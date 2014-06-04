/**
 * Documentacao tecnica da user story 034 : Funcao Eval. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Esta funcao tem um único parametro que é uma string. A execucao dessa funcao 
 * o que faz é compilar o texto da string e executar a expressão obtida. O 
 * resultado da funcão eval é o resultado da expressão compilada. Por exemplo, 
 * se escrevermos a seguinte fórmula "="2+3"" o que obtemos é a string "2+3" na 
 * célula. No entanto, se escrevermos a fórmula "=eval("2+3")" o que obtemos é o 
 * valor 5 na célula. 
 * <br/>
 * <br/>
 *  
 * <b>S001a: Analysis</b><br/>
 * Terá de ser criada uma nova Formula para ser verificada na cell. Para isso, 
 * terá de ser acrescentado á gramatica existente o reconhecimento lexico da 
 * funcão Eval("").
 * irá ser definido um novo token a acrescentar ao Formula.tokens; 
 * irá ser definido uma nova regra no Formula.g
 * irá ser actualizado o FormulaLexer e o FormulaParser
 * no final, ira ser criada a classe Eval.java no package csheets.core.formula.lang 
 * contendo metodos necessarios para a classe funcionar correctamente. 
 * 
 * <br/>
 * <br/>
 * 
 * <b>S001d: Design</b><br/>
 * O utilizador ira introduzir um texto numa celula. Se o texto comecar por '='
 * isto ira despoletar um trigger e assumir uma nova formula (expressao)
 * essa expressao irá originar uma FunctionCall (Eval (argumentos))
 * esses argumentos, irao originar uma binaryOperation (LeftOperand, Operator, RightOperand)
 * o resultado da BinaryOperation irá ser o novo texto a ser apresentado na celula original.
 * 
 * 
 * <br/>
 * <br/>
 * <img src="../../../csheets/userstories/us034/doc-files/us034_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S001c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S001u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S001f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1- run cleansheets;<br/>
 * 2- click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
 * 3- the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
 * 4- the sidebar window should have only one editbox. <br/>
 * <br/>
 * <br/>
 * 
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
/*
 *
  @startuml doc-files/us034_design1.png
    User->Cell: dados
    Cell->CellImpl: setContent()
    CellImpl->Formula: create
    Formula->FormulaCompiler: getInstance()
    FormulaCompiler->FormulaCompiler: compile()
    FormulaCompiler->Eval : String
    Eval->Formula: create
    Formula->FormulaCompiler: getInstance()
    FormulaCompiler->FormulaCompiler: compile()
    FormulaCompiler->CellImpl: instance
    CellImpl->CellImpl: updateDependencies()
    CellImpl->CellImpl: fireContentChanged()
    CellImpl->CellImpl: reevaluate()
  @enduml
 *
 */
package csheets.userstories.us034;