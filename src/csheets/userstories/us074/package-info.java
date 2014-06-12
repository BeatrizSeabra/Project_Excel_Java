/**
 * Documentacao tecnica da user story 074 : Exportacão Paralela 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *  A exportacao de dados deve ser efectuada em "paralelo". Deve ser
 *  possivel definir os caracteres separadores de campo e se existe
 *  linha cabecalho ou nao.
 * <br/>
 * <br/>
 *  
 * <b>S074a: Analysis</b><br/>
 * Devera ser usado threads para a exportacao paralela do ficheiro
 * Devera ser criada uma opcao para defenir o caracter separador de dados
 * Devera ser criada a opcao para definir se existe linha de cabecalho e qual 
 * será este cabacalho caso exista
 * Sera criada uma janela com as opcoes novas, e criada a exportacacao usando 
 * as threads necessarias para um bom funcionamento em paralelo, havendo tambem 
 * sincronizacao entre as threads para nao haver alteracao dos dados
 * 
 * <br/>
 * <br/>
 * 
 * <b>S074d: Design</b><br/>
 * Juntamente com o colega que estava a fazer a importação paralela, foi definido
 * que o ficheiro de texto iria conter na primeira linha as informações fornecidas
 * pelo cliente. ou seja, na primeira linha ficaria o simbolo separador, e depois
 * o cabecalho. 
 * A função que escreve o ficheiro´irá ser usada numa thread para funcionar em
 * paralelo com o resto do programa como pedido.
 * 
 * <br/>
 * <br/>
 * <img src="../../../csheets/userstories/us074/doc-files/us074_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S074c: Coding</b><br/>
 * csheets.ext.exporttxt.ui/TxtAction.java
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S074u: Unit Tests</b><br/>
 * Testes não necessarios
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S074f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * <br/>
 * 
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
/*
 *
  @startuml doc-files/us074_design1.png
    extensionImport->uiExtensionImport: getUiExtension() 
    uiExtensionImport->exportMenu: getMenu() 
    exportMenu->exportAction: new exportAction()
    exportAction->exportAction: FileExport()
   @enduml
 *
 */
package csheets.userstories.us074;
