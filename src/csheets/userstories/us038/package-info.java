/**
 * Documentacao tecnica da user story 038 : Variavel temporaria.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Acrescentar o conceito de variavel temporaria. As variaveis temporarias devem
 * ter um nome que se inicia pelo simbolo "@". <br/>
 * Quando a variavel e referida numa formula ela deve ser criada se ainda nao
 * existir. <br/>
 * Caso exista, deve-se utilizar "essa" variavel. O seu valor permanece ate ser
 * sobreposto ou se fechar a folha. <br/>
 * <br/>
 * <br/>
 *
 * <b>S038a: Analysis</b><br/>
 * Escolher o local onde vai ser implementada a funcionalidade. Como e um
 * elemento de uma formula na folha de Excel, sera em principio implementado nos
 * packages csheets.core.formula e csheets.core.formula.compiler. <br/>
 * Analise dos packages referidos anteriormentes e necessaria a analise da
 * utilizacao de referências em Excel, como modo de auxiliar <br/>
 * Devera ser ainda necessario a alteracao da gramatica das formulas de modo a
 * poder ser utilizada essa funcionalidade.
 * <br/>
 * <br/>
 *
 * <b>S038d: Design</b><br/>
 * <img src="../../../csheets/userstories/us0038/doc-files/us038_design1.png">
 * <br/><br/>
 * <br/>
 * <br/>
 *
 * <b>S038c: Coding</b><br/>
 * see: Ficou incompleto e com erros na gramática<br/>
 * <br/>
 * <br/>
 *
 * <b>S038u: Unit Tests</b><br/>
 * see:<br/>
 * <br/>
 * <br/>
 *
 * <b>S038f: Functional Tests</b><br/>
 * Apesar de não estar a fncionar, os passos pretendidos para testar o
 * funcionamento da funcionalidade eram os seguintes 1. Inserir uma funcao a
 * atribuir um valor a uma variavel temporária 2. Depois, caso não existisse,
 * essa variavel, teria de criar um nova, senao sobrepunha o novo valor com o
 * valor anterior 3. Atribuir a uma variavel, usando o atributo de atribtuição,
 * o valor da variavel temporaria
 * <br/>
 * <br/>
 *
 * @author Tiago
 */
/*
 *@startuml doc-files/us037_design1.png
 User -> Cell : Inserção de dados
 Cell -> CellImpl : setContent()
 CellImpl -> Formula : create
 Formula -> FormulaCompiler : getInstance()
 ExcelExpressionCompiler -> Attribution : compile ()
 Attribution -> Expression : applyTo()
 Expression -> CellImpl :evaluate()
 FormulaCompiler -> CellImpl : instance
 CellImpl -> CellImpl : updateDependencies()
 CellImpl -> CellImpl : fireContentChanged()
 CellImpl -> CellImpl : reevaluate()
 
 @enduml
 *
 */
package csheets.userstories.us038;
