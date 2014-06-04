/**
 * Technical documentation regarding the user story 022: pesquisar texto. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Tem de existir uma opcao na interface grafica que permita a pesquisa de texto. Essa opcao deve abrir uma janela onde o texto, propriamente dito ou expressao regular, e' escrito e se confirme a ordem de procura.
 * <br/>
 * <br/>
 *  
 * <b>S022a: Analysis</b><br/>
 * A interface grafica recebe o texto a ser pesquisado e instancia uma classe Search. A classe Search efectua a pesquisa e retorna o indice da primeira celula com o texto pretendido e a celula e' selecionada.<br/> 
 * A pesquisa e' efectuada no Workbook aberto e na Spreadsheet selecionada (o separador aberto). A "primeira celula a ser encontrada" depende da forma como a Spreadsheet e' percorrida.<br/>
 * Neste caso, a pesquisa sera feita de linha em linha, da esquerda para a direita. Se considerarmos o indice de uma celula um par (x,y) a primeira celula econtrada sera a celula com o valor pretendido de valor x mais baixo.<br/>
 * Caso haja duas celulas com o mesmo valor de x, a primeira celula sera sempre a que tem o valor y mais baixo.<br/>
 * Caso o texto a pesquisar nao seja encontrado, a aplicacao mostra uma caixa com a mensagem que informa que nao foram encontradas celulas com aquele valor.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S022d: Design</b><br/>
 * Para implementar este caso de uso e' necessario criar 2 classe novas. A classe JDialogSearchAndReplace, que surge quando a opcao Search and Replace e' selecionada no menu, que recolhe o texto a procurar <br/>
 * e a classe Search que e' a responsavel pela pesquisa do texto e retorno da celula pesquisada.<br/>
 * <br/>
 * <br/>
 *<img src="../../../csheets/userstories/us022/doc-files/us022_design1.png"> 
 *<br/>
 *<br/>
 * @author Diogo Moreira (1120339)
 */
/*
*
@startuml doc-files/us022_design1.png
User -> UIController: searchAndReplace()
UIController -> SearchAction: actionListener()
SearchAction -> Search: create()
Search -> JDialogSearchAndReplace: create()
Search <- JDialogSearchAndReplace: texto
Search -> Search: search()
SearchAction <- Search: celula
SearchAction -> SpreadsheetTable:changeSelection()
@enduml
*
*/

package csheets.userstories.us022;