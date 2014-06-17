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
 *  Para realizar esta user story, temos de criar a classe JDialogSearch, para o Utilizador inserir o padrao e o diretorio, tal como decorreu no issue passado mas desta vez deve dar mais opçoes de pesquisa ao utilizador.<br/>
 *  A utilização de threads será necessária ao longo de todo o issue uma vez que serao necessarios multiplos processos a decorrer ao mesmo tempo. <br/>
 *  <br/>
 * <img src="../../../csheets/userstories/us078/doc-files/US078_design.png"> 
 * <br/>
 * <br/>
 *
 *
 *
 *
 *
 *
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
