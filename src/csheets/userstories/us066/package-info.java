/**
* Technical documentation regarding the user story 066: Several shares (Multi Shares). 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve ser possível ter várias partilhas "activas" (com nomes diferentes). Deve ser possível ligar-se a várias partilhas. 
* O local que recebe a partilha pode ser diferente do local "origem".
* <br/>
* <br/>
*  
* <b>S066a: Analysis</b><br/>
* User Story 066 consiste em evoluir o mecanismo de partilha criado anteriormente de forma a existir várias partilhas a correr ao mesmo tempo.
* Assim será necessário acrescentar código às classes existentes da extensão 'share' já implementada e implementação de
* uma classe nova, "MultiShare" e a sua interface SharePanel. Será reutilizado ao máximo o código criado na US064 e US065, e todo código criado em diante terá em conta o código já existente.
* Serão utilizadas as classes nos packages csheets.ext.share e csheets.ext.share.ui, acrescentada a classe "MultiShare" na package csheets.ext.share, a classe (form) SharePanel na package
* csheets.ext.share.ui. Ainda foram acrescentados métodos à classe "BaseConnection". A janela de ferramentas do 'MultiShare' estará disponível no sideBar.
* <br/>
* <br/>
* 
* <b>S066d: Design</b><br/>
* Criação do diagrama de sequencia na plataforma plantuml da US066.<br/>
* 
* <img src="../../../csheets/userstories/us066/doc-files/us066_design1.png"> 
* 
* <br/>
* <br/>
* 
* <b>S066c: Coding</b><br/>
* Ver: <br/>
* <a href="../../../csheets/ext/share/package-summary.html">csheets.ext.share</a><br/>
* <a href="../../../csheets/share/ui/package-summary.html">csheets.ext.share.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S066u: Unit Tests</b><br/>
* Não foi possível realizar Testes Unitários, visto que a maioria dos médotos implementados é do tipo 'void'.
* A classe SharePanel é do tipo 'form'.
* A classe MultiShare possui um contrutor do tipo 'private' o que torna difícil a elaboração dos testes para os métodos da mesma classe.
* Ainda assim foram efectuadas todas as validações possíveis para prevenir o maior número de possíveis erros que possam surgir.
* 
* 
* <b>S066f: Functional Tests</b><br/>
* 
* ***SHARE METODO CLASSICO***
* Antes de tudo, teem de estar abertas duas instancias do cleansheets. 
* Depois, teem de se preencher celulas e selecionar as que quer partilhar.
* Em seguida, ir ao menu extensions e escolher a opcao share e depois server.
* Vai inserir un nome da partilha, uma porta e uma password para a partilha.
* Na segunda instancia selecionar as celulas onde quer que a informação apareca e escolher o menu extensions -> share - > client.
* Escrever o ip do servidor, a porta e a password (definidas anteriormente)e a informação aparecerá onde estão as celulas selecionadas.
* De seguida no side bar no separados 'Share' tem várias abas relativas à gestão das partilhas.
* 
* ***ATIVAR JANELA SHARE NO SIDE BAR***
* Para activar a janela do 'Multi Share', caso ainda não seja vizivel no side bar é necessário ir ao menu 'View' e clicar na opção 'Share'.
* 
* ***MULTI SHARE***
* Na aba 'Multi Share' tem as informações sobre todas as partilhas activas da instância em questão.
* Lista de servidores apresenta a lista de partilhas em que a instância em questão funciona em modo servidor.
* Lista de clientes apresenta a lista de partilhas em que a instância em questão funciona em modo cleinte.
* Para parar cada partilha dessas (Servidor/Cliente mode) basta seleccionar na partilha e clicar no botão 'Stop'.
* 
* ***CONNNECT***
* Na aba 'Connect' - 'Manual' é possível criar uma nova ligação em modo cliente, tecnicamente é o mesma opção que escolher o menu extensions -> share - > client,
* após inserir todos os campos com informações válidas é criada uma nova ligação em modo cliente à um Servidor (caso exista).
* Na aba 'Connect' - 'Auto' é possível ligar à um servidor conectado anteriormente que ficou gravado na memória.
* 
* ***NEW SHARE***
* Na aba 'New Share' é possível criar uma nova partilha em modo Servidor, ainda com a opção 'read only', que caso seleccionada
* permite tornar a instância um servidor autêntico, isto é todas as celulas seleccionadas que forem modificadas os clientes conectados
* tambem sofrem dessas alterações, mas as alterações dos clientes nunca interferem com o Servidor.
* É necessário preencher todos os campos com os dados válidos, o botão verde 'actualizar' tem como função actualizar as celulas seleccionadas.
* 
* 
* @startuml doc-files/us066_design1.png
    actor User
    participant SharePanel as panel
    participant Server as se
    participant MultiShare as multiShare
    participant TrataClientes as tc
    participant Thread as tr
    participant IN as in
    participant OUT as out

    User -> panel : setPort()
    User -> panel : setName()
    User -> panel : setPassword()
    panel -> se : server=new Server(nome, password, porta)
    se -> multiShare : multiShare= MultiShare.getShare()
    panel -> tr : thread=new Thread(server)
    panel -> panel : thread.start()
    se -> se : shareLimits()
    se -> multiShare : addServer(this)
    loop isActive()==true
        se -> se :connection = waiting_for_clients(...)
        se -> tc : Thread(new(connection))
    end
 
    tc -> tr : in=new Thread(IN)
    tc -> tr : out=new Thread(OUT)
    loop isActive()==true
	activate in
        in -> in : OBject = waiting_for_data
        in -> in : toSpreedsheet()
	deactivate in
    end

    loop isActive()==true 
	activate out
        out -> CellListener : waiting_for_changes
        User -> Cell : valueChanged(cell)
        out -> out : white (cell[][])
	deactivate out
    end
 @enduml
*/

package csheets.userstories.us066;
