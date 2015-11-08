  git init -> para iniciar;

    cd -> para navegar pelas pastas;

  git status -> para verificar os arquivos no git;
  git add -A -> adiciona tudo na staging ara;
    add *.php,txt -> adiciona todos os da estensão;
    add teste.txt -> o arquivo;

  git commit -> salva o arquivo no repositorio e pede uma mensagem de identificação;
    commit -m -> salva o arquivo no repositorio já com a mensagem;
    commit -a -m -> executa o commit direto sem passar para a staged area;  
    commit --amend -m -> sobrescreve o ultimo commit;

    .gitignore -> arquivo onde pode adcionamos pastas e arquivos que deveram ser ignorados pelo git;

  git diff -> exibi as alteraões feitas nos arquivos que estao na staged area;
      diff --staged -> exibi as alteraões feitas nos arquivos mesmo após o commit;

  git log -> exibi um log dos commits;
      log -p -> exibi as alterções feitas;    
      log -p -1 -> exibi um determinado commit;
      log --pretty=oneline -> exibi uma lista simples dos commits

  git -> exibi os relatorios na forma grafica; 

  git reset HEAD <nome do arquivo>-> apaga algum arquivo na staged area;

  git checkout -- <nome do arquivo -> restaura seu arquivo para o ultimo commit;

  git rm <nome do arquivo> -> para remove arquivos deletados;

  git tag -a <nome da versao> -m "mensagem" -> criar uma etiqueta de identificação para um commit;
  git tag -a <nome da etiqueta <id do commit> m- <mensagem> -> criar uma etiqueta para um commit especifico;

  git show <nome da tag> -> exibi detalhes da tag;

  git checkout <nome da tag> -> trocar a tag que está sendo utilizada possibilitando voltar ao um commit anterior;
  git checkout master -> voltar a tag principal;

  git branch <nome do branch> -> cria uma ramificação util para alterar os arquivos;
  git branch - d <nome do branch> -> deleta um branch;
  git checkout <nome da branch> -> altera para branch criada;
  git check out -b < nome da branch> -> cria uma nova branch e já disponibiliza para o uso;

  git merge <nome do branch subtituto> -> subtitui seu branch de teste pelo principal(master);

  ssh-keygen -> criar uma chave para interagir com o github;