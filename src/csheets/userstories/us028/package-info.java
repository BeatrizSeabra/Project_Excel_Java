/**
 * Technical documentation regarding the user story 028: Exportar PDF. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve ser possível exportar o conteúdo (valores) de uma
sheet para um ﬁcheiro PDF. Apenas o conteúdo das células deve ser exportado (i.e., não é necessário
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
 * 
 * 
 * 
 * <br/>
 * <br/>
 * 
 * <b>S028c: Coding</b><br/>
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S028u: Unit Tests</b><br/>
 * see:<br/>
 * <br/>
 * <br/>
 * 
 * <b>S028f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
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