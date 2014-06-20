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
 * -Depois de analisar o codico referente ao US080, entendi o conceito, sendo que sao precisas algumas melhorias.<br/>
 * Como filtrar as mensagens e conversas <br/>
 * -Penso que a melhor forma é usar um identificador no corpo da mensagem para distinguir o tipo da mesma.<br/>
 * Qual a melhor forma de criar as conversas. <br/>
 * ´- Criar uma classe com um identificador e uma lista de intervenientes.<br/>
 * Analisar o código já existente. <br/>
 * Criar estrutura dinamica para guardar conversas(ips participantes, id conversa), enviar mensagens para todos os ips, actualizar chats de todos sempre que alguém envia mensagem.
 * <br/>
 * <br/>
 * 
 * <b>S081d: Design</b><br/>
 * Para realizar esta user story irá ser criado a classe "Conversation", cujo objectivo é ter um ID, e uma lista de ips.<br/>
 * O modo de funcionamento esta ilustrado neste diagrama de sequencia, que demonstra a forma como encontra os ips na rede, e como se processa as conversas<br/>
 * Sempre que um utilizar envia uma mensagem, a mesma sera enviada a todos os intervenientes. <br/>
 * Sempre que um utilizador cria uma mensagem a mesma é enviada a todos os intervenientes para actualizar a lista de conversas de cada instancia<br/>
 * <img src="../../../csheets/userstories/us081/doc-files/us081_design.png"> <br/>
 * O diagrama de sequência ilustra os seguintes eventos:<br/>
 * Na UIChat é chamado o metodo de encontrar instancias referente aos US080.<br/>
 * Encontradas as instancias é criada uma conversa, na qual vão ser inseridos os participantes que o utilizador pretender.<br/>
 * Inseridos todos os participantes, o controlador envia a conversa a todos os participantes.<br/>
 * Quando o utilizador envia uma mensagem, a interface invoca o controlador para tratar a mesma. Este envia a todos os ips a mensagem<br/>
 * Quando uma mensagem é recebida o controlador actualiza a interface<br/>
 * <br/>
 * <br/>
 * 
 * <b>S081c: Coding</b><br/>
 * No decorrer desta etapa foram realizadas alteracoes á classe ChatController, UDPCliente, UDPServer.<br/>
 * Na ChatController foi criado um arraylist de conversas para as poder gerir atraves desta classe,
 * além disso foi criado metodos para tratar os dados a ser enviados quer para conversas de 3 ou mais pessoas, quer para conversa entre 2 pessoas, 
 * foi alterado o metodo de tratamento de mensagens recebidas pelo servidor que passa a identificar o tipo de mensagem(mensagem individual, criacao de conversa, mensagem numa conversa)<br/>
 * Devido ao US80 ter ficado incompleto foram feitas alteracoes a classe UDPCliente que ficou apenas a enviar pedidos de broadcast de 10 em 10 segundos, 
 * em vez de enviar e receber como estava implementado por um colega. A Classe UDPServer passa a identificar o tipo de mensagem, caso seja pedido, devolve uma resposta com ao ip, mas na porta do servidor com o seu endereço de IP, 
 * caso a mensagem seja um IP, verifica se existe e guarda o Ip na lista destina a esse efeito e coloca na interface grafica o mesmo IP.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S081u: Unit Tests</b><br/>
 * Foram realizados testes unitários a classe ChatController e Conversation, na chat controller ja havia sido realizado testes, sendo que foram acrescentados 3 metodos que servem para tratamento de dados<br/>
 * A classe conversation foram realizados testes ao metodos de adicionar e remover Ips<br/>
 * Todos os metodos passaram nos testes elaborados.
 * <br/>
 * <b>S081f: Functional Tests</b><br/>
 * 1-Executar o programa
 * 2-Clicar em em Extensions->Chat->Chat.
 * 3-Activate Chat
 * 4-Find Participants
 * 5-Escolher participantes(CTRL+CLICK in ips in list)
 * 6-Start Conversation
 * 7-Escolher id para a conversa(menos de 10 caracteres)
 * 8-OK
 * 9-Enviar Mensagem
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
UIC -> control: SendConversation(conv);
control->srv: SendConversation(ip,conv);
UIC -> control: sendtoConversation(message, conv);
control -> srv :sendMessage(ip,message);
control -> conv: messageReceived(from, message);
@enduml

*/

package csheets.userstories.us081;
