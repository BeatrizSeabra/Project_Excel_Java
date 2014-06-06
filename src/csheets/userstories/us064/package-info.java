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
 * <br/>
 * 
 * <br/>
 * <br/>
 * 
 * <b>S064u: Unit Tests</b><br/>
 * Neste caso de uso (US064) não foi possível realizar teste unitários devido ao facto de os metodos a serem testados (que estão dentro de uma classe JForm) não terem return.<br/>
 * Devido à falta de return é dificil de esperar um resultado para casos de testes.<br/>
 * Por exemplo:<br/>
 * Como o metodo run não possui um return logo é dificil de ter um resultado esperado para confirmar o caso de teste.<br/>
 * No ActionPerformed do botão do ServerUI já está a validar o valor da porta e a password.
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
User -> ServerUI : ActionListener()
ServerUI -> Server : Server(String pass, int port, Address inicio, Address fim, Spreadsheet folha)
Server -> TrataCliente : new(socket)
  @enduml
 
@startuml doc-files/us064_design2.png
User -> ClientUI : ActionListener()
ClientUI -> Client :Client(String pass, int port, Spreadsheet folha_actual, Address addres, String ip)
  @enduml




 *
 */
package csheets.userstories.us064;