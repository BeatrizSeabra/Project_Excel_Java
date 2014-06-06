/**
 * Technical documentation regarding the user story 007: sort cells. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Sort by order the cells content. For this use case only need to sort one collumn.
 * <br/>
 * <br/>
 *  
 * <b>S007a: Analysis</b><br/>
 * 
 * Since the cells will be filled with strings and number, they will need to be sort by order. The user will be able to choose how he/she want to order the collumn.
 * This will be added to the submenu Sort Cell on Extensions menu that will get the collumn of the active cell.
 * The class method that will be called is SortActionAZ()or SortActionZA(), depending on order that user choose, that allow to order the collumn.
 * That method will call a bunch of methods since order cells, to clean arrays and set cells.
 * <br/>
 * <br/>
 * 
 * * <b>S007d: Design</b><br/>
* To realize this user story we will need to create a subclass of Extension. We will also need to create a subclass of UIExtension.<br/>
* With the uiController i get the active cell to get the respective collumn. Then for each row filled with a number or string, of that collumn, i will get the content to order it.
* Then i'll set the content of the rows that add the content. If there is a row that have a empty cell, the program "deletes" that cell and order with less one content.
* The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
* <img src="../../../csheets/userstories/us007/doc-files/us007_design1.png"> 
* <br/>
* <br/>
* 
* * <b>S007c: Coding</b><br/>
* 
* see:<br/>
* <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
* <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S007u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
* <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
* <br/>
* <br/>
* * <b>S007f: Functional Tests</b><br/>
* To test this user story, the user should follow these steps:<br/>
* 1 run cleansheets;<br/>
* 2 click on the Extensions menu and select Order Cells. Then you must choose with order you like you would like to use;<br/>
* 3 the previous option will get the active cell and order the respective collumn<br/>
* <br/>
* <br/>
* 
 * */

/*
    @startuml doc-files/us007_design1.png
 Create SortAction
 Create JPane
 SortAction->JPane: create()
 JPane-->SortAction: return collumn
 Loop
 SortAction->UIController: getActiveSpreedsheet()
 UIController->Spreedsheet: getCell(collumn,0)
 Spreedsheet->Cell: getContent()
 end

 SortAction->SortAction: sort(ArrayList<String>Content)

 Loop
 SortAction->Cell:setContent(content)
 end
 @enduml
 * 
 */

package csheets.userstories.us007;
