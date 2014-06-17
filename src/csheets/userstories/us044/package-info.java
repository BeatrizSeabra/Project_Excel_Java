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
 * see:<br/>
 * 
 * <br/>
 * <br/>
 * 
 * <b>S076u: Unit Tests</b><br/>
 * see:<br/>
 *
 * <br/>
 * <br/>
 * 
 * <b>S076f: Functional Tests</b><br/>
 * 
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
