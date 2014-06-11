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
 * This functionality will allow the user to create new menus and use them to run previously created macros
 * 
 * 
 * <br/>
 * 
 * <b>S059d: Design</b><br/>
 * 
 * The menu creation window pops up and when filling out the data to create the <br/>
 * new menu option the user will have an option to bind the execution to a specified macro <br/>
 * <img src="../../../csheets/userstories/us059/doc-files/us059_design1.png">
 * 
 * <br/>
 * 
 * 
 * 
 * <b>S059c: Coding</b><br/>
 * <br/>
 * 
 * <b>S059u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S059f: Functional Tests</b><br/>
 * <br/>
 * 
 * @author 1120546
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
  	uext -> jm : bindMacroToMenu(true)
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