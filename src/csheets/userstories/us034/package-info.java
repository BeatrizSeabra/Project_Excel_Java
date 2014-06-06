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
 * <b>S034a: Analysis</b><br/>
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
 * <b>S034d: Design</b><br/>
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
 * <b>S034c: Coding</b><br/>
 * //csheets.core.formula.lang/Eval.java<br/>
 * <br/>
 * <br/>
 * 
 * <b>S034u: Unit Tests</b><br/>
 * //Test Packages/csheets.core.formula.lang/EvalTest.java<br/>
 * <br/>
 * <br/>
 * 
 * <b>S034f: Functional Tests</b><br/>
 * Para testar esta User Story, o Utilizador deve fazer:<br/>
 * 1- abrir o Cleansheets;<br/>
 * 2- Seleccionar uma Celula;<br/>
 * 3- escrever uma formula de teste:;<br/>
 *  3.1- Deve comecar por = <br/>
 *  3.2- Deve conter o identificador da função Eval <br/>
 *  3.3- Deve conter a expressao a testar entre parentesis e aspas <br/>
 * 4- na celula, deverá ficar o resultado da expressao testada. <br/>
 * 5- Exemplo : =Eval("2+3")   Resultado na celula : 5 <br/>
 * <br/>
 * <br/>
 * 
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
/*
 *
  @startuml doc-files/us034_design1.png
    User->Cell: dados
    Cell->ExcelExpressionCompiler: compile()
    ExcelExpressionCompiler->Expression : dados 
    Expression->Value : evaluate()
    Value: toString()
    Value->ExcelExpressionCompiler: compile()
    ExcelExpressionCompiler->Expression : dados 
    Expression->Value : evaluate()
    Value->Cell : return
  @enduml
 *
 */
package csheets.userstories.us034;