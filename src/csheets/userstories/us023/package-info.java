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
 * No user story 023 devem ser apresentados todos os match. Sera necessario a
 * utilizacao de threads, bem como a criacao de uma janela de resultados, que
 * ira conter todos os matches encontrados.
 * <br/>
 *
 *
 * <br/>
 * <br/>
 *
 * <b>S023d: Design</b><br/>
 * <br/>
 * <img src="../../../csheets/userstories/us023/doc-files/us023_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S023c: Coding</b><br/>
 * <br/>
 * <br/>
 *
 * <b>S023u: Unit Tests</b><br/>
 *
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
 JDialogSearchAndReplace-> Search : searchAll()
 Search->JDialogSearchAndReplace: updateMatch()
 @enduml
 *
 */
package csheets.userstories.us023;
