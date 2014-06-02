/**
 * Technical documentation regarding the user story 025: exportar xml. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Criação de uma componente que permite exportar o conteúdo de uma cleanSheets para xml.
 * <br/>
 * <br/>
 *  
 * <b>S025a: Analysis</b><br/>
 * A implementação deste use case irá permitir exportar o conteúdo de uma cleanSheets para xml, para tal é necessário criar uma interface que permitar controlar as exportações de documentos em diferentes formatos, seguindo o padrão strategy.<br/> 
 * A classe responsável pela exportação em xml irá implementar essa inteface.<br/>
 * No menuBar será acrescentado uma opção chamada Export. Uma das opções do subMenu será xml.<br/>
 * Com essa opção adicionada ao menur será gerardo, ao selecionar essa opção, uma instancia da classe exportXmlUI, responsável pela troca de dados entre utilizador e sistema.<br/>
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