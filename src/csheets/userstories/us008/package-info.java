/*
 * Technical documentation regarding the user story 008: sort multiple collumns of cells. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Sort range of cells. Sorting a range (several columns) cells.
 * <br/>
 * <br/>
 *  
 * <b>S008a: Analysis</b><br/>
 * 
 * This use case is the continue of the US007 the previous use case was supposed to do the sort of string and numbers of one column
 * Week 2 requires the function to order multiple cells, so we just need to configure thi snew method to sort 1 or more columns.
 * The class method that will be called is SortActionAZ()or SortActionZA(), depending on order that user choose, that allow to order the collumn.
 * That method will call a bunch of methods since order cells, to clean arrays and set cells.
 * <br/>
 * <br/>
 *
 * <b>S008d: Design</b><br/>
 * 
 * For this sequel, the user will select a range of columns for example A to C, and by selecting the sort option, all the columns will be sorted.
 * So it will be basically the same option a before on Extensions->SortAZ or SortZA.
 * <img src="../../../csheets/userstories/us008/doc-files/us008_design1.png"> 
 * <br/>
 * <br/>
 *
 *<b>S007c: Coding</b><br/>
 * The class in use is the CellTransferHandler, i had some problems using this one because a NullPointer exception would appear, to fix this, i had to do some research and realize that the problem,
 * was that this class is "activated" when the cells are either copied or moved.
 * see:<br/>
 * <a href="../../../csheets/ext/sort/package-summary.html">csheets.ext.sort</a><br/>
 * <a href="../../../csheets/ext/sort/ui/package-summary.html">csheets.ext.sort.ui</a><br/>
 * <br/>
 * <br/>
 *
 *
 *
 */
/*
@startuml
 participant "uic : UIController" as UIC
 participant "cth : CellTransferHandler" as CTH
 participant "c : Cell" as C
 participant "sa : SortAction" as SA
 UIC->CTH : getCellTransferHandler()
 C->CTH : getSelec()
 CTH->SA : sourceTable.getSelectedCells()
@end
*/
package csheets.userstories.us008;
