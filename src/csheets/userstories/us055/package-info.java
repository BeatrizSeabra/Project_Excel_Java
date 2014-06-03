/**
 * Technical documentation regarding the user story 055: Cell's Events. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Setup events on cells. The user can then choose, with the help of an graphic interface, which events are going to be logged. Every time said event occurs a new line in the log file has to be added with the event's name.
 * <br/>
 * <br/>
 *  
 * <b>S055a: Analysis</b><br/>
 * Since there are three events that can occur on cells (onclick, onchange, rightclick) we have to study how and when said events occur.
 * We have to add three new CellListeners which will be implemented in the CellImpl class.
 * With the need of making a graphic interface we have to study how to add another sub-menu. We latter have to sketch an example of the interface as it will be added to the code.
 * <br/>
 * <br/>
 * 
 * <b>S055d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named EventLogFile.
 * To demonstrate the interaction between the User and the UI heres a diagram: <img src="../../../csheets/userstories/us055/doc-files/us055_design1.png">. Every event will be added to the EventList by default.
 * To add Events to cells we have to create new CellListeners, each with its own name and code, but since for this US we only need to write to the logfile, everytime the event occurs the system checks the event's name against the list. If the name is in there it writes to the logFile (name and date).
 * (Diagram Comming Soon)
 * <br/>
 * <br/>
 * 
 * 
 * 
 * @startuml doc-files/us055_design55.png
participant "User" as User
participant "lfc:EventLogFileController" as LFC
participant "EventLogFile" as LogFileUI
participant "el:EventList" as el

User -> LFC:Initialize process
Create LogFileUI
LFC->LogFileUI : create()
LFC->User: show events list
Create el
LogFileUI ->el:create()
loop while stop
alt Add case
User->LFC:Selects event
LFC->LogFileUI:addEventName(event)
LogFileUI->el:add(event)
end
alt Remove case
User->LFC:Selects event
LFC->LogFileUI:removeEventName(event)
LogFileUI->el:remove(event)
end
end 
@enduml
* 
**/
package csheets.userstories.us055;
