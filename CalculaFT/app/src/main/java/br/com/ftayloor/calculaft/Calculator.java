package br.com.ftayloor.calculaft;

/**
 * Created by Ftayloor on 26/10/2015.
 * Translation of the attributes and methods:
   operating -> Operando
   operatingEarlier -> Operando anterior
   operatorEarlier -> Operador anterior
   memory -> Memoria
   operationsPerform -> Realizar operação
   operationsPerformPrevious -> Realizar operação anterior
   operationsPerformMemory -> Realizar operação da memoria
 */

public class Calculator {
    private double operating;
    private double operatingEarlier;
    private String operatorEarlier;
    private double memory;

    public Calculator() {         /** Metodo construtor com valores default para iniciar a calc*/
        operating = 0;
        operatingEarlier = 0;
        operatorEarlier = "";
        memory = 0;
    }

    /** utiliza-se getter e setter para transformar um atributo ou metodo privado em publico */

    public double getOperating() { /** Metodo get para obter o valor do operating que está private */
        return operating;
    }

    public void setOperating(double operating) { /** Metodo set para pegar o valor digitado pelo */
        this.operating = operating;              /** usuario */
    }

    /** metodo operationsPerformPrevious declarado com privado pois não será acessado
     *  de fora da classe Calculator */

    private void operationsPerformPrevious() {
        if (!operatorEarlier.equals("")) {   /**Verifica se existe uma operação anterior*/
            if (operatorEarlier.equals("+")) {
                operating = operatingEarlier + operating;
            } else if (operatorEarlier.equals("-")) {
                operating = operatingEarlier - operating;
            }else if (operatorEarlier.equals("x")){
            operating =operatingEarlier * operating;
            }else if (operatorEarlier.equals("÷")){
                if (operating != 0){ /** evita a divisão por zero*/
                    operating = operatingEarlier / operating;
                }
            }
        }
    }
    /** metodo operationsPerform que iria interagir com a classe CalculatorActivity */
    public void operationsPerform(String op){
        if (op.equals("%")){
            operating = (operatingEarlier * operating) / 100;
        }else if (op.equals("+/-")){
            operating = -operating;
        }else if (op.equals("C")){
            operating = 0;
            memory = 0;
            operatorEarlier= "";
        }else{
            operationsPerformPrevious();
            operatorEarlier = op;
            operatingEarlier = operating;
        }
    }

    public void operationsPerformMemory(String opm){
        if (opm.equals("mc")){
            memory = 0;
        }else if (opm.equals("m+")){
            memory +=operating;
        }else if (opm.equals("m-")){
            memory -=operating;
        }else if (opm.equals("mr")){
            operating = memory;
        }
    }
}
