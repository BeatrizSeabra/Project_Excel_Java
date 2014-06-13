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
 * A importacao de dados deve ser efectuada em "paralelo". 
 * Deve ser possivel definir os caracteres separadores de campo e se existe linha cabecalho ou nao.
/**
 * Documentacao tecnica da user story 071 : Importacao Paralela. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * A importacao de dados deve ser efectuada em "paralelo". 
 * Deve ser possível definir os caracteres separadores de campo e se existe linha cabeçalho ou nao.
 * <br/>
 * <br/>
 *  
 * <b>S071a: Analysis</b><br/>
 * <ul><li>Vai ser efectuada uma thread para a importacao dos ficheiros em paralelo. </li></ul>
 * <ul><li> O utilizador vai poder escolher o separador de linha.</li></ul>
 * <ul><li>Ver se o ficheiro tem cabecalho.</li></ul>
 *  
 * <br/>
 * <br/>
 * 
 * <b>S071d: Design</b><br/>
 * <br/>O Diagrama de sequencia vai ser exactamente igual ao anterior excepto
 * o ultimo metodo invocado que é o fileImport() neste caso vai invocar a thread.
 * 
 * De referiri que a US071 importacao paralela e a US074 Exportacao paralela
 * foram pensadas em comum assim sendo os ficheiros podem ser importados e exportador
 * colocando como o primeiro caracter de separacao e os restantes como dados ou header.
 * <br/>

 * 
 * 
 * <img src="../../../csheets/userstories/us0071/doc-files/us071_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S071c: Coding</b><br/>
 * <ul><li>1. Foi realizada uma Thread na actionPerformed()</li></ul>
 * <ul><li>2. Realizou.se um novo metodo FileImporter onde implementa o Runnable,
 * onde e chamada a funcao importFile</li></ul>
 * see:<br/>
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071u: Unit Tests</b><br/>
 * <ul><li> De referir nao existe testes que sejam muito legiveis para esta funcionalidade</li></ul>
 * see:<br/>
 * 
 * <a href="../../../csheets/ext/importfiles/ui/package-summary.html">csheets.ext.importfiles.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S071f: Functional Tests</b><br/>
 *  <ul><li>1. O utilizador escolhe a menu "Extensions"</li></ul>
 *  <ul><li>2. Escolhe opção import em TXT</li></ul>
 *  <ul><li>3. Escolhe o ficheiro pretendido</li></ul>
 *  <ul><li>4. Ve o resultado nas celulas.</li></ul>
 *  <ul><li> Se o ultilizador quiser fazer um novo ficheiro para ser exportado tem 
 *  que ter em conta:
 *  - O primeiro caracter e sempre o caracter de separacao;
 *  - Se colocar um header nao pode ter qualquer simbolo no final exemplo:  ;Isto e um Header  .
 *  - Se colocar alguma informacao nas respectivas celulas precisa so de colocar 
 *    o simbolo de separacao exemplo: m;f;s; ou entao se for na primeira linha ;j;g;d;e  .
 *  Ter em conta: A variavel SEPARATOR nao pode ter valores reservados EX: [ ] . ? \etc
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