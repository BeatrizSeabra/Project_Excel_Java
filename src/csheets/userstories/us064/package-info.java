/**
 * Technical documentation regarding the user story 064: Iniciar Partilha. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Permitir estabelecer uma conexao com uma outra instancia do cleansheets e enviar um range de celulas para a outra instancia.<br/>
 * O conteudo recebido deve ser apresentado no mesmo "local". <br/>
 * Para isso, em cada instancia do cleansheets deve ser possivel definir uma porta para ligacoes.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S064a: Analysis</b><br/>
 * Na UserStory 064 é pedido que seja efectuado uma ligação entre duas instâncias do projecto cleansheets, esta ligação vai partilhar o conteúdo de um dado número de células no mesmo local onde estavam na primeira janela de cleansheets.<br/>
 * Vai ser adicionado uma opção no menu "extensions" para fazer parte das opções do utilizador.<br/>
 * Na analise do codigo do projecto que nos foi fornecido a classe CellListener no package csheets.core contem um metodo, cellCopied, que deverá ser utilizado para copiar os valores das celulas de uma folha de calculo para a outra.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S064d: Design</b><br/>
 * Criação do diagrama de sequencia na plataforma plantuml da US064.<br/>
 * Partilha de "range" entre servidor e cliente, onde o cliente vai ser o ip do servidor so vai ser pedida a porta.
 * <br/>
 * <br/>
 * 
 * <b>S064c: Coding</b><br/>
 * see:<br/>
 * 
 * <br/>
 * <br/>
 * 
 * <b>S064u: Unit Tests</b><br/>
 * 
 * <br/>
 * <br/>
 * 
 * <b>S064f: Functional Tests</b><br/>
 * 
 * <br/>
 * <br/>
 * 
 * @author 1110506
 */
/*
 *
 @startuml doc-files/us064_design1.png
UIController -> FocusOwnerAction : getSelectedCells()
FocusOwnerAction --> UIController : getSelectedCells()
User -> UIController : enterShareName(String name)
User -> UIController : enterPort(int port)
UIController -> ShareInfo : new(int shareid,int sharePort,ArrayList<Cell> sharedCells,String shareName)
UIController -> ServerConnectionHandler : createServerConnection()
UIController -> ServerConnectionHandlerFactory : createShareHandlerFactory(UIController uiController,ShareInfo currentShareInfo)
ServerShareHandlerFactory --> ServerShareHandler : createShareHandler(UIController uiController,ShareInfo current ShareInfo)
ServerConnectionHandler -> ObjectOutputStream : new(connection.getOutputStream())
ServerConnectionHandler -> ObjectInputStream : new(connection.getInputStream())
ServerConnectionHandler -> ServerConnectionHandler : sendObject(currentShareInfo)
  @enduml
 
 *
 */
package csheets.userstories.us064;