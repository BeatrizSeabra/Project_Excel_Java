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
 * a classe runMacro para que a macro introduzida pelo utilizador seja executada e a classe runMacroController que vai controlar a JDialogMacro
 * e tratar os dados inseridos pelo utilizador na JDialogMacro. O diagrama seguinte mostra como integrar estas classes... <br/><br/>
 * <img src="../../../csheets/userstories/us043/doc-files/US043_design.png">
 * <br/>
 * Classes:<br/>
 * <br/>
 * JDialogMacro:<br/>
 * Classe que vai servir de interface com o utilizador. Conta com:<br/>
 * <br/>
 * TextArea, onde o utilizador insere a macro;<br/>
 * Botao RunMacro, que inicia a execução da macro;<br/>
 * Botao Cancel, para cancelar a execuçao da macro;<br/>
 * <br/>
 * runMacroController:<br/>
 * <br/>
 * Classe que vai controlar a JDialogMacro, executando a macro introduzida pelo utilizador, e retornando para a JDialogMacro, os resultados. <br/>
 * Conta com os seguintes metodos:<br/>
 * <br/>
 * getEmptyCell()->devolve uma celula vazia;<br/>
 * results()->devolve os resultados da execução da macro;<br/>
 * <br/>
 * <br/>
 * 
 * <b>S076c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/runMacro/package-summary.html">csheets.ext.runMacro</a><br/>
 * <a href="../../../csheets/ext/runMacro/ui/package-summary.html">csheets.ext.runMacro.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/runMacro/package-summary.html">csheets.ext.runMacro</a><br/>
 * <a href="../../../csheets/ext/runMacro/ui/package-summary.html">csheets.ext.runMacro.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * Para testar esta user story, o utilizador deve seguir os passos seguintes:<br/>
 * 1 Executar o CleanSheets;<br/>
 * 2 Clicar no menu Extensions onde serao apresentadas as extensoes disponiveis;<br/>
 * 3 Clicar na extensao Run Macro, em seguida será apresentada uma janela;<br/>
 * 4 Nessa janela, o utilizador deverá a macro que deseja executar;<br/>
 * 5 O utilizador carrega no botao 'OK' e os resultados da execução da macro são apresentados numa nova janela.<br/>
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
 JDialogMacro -> runMacroController: macro
 runMacroController -> runMacroController : ExecuteMacro()
 runMacroController -> JDialogMacro: results
 @enduml
 *
 */


package csheets.userstories.us043;
