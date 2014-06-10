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
 * For this sequel, the program will create a user interface for the client to choose the columns that will need.
 * So it will be basically a new option on Extensions->Sort Cell->Sort range of cells.
 * What will happen in this option is that the client willl introduce the columns that he wishes to sort, and then he just has to press the "Ok" button, then the wanted columns will be automatically sorted.
 * <br/>
 * <br/>
 *
 *
 *
 */
package csheets.userstories.us008;
