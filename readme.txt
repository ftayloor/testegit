git init -> para iniciar;
git init --bare -> para iniciar o git em uma rede;

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

  gitk -> exibi os relatorios na forma grafica; 

  git reset HEAD <nome do arquivo>-> apaga algum arquivo na staged area;

  git checkout -- <nome do arquivo -> restaura seu arquivo para o ultimo commit;

  TAG -> etiquetas para identificação dos commit.
  git tag -> lista as tags; *as tag são relacionadas ao commit atual.
  git tag -a <nome da tag> -m <mensagem> -> cria uma etiqueta para o seu commit;
  git tag -a <nome da tag> <chave do commit> -m <mensagem> -> cria tag para um commit espeficio;
  git tag -d <nome datag> -> remove a tag;

  git show <nome da tag> -> exibi informações uma tag;

  git checkout <nome da tag> -> retorno para tags anterior
  git checkout master -> retorna para versão atual;

  BRANCH -> um braço do sistema; 
  git branch <nome do branch> -> criar um branch;
  git checkout <nome da branch> -> entrar num branch existente;
  git branch -d <nome do branch> -> deleta um branch

  MERGE -> mescla os branch {o branch a ser substituido deverá estar em uso e o substituido devera ser informado }
  (Master-> branch que será substituido)
  git merge <nome do branch substituto> -> mesclas os branch do sistema

  git init --bare -> inicia um repositorio git para pastas compartilhadas;
  
  git clone file:////<nome da maquina>/<caminho do arquivo> -> clona os arquivos numa rede

  git remote -> retorna o nome do seu clone, por padrao vem origin;

  git push <nome do clone> master -> envia suas alterção para o servidor remoto;

  git pull <nome do clone> master -> busca os dados e já um merge com os dados do servidor;

  git fetch <nome do clone> master <novo branch> -> busca os dados no servidor sem fazer um merge automatico;
  
  git rm <nome do arquivo> -> para remove arquivos deletados;

  ssh-keygen -> criar uma chave para interação com github.com (copie e cole a chave criada no arquivo idrca.pub)

