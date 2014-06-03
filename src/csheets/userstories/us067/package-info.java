/**
 * Technical documentation regarding the user story 067: Find workbooks files.
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Enable research on the local disk files that are leaves calculation of cleansheets. 
 * Must do a thorough search to all folders and display a list of all files found.
 * <br/>
 * <br/>
 *  
 * <b>S067a: Analysis</b><br/>
 * At first sight, I thought implement an option in the application menu,  
 * which serve to perform the functionality to search for workbooks cleansheets files (*.cls), 
 * which are the files supported by the application. Running this option, 
 * the program will search for all files with this extension, in all the hdd directories, 
 * showing to the user, a list of found files.
 * <br/>
 * <br/>
 * 
 * <b>S067d: Design</b><br/> 
 * <br/>
 * To realize this user story we will need to create a submenu option in the menu option File, named "List workbooks files in hdd".
 * We will also need to create a subclass of UIExtension. For the sidebar we need to implement a JPanel.<br/>
 * The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us067_design1.png">
 * <br/>
 * 
 * <b>S067c: Coding</b><br/>
 * <br/>
 * 
 * <b>S067u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S067f: Functional Tests</b><br/>
 * <br/>
 * 
 * @author 1090675
 */
/*
 *
  @startuml doc-files/us067_design1.png
  participant "uic : UIController" as UIC
    participant ExtensionManager as ExtM
    participant "extension : CommentsExtension" as EExample
    participant "uiExtension : UIExtensionComments" as UIExt
    participant "CommentPanel : JPanel" as cp
    UIC -> ExtM : extensions=getExtensions();
    loop for Extension ext : extensions
           UIC -> EExample : uiExtension=getUIExtension(this);
           activate EExample
           create UIExt
           EExample -> UIExt : new(extension, uic)
           deactivate EExample
           UIExt -> UIExt : getSideBar();
           activate UIExt
           create cp
           UIExt -> cp :  new (uic)  	
           deactivate UIExt
           UIC -> UIC : uiExtensions.add(uiExtension);
    end
  @enduml
 *
 */
package csheets.userstories.us067;