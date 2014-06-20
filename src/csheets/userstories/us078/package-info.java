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
 * For this use case, the previous issue code used, will be reutilize to allow the user to do multiple searches, and by just setting a word, all the files that have this parameter shall be displayed.
 * <br/>
 * 
 *
 * * <b>S078d: Design</b><br/>
 *  To realize this user story, there is the class JDialogSearchFilesByContent, to the user insert not only the directory but also the content that should be searched in the files.<br/>
 *  For the realization of this use case, it will be needed the use of threads, not only for the multiple searchesbut also to the user search for a content in file and do this in background.<br/>
 *  <br/>
 * <img src="../../../csheets/userstories/us078/doc-files/US078_design.png">
 * 
 * <br/>
 * <br/>
 *
 *
 *
 *<b>S07c: Coding</b><br/>
 * see:<br/>
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
 *
 *
 *
 *
*/



/*
@startuml doc-files/US078_design.png
 User -> UIController: searchFiles()
 loop for SearchAction : sa
 UIController -> SearchAction: actionListener()
 SearchAction -> Thread : search()
 SearchAction <- Thread
 SearchAction -> SearchFiles: create()
 SearchFiles -> JDialogSearch: create()
 SearchFiles <- JDialogSearch: pattern
 SearchFiles -> SearchFiles : search()
 SearchFiles -> JDialogSearch: results
@enduml
*/


package csheets.userstories.us078;
