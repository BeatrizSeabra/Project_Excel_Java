/**
 * Technical documentation regarding the user story 028: Exportar PDF.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Deve ser possivel exportar o conteudo (valores) de uma sheet para um ficheiro
 * PDF. Apenas o conteudo das ceulas deve ser exportado (i.e., nao e necessario
 * exportar as formulas, etc.). Nao e necessaria grande preocupacao no aspecto
 * visual.
 * <br/>
 * <br/>
 *
 * <b>S028a: Analysis</b><br/>
 * No User Story 028 é pedido que o conteudo das celulas da folha de calculo
 * sejam exportadas para um ficheiro PDF. Ira ser utilizada a biblioteca "itext"
 * e a estrutura vai ser baseada nas classe dos package "csheets.ext.simple" e
 * "csheets.ext.simple.ui".
 * <br/>
 * <br/>
 *
 * <b>S028d: Design</b><br/>
 * O Diagrama de Sequencia demonstra como ira ser efectuado o caso de uso:<br/>
 * <img src="../../../csheets/userstories/us028/doc-files/us028_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S028c: Coding</b><br/>
 * <br/>
 * <br/>
 * <br/>
 *
 * <b>S028u: Unit Tests:</b><br/>
 * Os metodos utilizados sao void e portanto nao foi possivel a realizaçao de
 * testes unitarios.
 * <br/>
 * <br/>
 * <br/>
 *
 * <b>S028f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1 - Correr o cleansheets <br/>
 * 2 - Escrever nas celulas <br/>
 * 3 - Seleccionar uma celula sem qualquer texto escrito <br/>
 * 4 - Ir ao Menu "Extensions" <br/>
 * 5 - Seleccionar a opcao "Export" e em seguida "PDF" <br/>
 * 6 - Escolher o caminho e o nome do ficheiro <br/>
 * 7 - Clicar no botao "save". <br/>
 *
 * Se tentar guardar um documento em branco/sem nada escrito nas celulas, da
 * erro e guarda um ficheiro corrompido com extensao PDF.
 *
 * <br/>
 * <br/>
 *
 * @author marcazevedo
 */
/*
 *
 @startuml doc-files/us028_design1.png
 "uic:UIController" -> ExtensionManager : extensions = getExtensions()
 loop [for Extension ext: extensions]
 "uic:UIController" -> "extension:ImportExtensions" : uiExtension=getUIExtension(this)
 "extension:ImportExtensions" -> "uiExtension:UIExtensionImport" : new(extension,uic)
 "uiExtension:UIExtensionImport" -> "uiExtension:UIExtensionImport" : getMenu()
 "uiExtension:UIExtensionImport" -> "menu:ImportMenuAction" : new(uic)

 note over of ExtensionManager: Completar .....
 "uic:UIController" -> "uic:UIController" : uiExtensions.add(uiExtension)
 end
 @enduml
 *
 */
package csheets.userstories.us028;
