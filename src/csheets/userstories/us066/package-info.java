/**
* Technical documentation regarding the user story 066: Several shares. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve ser possível ter várias partilhas "activas" (com nomes diferentes). Deve ser possível ligar-se a várias partilhas. 
* O local que recebe a partilha pode ser diferente do local "origem".
* <br/>
* <br/>
*  
* <b>S066a: Analysis</b><br/>
* User Story 066 consiste em evoluir o mecanismo de partilha criado anteriormente de forma a existir várias partilhas a correr ao mesmo tempo.
* Assim será necessário acrescentar código às classes existentes da extensão 'share' já implementada e implementação de
* uma classe nova, "MultiShare". Será reutilizado ao máximo o código criado na US064 e US065, e todo código criado em diante terá em conta o código já existente.
* Serão utilizadas as classes nos packages csheets.ext.share e csheets.ext.share.ui, acrescentada a classe "MultiShare" na package csheets.ext.share, a classe (form) SharePanel na package
* csheets.ext.share.ui.
* <br/>
* <br/>
* 
* <b>S066d: Design</b><br/>
* Criação do diagrama de sequencia na plataforma plantuml da US066.<br/>
* 
* <img src="../../../csheets/userstories/us066/doc-files/us066_design1.png">
* <br/>
* <img src="../../../csheets/userstories/us066/doc-files/us066_design2.png">
* 
* <br/>
* <br/>
* 
* <b>S066c: Coding</b><br/>
* <br/>
* 
* <br/>
* <br/>
* 
* <b>S066u: Unit Tests</b><br/>
* 
* 
* <b>S066f: Functional Tests</b><br/>
* 
* 
* 
* @startuml doc-files/us066_design1.png
 User -> ServerUI : ChooseShare(ip, port)
 ServerUI -> Server : Server(String pass, int port, Address inicio, Address fim, Spreadsheet folha)
 Server -> TrataCliente : new(socket)
 @enduml
* 
* @startuml doc-files/us066_design2.png
 User -> ClientUI : ChooseShare(ip, port)
 ClientUI -> Client :Client(String pass, int port, Spreadsheet folha_actual, Address addres, String ip)
 @enduml
*/


package csheets.userstories.us066;
