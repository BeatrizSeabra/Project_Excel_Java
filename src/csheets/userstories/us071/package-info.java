/**
 * Documentação tecnica da user story 071 : Importação Paralela. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * A importacão de dados deve ser efectuada em "paralelo". 
 * Deve ser possível definir os caracteres separadores de campo e se existe linha cabeçalho ou não.
/**
 * Documentação tecnica da user story 071 : Importação Paralela. 
 * <br/>
 * <br/>
/**
 * Documentação tecnica da user story 071 : Importação Paralela. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * A importacão de dados deve ser efectuada em "paralelo". 
 * Deve ser possível definir os caracteres separadores de campo e se existe linha cabeçalho ou não.
/**
 * Documentação tecnica da user story 071 : Importação Paralela. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * A importacão de dados deve ser efectuada em "paralelo". 
 * Deve ser possível definir os caracteres separadores de campo e se existe linha cabeçalho ou não.
 * <br/>
 * <br/>
 *  
 * <b>S071a: Analysis</b><br/>
 * <ul><li>Vai ser efectuada uma thread para a importação dos ficheiros em paralelo. </li></ul>
 * <ul><li> O utilizador vai poder escolher o separador de linha.</li></ul>
 * <ul><li>Ver se o ficheiro tem cabeçalho.</li></ul>
 *  
 * <br/>
 * <br/>
 * 
 * <b>S071d: Design</b><br/>
 * <br/>O Diagrama de sequência vai ser exactamente igual ao anterior excepto
 * o ultimo metodo invocado que é o fileImport() neste caso vai invocar a thread<br/>

 * 
 * 
 * <img src="../../../csheets/userstories/us0071/doc-files/us071_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S071c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071f: Functional Tests</b><br/>
 *  De referiri que a US071 importação paralela e a US074 Exportação paralela
 *  foram pensadas em comum assim sendo os ficheiros podem ser importados e exportador
 *  sem que exista qualquer problema, reconhecendo cabeçalho e dados
 *  A varavel SEPARATOR nao pode ter valores reservados EX: [ ] . ?...
 * <br/>
 * <br/>
 * 
 * @author Frederico Calor
 */
/*
 *
  @startuml doc-files/us071_design1.png
    extensionImport->uiExtensionImport: getUiExtension() 
    uiExtensionImport->importMenu: getMenu() 
    importMenu->importAction: new ImportAction()
    importAction->importAction: FileImport() 
  
  @enduml
 *
 */
package csheets.userstories.us071;