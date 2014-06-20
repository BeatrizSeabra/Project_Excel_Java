/**
* Technical documentation regarding the user story 050:  Workbook Events with formulas. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Associate workbook events to formulas that must be performed. 
* Must have at least one new function (in the formula) that allows you to write text in the log file.
* <br/>
* <br/>
*  
* <b>S050a: Analysis</b><br/>
* Talking with the colleague who developed the previous U.S. (US49) to understand how the application works 
* from the user perspective and to meet the involved classes. Analyze the classes involved to understand 
* how the application works in view of the upcoming. Analyze how the application should work from the 
* user perspective. Analyze what is necessary to add the application for it work.
* <br/>
* <br/>
* 
* <b>S050d: Design</b><br/>
* In the UIController class add a String[5] formulas and an ArrayList evlf. The first is for to contains the 
* message that the user want to add to the LogFile and the second the list of events that the user chooses.
* Adding a method writeLogFile(String event, String[] formulas) in the existent class WriteLogFile.
* That funcion chould write the events in the LogFile if the association between the formulas[5] and the evlf
* is correct.
* The classes OpenAction, CloseAction, AddSpreadsheetAction, RemoveSpreadsheetAction and RenameSpreadSheetAction
* call the writeLogFileWB("Open, Close, sheetCreated...") function through the UIController class which calls
* the writeLogeFileWBF(String event) function that calls the WriteLogFile.writeLogFile(event, formulas) function
* by WriteLogFile class.
* It's also necessary create a class WorkbookEventsFormulaUI which contains the user interface to write the 
* formula and choose the intented. Than it will change the vars formula and evlf for content the events and the
* formula.
* <img src="../../../csheets/userstories/us050/doc-files/us050_design1.png"/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design2.png"/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design3.png"/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design4.png"/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design5.png"/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design6.png"/>
* <br/>
* <br/>
* 
* <b>S050c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S050u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S050f: Functional Tests</b><br/>
* To test this user story, the user should follow these steps:<br/>
* 1run cleansheets;<br/>
* 2click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
* 3the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
* 4the sidebar window should have only one editbox. <br/>
* <br/>
* <br/>
* 
* @author alexandrebraganca
*/
/*
*
 @startuml doc-files/us050_design1.png
 participant "WorkboockEventsFormulaUI" as WB
 participant "uiController : UIController" as UI
 -> WB : JButtonOK;
 WB -> UI : setFormula(OPEN,fomrula);
 WB -> UI : setFormula(CLOSE,fomrula);
 WB -> UI : setFormula(SHEETCREATED,fomrula);
 WB -> UI : setFormula(SHEETDELETED,fomrula);
 WB -> UI : setFormula(SHEETRENAMED,fomrula);
 WB -> UI : setFormula(Evlf);
 @enduml
 @startuml doc-files/us050_design2.png
 participant ": OpenAction" as OA
 participant "uiController : UIController" as UI
 participant ": WriteLogFile" as WLF
 OA -> UI : writeLogFileWB("Open");
 UI -> UI : writeLogFileWBE(event);
 UI -> WLF : writeLogFile(event,formulas);
 @enduml
 @startuml doc-files/us050_design3.png
 participant ": CloseAction" as A
 participant "uiController : UIController" as UI
 participant ": WriteLogFile" as WLF
 A -> UI : writeLogFileWB("Close");
 UI -> UI : writeLogFileWBE(event);
 UI -> WLF : writeLogFile(event,formulas);
 @enduml
 @startuml doc-files/us050_design4.png
 participant ": AddSpreadsheetAction" as A
 participant "uiController : UIController" as UI
 participant ": WriteLogFile" as WLF
 A -> UI : writeLogFileWB("sheetCreated");
 UI -> UI : writeLogFileWBE(event);
 UI -> WLF : writeLogFile(event,formulas);
 @enduml
 @startuml doc-files/us050_design5.png
 participant ": RemoveSpreadsheetAction" as A
 participant "uiController : UIController" as UI
 participant ": WriteLogFile" as WLF
 A -> UI : writeLogFileWB("sheetDeleted");
 UI -> UI : writeLogFileWBE(event);
 UI -> WLF : writeLogFile(event,formulas);
 @enduml
 @startuml doc-files/us050_design6.png
 participant ": RenameSpreadsheetAction" as A
 participant "uiController : UIController" as UI
 participant ": WriteLogFile" as WLF
 A -> UI : writeLogFileWB("sheetRenamed");
 UI -> UI : writeLogFileWBE(event);
 UI -> WLF : writeLogFile(event,formulas);
 @enduml
*
*/
package csheets.userstories.us050;
