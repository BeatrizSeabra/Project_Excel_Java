/**
 * Technical documentation regarding the user story 056: Cell's Events with formulas. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Join the events of cell formulas that must be performed. 
 * Must be at least one new function (in formulas) that allows you to write text in the log file.
 * <br/>
 * <br/>
 *  
 * <b>S056a: Analysis</b><br/>
 * Since there are two types of events that are already defined, the user can atribute a formula that event.
 * So if the cell event has a formula assigned to it, everytime that event occurs, the formula is executed.
 * For everytime that a formula is executed, it will write on log file when the event occurs.
 * <br/>
 * <br/>
 * 
 * <b>S056d: Design</b><br/>
 * The user will introduce a text in a cell. If the text starts by "=" and contains EVSET it will assign a event cell that is on the parameters to the formula that comes afer the event cell.
 * That expression will originate a functionCall and there will have a method that will associate the event cell to the formula. 
 * Then will have a method that will verify if the cell event have any formula assign and if there is will write on the cell the content relative to the formula.
 * Then if setContent() happens, it will write too on the EventLogFile.
 * <br/>
 * <br/>
 * 
 * <b>S056c: Coding</b><br/>

 * <br/>
 * <br/>
 * 
 * <b>S056u: Unit Tests</b><br/>
 *
 * <br/>
 * <br/>
 * 
 * <b>S056f: Functional Tests</b><br/>

 * <br/>
 * <br/>
 * 
 * @author Stefan Parker
 **/
package csheets.userstories.us056;
