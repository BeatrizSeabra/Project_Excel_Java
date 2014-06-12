/**
* Technical documentation regarding the user story 080: Find participants.
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* It should be possible to find a cleansheets instances in the local network in order to contact (possible chatters).
* Each cleansheets should or not allow the messaging reception from others instances.
* <br/>
* <br/>
*  
* <b>S001a: Analysis</b><br/>
* Analyze all involved classes in the previous user storie (us079) for understanding its functioning
* <br/>
* <br/>
* 
* <b>S001d: Design</b><br/>
* Create two distinct classes, where each one has a running thread: UDPClient and UDPServer.
* The first one, UDPClien, has a thread to continuously sending broadcaste requests to the entire network, with a string message, and waiting for a response with the same message.
*
* The second one, UDPServer, has a thread that is continuously listening for the message that has been combined before. Case it receives that message, respondes with is ip address.
* 
* When the UDPClient class receives that response, it put that ip in a list of ip's. Both of these classes are singleton. 
* 
* The ChatUI class will have a thread (ThreadUpdateList) that calls a method that gets the list of ip's and puts them in the JList.
* The same thread must make stops from five seconds during its execution.
* 
* <img src="../../../csheets/userstories/us080/doc-files/us080_design1.png"> 
* <br/>
* <br/>
* 
* <b>S001c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/chat/package-summary.html">csheets.ext.chat</a><br/>
* <a href="../../../csheets/ext/chat/ui/package-summary.html">csheets.ext.chat.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001f: Functional Tests</b><br/>
* <br/>
* <br/>
* <br/>
* <br/>
* 
* @author alexandrebraganca
*/
/*
*
@startuml
 participant "UIChat" as UIC
 participant "server : UDPServer" as UDPS
 participant "client : UDPClient" as UDPC
 participant "listParticipants : ArrayList<String>" as LSTP
 participant "threadUpdateList : ThreadUpdateList" as TUL

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

@enduml
*
*/
package csheets.userstories.us080;
