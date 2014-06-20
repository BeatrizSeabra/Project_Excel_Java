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
 * Classe TemporaryVariable foi criada para suportar as variaveis temporarias. A classe implementa a interface Expression.<br/>
 * A gramatica Formula.g foi alterada para suportar as variaveis temporarias. VARNAME e' o identificador de uma variavel temporaria e sera adicionado ao atom e pode ser o resultado de uma atribuicao.<br/>
 * O metodo convert() da classe ExcelExpressionCompiler tem de ser alterada em dois pontos. Quando o node.getChildCount() == 0 a variavel e' tratada como um valor e e' retornado um objeto do tipo TemporaryVariable que exista numa spreadsheet com aquele nome.<br/>
 * Quando o node.getChildCount() == 2 e a atribuicao esta' a ser feita a uma variavel, tera que se criar um novo objeto do tipo TemporaryVariable e adiciona-la a todas as Spreadsheets(variavel contexto workbook).
 * <img src="../../../csheets/userstories/us0038/doc-files/us038_design1.png">
 * <br/><br/>
 * <br/>
 * <br/>
 *
 * <b>S038c: Coding</b><br/>
 * See:<br/>
 * <a href="../../../csheets/core/formula/package-summary.html">csheets.core.formula</a><br/>
 * <a href="../../../csheets/core/formula/compiler/package-summary.html">csheets.core.formula.compiler</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S038u: Unit Tests</b><br/>
 * see:<br/>
 * Nao e' possivel realizar testes unitarios.
 * <br/>
 * <br/>
 *
 * <b>S038f: Functional Tests</b><br/>
 * Para testar esta User Story e' necessario seguir os seguintes passos:<br/>
 * 1. Correr o cleansheets;<br/>
 * 2. Atribuir (operador :=) a uma variavel temporaria (@texto) um valor ou expressao;<br/>
 * 3. Utilizar a variavel em expressoes.<br/>
 * <br/>
 * <br/> 
 *
 * @author Tiago & Diogo Moreira(1120339)
 */
/*
 *@startuml doc-files/us038_design1.png
 User -> Cell : Inserção de dados
 Cell -> CellImpl : setContent()
 CellImpl -> Formula : create()
 Formula -> FormulaCompiler : getInstance()
 FormulaCompiler -> ExcelExpressionCompiler: compile()
 ExcelExpressionCompiler-> ExcelExpressionCompiler: convert()
 alt node.getChildCount() == 0
 ExcelExpressionCompiler<-Formula: return ((SpreadsheetImpl)cell.getSpreadsheet()).getTemporaryVariable(node.getText())
 end
 
 alt node.getChildCount() == 2
 ExcelExpressionCompiler->Spreadsheet: addOrUpdateTemporaryVariable(new TemporaryVariable(node.getChild(0).getText(), value, cell.getSpreadsheet()))
 end
 @enduml
 *
 */
package csheets.userstories.us038;
