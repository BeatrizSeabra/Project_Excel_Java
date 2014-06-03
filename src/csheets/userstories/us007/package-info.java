/**
 * Technical documentation regarding the user story 007: sort cells. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Sort by order the cells content. For this use case only need to sort one collumn.
 * <br/>
 * <br/>
 *  
 * <b>S001a: Analysis</b><br/>
 * 
 * Since the cells will be filled with strings and number, they will need to be sort by order. The user will be able to choose how he/she want to order the collumn.
 * This will be added to the submenu Sort on Edit menu that will open a JFrame or a messageDialog to input the collumn to be order.
 * The class method that will be called is SortAction() that creates a new sorting action and then will use the actionPerformed method that will allow the user to choose the criteria wanted. 
 * Then will be called a new method that contains the code for sorting all the collumn with the order type picked by the user. 
 * <br/>
 * <br/>
 * 
 * * <b>S001d: Design</b><br/>
* To realize this user story we will need to create a subclass of Extension. We will also need to create a subclass of UIExtension. For the sidebar we need to implement a JPanel.<br/>
* The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
* <img src="../../../csheets/userstories/us007/doc-files/us007_design1.png"> 
* <br/>
* <br/>
 * 
 * @startuml doc-files/us007_design7.png
 Create SortAction
 Create JPane
 SortAction->JPane: create()
 JPane-->SortAction: return collumn
 Loop
 SortAction->UIController: getActiveSpreedsheet()
 UIController->Spreedsheet: getCell(collumn,0)
 Spreedsheet->Cell: getContent()
 end

 SortAction->SortAction: sort(ArrayList<String>Content)

 Loop
 SortAction->Cell:setContent(content)
 end
 @enduml
 * */

package csheets.userstories.us007;
