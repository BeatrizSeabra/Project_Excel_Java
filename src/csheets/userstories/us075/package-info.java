/**
 * Technical documentation regarding the user story 075: Exportation Link. 
 * <br/>
 * <br/>
 * 
* <b>Requirement</b><br/>
* Instead of exporting, it should be possible to link to a file text. 
* The process is similar but from the moment the link is established, whenever the cell change, the text file must be updated.
* <br/>
* <br/>
*  
* <b>S075a: Analysis</b><br/>
* It will be possible to, whenever that the cell changed, and if the file is already created (that means that the link needs to be established), the content is updated in the text file.
* For that there will be a thread and a cicle that makes the thread to run until export is called again.
* That way if a cell is changed, there will be an exportation of that modification. The thread continues running.
* <br/>
* <br/>
* 
* <b>S075d: Design</b><br/>
* To realize this userstory first we need to call the method to write to the file in the action performed. That still needs to be done at same time the program runs, so we still need the thread to run both of them at same time.
* After the file is created, there will be a second writing file method that write everytime a cell change. For that, there is a boolean created on UIController with the respective get and set, and Cell Listeners on the spreedsheet that verifies if the content is changed(implemented on TxtAction). If there is any change, the boolean is set to true and the method to write is called.
* After the writing of the changed content, the boolean returns to false again and continue to verify.
* <br/>
* <br/>
* <img src="../../../csheets/userstories/us075/doc-files/us075_design1.png"> 
* <br/>
* <br/>
* 
* <b>S075c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/exporttxt/package-summary.html">csheets.ext.exporttxt</a><br/>
* <a href="../../../csheets/ext/exporttxt/ui/package-summary.html">csheets.ext.exporttxt.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S075u: Unit Tests</b><br/>
* <a href="../../../csheets/ext/exporttxt/package-summary.html">csheets.ext.exporttxt</a><br/>
* <a href="../../../csheets/ext/exporttxt/ui/package-summary.html">csheets.ext.exporttxt.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S075f: Functional Tests</b><br/>

* <br/>
* <br/>
* 
*/
/*@startuml doc-files/us075_design1.png
   actor User
   User -> ExtensionTxt : Export txt
   ExtensionTxt->UIExtensionTxt: getUiExtension() 
   UIExtensionTxt->TxtMenu: getMenu() 
   TxtMenu->TxtAction: new TxtAction()
   TxtAction->FileExporter: create(file)
   FileExporter->TxtAction: ExportFile(file)
   loop 
       alt uiController.getModificado()
           FileExporter->TxtAction: ExportFile2(file)  
       end
   end
@enduml
*/

package csheets.userstories.us075;
