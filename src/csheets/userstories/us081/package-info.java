/**
 * Documentacao tecnica para a user story 081: Criar conversas. 
 * <br/>
 * <br/>
 * 
 * <b>Requisitos</b><br/>
 * Um utilizador pode contactar directamente outro cleansheets ou criar uma "conversa". Os cleansheets que entrem numa conversa recebem todas as mensagens cujo destino é a "conversa".
 * <br/>
 * <br/>
 *  
 * <b>S081a: Analysis</b><br/>
 * Entender como se envia mensagens em broadcast <br/>
 * Como filtrar as mensagens e conversas <br/>
 * Qual a melhor forma de criar as conversas. <br/>
 * Analisar o código já existente. <br/>
 * Criar estrutura dinamica para guardar conversas(ips participantes, id conversa), enviar mensagens para todos os ips, actualizar chats de todos sempre que alguém envia mensagem.
 * <br/>
 * <br/>
 * 
 * <b>S081d: Design</b><br/>
 * Para realizar esta user story irá ser criado a classe "Conversation", cujo objectivo é ter um ID, e uma lista de ips.<br/>
 * O modo de funcionamento esta ilustrado neste diagrama de sequencia, que demonstra a forma como encontra os ips na rede, e como se processa as conversas<br/>
 * <img src="../../../csheets/userstories/us081/doc-files/us081_design.png"> <br/>
 * <br/>
 * <br/>
 * 
 * <b>S081c: Coding</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S081u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S081f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author Fábio Carvalho 1121228
 */

 
 /**
 @startuml doc-files/us081_design.png
 participant "UIChat" as UIC
 participant "server : UDPServer" as UDPS
 participant "client : UDPClient" as UDPC
 participant "listParticipants : ArrayList<String>" as LSTP
 participant "threadUpdateList : ThreadUpdateList" as TUL
 participant "conversation : Conversation" as conv
 participant "controller : ChatController" as control
 participant "server : Server" as srv

 UIC -> UDPS: start();
 loop for UDPS
   UDPS -> UDPS: run();
 end

 UIC -> UDPC : start();
 loop for UDPC
   UDPC -> UDPC: run();
   UDPC -> LSTP : add(ip_participant)
 end

 UIC -> TUL : start();
 loop for TUL
   TUL -> UIC : updateList()
   TUL -> TUL : sleep(5000)
 end

UIC -> control: createConv();
control -> conv: create();
UIC -> control: addIpToConversation(ip, conv);
control -> conv: addIP(ip);
UIC -> control: addIpToConversation(ip, conv);
control -> conv: addIP(ip);
UIC -> control: sendtoConversation(message, conv);
control -> srv :sendMessage(ip);
control -> conv: messageReceived(from, message);
@enduml

*/

package csheets.userstories.us081;
