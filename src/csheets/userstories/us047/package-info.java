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
 * <b>S065d: Design</b><br/>
 * Criação do diagrama de sequencia na plataforma plantuml da US047.<br/>
 * 
  * <img src="../../../csheets/userstories/us047/doc-files/US047_design1.png">
 *
 * <br/>
 * <br/>
 *
 *
 * <b>S065c: Coding</b><br/>
 * <br/>
 *
 * <br/>
 * <br/>
 *
 * <b>S065u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 *
 * <b>S065f: Functional Tests</b><br/>
 *
 * To test this user story, the user should follow these steps:<br/>
 *
 * /
 *
 **
 * @startuml doc-files/us047_design1.png 
 * UIController -> ExtensionButton getUIExtension(this); 
 * ExtensionButton -> UIExtensionButton : new();
 * UIExtensionButton -> ButtonMenu : getMenu();
 * ButtonMenu -> ButtonAction : newButtonAction(); 
 * ButtonAction -> ButtonAction : new JFrame(); 
 * ButtonAction -> SpreadsheetTable: getselectedcells(); 
 * SpreadsheetTable -> Workbook: show();
 * @enduml
 *
 * @author marc
 */
package csheets.userstories.us047;
