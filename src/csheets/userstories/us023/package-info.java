/**
 * Documentação referente ao user story us023: Match multiplo
 * <br/>
 * <br/>
 *
 * <b>Requerimento</b><br/>
 * US023- Match multiplo - Deve ser apresentado todos os matches, a medida que
 * vao sendo encontrados, numa janela de resultados.
 *
 * </br>
 * </br>
 *
 * <b>S023a: Analysis</b><br/>
 * No user story 023 devem ser apresentados todos os match. Será necessário a
 * utilização de threads, bem como a criação de uma nova janela para apresentar
 * os resultados que serão encontrados na folha.
 * <br/>
 *
 *
 * <br/>
 * <br/>
 *
 * <b>S023d: Design</b><br/>
 * <br/>
 * Para implementar este caso de uso e' necessario criar 1 classe nova UpdateSearch. 
 * A classe UpdateSearch, surge quando a opcao Search All da janela
 * JDialogSearchAndreplace e selecionada. A class Search é responsavel 
 * por pesquisar todos os elementos iguais ao texto inserido.
 * <img src="../../../csheets/userstories/us023/doc-files/us023_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S023c: Coding</b><br/>
 * Na implementação do código para este problema foi adicionada uma nova classe
 * "UpdateSearch" para apresentar os resultados encontrados, bem como um novo
 * método na classe "Search" designado por "SearchAll" para pesquisar todas as
 * linhas e colunas da folha. <br/>
 * see:<br/>
 * <a href="../../../csheets/ui/crtl/package-summary.html">csheets.ui.crtl</a><br/>
 * <a href="../../../csheets/ext/searchandreplace/package-summary.html">csheets.ext.searchandreplace</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S023u: Unit Tests</b><br/>
 * A realização de testes unitários foi bem sucedida. <br/>
 * Utilizei procura com vários tipos, como por exemplo: "1"; "a"; ""; null; "[ ]*"; "VR[0-9]*".
 * see:<br/>
 * <a href="../../../csheets/ext/searchandreplace/package-summary.html">csheets.ext.searchandreplace</a><br/>
 * <br/>
 * <b>S023f: Functional Tests</b><br/>
 *
 *
 *
 * @author 1110316
 */
/*
 @startuml doc-files/us023_design1.png
 User -> UIController: searchAndReplace()
 UIController -> SearchAction: actionListener()
 SearchAction -> JDialogSearchAndReplace: create()
 JDialogSearchAndReplace-> Search : create()
 Search -> Search: searchAll()
 Search -> UpdateSearch: run()
 @enduml
 *
 */
package csheets.userstories.us023;
