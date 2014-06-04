/**
 * Documentação tecnica da user story 034 : Função Eval. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Edition Editor of entries associated with menu options. 
 * Should allow adding new options menu. 
 * For the new menu options it is not required to do anything (the option only appear in cleansheets). 
 * <br/>
 * <br/>
 *  
 * <b>S001a: Analysis</b><br/>
 * For this issue the program, will need basically a new option on the Menubar() of the cleansheet.
 * This new option will pop a window to the user and then give him the option of creating a new menu option, under the existing MenuBar() option or create a new MenuItem().
 * After reading the issue, we can confirm that we only need to create a new Menu or subMenu option, it is not require for it to do anything so the user can see the option but can not use it, or if he does, it won't happen anything.
 * <br/>
 * <br/>
 * 
 * 
 * <b>S001d: Design</b><br/>
 * To realize this user story we don't need to create any new subclass, we can simply use the classes and methods allready in use to create a new JMenu.
 * Also it will be needed a method to assign the correct menus that the user wants to work on, by creating methods with the UI regarding Java knowledge.
* <br/>
* <br/>
 * */
/*
@startuml doc-files/us058_design1.png
participant "uic : UIController" as UIC
 participant ExtensionManager as ExtM
 participant "extension : MenuExtension" as EM
 participant "uiExtension : UIExtensionNewMenu" as UIExt
 participant "newMenuPanel : JMenuItem" as cp
 UIC -> ExtM : extensions=getExtensions();
  loop for Extension ext : extensions
 	UIC -> EM : uiExtension=getUIExtension(this);
        EM -> UIC : name=addMenu(name);
 	EM -> UIC : mnemonic=addMenu(mnemonic);
 	EM -> UIExt : new(extension, uic)
 	UIExt -> UIExt : getMenuItem();
        activate UIExt
 	create cp
 	UIExt -> cp :  new (uic)
        deactivate UIExt  	
 	UIC -> UIC : uiExtensions.add(uiExtension);
 end
@enduml
 */

package csheets.userstories.us058;
