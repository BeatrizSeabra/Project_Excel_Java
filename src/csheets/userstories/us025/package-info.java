/**
 * Technical documentation regarding the user story 025: exportar xml. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *  Deve ser possivel exportar o conteudo de uma folha para um ficheiro XML. Apenas o conteudo das celulas deve ser exportado (i.e., nao e necessario exportar as formulas, etc.).
 *
 * <br/>
 * <br/>
 *  
 * <b>S025a: Analysis</b><br/>
 * A implementacao deste use case ira permitir exportar o conteudo de uma cleanSheets para xml, para tal e necessario criar uma interface que permitar controlar as exportacoes de documentos em diferentes formatos, seguindo o padrao strategy.<br/> 
 * A classe responsavel pela exportacao em xml ira implementar essa inteface.<br/>
 * Sera acrescentado ao save uma opçao de guardar como xml .<br/>
 * Com essa opcao adicionada, ao ser selecionar, uma instancia da classe exportXmlUI, responsavel pela troca de dados entre utilizador e sistema.<br/>
 * Apos a troca de dados com a exportXmlUI uma instancia do controlExportXML será criada e essa ira instanciar a classe ExportXML e a informacao contida no objecto da classe Workbook sera exportada para xml.<br/>
 * <br/>
 *
 *<b>S025d: Design</b><br/>
 *Para realizar este use case iremos precisar de utilizar uma interface que controle as classes responsaveis pela exportacao e importacao.Iremos precisar tambem de uma classe responsavel pela exportacao em xml, XMLCodec.<br/>
 *Teremos de adicionar a opcao de salvar como xml na IterfaceUI responsavel por tal.<br/>
 *O diagrama de sequencia seguinte descreve como ira ocorrer a iteracao entre classes.<br/>
 *<img src="../../../csheets/userstories/us025/doc-files/us025_design1.png"> 
 *Para validar o xml exportado e limitar o conteudo das celulas, foi criado uma ficheiro xsd. <br/>
 * <a src="../../../csheets/io/cleanSheets.xsd" target="_blank">cleanSheet xsd</a> 
 *<br/>
 *<br/>
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
 @enduml
 *
 */
 
package csheets.userstories.us025;