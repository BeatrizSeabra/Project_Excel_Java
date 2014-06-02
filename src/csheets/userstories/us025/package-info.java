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
 * @author 1120388
 */
/*
 *
 
 *
 */
package csheets.userstories.us025;