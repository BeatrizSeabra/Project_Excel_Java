/**
 * Technical documentation regarding the user story 047: Propriedades dos
 * botões.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Janela para edição de propriedades de um botãoo: cores, texto do botão e
 * fórmula. A fórmula associada é executada quando se clica no botão.
 * <br/>
 * <br/>
 *
 * <b>S047a: Analysis</b><br/>
 *
 * Na User Story 047 é pedido uma janela que permita editar as propriedades dos
 * botões criados, como por exemplo: cores, texto do botão e a fórmula. Irá ser
 * estudado o código e a documentação da user story 46, realizada pelo meu
 * colega na semana anterior. Irá ser criada uma janela nova que permita
 * escolher as funcionalidades e que sejam efectuadas as validações necessárias
 * para o texto no botão assim como na fórmula introduzida. Para a escolha das
 * cores irá ser utilizado uma combobox.
 * <br/>
 * <br/>
 *
 * <b>S047d: Design</b><br/>
 * Criação do diagrama de sequencia na plataforma plantuml da US047.<br/>
 * 
  * <img src="../../../csheets/userstories/us047/doc-files/US047_design1.png">
 *
 * <br/>
 * <br/>
 *
 *
 * <b>S047c: Coding</b><br/>
 * 
 * see:<br/>
 * <a href="../../../csheets/ext/button/package-summary.html">csheets.ext.button</a><br/>
 * <a href="../../../csheets/ext/button/ui/package-summary.html">csheets.ext.button.ui</a><br/>
 * <br/>
 *
 * <br/>
 * <br/>
 *
 * <b>S047u: Unit Tests</b><br/>
 * Métodos da interface gráfica não permitem a realização de testes unitários.
 * see:<br/>
 * <a href="../../../csheets/ext/button/package-summary.html">csheets.ext.button</a><br/>
 * <a href="../../../csheets/ext/button/ui/package-summary.html">csheets.ext.button.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S047f: Functional Tests</b><br/>
 *
* To test this user story, the user should follow these steps:<br/>
 * 1 - Correr o cleansheets; <br/>
 * 2 - Ir ao menu "Extensions", em seguida ao menu "Button" e clicar na opção "Insert Button"; <br/>
 * 3 - Irá aparecer uma nova janela, lá poderá escolher o texto que irá aparecer no botão, assim como a cor e a formula associada;<br/>
 * 4 - O botão posiona-se de acordo com a linha da célula selecionada;
 * 5 - Agora poderá testar o botão. Por exemplo, escrever na célula A1 o valor 2 e na A2 o valor 3 e na fórmula escrever "=A1+A2", o resultado da soma irá aparecer na célula selecionada (5 neste caso);<br/>
 * 6 - Se não escrever a fórmula correctamente irá aparecer uma mensagem de erro;<br/>
 * <br/>
 *
@startuml doc-files/us047_design1.png 
 UIController -> ExtensionButton : getUIExtension(this) 
 ExtensionButton -> UIExtensionButton : new()
 UIExtensionButton -> ButtonMenu : getMenu()
 ButtonMenu -> ButtonAction : newButtonAction() 
 ButtonAction -> ButtonAction : new JFrame() 
 ButtonAction -> SpreadsheetTable: getselectedcells()
 SpreadsheetTable -> Workbook: show()
 @enduml
 * @author marc
 */
package csheets.userstories.us047;
