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
 * see:<br/>
 * <a href="../../../csheets/ext/searchFiles/package-summary.html">csheets.ext.searchFiles</a><br/>
 * <a href="../../../csheets/ext/searchFiles/ui/package-summary.html">csheets.ext.searchFiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/searchFiles/package-summary.html">csheets.ext.searchFiles</a><br/>
 * <a href="../../../csheets/ext/searchFiles/ui/package-summary.html">csheets.ext.searchFiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * Para testar esta user story, o utilizador deve seguir os passos seguintes:<br/>
 * 1 Executar o CleanSheets;<br/>
 * 2 Clicar no menu Extensions onde serao apresentadas as extensoes disponiveis;<br/>
 * 3 Clicar na extensao searchFiles Menu, será apresentada uma janela;<br/>
 * 4 Nessa janela, o utilizador deverá inserir o padrao do nome do ficheiro e o directorio onde deseja fazer a pesquisa;<br/>
 * 5 O utilizador carrega no botao 'OK' e uma lista de ficheiros ou directorios é apresentada na janela com os resultados da pesquisa.<br/>
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
