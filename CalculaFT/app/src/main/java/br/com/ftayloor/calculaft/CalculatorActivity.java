package br.com.ftayloor.calculaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.text.*;
import java.util.Locale;

public class CalculatorActivity extends AppCompatActivity {

    private Calculator calc; /** para armazenar a instancia da classe*/
    private boolean userIsTypingNumber; /** para verificar a digitação */
    private boolean decimalTyped; /** para verificar se a virgula foi sua */

    private TextView txtDisplay;  /** para conectar ao Txtview do activity_calculator*/

    private String separator;
    private char separatorChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator); /**cria o layuot padrao */

        calc = new Calculator(); /** cria um objeto da classe Calcualtor */

        userIsTypingNumber = false;
        decimalTyped = false;

        txtDisplay = (TextView)findViewById(R.id.TXTDisplay); /** conecta o TxtDisplay do . java ap TxtDisplay activity atraves do findViewBYId.*/
        txtDisplay.setText("0"); /** define a string padrao no inicio da calculadora*/

        Locale localization = getResources().getConfiguration().locale;

        NumberFormat formatter = NumberFormat.getInstance(localization);

        if (formatter instanceof DecimalFormat){
            DecimalFormatSymbols symbols = ((DecimalFormat)formatter).getDecimalFormatSymbols();
            separatorChar = symbols.getDecimalSeparator();
        }

        separator =String.valueOf(separatorChar);

        Button btnSeparator = (Button)findViewById(R.id.BTNComma);
        btnSeparator.setText(separator);

    }


    /**Metodo que define o que ocorrera quando os numeros forem tocados*/
    public void onClickNumbers(View v){ /** indica qual objeto da view foi pressionada"*/
        Button TouchButton = (Button)v; /** indica ao objeto "v" que  é um botão que será usado*/
        String digit = TouchButton.getText().toString(); /** pega o conteudo do botão e converte para string*/
        String TextOnDisplay = txtDisplay.getText().toString(); /** pega o conteudo da tela e converte para string*/

        if (!userIsTypingNumber || TextOnDisplay.equals("0")){
            txtDisplay.setText(digit);
            if (!digit.equals("0")){
                userIsTypingNumber =true;
            }
        }else{
            txtDisplay.setText(TextOnDisplay + digit);
        }
    }

    /**Metodo que define o que ocorrera quando as opreções forem tocados*/
    public void onClickOperation(View v){
        Button touchButton = (Button)v;
        String operation = touchButton.getText().toString();

        if (operation.equals(separator) && !decimalTyped){ /** verifica se a operação digitada */
            decimalTyped = true;
             if (!userIsTypingNumber){
                 txtDisplay.setText("0" +separator);
             }else
                 txtDisplay.setText(txtDisplay.getText().toString() + separator);
                 userIsTypingNumber = true;
                     } else if (!operation.equals(separator)){
            String valueWithoutCommma = txtDisplay.getText().toString().replace(separatorChar,'.'); /** metodo replace armazena duas char a primeira a atual e segunda a substituta*/

            calc.setOperating(Double.parseDouble(valueWithoutCommma)); /** converte a string recebida pelo objeto da classe calcutor e converte e double*/
            calc.operationsPerform(operation);

            String textResult = String.valueOf(calc.getOperating());

            if (textResult.endsWith(".0")){
                textResult = textResult.substring(0, textResult.length() - 2);
            }
            txtDisplay.setText(textResult.replace('.',separatorChar));
            userIsTypingNumber =false;
            decimalTyped = false;
        }
    }

    /** Metodo que define o que ocorrera quando as memorias forem tocadas*/
    public void onClickMemory(View v){
        Button touchButton = (Button)v;
        String operationMemory = touchButton.getText().toString();
        String valueWithComma = txtDisplay.getText().toString().replace(separatorChar, '.');

        calc.setOperating(Double.parseDouble(operationMemory));
        calc.operationsPerformMemory(operationMemory);
        userIsTypingNumber = false;

    }
}





