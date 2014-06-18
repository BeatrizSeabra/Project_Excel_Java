/**
 * Documentacao tecnica para a user story 009: Auto-ordenacao. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Permitir que se deﬁna um range e se possa clicar na coluna que se deseja ordenar.
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
 * 
 * <b>S009d: Design</b><br/>
 * Nesta user story será pedido ao utilizador para escolher uma coluna que servira como referencia antes de executar o metodo
 * orderContents(), so essa coluna sera ordenada, as restantes simplesmente acompanharao a coluna escolhida pelo utilizador.
 * O restante design será como na user story anterior, como mostra o seguinte diagrama:
 * <img src="../../../csheets/userstories/us043/doc-files/US009_design.png">
 * <br/>
 * <br/>
 * 
 * <b>S009c: Coding</b><br/>
 *  * see:<br/>
 * <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
 * <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S009u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S009f: Functional Tests</b><br/>
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
