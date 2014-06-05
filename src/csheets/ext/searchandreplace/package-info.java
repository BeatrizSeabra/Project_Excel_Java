/**
 * Extensao para permitir a pesquisa de texto numa spreadsheet<br/>
 * <br/>
 * <b>Sequence Diagram</b><br/> 
 *<img src="doc-files/us022_design1.png"><br/>
 * <br/>
 * @author Diogo Moreira (1120339)
 * 
 */
/*
*
@startuml doc-files/us022_design1.png
User -> UIController: searchAndReplace()
UIController -> SearchAction: actionListener()
SearchAction -> JDialogSearchAndReplace: create()
JDialogSearchAndReplace-> Search : create()
JDialogSearchAndReplace-> Search : texto
Search -> Search: search()
JDialogSearchAndReplace<- Search: celula
SearchAction<- JDialogSearchAndReplace: celula
SearchAction -> SpreadsheetTable:changeSelection(celula)
@enduml
*
*/

package csheets.ext.searchandreplace;
