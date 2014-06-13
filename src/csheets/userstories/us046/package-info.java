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
 * Diagrama de sequencia relativo ao US046.
 * <img src="../../../csheets/userstories/us046/doc-files/US046_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S073c: Coding</b><br/>
 * Na implementaçao do codigo sera necessario utilizar uma extensao para a
 * insercao de um botao. Sera necessario utilizar um painel onde irao ser
 * colocados os botes, o painel estara com o fundo transparente para assim ser
 * possivel visualizar a folha de calculo.<br/> 
 * see:<br/>
 * <a href="../../../csheets/ext/button/package-summary.html">csheets.ext.button</a><br/>
 * <a href="../../../csheets/ext/button/ui/package-summary.html">csheets.ext.button.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S073u: Unit Tests</b><br/>
 * A realização de testes unitarios na interface grafica nao e possivel.
 * see:<br/>
 * <a href="../../../csheets/ext/button/package-summary.html">csheets.ext.button</a><br/>
 * <a href="../../../csheets/ext/button/ui/package-summary.html">csheets.ext.button.ui</a><br/>
 * <br/>
 * <br/>
 * <b>S028f: Functional Tests</b><br/>
 * O procedimento necessário para executar o User Story referente á inserção
 * de botões na folha é:<br/>
 * 1- Correr o Programa;<br/>
 * 2- Selecionar "Extensions" na opção do menu;<br/>
 * 3- Escolher "Button" e depois "Insert button";<br/>
 * 4- Se for necessario inserir mais botoes tem que seguir os mesmos passos.<br/>
 *
 *
 *
 * @author 1110316
 */
/**
  @startuml doc-files/us046_design1.png 
  menuBar -> ButtonSheet : create()
  buttonSheet -> StyleToolbar : add()
  buttonSheet -> SpreadSheetTable:getselectedcells()
  buttonSheet -> Workbook: show()
  @enduml
 *
 */
package csheets.userstories.us046;
