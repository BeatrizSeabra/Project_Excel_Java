/**
 * Technical documentation regarding the user story 029: Exportar Folha para PDF.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Deve ser possivel exportar uma folha em formato PDF. 
 * O aspecto visual do PDF deve ser similar ao do cleansheets 
 * (nao e necessario exportar as formulas).
 * <br/>
 * <br/>
 *
 * <b>S029a: Analysis</b><br/>
 * <ul><li>No User Story 029 e pedido que o conteudo das celulas da folha de calculo
 * sejam exportadas para um ficheiro PDF, so com mais um pormenos, que a informacao
 * fique organizada por tabela como o csheet.</li></ul>
 * <br/>
 * <br/>
 *
 * <b>S029d: Design</b><br/>
 * O diagrama de Sequencia vai ser igual ao do anterir uma vez que todas as alteracoes 
 * efectuadas, foram realizadas no ExportPdfAction.java.
 * O Diagrama de Sequencia demonstra como ira ser efectuado o caso de uso:<br/>
 * <img src="../../../csheets/userstories/us029/doc-files/us029_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S029c: Coding</b><br/>
 * <br/>
 * <ul><li>Pouco foi alterado da issue anterior, foi so colocar dentro do "for" para ir
 * buscar o que esta dentro da celula e imprimir na tabela em pdf que foi inicializada
 * antes desse "for".</li></ul>
 * <a href="../../../csheets/ext/pdf/package-summary.html">csheets.ext.pdf</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S029u: Unit Tests:</b><br/>
 * <ul><li> De referir nao existe testes que sejam muito legiveis para esta funcionalidade, 
 * uma vez que os metodos utilizados são void não existe qualquer retorno</li></ul>
 * <br/>
 * <br/>
 * <br/>
 *
 * <b>S029f: Functional Tests</b><br/>
 *
 *
 * Se tentar guardar um documento em branco/sem nada escrito nas celulas, da
 * erro e guarda um ficheiro corrompido com extensao PDF.
 *
 * <br/>
 * <br/>
 *
 * @author Frederico Calor
 */
/*
 *
 @startuml doc-files/us029_design1.png

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
package csheets.userstories.us029;
