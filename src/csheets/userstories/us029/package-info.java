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
 * <b>S028a: Analysis</b><br/>
 * No User Story 029 é pedido que o conteudo das celulas da folha de calculo
 * sejam exportadas para um ficheiro PDF, so com mais um pormenos, que a informacao
 * fique organizada por tabela como o csheet,.
 * <br/>
 * <br/>
 *
 * <b>S028d: Design</b><br/>
 * O Diagrama de Sequencia demonstra como ira ser efectuado o caso de uso:<br/>
 * <img src="../../../csheets/userstories/us028/doc-files/us028_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S028c: Coding</b><br/>
 * <br/>
 * <br/>
 * <br/>
 *
 * <b>S028u: Unit Tests:</b><br/>
 * Os metodos utilizados sao void e portanto nao foi possivel a realizaçao de
 * testes unitarios.
 * <br/>
 * <br/>
 * <br/>
 *
 * <b>S028f: Functional Tests</b><br/>
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
 @startuml doc-files/us028_design1.png
 
 end
 @enduml
 *
 */
package csheets.userstories.us029;
