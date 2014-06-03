/**
 * Technical documentation regarding the user story 022: pesquisar texto. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Tem de existir uma opção na interface gráfica que permita a pesquisa de texto. Essa opção deve abrir uma janela onde o texto, propriamente dito ou expressão regular, é escrito e se confirme a ordem de procura.
 * <br/>
 * <br/>
 *  
 * <b>S022a: Analysis</b><br/>
 * A interface gráfica recebe o texto a ser pesquisado e instancia uma classe Search. A classe Search efectua a pesquisa e retorna o indice da primeira célula com o texto pretendido e a célula é selecionada.<br/> 
 * A pesquisa é efectuada no Workbook aberto e na Spreadsheet selecionada (o separador aberto). A "primeira célula a ser encontrada" depende da forma como a Spreadsheet é percorrida.<br/>
 * Neste caso, a pesquisa será feita de linha em linha, da esquerda para a direita. Se considerarmos o indice de uma célula um par (x,y) a primeira célula econtrada será a célula com o valor pretendido de valor x mais baixo.<br/>
 * Caso haja duas células com o mesmo valor de x, a primeira célula será sempre a que tem o valor y mais baixo.<br/>
 * Caso o texto a pesquisar nao seja encontrado, a aplicação mostra uma caixa com a mensagem que informa que nao foram encontradas células com aquele valor.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S022d: Design</b><br/>
 * Para implementar este caso de uso é necessário criar 2 classe novas. A classe JDialogSearchAndReplace, que surge quando a opçao Search and Replace é selecionada no menu, que recolhe o texto a procurar <br/>
 * e a classe Search que é a responsável pela pesquisa do texto e retorno da célula pesquisada.<br/>
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