/**
 * Technical documentation regarding the user story 026: exportar html. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve ser possível exportar uma folha em formato html. O aspecto visual
 * da página html deve ser similar ao do cleansheets ( não é necessário exportar as formulas).
 *
 * <br/>
 * <br/>
 *  
 * <b>S025a: Analysis</b><br/>
 * A implementacao deste use case ira permitir exportar o conteudo de uma 
 * cleanSheets para html,
 * para tal e necessario criar uma interface que permitar controlar as exportacoes 
 * de documentos em diferentes formatos,
 * seguindo o padrao strategy.<br/> 
 * A classe responsavel pela exportacao em html ira implementar essa inteface.<br/>
 * Sera acrescentado ao save uma opçao de guardar como html .<br/>
 * Com essa opcao adicionada, ao ser selecionar, uma instancia da classe exportHtmlUI,
 * responsavel pela troca de dados entre utilizador e sistema.<br/>
 * Apos a troca de dados com a exportHtmlUI uma instancia do controlExportHtml
 * será criada e essa ira instanciar a classe ExportHtml e a informacao contida
 * no objecto da classe Workbook sera exportada para html.<br/>
 * <br/>
 *
 *<b>S025d: Design</b><br/>
 *Para realizar este use case iremos precisar de utilizar uma interface que
 * controle as classes responsaveis pela exportacao e importacao.
 * Iremos precisar tambem de uma classe responsavel pela exportacao em html<br/>
 *Teremos de adicionar a opcao de salvar como  na IterfaceUI responsavel por tal.<br/>
 *O diagrama de sequencia seguinte descreve como ira ocorrer a iteracao entre classes.<br/>
 *<img src="../../../csheets/userstories/us026/doc-files/us026_design1.png"> 
  <br/>
* 
* 
 * @author 1040314 - João Paulo Silva
 */
/*
 *
 @startuml doc-files/us026_design1.png
 UIController -> Frame: new SaveAsAction()
 Frame -> SaveAsAction : saveAsAction()
 SaveAsAction -> UIController : getActiveWorkbook()
 UIController -> SaveAsAction : activeWorkbook
 SaveAsAction -> CleanSheets : saveAs
 CleanSheets -> Codec : new CodecFactory().getCodec(file)
 Codec  -> HtmlCodec : getCodec()
 HtmlCodec -> CleanSheets  : write()
 @enduml
 *
 */
 
package csheets.userstories.us026;