/**
 * Documentacao tecnica para a user story 009: Auto-ordenacao. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Permitir que se defina um range e se possa clicar na coluna que se deseja ordenar.
 * <br/>
 * <br/>
 *  
 * <b>S076a: Analysis</b><br/>
 * Esta user story e a continuacao da user story 008 e 007, pelo que se deve estudar estas duas user storys. <br/> 
 * Estudar o Cleansheets. <br/>
 * Aprofundar conhecimentos em JSwing. <br/>
 * Esta user story deve ser um melhoramento das user stories em cima citadas, e nao uma nova implementacao. <br/> 
 * <br/>
 * <br/>
 * Implementacao:<br/>
 * <br/>
 * Será necessaria a criacao de um metodo que peça ao utilizador para escolher uma coluna referencia de entre 
 * as colunas por ele selecionadas.<br/>
 * Tem de se implementar o metodo sort de maneira a que a alteraçao feita na coluna escolhida pelo utilizador 
 * seja feita tambem nas restantes colunas.<br/>
 * <br/>
 * <br/>
 * Utilizador:<br/>
 * Do ponto de vista do utilizador, a unica diferença em relaçao a user story anterior, será que nesta user story, 
 * o utilizador, deverá escolher uma coluna que servirá como referencia.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S009d: Design</b><br/>
 * Nesta user story será pedido ao utilizador para escolher uma coluna que servira como referencia antes de executar o metodo
 * orderContents(), so essa coluna sera ordenada, as restantes simplesmente acompanharao a coluna escolhida pelo utilizador.
 * O restante design será como na user story anterior, como mostra o seguinte diagrama:<br/><br/>
 * <img src="../../../csheets/userstories/us043/doc-files/US009_design.png">
 * <br/>
 * <br/>
 * Classes:<br/>
 * <br/>
 * SearchAction:<br/>
 * Classe que vai ordenar alfabeticamente os conteudos das celulas. Conta com os seguintes metodos:<br/>
 * <br/>
 * getColumns()->devolve as colunas selecionadas pelo utilizador;<br/>
 * sortAZ()->chama os metodos que vao organizar os conteudos das celulas;<br/>
 * checkListEmpty()->limpa os dados dos valores das celulas;<br/>
 * setContentCells()->escreve nas celulas os conteudos ordenados;<br/>
 * orderContents()->ordena os conteudos das celulas;<br/>
 * askColumn()->pergunta ao utilizador qual a coluna referencia;<br/>
 * <br/>
 * SearchActionZA:<br/>
 * Classe que vai ordenar em ordem inversa ao alfabeto os conteudos das celulas. Conta com os seguintes metodos:<br/>
 * <br/>
 * getColumns()->devolve as colunas selecionadas pelo utilizador;<br/>
 * sortAZ()->chama os metodos que vao organizar os conteudos das celulas;<br/>
 * checkListEmpty()->limpa os dados dos valores das celulas;<br/>
 * setContentCells()->escreve nas celulas os conteudos ordenados;<br/>
 * orderContents()->ordena os conteudos das celulas;<br/>
 * askColumn()->pergunta ao utilizador qual a coluna referencia;<br/>
 * <br/>
 * <br/>
 * 
 * <b>S009c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
 * <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S009u: Unit Tests</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
 * <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S009f: Functional Tests</b><br/>
 * Para testar esta user story, o utilizador deve seguir os passos seguintes:<br/>
 * 1 Executar o CleanSheets;<br/>
 * 2 Arrastar uma celula vazia para outra celula vazia;<br/>
 * 3 Inserir valores nas celulas;<br/>
 * 4 Selecionar a range de colunas que deseja ordenar;<br/>
 * 5 Clicar no menu Extensions onde serao apresentadas as extensoes disponiveis;<br/>
 * 6 Clicar na extensao Sort Cell/Sort Cell Z-A, mediante o tipo de ordenação que desejar executar;<br/>
 * 7 Caso o utilizador tenha selecionado varias colunas, será mostrada uma coluna em que o utilizador deve escolher a coluna referencia;<br/>
 * 8 A coluna escolhida sera ordenada, e as restantes colunas acompanharao os mesmos movimentos de ordenacao da coluna selecionada.<br/>
 * <br/>
 * <br/>
 * 
 * @author 1120564MarcoEsteves
 */
/*
@startuml doc-files/US009_design.png
 participant "uic : UIController" as UIC
 participant "cth : CellTransferHandler" as CTH
 participant "c : Cell" as C
 participant "sa : SortAction" as SA
 UIC->CTH : getCellTransferHandler()
 C->CTH : getSelec()
 CTH->SA : sourceTable.getSelectedCells()
@end
*/


package csheets.userstories.us009;