/**
 * Technical documentation regarding the user story 036: "DoWhile" e "WhileDo" instructions.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Add the possibility to use "DoWhile" e "WhileDo" instructions.
 * DoWhile should execute one expression/block and only after test a expression
 * that indicates if it loop's again.
 * WhileDo tests the expession 1st, and then executes.
 * Example input
 * ={@conta=1;WhileDo(EVAL("A"&@conta)>0;{C1 = C1+EVAL("B" & @conta);
 * @conta := @conta+1})}
 * <br/>
 * <br/>
 *
 * <b>S036a: Analysis</b><br/>
 * Terá de ser criada duas novas Formulas para serem verificadas na cell. Para isso, 
 * terá de ser acrescentado á gramatica existente o reconhecimento lexico das 
 * funcões WhileDo("");{} e DoWhile("");{}
 * terão de ser definido novos tokens a acrescentar ao Formula.tokens; 
 * terão de ser definidas novas regras no Formula.g
 * actualizar o FormulaLexer e o FormulaParser
 * no final, terão de ser criadas a classe WhileDo.java e DoWhile.java no package csheets.core.formula.lang 
 * contendo metodos necessarios para a classe funcionar correctamente. 
 * 
 * <br/>
 * <br/>
 *
 * <b>S036d: Design</b><br/>
 * In order to build this funcionality it will be need to edit the class ExcelExpressionCompiler to compile DoWhile and WhileDo.
 * <br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us036_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S036c: Coding</b><br/>
 * <br/>
 *
 * <b>S036u: Unit Tests</b><br/>
 * <br/>
 *
 * <b>S036f: Functional Tests</b><br/>
 * <br/>
 * 
* @author 1120588
 */
/*
 *
 @startuml doc-files/us036_design1.png
    cellEditor->cellImpl: setContent()
    cellImpl->FormulaCompiler: storeContent()
    FormulaCompiler->ExcelExpressionCompiler : compile()
    ExcelExpressionCompiler->CellImpl : evaluate()
  @enduml
 *
 */
package csheets.userstories.us036;
