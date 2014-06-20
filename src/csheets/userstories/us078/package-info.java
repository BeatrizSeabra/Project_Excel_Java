/*
 * Technical documentation regarding the user story 078: Search by content.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * There should be allowed multiple researches and it should be possible to search by the content of the files. (Text files only).
 * <br/>
 * <br/>
 *
 * <b>S078a: Analysis</b><br/>
 * For this use case, the previous issue code used, will be reutilize to allow the user to do multiple searches, and by just setting a word, all the files that have this parameter shall be displayed.<br/>
 * The function to search by content is intended to be a new option unde the Search Menu.<br/>
 * <br/>
 * 
 *
 * * <b>S078d: Design</b><br/>
 *  To realize this user story, there is the class JDialogSearchFilesByContent, to the user insert not only the directory but also the content that should be searched in the files.<br/>
 *  For the realization of this use case, it will be needed the use of threads, not only for the multiple searchesbut also to the user search for a content in file and do this in background.<br/>
 *  <br/>
 * <img src="../../../csheets/userstories/us078/doc-files/US078_design.png">
 * <img src="../../../csheets/userstories/us078/doc-files/US078_design02.png">
 * <br/>
 * <br/>
 *
 *
 *
 *<b>S07c: Coding</b><br/>
 * see:<br/>
 * It's is important to refer that the changes done to the last US077 is the clear list,so basically now the thread doesn't clear the search when the user select a new one<br/>
 * <a href="../../../csheets/ext/searchFilesBackground/package-summary.html">csheets.ext.searchFilesBackground</a><br/>
 * <a href="../../../csheets/ext/searchFilesBackground/ui/package-summary.html">csheets.ext.searchFilesBackground.ui</a><br/>
 * <a href="../../../csheets/ext/searchFilesByContent/package-summary.html">csheets.ext.searchFilesByContent</a><br/>
 * <a href="../../../csheets/ext/searchFilesByContent/ui/package-summary.html">csheets.ext.searchFilesByContent.ui</a><br/><br/>
 * <br/>
 *
 *<b>S077u: Unit Tests</b><br/>
 * Since the method that do the search, is restrained on the thread, since all the searches we are doing must be in background.<br/>
 * it is not possible to realize unit tests in this way.<br/>
 * Like my last colleague said, it is needed to advise of some validation results on this extension.<br/>
 * this is mainly refered to messages on the side bars that switch from "background" to "files not found" if no file is found with the wanted content.<br/>
 * <br/>
 * <br/>
 *
 * <b>S078f: Functional Tests</b><br/>
 * To test the functionality of multiple background searches, the user has to follow the current steps: <br/>
 * 1.Execute the CleanSheets. <br/>
 * 2.Select the sidebar relative to the search files. <br/>
 * 3.Select on the menu the option Extensions. <br/>
 * 4.Select in the Extensions the option  SearchFiles Menu. <br/>
 * 5.Select in the SearchFiles Menu the option SearchFiles in Background. <br/>
 * 6.Insert in the JDialog the Pattern and the Directory <br/>
 * 7.Confirm the operation with the OK button. <br/>
 * 8.After the confirmation, a MessageDialog will appear to inform that the search has begin and another MessageDialog to inform when it ends. <br/>
 * The files from the search will be listed on the sideBar. <br/>
 *
 *
 * To test the functionality of search by Content, the user has to follow the current steps: <br/>
 * 1.Execute the CleanSheets. <br/>
 * 2.Select the sidebar relative to the search files by content. <br/>
 * 3.Select on the menu the option Extensions. <br/>
 * 4.Select in the Extensions the option  SearchFiles Menu. <br/>
 * 5.Select in the SearchFiles Menu the option SearchFiles by Content. <br/>
 * 6.Insert in the JDialog the Content and the Directory <br/>
 * 7.Confirm the operation with the OK button. <br/>
 * 8.After the confirmation, a MessageDialog will appear to inform that the search has begin and another MessageDialog to inform when it ends. <br/>
 * The files from the search will be listed on the sideBar. <br/>
 * <br/>
 * <br/>
 *
 *
 *
*/



/*
@startuml doc-files/US078_design.png
 loop
 User -> UIController: searchFiles()
 UIController -> SearchAction: actionListener()
 SearchAction -> Thread : search()
 SearchAction <- Thread
 SearchAction -> SearchFiles: create()
 SearchFiles -> JDialogSearch: create()
 SearchFiles <- JDialogSearch: pattern
 SearchFiles -> SearchFiles : search()
 SearchFiles -> JDialogSearch: results
 end
@enduml
*/

/*
 @startuml doc-files/US78_design02.png
 loop
 User -> UIController: searchFiles()
 UIController -> SearchAction: actionListener()
 SearchAction -> Thread : search()
 SearchAction <- Thread
 SearchAction -> SearchFiles: create()
 SearchFiles -> JDialogSearch: create()
 SearchFiles <- JDialogSearch: content
 SearchFiles -> SearchFiles : search()
 SearchFiles -> JDialogSearch: results
 end
*/


package csheets.userstories.us078;
