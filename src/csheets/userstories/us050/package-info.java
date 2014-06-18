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
* Create a new window WorkbookEventsFormulaUI similar to WorkBookEventsUI but with a text field for the 
* user writing the formula.
* This should call the addEvent() method of the class csheets.ext.logfile.AtributeFormula which should add 
* their events associated to the formula.
* It's also necessary to make appropriate amendments to the method for the same treating the due events 
* (opening, closing, sheet set, cleared leaf, leaf renamed)<br/><br/>
* <img src="../../../csheets/userstories/us050/doc-files/us050_design1.png">
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
 participant "a : AtributeFormula" as AF
 participant "workboock : Workboock" as WK
 -> WB : JButtonOK;
 WB -> AF : addEvent();
 AF -> WK : <<create>>
 AF -> WK : addWorkbookEvent();
 @enduml
*
*/
package csheets.userstories.us050;
