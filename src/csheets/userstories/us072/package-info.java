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
 * <b>S072f: Functional Tests</b><br/>
 *  <ul><li>1. The User choose the menu "Extensions".</li></ul>
 *  <ul><li>2. Picks the option import TXT.</li></ul>
 *  <ul><li>3. Choose the pretended file.</li></ul>
 *  <ul><li>4. Look to the result on de sheet.</li></ul>
 *  <ul><li>5. After the file is open when the user modifie the file and save it, the changes will automatically to the sheet in the active cell.</li></ul>
 *  <ul><li>6. The selected file will be the last file that the user select to import, could be changed repeating all the latest steps.</li></ul>
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
