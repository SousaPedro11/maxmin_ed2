# MAXMIN_ED2
Implementação dos algoritmos MaxMin e Guloso da disciplina Estrutura de Dados II.

## REQUISITOS DO PROJETO
1. Implementar os algoritmos MaxMin1, MaxMin2, e MaxMin3.
2. Implementar um algoritmo guloso.

## RECURSOS UTILIZADOS

1. ECLIPSE PHOTON EE
2. ORACLE JAVA JDK 8_144

### INSTALAÇÃO DOS RECURSOS UTILIZADOS
#### Java, Eclipse
1. Baixe o Eclipse Photon e/ou Java JDK dos links presentes lá no final.
2. De preferencia crie uma pasta na raiz do sistema para instalação do Eclipse<br /> Ex: *C:\\Desenvolvimento* (opcional).
3. Instale o Oracle Java SDK no diretório de sua preferência, mas recomendo instalar na padrão do sistema.
4. Descompacte e copie o diretório do eclipse para a pasta de sua escolha (recomendo na *C:\\Desenvolvimento*).

#### TestNG
1. No Eclipse clique em *Help > Install New Software*.
2. No campo Work With cole o link <http://beust.com/eclipse> e clique em *add*.
3. Insira o nome TestNG, clique *Ok*.
4. Espere carregar e assim que aparecer o TestNG, marque-o e clique em *next*.
5. Clique em *next* até aparecer para aceitar licenças, aceite e clique em *finish*.
6. Após iniciada a instalação poderá aparecer uma janela Security Warning, clique em *Install Anyway* e espere a instalação terminar.
7. Quando for terminada o eclipse pedirá para ser reiniciado, reinicie-o.
9. Ao ser aberto novamente o TestNG já poderá ser utilizado.

+ Após instalar os programas devemos configurar o ambiente.

### CONFIGURAÇÃO DO AMBIENTE

1. É necessário criar variáveis de sistema e amiente, para ter acesso a essas configuraçães:
 *Win(*<img src="http://www.rw-designer.com/icon-image/7665-256x256x8.png"  width="15" height="15">)*+Pause Break > Configurações Avançadas do Sistema > Variáveis de Ambiente*.
2. Crie ou edite a **Variável de Usuário** Path adicionando o caminho para *\bin* do Java JDK.<br /> Ex: *C:\Program Files\Java\jdk1.8.0_144\bin*
3. Crie a **Variável de Sistema** *JAVA*\_*HOME* adicionando o caminho da pasta do Java JDK.<br /> Ex: *C:\Program Files\Java\jdk1.8.0_144*
4. Edite a **Variável de Sistema** *Path* adicionando as linhas: *%JAVA*\_*HOME%\bin*.
5. Clique *OK* nas janelas para validar as configurações.
6. Agora devemos testar se funcionou.
7. Pressione *Win(*<img src="http://www.rw-designer.com/icon-image/7665-256x256x8.png"  width="15" height="15">)*+R* , digite *cmd* e aperte *enter* para abrir o Prompt.
8. No CMD digite *java -version* e aperte *enter*.
9. Se o ambiente foi configurado com sucesso, aparecerá: Openjdk Version, Openjdk Runtime Enviroment e Openjdk Server VM.

## Baixando o Repositório

### Download
1. Clique no botão *clone or Download* e selecione *Download ZIP*

   <img src="https://raw.githubusercontent.com/SeeedDocument/Tutorial_Add_Arduino_Library/master/images/github_download.png" width="480">
2. Extraia para a pasta definida como Workspace do eclipse.
3. Renomeie a pasta extraída de: *nomedorepositorio-master.zip* para *nomedorepositorio.zip*, ou seja, renomeie excluindo o *-master*.

### Git Clone
1. Baixe e instale o git (link presente no fim da página).
2. Copie o link do repositório a ser baixado

   <img src="https://sarafordnet.files.wordpress.com/2016/12/snaghtmlb64afe.png" width="480">
3. Abra o git bash e vá para a pasta definida como workspace do eclipse.<br /> Ex: *cd ~/eclipse-workspace*
4. Utilize o comando para clonar o repositório: *git clone linkdorepositório*.<br />
Ex: *git clone http&#58;github.com/SousaPedro11/maxmin_ed2.git*
5. Feche o git Bash caso não precise utilizá-lo.

## Abrindo o projeto no eclipse
1. Abra o Eclipse
2. Clique em: *File > Open projects from FileSystem or Archives*
3. Ao aparecer a janela parecida com a imagem abaixo, clique em *Browse*.
   
   <img src="https://i.stack.imgur.com/ZaFsl.png" width="640">
4. Selecione a pasta do repositório que foi baixado seguindo o passo anterior.<br /> Ex: <b><i>pastadousuario</i></b> *> eclipse-workspace > maxmin_ed2* ou <i>C:\Users\<b>nomedousuario</b>\eclipse-workspace\projetos\maxmin_ed2</i>
5. Depois clique em *finish*

## LINKS EXTERNOS
### Downloads
+ [Eclipse Photon EE](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/photonr)

+ [Oracle Java 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

+ [Git](https://git-scm.com/downloads)

### Guias e documentação
+ [git - Guia Prático](http://rogerdudler.github.io/git-guide/index.pt_BR.html)

+ [Pro Git - Documentação](https://git-scm.com/book/pt-br/v1)

+ [Helo World - GitHub Guides](https://guides.github.com/activities/hello-world/)