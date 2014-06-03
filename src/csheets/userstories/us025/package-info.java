/**
 * Technical documentation regarding the user story 025: exportar xml. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *  Deve ser possível exportar o conteúdo de uma folha para um ﬁcheiro XML.Apenas o conteúdo das células deve ser exportado (i.e., não é necessário exportar as formulas, etc.).

 * <br/>
 * <br/>
 *  
 * <b>S025a: Analysis</b><br/>
 * A implementação deste use case irá permitir exportar o conteúdo de uma cleanSheets para xml, para tal é necessário criar uma interface que permitar controlar as exportações de documentos em diferentes formatos, seguindo o padrão strategy.<br/> 
 * A classe responsável pela exportação em xml irá implementar essa inteface.<br/>
 * Será acrescentado ao save uma opção de guradar como xml .<br/>
 * Com essa opção adicionada, ao ser selecionar, uma instancia da classe exportXmlUI, responsável pela troca de dados entre utilizador e sistema.<br/>
 * Após a troca de dados com a exportXmlUI uma instancia do controlExportXML será criada e essa ira instanciar a classe ExportXML e a informação contida no objecto da classe Workbook será exportada para xml.<br/>
 * <br/>
 *
 * <b>S025d: Design</b><br/>
 * Para realizar este use case iremos precisar de utilizar uma interface que controle as classes responsáveis pela exportação e importação.Iremos precisar também de uma classe responsável pela exportação em xml, XMLCodec.<br/>
 * Teremos de adicionar a opção de salvar como xml na IterfaceUI responsável por tal.<br/>
 * O diagrama de sequencia seguinte descreve como irá ocorrer a iteração entre classes.<br/>
 * <img src="../../../csheets/userstories/us025/doc-files/us025_design1.png"> 
 * <a href="../../../csheets/userstories/us025/XMLcleanSheets.xsd" target="_blank">xml schema</a>
 * <br/>
 * <br/>
 * 
 * @author 1120388
 */
/*
 *
 @startuml doc-files/us025_design1.png
 UIController -> Frame: new SaveAsAction()
 Frame -> SaveAsAction : saveAsAction()
 SaveAsAction -> UIController : getActiveWorkbook()
 UIController -> SaveAsAction : activeWorkbook
 SaveAsAction -> CleanSheets : saveAs
 CleanSheets -> Codec : new CodecFactory().getCodec(file)
 Codec  -> XMLCodec : getCodec()
 XMLCodec -> CleanSheets  : write()
 end
 @enduml
 *
 */
package csheets.userstories.us025;