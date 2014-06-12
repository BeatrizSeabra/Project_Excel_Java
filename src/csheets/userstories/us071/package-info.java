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
 * Deverá ser efectuada uma thread  para a importação dos ficheiros seja feita
 * em paralelo. 
 * Criar a opção do utilizador coloque o separador de linha.
 * Ver se o ficheiro tem cabeçalho.
 *  
 * <br/>
 * <br/>
 * 
 * <b>S071d: Design</b><br/>
 * <br/><br/>

 * 
 * 
 * <img src="../../../csheets/userstories/us0037/doc-files/us037_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S071c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/core/formula/compiler/lang/package-summary.html">csheets.core.formula.lang</a><br/>
 * <a href="../../../csheets/core/formula/compiler/compiler/package-summary.html">csheets.core.formula.lang</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071f: Functional Tests</b><br/>
 <br/>
 * <br/>
 * <br/>
 * 
 * @author Frederico Calor
 */
/*
 *
  @startuml doc-files/us071_design1.png
    extensioImport->uiExtensionImport: getUiExtension() 
    uiExtensionImport->importMenu: getMenu() 
    importMenu->importAction: new ImportAction()
    importAction->importAction: FileImport() 
  
  @enduml
 *
 */
package csheets.userstories.us071;