/**
 * Documentação tecnica da user story 037 : Operador de atribuicão. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Acrescentar o operator ":=" para atribuicao. Este operador deve atribuir a
 * esquerda o resultado da expressao a 
 * direita do operador. Para ja a esquerda deve se possivel colocar o nome de uma celula.
 * <br/>
 * <br/>
 *  
 * <b>S037a: Analysis</b><br/>
 * Vai ser criada uma nova formula,
 * verifica la na celulua
 * colocar um novo token :=
 * Fazer a funçao para atribuicao e colocar na celula certa
 *  
 * <br/>
 * <br/>
 * 
 * <b>S037d: Design</b><br/>
 * <br/><br/>
 * O user introduz texto na celula.
 * Se o texto começar por = assim assume uma formula.
 * A formula por sua vez é uma expressao.
 * Vai validar a expressao e faz o que é pretendido
 * use case:
 * o user coloca a informaçao e vai para cell
 * vai para o cell imp pelo set content
 * cria uma nova formula e vai ao formula compilar ver se 
 * esta correcta eenvia novamente para a cellImp
 * 
 * 
 * <img src="../../../csheets/userstories/us001/doc-files/us037_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S037c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/core/formula/lang/package-summary.html">csheets.core.formula.lang</a><br/>
 * <a href="../../../csheets/core/formula/compiler/package-summary.html">csheets.core.formula.compiler</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S037u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S037f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1- run cleansheets;<br/>
 * 2- click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
 * 3- the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
 * 4- the sidebar window should have only one editbox. <br/>
 * <br/>
 * <br/>
 * 
 * @author Frederico Calor
 */
/*
 *
  @startuml doc-files/us037_design1.png
   User->Cell: dados 
   Cell->CellImpl: setContent() 
   CellImpl->Formula: create
   Formula->FormulaCompiler: getInstance()
   FormulaCompiler->FormulaCompiler: compile() 
   FormulaCompiler->CellImpl: instance 
   CellImpl->CellImpl: updateDependencies() 
   CellImpl->CellImpl: fireContentChanged() 
   CellImpl->CellImpl: reevaluate()
  @enduml
 *
 */
package csheets.userstories.us037;