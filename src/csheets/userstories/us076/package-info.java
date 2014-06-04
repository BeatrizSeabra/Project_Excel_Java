/**
 * Documentacao tecnica para a user story 076: Pesquisar ficheiros. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Implementar uma extensao que permita pesquisar no disco local por ficheiros cujo nome siga um determinado padrao. Os ficheiros encontrados devem aparecer numa janela modal. 
 * <br/>
 * <br/>
 *  
 * <b>S076a: Analysis</b><br/>
 * Perceber como se inserem extensoes no cleansheets. <br/> 
 * Perceber como pesquisar ficheiros no disco local. <br/>
 * Saber o que e uma janela modal. <br/>
 * Saber como utilizar padroes. <br/>
 * Pedir padrao ao utilizador, procurar ficheiros, e depois mostrar resultado numa janela modal. <br/>
 * <br/>
 * 
 * <b>S076d: Design</b><br/>
 * Para realizar esta user story, temos de criar a classe JDialogSearch, para o Utilizador inserir o padrao e para mostrar os resultados,
 * e a classe Search para realizar a pesquisa dos ficheiros. O diagrama seguinte
 * mostra como integrar estas classes... <br/><br/>
 * <img src="../../../csheets/userstories/us076/doc-files/US076_design.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S076c: Coding</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author 1120564MarcoEsteves
 */
 /*
 *
 @startuml doc-files/US076_design.png
 User -> UIController: searchFiles()
 UIController -> SearchAction: actionListener()
 SearchAction -> SearchFiles: create()
 SearchFiles -> JDialogSearch: create()
 SearchFiles <- JDialogSearch: pattern
 SearchFiles -> SearchFiles : search()
 SearchFiles -> JDialogSearch: results
 @enduml
 *
 */

package csheets.userstories.us076;
