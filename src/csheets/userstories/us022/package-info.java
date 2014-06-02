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
 * A interface gráfica deve passar o texto a ser pesquisado a um controlador. Esse controlador instancia a classe responsável pela pesquisa (nome a definir)<br/> 
 * A classe responsável da pesquisa irá obter linhas da Spreadsheet através do método getRow(). As linhas ou colunas serão obtidas sequencialmente, do menor para o maior índice, de forma a garantir que a primeira célula encontrada é a correta.<br/>
 * Depois de obter uma linha, a classe responsável pela pesquisa irá comparar cada célula dessa linha com o valor obtido pela interface gráfica. Se os valores forem coincidentes, a pesquisa é terminada e a célula é selecionada<br/>
 * <br/>
 * <br/>
 * 
 * @author Diogo Moreira (1120339)
 */

package csheets.userstories.us022;