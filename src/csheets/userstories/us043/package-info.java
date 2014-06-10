/**
 * Documentacao tecnica para a user story 043: Janela de execucao de Macro. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Abrir uma janela para escrever e executar uma macro. Para 
 * já uma macro é simplesmente uma sequência de fórmulas que são executadas sequencialmente. Deve-se
 * reutilizar as fórmulas para implementar a macro. Só é necessário ter uma macro no cleansheets.
 * <br/>
 * <br/>
 *  
 * <b>S076a: Analysis</b><br/>
 * Perceber melhor o que é pedido na user story. <br/> 
 * Estudar o Cleansheets. <br/>
 * Estudar conteudos sobre macros. <br/>
 * <br/>
 * 
 * <b>S076d: Design</b><br/>
 * Para realizar esta user story, temos de criar a classe JDialogMacro, para o Utilizador inserir o macro e para mostrar os resultados,
 * e a classe runMacro para que a macro introduzida pelo utilizador seja executada. O diagrama seguinte
 * mostra como integrar estas classes... <br/><br/>
 * <img src="../../../csheets/userstories/us043/doc-files/US043_design.png">
 * <br/>
 * <br/>
 * 
 * <b>S076c: Coding</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author 1120564MarcoEsteves
 */
/*
 *
 @startuml doc-files/US043_design.png
 User -> UIController: runMacro()
 UIController -> RunMacroAction: actionListener()
 RunMacroAction -> RunMacro: create()
 RunMacro -> JDialogMacro: create()
 RunMacro <- JDialogMacro: macro
 RunMacro -> RunMacro : ExecuteMacro()
 RunMacro -> JDialogMacro: results
 @enduml
 *
 */


package csheets.userstories.us043;
