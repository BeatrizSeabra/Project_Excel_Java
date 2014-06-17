/*
 * Technical documentation regarding the user story 069: Workbook Real Time List. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Real time workbook monitoring of one or more folders.
 * <br/>
 * <br/>
 *  
 * <b>S069a: Analysis</b><br/>
 * 
 * This userstory requires that the aplication keeps an updated list of the existing workbook files on one or more specified folders by the user
 * This means that every few seconds(?) the aplication must execute a workbook file search on the folder and update the previous existing list of results.
 * <br/>
 * <br/>
 * 
 * * <b>S069d: Design</b><br/>


*To implement this use case I used a thread which is responsible for making a file search parallel to the rest of the aplication. This way we are able to use the aplication at the same time the folder is being monitored.<br/>
*First the user choses a folder that he wants to monitor, after that all folders and sub-folders in that directory are monitored.<br/>
*The monitoring is done by making constant searches for workbook files. This means that a few seconds after the content of the folder is changed, the results list is updated.<br/>
*The use of joins operation in this case doesn't make sense since we want the run the folder monitoring in the background and we don't want a thread to wait for another thread.<br/>

* <img src="../../../csheets/userstories/us007/doc-files/us069_design1.png"> 
* <br/>
* <br/>
* 
* * <b>S069c: Coding</b><br/>
* 
* see:
 * <a href="../../../csheets/ext/findworkbooksfiles/FolderMonitor.java">csheets.ext.findworkbooksfiles.FolderMonitor.java</a><br/>
 * <a href="../../../csheets/ext/findworkbooksfiles/ui/FindWorkbooksFilesMenu.java">csheets.ext.findworkbooksfiles.ui.FindWorkbooksFilesMenu.java</a><br/>
* <a href="../../../csheets/ext/findworkbooksfiles/ui/FolderMonitorAction.java">csheets.ext.findworkbooksfiles.ui.FolderMonitorAction.java</a><br/>
* <a href="../../../csheets/ext/findworkbooksfiles/ui/JFrameWorkbookSearchResults.java">csheets.ext.findworkbooksfiles.ui.JFrameWorkbookSearchResults.java</a><br/>
* <br/>
* <br/>
* 
* <b>S069u: Unit Tests</b><br/>
* Since no methods with returns where used, in this case it doesn't make much sense using JU tests. In order to test this functinality we should use Functional Tests <br/>
* <br/>
* <br/>
* * <b>S069f: Functional Tests</b><br/>

To test this use case you should follow this steps:<br/>
 * 1. Run cleansheats;<br/>
 * 2. Click on the menu Extensions, click on Find Workbook Files and select the option Monitor a folder;<br/>
 * 3. Choose a folder to monitor;<br/>
 * 4. Wait for the workbook files to show up on the results list;<br/> 
 * 5. You can select a file and see a sample of it's content and by clicking on the Open File button you can open it on Cleansheats<br/>
 * 6. To check if the results list is refreshed you can try and delete a file, wait a few seconds, and see if it disappears from the results list. <br/>
* <br/>
* <br/>

@startuml doc-files/us069_design1.png
actor User
participant "FolderMonitorAction" as searchAction
participant "<b>fc</b> : FileChooser" as FC
participant "FolderMonitor" as workbookSearch
participant Thread as thread
participant "JFrameWorkbookSearchResults" as window
participant JDialogShowFirstLine
participant CleanSheets as cs

  
User -> searchAction: actionPerformed(ActionEvent event)
searchAction-> FC : <b>fc</b> = new FileChooser()
searchAction-> FC : <b>fc</b>.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY)
searchAction-> FC : <b>fc</b>.showDialog()
...
searchAction-> window: <b>workbookSearchResults</b> = new JFrameWorkbookSearchResults(null)
searchAction-> workbookSearch: <b>folderMonitor</b> = new FolderMonitor()
searchAction-> workbookSearch: <b>folderMonitor</b>.folderMonitor(fc.getSelectedFile(), ".*\\.cls", workbookSearchResults)
loop
workbookSearch-> thread: <b>thread</b> = new Thread(new ParallelSearch(startingDirectory, pattern, workbookSearchResults))
workbookSearch-> thread: <b>thread</b>.start()
...

loop for File <b>fileDirectory</b> : 
   thread-> window: <b>windowLWF</b>.updateInformation(File file)
end

loop
window->window: valueChanged()
window->JDialogShowFirstLine: create()
JDialogShowFirstLine->JDialogShowFirstLine: open()
JDialogShowFirstLine->cs: create()
end
end
@enduml
* 
 * */



package csheets.userstories.us069;
