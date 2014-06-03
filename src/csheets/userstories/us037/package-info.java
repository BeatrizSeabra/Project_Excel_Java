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
 * <b>S001a: Analysis</b><br/>
 * Vai ser criada uma nova formula,
 * verifica la na celulua
 * colocar um novo token :=
 * Fazer a funçao para atribuicao e colocar na celula certa
 *  
 * <br/>
 * <br/>
 * 
 * <b>S001d: Design</b><br/>
 * <br/><br/>
 * O user introduz texto na celula.
 * Se o texto começar por = assim assume uma formula.
 * A formula por sua vez é uma expressao.
 * Vai validar a expressao e faz o que é pretendido
 * 
 * 
 * <img src="../../../csheets/userstories/us001/doc-files/us037_design1.png"> 
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
 * @author Frederico Calor
 */
/*
 *
  @startuml doc-files/us037_design1.png
  title Operador de Distribuicao


User -> Cell : Escreve na cell;
Cell -> Formula : cell.setContent(string);
note right of Cell: vai ver se esta correcto;
Formula -> Expression : formula.evaluete();

Expression -> ExpressionCompiler : texto;
Expression -> BinaryOperation : texto;

BinaryOperation()->Cell : toString(resultado para a cell pretendida);


  end
  @enduml
 *
 */
package csheets.userstories.us037;