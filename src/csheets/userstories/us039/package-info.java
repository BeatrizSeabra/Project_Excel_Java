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
 * <b>S039d: Design</b><br/>
 * Na US anterior, as variaveis temporarias existiam num contexto de spreadsheet e nesta devem existir num contexto de workbook.</br>
 * Face a esta alteracao, decidi manter as variaveis num ArrayList associado a uma sheet (ou as alteracoes seriam muito significativas) mas sempre que e' alterada ou adicionada uma variavel, as outras sheets tambem sao atualizadas.<br/>
 * Para a implementacao desta US e' necessario criar um sidebar que mostras as variaveis temporarias do workbook.<br/>
 * E' necessario implementar um WorkbookListener que atribui as variaveis temporarias a uma folha quando ela e' criada.<br/>
 * Cada sheet tem um arraylist de variaveis que podem ser editadas atraves de uma JDialog.<br/>
 * A JDialog contem informacao do conteudo da variavel. Contem um botao para Editar o conteudo e um botao para Sair da JDialog.<br/>
 * A sidebar tera' uma JList para mostrar as variaveis. Um listener sera' implementado para que, sempre que a variavel seja selecionada, a JDialog de Edicao do conteudo da variavel apareca.<br/>
 * O editor de variaveis implementa a interface TemporaryVariablesListener e e' notificado sempre que existe uma alteracao na primeira sheet do workbook (e consequentemente, em todas as outras) para que atualize o conteudo das variaveis.</br>
 * Por limitacoes (aparentes) da arquitetura da aplicacao, e' necessario criar uma acao que adiciona a sidebar 'a lista de TemporaryVariablesListener presente nas spreadsheets.
 * <br/>
 * <br/>
 *<img src="../../../csheets/userstories/us068/doc-files/us039_design1.png"> 
 *<br/>
 *<br/>
 *
 * <b>S039c: Coding</b><br/>
 * See:<br/>
 * <a href="../../../csheets/ext/temporaryvariable/package-summary.html">csheets.ext.temporaryvariable</a><br/>
 * <a href="../../../csheets/ext/temporaryvariable/ui/package-summary.html">csheets.ext.temporaryvariable.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S039u: Unit Tests</b><br/>
 * See:<br/>
 * <a href="../../src-tests/csheets/ext/temporaryvariable/package-summary.html">csheets.ext.temporaryvariable</a><br/>
 * <br/>
 * <br/>
 *  
 * <b>S039f: Functional Tests</b><br/>
 * Para testar esta User Story e' necessario seguir os seguintes passos:<br/>
 * 1. Correr o cleansheets;<br/>
 * 2. Clicar no menu Extensions, clicar em Temporary Variables e selecionar a opcao Activate Side Bar;<br/>
 * 3. Escrever uma expressao de atribuicao a uma variavel temporaria numa celula;<br/>
 * 4. Abrir o side bar das Temporary Variables e selecionar uma das variaveis apresentadas;<br/> 
 * 5. Alterar o valor da variavel na janela de edicao e clicar na opcao Change Value ;<br/>
 * 6. Utilizar a variavel com o novo valor.<br/>
 * <br/>
 * <br/> 
 * @author Diogo Moreira (1120339)
 */
 /*
*
@startuml doc-files/us039_design1.png
title Temporary Variables Editor
User -> TemporaryVariablesEditorAction: actionPerformed()
User -> UIController: temporaryVariablesSideBar()
UIController -> UIExtensionTemporaryVariables: actionListener()
UIExtensionTemporaryVariables -> JDialogTemporaryVariablesEditor: create()
alt Edit Variable
JDialogTemporaryVariablesEditor -> Spreadsheet: addOrUpdateTemporaryVariable(TemporaryVariable temporaryVariable)
Spreadsheet -> TemporaryVariablesListener: fireVariableCreatedOrUpdated(ArrayList<TemporaryVariable> varList)
end
@enduml
*
*/
package csheets.userstories.us039;