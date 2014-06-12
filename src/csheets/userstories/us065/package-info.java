/**
 * Technical documentation regarding the user story 065: Update Automático de
 * Partilha.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Após estabelecida a conexão entre duas instâncias do cleansheets as
 * alteracoes efectuadas em qualquer dos "lados" devem dar origem a
 * actualizações imediatas
 * <br/>
 * <br/>
 *
 * <b>S065a: Analysis</b><br/>
 *
 * Na User Story 065 é pedido que após a conexão seja estabelecida entre as duas
 * instâncias do cleansheets, é necessário que as alterações efectuadas em
 * qualquer uma das instâncias dê origem a actualizações imediatas. Reutilizando
 * o código feito pelo meu colega encarregue da User Story 064, ou seja, as
 * classes presentes nos packages csheets.ext.share e csheets.ext.share.ui, irei
 * elaborar os métodos para a realização das actualizações automáticas entre as
 * instâncias do cleansheets.
 * <br/>
 * <br/>
 *
 * <b>S065d: Design</b><br/>
 * Criação do diagrama de sequencia na plataforma plantuml da US065.<br/>
 * 
 * <img src="../../../csheets/userstories/us028/doc-files/us065_design1.png"> <br/>
 * <img src="../../../csheets/userstories/us028/doc-files/us065_design2.png">
 * <br/>
 * <br/>
 * 
 *
 * <b>S065c: Coding</b><br/>
 * <br/>
 *
 * <br/>
 * <br/>
 *
 * <b>S065u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 *
 * <b>S065f: Functional Tests</b><br/>
 *
 * @author marc
 */
/*
 *

 @startuml doc-files/us065_design1.png
User -> ServerUI : ActionListener()
ServerUI -> Server : Server(String pass, int port, Address inicio, Address fim, Spreadsheet folha)
Server -> TrataCliente : new(socket)
  @enduml
 
@startuml doc-files/us065_design2.png
User -> ClientUI : ActionListener()
ClientUI -> Client :Client(String pass, int port, Spreadsheet folha_actual, Address addres, String ip)
  @enduml
 *
 */
package csheets.userstories.us065;
