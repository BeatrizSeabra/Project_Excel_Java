/**
 * Technical documentation regarding the user story 072: Link de importação. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Instead of import should be possible to make a link to a text file. The process is similar but from the moment that establishes the link whenever you change the text file to the spreadsheet should be updated.
 * <br/>
 * <br/>
 *  
 * <b>S072a: Analysis</b><br/>
 * This use case is a continuation of previous use case, but now when occurs a modification in  the file, selected by the user, the sheet has to be updated.
 * I have to know how i get the modification in the file and how to connect instantly the sheet.
 *
 * <b>S072d: Design</b><br/>
 * In this Use Case realization we use the same graphic interface and the same classes. We also run the same thread to run this import in parallel to the main program.
 * To  import instantly the file when it is modified we create a while cicle that will be waiting to a modification in the file. When that occurs we import the file.
 * <br/>
 * <br/>
 * <img src="../../../csheets/userstories/us072/doc-files/us072_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S072c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/importfiles/package-summary.html">csheets.ext.importfiles</a><br/>
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S072u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/importfiles/package-summary.html">csheets.ext.importfiles</a><br/>
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * @startuml doc-files/us072_design1.png
   actor User
   User -> ImportAction : 
   extensionImport->uiExtensionImport: getUiExtension() 
   uiExtensionImport->importMenu: getMenu() 
   importMenu->importAction: new ImportAction()
   importAction->FileImporter: create(file)
   FileImporter->importAction: ImportFile(file)
   loop 
       alt date.before(new Date(file.lastModified()))
           FileImporter->importAction: importFile(file)
       end
   end
 @enduml
**/

package csheets.userstories.us072;
