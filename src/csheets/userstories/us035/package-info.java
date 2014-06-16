/**
 * Technical documentation regarding the user story 035: block of instructions.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Add the possibility of write a block (or sequence) of instructions. A block must be 
 * bounded by braces and his instructions splitted by ";". Instructions of a block 
 * are executed sequentially an the result of block is the result of last instruction of that block.
 * For example the formula "={1+2; sum(A1:A10); B3+4}" must result in execution sequentially of all
 * expressions and the result will be the value of expression "B3+4".
 * <br/>
 * <br/>
 *
 * <b>S035a: Analysis</b><br/>
 * This functionality function will now allow the user insert in the formula bar a block
 * of instructions that will be executed sequentially, being displayed in cell the result
 * of last instruction.
 * <br/>
 * <br/>
 *
 * <b>S035d: Design</b><br/>
 * In order to build this funcionality it will be need to edit the class ExcelExpressionCompiler to compile blocks.
 * <br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us035_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S035c: Coding</b><br/>
 * <br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S035u: Unit Tests</b><br/>
 * see:<br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S035f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1run cleansheets;<br/>
 * 2insert on the formula bar the block to be executed;<br/>
 * 3to test insert some instructions splitted by ";" between brackets (ex. "={A1+4;A1+3}").
 * The result of last instruction appears in the cell.<br/>
 * 
 * <br/>
 * <br/>
 * 
* @author alexandrebraganca
 */
/*
 *
 @startuml doc-files/us035_design1.png
    cellEditor->cellImpl: setContent()
    cellImpl->FormulaCompiler: storeContent()
    FormulaCompiler->ExcelExpressionCompiler : compile()
    ExcelExpressionCompiler->CellImpl : evaluate()
  @enduml
 *
 */
package csheets.userstories.us035;
