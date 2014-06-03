/**
 * Documentação referente ao user story us073: Exportação de ficheiros de texto
 * <br/>
 * <br/>
 *
 *<b>Requerimento</b><br/>
 *US073- Exportar ficheiro de texto. Deve ser possível exportar dados para um ficheiro de texto,
 *cujas colunas são divididas por “,”. Os dados devem ser exportados a partir de uma célula que é identificada
 *como o canto superior esquerdo.
 *</br>
 *</br>
 *
 * <b>S073a: Analysis</b><br/>
 *Tendo a necessidade de criar uma funcionalidade para a exportação de dados para ficheiros de texto, 
 *é necessário utilizar a class Codec como base, de modo a servir de class mãe para uma nova class que utilize 
 *o seu método write, para assim conseguir escrever. Será necessário também adicionar uma outra opção no menu guardar, 
 *com a possibilidade de guardar em ficheiro de texto.
 *
 *
 *
 *
 * <br/>
 * <br/>
 * 
 * <b>S073a: Design</b><br/>
 * 
 * <img src="../../../csheets/userstories/us001/doc-files/us073_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S073c: Coding</b><br/>
 
 * <br/>
 * <br/>
 * 
 * <b>S073u: Unit Tests</b><br/>
 *
 *
 *
 /*
*
 @startuml doc-files/us073_design1.png
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
 
 
/**
 * @author 1110316
 *
 */
package csheets.userstories.us073;