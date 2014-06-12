/**
 * Technical documentation regarding the user story 055: Cell's Events. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Setup events on the workbook. The user can choose, with the help of an graphic interface, which events are going to be logged. Every time the event occurs a new line in the log file has to be added with the event's name.
 * <br/>
 * <br/>
 *  
 * <b>S055a: Analysis</b><br/>
 * Since there are many events to apply on the workbook like (Open, Close, sheetCreated, sheetDeleted and sheetRenamed) we have to study how and when said events occur.
 * With the need of making a graphic interface we have to study how to add another sub-menu. We latter have to sketch an example of the interface as it will be added to the code.
 * <br/>
 * <br/>
 * 
 * <b>S055d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named EventLogFile.
 * To demonstrate the interaction between the User and the UI heres a diagram: <img src="../../../csheets/userstories/us055/doc-files/us055_design1.png">. Every event will be added to the EventList by default.
 * Since for this US we only need to write to the logfile, every time the events occurs the system checks the event's name against the list. If the name is in there it writes to the logFile (Events name + date).
 * Close: the source of this event is when the workbook close,after the method to close the workbook is called we call the writeLogFile method. 
 * Open: the source of this event is when the workbook open,after the method to open the workbook is called we call the writeLogFile method.
 * sheetCreated: the source of this event is when a sheet is created,after the method to create a sheet is called we call the writeLogFile method.
 * sheetDeleted: the source of this event is when a sheet is removed,after the method to remove a sheet is called we call the writeLogFile method.
 * sheetRenamed: the source of this event is when a sheet is renamed,after the method to rename a sheet is called we call the writeLogFile method. The method to rename is not implemented in de cheasheets yet.
 * <br/>
 * <br/>
 * 
 * <b>S055c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/logfile/package-summary.html">csheets.ext.logfile</a><br/>
 * <a href="../../../csheets/ext/logfile/ui/package-summary.html">csheets.ext.logfile.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S055u: Unit Tests</b><br/>
 * Has this user story only have a UI and write the workbook events when they are called in a txt file, we don't create unit Tests. To teste and execute this US see Functional Tests below.
 * <br/>
 * <br/>
 * 
 * @author Nélson Mourão
 **/
/*
 * @startuml doc-files/us049_design.png
actor User 
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
package csheets.userstories.us049;
