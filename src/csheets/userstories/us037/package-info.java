/**
 * Documentação tecnica da user story 037 : Operador de atribuicao. 
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
 * Ver se funciona 
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
 * o user coloca a informacao e vai para cell
 * vai para o cell imp pelo set content
 * cria uma nova formula e vai ao formula compilar ver se 
 * esta correcta eenvia novamente para a cellImp
 * 
 * 
 * <img src="../../../csheets/userstories/us0037/doc-files/us037_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S037c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/core/formula/compiler/lang/package-summary.html">csheets.core.formula.lang</a><br/>
 * <a href="../../../csheets/core/formula/compiler/compiler/package-summary.html">csheets.core.formula.lang</a><br/>
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
 * Para verificar a atribuicao necessita:<br/>
 * 1- colocar a correr o cleansheets;<br/>
 * 2- colocar numa celula =;<br/>
 * 3- Colocar de seguida a celula "a2" ou "c7" com a atribuiçao e o numero exemplo: a4:=7;<br/>
 * 4- pode colocar a4:=g4:=5, ou colocar a5:=4<6, aparecendo true ou false. <br/>
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