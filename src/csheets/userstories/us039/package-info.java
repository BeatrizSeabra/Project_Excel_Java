/**
 * Technical documentation regarding the user story 039: editor de variaveis temporarias. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *  Deve existir uma janela (ou um sidebar) que permite consultar e editar as variaveis temporarias.<br/>
 *  As variaveis temporarias existem no contexto de um workbook.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S039a: Analysis</b><br/>
 * Analise do codigo implementado no US038, implementado na semana anterior.<br/> 
 * O codigo da semana anterior ficou muito incompleto e e' necessario implementa-lo para realizar esta US.<br/>
 * Analise de como guardar um conjunto de variaveis num contexto de workbook.<br/>
 * Analise de como implementar um sidebar onde seja possivel editar os seus elementos.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S068d: Design</b><br/>
 * Para a implementacao desta US e' necessario criar um sidebar onde constarao as variaveis presentes em cada sheet do workbook.<br/>
 * Cada sheet tem um arraylist de variaveis que podem ser editadas atraves de uma JDialog.<br/>
 * A JDialog contem informacao do conteudo da variavel. Contem um botao para Editar o conteudo e um botao para Sair da JDialog.<br/>
 * A sidebar tera' uma JList para mostrar as variaveis. Um listener sera' implementado para que, sempre que a variavel seja selecionada, a JDialog de Edicao do conteudo da variavel apareca.<br/>
 * <br/>
 * <br/>
 *<img src="../../../csheets/userstories/us068/doc-files/us039_design1.png"> 
 *<br/>
 *<br/>
 *
 * @author Diogo Moreira (1120339)
 */
 /*
*
@startuml doc-files/us039_design1.png
title Temporary Variables Editor
User -> UIController: temporaryVariablesSideBar()
UIController -> UIExtensionTemporaryVariables: actionListener()
UIExtensionTemporaryVariables -> JDialogTemporaryVariablesEditor: create()
alt Edit Variable
JDialogTemporaryVariablesEditor -> Spreadsheet: addOrUpdateTemporaryVariable(TemporaryVariable temporaryVariable)
end
@enduml
*
*/
package csheets.userstories.us039;