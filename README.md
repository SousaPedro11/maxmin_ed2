# MAXMIN_ED2
Implementa��o dos algoritmos MaxMin e Guloso da disciplina Estrutura de Dados II.

## REQUISITOS DO PROJETO
1. Implementar os algoritmos MaxMin1, MaxMin2, e MaxMin3.
2. Implementar um algoritmo guloso.

## RECURSOS UTILIZADOS

1. ECLIPSE PHOTON EE
2. ORACLE JAVA JDK 8_144

### INSTALA��O DOS RECURSOS UTILIZADOS
#### Java, Eclipse
1. Baixe o Eclipse Photon e/ou Java JDK dos links presentes l� no final.
2. De preferencia crie uma pasta na raiz do sistema para instala��o do Eclipse<br /> Ex: *C:\\Desenvolvimento* (opcional).
3. Instale o Oracle Java SDK no diret�rio de sua prefer�ncia, mas recomendo instalar na padr�o do sistema.
4. Descompacte e copie o diret�rio do eclipse para a pasta de sua escolha (recomendo na *C:\\Desenvolvimento*).

#### TestNG
1. No Eclipse clique em *Help > Install New Software*.
2. No campo Work With cole o link <http://beust.com/eclipse> e clique em *add*.
3. Insira o nome TestNG, clique *Ok*.
4. Espere carregar e assim que aparecer o TestNG, marque-o e clique em *next*.
5. Clique em *next* at� aparecer para aceitar licen�as, aceite e clique em *finish*.
6. Ap�s iniciada a instala��o poder� aparecer uma janela Security Warning, clique em *Install Anyway* e espere a instala��o terminar.
7. Quando for terminada o eclipse pedir� para ser reiniciado, reinicie-o.
9. Ao ser aberto novamente o TestNG j� poder� ser utilizado.

+ Ap�s instalar os programas devemos configurar o ambiente.

### CONFIGURA��O DO AMBIENTE

1. � necess�rio criar vari�veis de sistema e amiente, para ter acesso a essas configura��es:
 *Win(*<img src="http://www.rw-designer.com/icon-image/7665-256x256x8.png"  width="15" height="15">)*+Pause Break > Configura��es Avan�adas do Sistema > Vari�veis de Ambiente*.
2. Crie ou edite a **Vari�vel de Usu�rio** Path adicionando o caminho para *\bin* do Java JDK.<br /> Ex: *C:\Program Files\Java\jdk1.8.0_144\bin*
3. Crie a **Vari�vel de Sistema** *JAVA*\_*HOME* adicionando o caminho da pasta do Java JDK.<br /> Ex: *C:\Program Files\Java\jdk1.8.0_144*
4. Edite a **Vari�vel de Sistema** *Path* adicionando as linhas: *%JAVA*\_*HOME%\bin*.
5. Clique *OK* nas janelas para validar as configura��es.
6. Agora devemos testar se funcionou.
7. Pressione *Win(*<img src="http://www.rw-designer.com/icon-image/7665-256x256x8.png"  width="15" height="15">)*+R* , digite *cmd* e aperte *enter* para abrir o Prompt.
8. No CMD digite *java -version* e aperte *enter*.
9. Se o ambiente foi configurado com sucesso, aparecer�: Openjdk Version, Openjdk Runtime Enviroment e Openjdk Server VM.

## Baixando o Reposit�rio

### Download
1. Clique no bot�o *clone or Download* e selecione *Download ZIP*

   <img src="https://raw.githubusercontent.com/SeeedDocument/Tutorial_Add_Arduino_Library/master/images/github_download.png" width="480">
2. Extraia para a pasta definida como Workspace do eclipse.
3. Renomeie a pasta extra�da de: *nomedorepositorio-master.zip* para *nomedorepositorio.zip*, ou seja, renomeie excluindo o *-master*.

### Git Clone
1. Baixe e instale o git (link presente no fim da p�gina).
2. Copie o link do reposit�rio a ser baixado

   <img src="https://sarafordnet.files.wordpress.com/2016/12/snaghtmlb64afe.png" width="480">
3. Abra o git bash e v� para a pasta definida como workspace do eclipse.<br /> Ex: *cd ~/eclipse-workspace*
4. Utilize o comando para clonar o reposit�rio: *git clone linkdoreposit�rio*.<br />
Ex: *git clone http&#58;github.com/SousaPedro11/maxmin_ed2.git*
5. Feche o git Bash caso n�o precise utiliz�-lo.

## Abrindo o projeto no eclipse
1. Abra o Eclipse
2. Clique em: *File > Open projects from FileSystem or Archives*
3. Ao aparecer a janela parecida com a imagem abaixo, clique em *Browse*.
   
   <img src="https://i.stack.imgur.com/ZaFsl.png" width="640">
4. Selecione a pasta do reposit�rio que foi baixado seguindo o passo anterior.<br /> Ex: <b><i>pastadousuario</i></b> *> eclipse-workspace > maxmin_ed2* ou <i>C:\Users\<b>nomedousuario</b>\eclipse-workspace\projetos\maxmin_ed2</i>
5. Depois clique em *finish*

## LINKS EXTERNOS
### Downloads
+ [Eclipse Photon EE](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/photonr)

+ [Oracle Java 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

+ [Git](https://git-scm.com/downloads)

### Guias e documenta��o
+ [git - Guia Pr�tico](http://rogerdudler.github.io/git-guide/index.pt_BR.html)

+ [Pro Git - Documenta��o](https://git-scm.com/book/pt-br/v1)

+ [Helo World - GitHub Guides](https://guides.github.com/activities/hello-world/)