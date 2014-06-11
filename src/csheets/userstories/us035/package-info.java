/**
 * Technical documentation regarding the user story 035: block of instructions.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Add the possibility of write a block (or sequence) of instructions. A block must be 
 * bounded by braces and his instructions splitted by ";". Instructions of a block 
 * are executed sequentially an the result of block is the result of last instruction of that block.
 * For example the formula "={1+2; sum(A1:A10); B3+4}” must result in execution sequentially of all
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
 * <br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us035_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S035c: Coding</b><br/>
 * see:<br/>
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
 * 2click on the Extension menu and select contacts. There must appear a contacts list.<br/>
 * 3to test create option, he should click on create button it will show a new window, now user must fill data, if succeed the contact created is visible on the list.<br/>
 * 4to test edit/remove option, he should click on contact he wants edit, it will pop a window with contact information, then if chooses to remove and confirm and get succeed it will be removed from the list,
 * if he chooses to edit user is able to edit the textfields, then if fields edited and confirmed and get succeed contact will appear edited on the list.  <br/>
 * 
 * <br/>
 * <br/>
 * 
* @author alexandrebraganca
 */
/*
 *
 @startuml doc-files/us035_design1.png
    formulaUI->ExcelExpressionCompiler: compile()
    ExcelExpressionCompiler->Eval: apply()
    Eval->Expression : evaluate()
    Expression->CellImpl : evaluate()
  @enduml
 *
 */
package csheets.userstories.us035;
