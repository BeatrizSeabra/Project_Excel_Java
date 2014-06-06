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
 * <b>S058a: Analysis</b><br/>
 * For this issue the program, will need basically a new option on the Menubar() of the cleansheet.
 * The new option will be under the Extensions options with the name "New Menus" with a option to the new ones under that same option (so this way it's sure that the program follow the basics).
 * This new option will pop a window to the user and then give him the option of creating a new menu option.
 * After reading the issue, we can confirm that we only need to create a new subMenu option, it is not require for it to do anything so the user can see the option but can not use it, or if he does, it won't happen anything.
 * <br/>
 * <br/>
 * 
 * 
 * <b>S058d: Design</b><br/>
 * To realize this user story we need to create the classes relative to extensions, so we need to do two packages and do the respective classes to add in the options.
 * Also it will be needed a method to assign the correct menus that the user wants to work on, by creating methods with the UI regarding Java knowledge.
 * The Diagram for this use case:<img src="../../../csheets/userstories/us058/doc-files/us058_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S058c: Coding</b><br/>
 * <a href="../../../csheets/ext/edMenu/package-summary.html">csheets.ext.edMenu</a><br/>
 * <a href="../../../csheets/ext/edMenu/ui/package-summary.html">csheets.ext.edMenu.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S058u: Unit Tests</b><br/>
 * Since this US only has user to graphic interface conection, there is no need ne realiza Unit. To try this function, we can check the functional tests on the next separator.
 * <br/>
 * <br/>
 * 
 * 
 */
/*
@startuml doc-files/us058_design1.png
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
        uext -> jm : add(i)
 	UIC -> UIC : uiExtensions.add(uiExtension);
 end
@enduml
 */

package csheets.userstories.us058;
