/**
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * US059- New menus with macros.
 * <br/>
 * <br/>
 *  
 * <b>S059a: Analysis</b><br/>
 *  
 * This functionality will allow the user to create new menus and use them to run previously created macros.
 * 
 * 
 * <br/>
 * 
 * <b>S059d: Design</b><br/>
 * 
 * The menu creation window pops up and when filling out the data to create the new menu option, <br/>
 * the user will have an option to bind the execution to a specified macro <br/>
 * Since currently there are no objects in the project that represent a Macro, <br/>
 * I will not be able to instanciate and run a macro so i will instead create a few examples that simulate the operations a macro would perform on a cell <br/>
 * <img src="../../../csheets/userstories/us059/doc-files/us059_design1.png">
 * 
 * <br/>
 * 
 * 
 * 
 * <b>S059c: Coding</b><br/>
 * 
 * Since there were no objects representing a Macro in the project(this feature will only be available when US44 is implemented),<br/>
 * I chose to write a few basic cell operations myself and bind them to a specified menu created by the user.<br/>
 * Even though US44 was not implemented, I still wrote the necessary code for US059 to work when someone implements US44 but I left it commented.<br/>
 * I took the following steps when implementing this US:<br/>
 * I first created a combobox that is populated with a list of all the existing Macros in the Aplication.<br/>
 * I then created a checkbox that enables and disables the Macro combobox, this option allows the user to choose either to bind the new menu to a macro or not.<br/>
 * If the user chooses to bind the new menu to a macro the aplication will run the macro whenever the user clicks the new menu and will send a confirmation message <br/>
 * showing that the macro's operations were executed.<br/>
 * 
 * <br/>
 * 
 * <b>S059u: Unit Tests</b><br/>
 * 
 * Since this US only performs interactions USER<->GUI there is no Unit Test available to test this US. The best way to test it is to perform a basic Functional Test described underneath.
 * <br/>
 * 
 * <b>S059f: Functional Tests</b><br/>
 * 
 * To test this functionality, the user should follow these steps:
 * 1- Run cleansheets;
 * 2- Click on the Extension menu, go to New Menus. There must appear a menu option containning "*Add Menu to window...*";<br/>
 * 3- The previous option will pop a new window with text field and a add and cancel options. After inserting a name for the new option, clicking on the checkbox and choosing a macro from the macros list the user should click on the Add button;<br/>
 * 4- To verify that the menu was added, navigate to New Menus and the new menu the user just created should appear under "*Add Menu to window...*" . <br/>
 * 5- The user can now click on the new menu and check if it performed the operations that it was supposed to do on the cells.
 * <br/>
 * 
 * @author 1120546LuísAbreu
 * 
 * @startuml doc-files/us059_design1.png
 participant "uic : UIController" as UIC
 participant ExtensionManager as ExtM
 participant "extension : MenuExtension" as EM
 participant "uiExtension : EdMenuUIExtension" as UIEd
 participant "aux1 : MenuEdWindow" as MEW
 participant "uiext : UIExtension" as uext
 participant "jMenu : JMenu" as jm
 UIC -> ExtM : extensions=getExtensions();
  loop for Extension ext : extensions
 	UIC -> EM : uiExtension=getUIExtension(this);
 	EM -> UIEd : new(extension, uic)
 	UIEd -> UIEd : getMenuItem();
        activate UIEd
 	create MEW
 	UIEd -> MEW :  new (uic)
        deactivate UIEd
  	MEW -> uext : getMenu()
  	MEW -> uext : selectMacro()
  	uext -> jm : bindMacroToMenu()
        uext -> jm : add(i)
 	UIC -> UIC : uiExtensions.add(uiExtension);
 end
  @enduml
 */
/*
 *

 *
 */
package csheets.userstories.us059;