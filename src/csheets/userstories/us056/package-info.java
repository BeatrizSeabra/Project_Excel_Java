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
 * The user can choose too to use an interface that can select the events and introduce the formula on a textbox and that will originate the same thing(call a method to associate the formula to event)
 * That expression will originate a functionCall and there will have a method that will associate the event cell to the formula. 
 * Then there will be cell listeners that whenever the event happens, it apply the formula to the cell.
 * It will write on the EventLogFile when the function is called.
 * <br/>
 * <br/>
 * 
 * <b>S056c: Coding</b><br/>
 * See:<br/>
 * <a href="../../../csheets/ext/logfile/package-summary.html">csheets.ext.logfile</a><br/>
 * <a href="../../../csheets/ext/logfile/ui/package-summary.html">csheets.ext.logfile.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S056u: Unit Tests</b><br/>
 ** see:<br/>
 * <a href="../../../csheets/ext/logfile/package-summary.html">csheets.ext.logfile</a><br/>
 * <a href="../../../csheets/ext/logfile/ui/package-summary.html">csheets.ext.logfile.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S056f: Functional Tests</b><br/>
 * * To test this user story, the user can try in different ways:
 * First mode:
 * 1- Run cleansheets;
 * 2- Click on the Extension menu, go to EventLogFile. There must appear a menu option containing one option for the Events with formula;<br/>
 * 3- The previous option is a set of two check boxes that when checked and after introduced a formula, when that event occurs, the cell change to the formula result<br/>
 * 4- This will write on EventLogFile which event was choosen and it's formula assigned <br/>
 * <br/>
 * <br/>
 * Second mode:
 * 1- Run cleansheets;
 * 2- Write on function mode "Evset( event , formula ).
 * 3- It will only write on EventLogFile and write on cell the formula (Not implemented, it should get the event and when that occurs, the cell change to the formula result).
 * @author Stefan Parker
 **/
package csheets.userstories.us056;
