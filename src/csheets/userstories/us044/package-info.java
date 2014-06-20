/**
 * Documentacao tecnica para a user story 044: Janela de Edição de Macro. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deﬁnir uma gramática especiﬁca só para macros (embora deva ter exactamente as mesmas funcionalidades das fórmulas). 
 * Cada macro deve ter o seu nome. 
 * Deve existir um botão “play” para executar a macro que esteja selecionada.
 * <br/>
 * <br/>
 *  
 * <b>S076a: Analysis</b><br/>
 * Para realizar o use case 44 e necessario perceber como funciona as formulas.<br/>
 * O conceito de Macro que iremos implementar e uma sequencia de formulas, essa sequencia ira ter uma nome indicado pelo utilizador.<br/>
 * Iremos ter de criar uma gramatica para Macros. Esta gramatica tera as mesmas funcionalidades das formulas. A diferenca entre formulas e macros e que nas macros,<br/>
 * teremos a possibilidade de inserir um conjuntos de formulas.<br/>
 * Para isso ser possivel iremos atraves do antlr, criar uma gramatica para Macros, que permita multiplas formulas.<br/>
 * Uma classe que ira representar as Macros, classe com um nome e conjunto de formulas.<br/>
 * Uma interface grafica que permita criar macros e executa-las.<br/>
 * <br/>
 * 
 * <b>S076d: Design</b><br/>
 * Como foi dito na analise do use case 44, para realizar esta extensao e necessario criar novas classes que irao satisfazer as necessidades do problema.<br/>
 * O diagrama seguinte mostra como integrar estas classes... <br/><br/>
 * <img src="../../../csheets/userstories/us044/doc-files/US044_design.png">
 * <br/>
 * Classes necessarias:<br/>
 * JDialogEditarMacro:<br/>
 * Iremos criar uma JDialog que irea recolher as informacoes do utilizador (nome da macro e conjunto de formulas) e ira mostrar o resultado da execusao de uma macro(atraves do butao "play").<br/>
 * editarMacroController:<br/>
 * Classe responsavel pela invocacao das classes que irao validar(gramatica) os dados inseridos e retornara os resultados.<br/>
 * Macro:
 * A macro sera a classe que representara a nova gramatica. A nova gramtica tera seguinte sintaxe "macro nome ={formula;formula}" <br/>
 * <br/>
 * 
 * <br/>
 * <br/>
 * 
 * <b>S076c: Coding</b><br/>
 * A codificacao do use case foi feita de modo que a Macro inserida seja validada por uma gramatica especifica para Macros.<br/>
 * Dai a necessidade de criar um package a parte do da formula onde esta inserido do a sintaxe da gramatica das Macros.<br/>
 * see:<br/>
 * <a href="../../../csheets/ext/editMacro/package-summary.html">csheets.ext.editMacro</a><br/>
 * <a href="../../../csheets/ext/editMacro/ui/package-summary.html">csheets.ext.editMacro.ui</a><br/>
 * <a href="../../../csheets/ext/editMacro/compiler/package-summary.html">csheets.ext.editMacro.compiler</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * A gramatica criada para Macros tem a seguinte sintaxe:<br/>
 * macro "Nome da Macro"{<br/>
 * formulas (sem a necessidade de indicar o simbolo "=")<br/>
 * ...<br/>
 * }<br/>
 * Apos a compilacao e possivel ter acesso ao nome da Macro e as respectivas expressoes e resultados das formulas.<br/>
 * Os teste unitarios realizados permitem verificar que apos a compilacao da Macro com a respectiva gramatica, esta retorna as expressoes com os valores das operacoes realizadas.<br/>
 * Permite tambem verificar que o nome da Macro e retornada apos a compilacao da mesma.<br/> 
 * see:<br/>
 *<a href="../../../csheets/ext/editMacro/compiler/package-summary.html">csheets.ext.editMacro.compiler</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * Para testar esta user story, o utilizador deve seguir os passos seguintes:<br/>
 * 1 Executar o CleanSheets;<br/>
 * 2 Clicar no menu Extensions onde serao apresentadas as extensoes disponiveis;<br/>
 * 3 Clicar na extensao Edit Macro, em seguida será apresentada uma janela;<br/>
 * 4 Nessa janela, o utilizador devera inserir a macro que ira ser validada com a gramatica especifica para Macros;<br/>
 * 5 O utilizador devera escolher na combobox a macro que deseja executar;<br/>
 * 6 Apos escolher a Macro devera executar com o butao play;<br/>
 * O resultado ira aparecer em uma jdialog.<br/>
 * obs.: para inserir uma gramatica valida devera seguir os eguinte exemplo:<br/>
 * macro "Nome da macro"{<br/>
 * 2+2<br/>
 * A1:=2<br/>
 * B1:=A1*2<br/>
 * }<br/>
 * <br/>
 * <br/>
 * 
 * @author 1120388
 */
/*
 *
 @startuml doc-files/US043_design.png
 User -> JDialogEditarMacro : macro
 User -> JDialogEditarMacro : submeter()

 User -> JDialogEditarMacro : selecionar()
 JDialogEditarMacro -> editarMacroController : compilarMacro(macro)
 editarMacroController -> Macro: compilar(macro)
 editarMacroController <- Macro: resultado
 JDialogEditarMacro <- editarMacroController : resultado
 User <- JDialogEditarMacro : resultado
 @enduml
 *
 */


package csheets.userstories.us044;
