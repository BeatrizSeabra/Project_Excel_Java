/**
 * Technical documentation regarding the user story 028: Exportar PDF. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve ser possível exportar o conteúdo (valores) de uma
sheet para um ficheiro PDF. Apenas o conteúdo das células deve ser exportado (i.e., não é necessário
exportar as formulas, etc.). Não é necessária grande preocupação no aspecto visual.
 * <br/>
 * <br/>
 *  
 * <b>S028a: Analysis</b><br/>
 * No User Story 028 é pedido que o conteúdo das células da folha de cálculos sejam exportadas para um ficheiro PDF.
 * Irá ser utilizada a interface "codec" do package "csheets.io" para a criação de uma nova classe para exportar o ficheiro com extensão PDF.
 * Também irá ser preciso criar no menu "save" uma opção para exportar para PDF.
 * <br/>
 * <br/>
 * 
 * <b>S028d: Design</b><br/>
 * O Diagrama de Sequência demonstra como irá ser efectuado o caso de uso:<br/>
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
 * Os metodos utilizados sao void e portanto nao foi possivel a realizaçao de testes unitarios.
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S028f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1 - Correr o cleansheets <br/>
 * 2 - Escrever nas celula <br/>
 * 3 - Seleccionar uma celula sem qualquer texto escrito <br/>
 * 4 - Ir ao Menu "Extensions" <br/>
 * 5 - Seleccionar a opcao "Export" e em seguida "PDF" <br/>
 * 6 - Escolher o caminho e o nome do ficheiro <br/>
 * 7 - Clicar no botao "save". <br/>
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