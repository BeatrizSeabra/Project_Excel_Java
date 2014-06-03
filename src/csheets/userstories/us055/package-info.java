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
 * With further investigation we learned that every event are subclasses of the AbstractAction class.
 * With the need of making a graphic interface we have to study how to add another sub-menu. We latter have to sketch an example of the interface as it will be added to the code.
 * <br/>
 * <br/>
 * 
 * <b>S055d: Design</b><br/>
 * 
 * <br/>
 * <br/>
 * 
 **/
package csheets.userstories.us055;
