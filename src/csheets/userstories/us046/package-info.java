/**
 * Documentação referente ao user story us046: Botoes nas folhas
 * <br/>
 * <br/>
 *
 * <b>Requerimento</b><br/>
 * US046- Botoes nas folhas - Permitir inserir botoes na folha de calculo (os
 * botoes ficam a "flutuar" em "cima" da folha de calculo).
 * </br>
 * </br>
 *
 * <b>S073a: Analysis</b><br/>
 * No user story 046 é pedido que seja possivel inserir um botao na folha de
 * calculo e esse fique a flutuar. Para isso e´ necessario adicionar uma
 * extencao ao menu que quando selecionada execute um Jpanel que vai conter os
 * botoes.
 * <br/>
 *
 *
 * <br/>
 * <br/>
 *
 * <b>S073a: Design</b><br/>
 * <img src="../../../csheets/userstories/us046/doc-files/US046_design.png">
 * <br/>
 * <br/>
 *
 * <b>S073c: Coding</b><br/>
 *
 * <br/>
 * <br/>
 *
 * <b>S073u: Unit Tests</b><br/>
 *
 * <br/>
 * <br/>
 * <b>S028f: Functional Tests</b><br/>
 *
 *
 *
 *
 * @startuml doc-files/us046_design1.png menuBar -> ButtonSheet : create();
 * buttonSheet -> StyleToolbar : add(); buttonSheet -> SpreadSheetTable:
 * getselectedcells(); buttonSheet -> Workbook: show();
 * @enduml
 *
 *
 * /
 *
 * @author 1110316
 *
 */
package csheets.userstories.us046;
