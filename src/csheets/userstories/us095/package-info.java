/**
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * US095- Contact's Occupation.
 * <br/>
 * <br/>
 *  
 * <b>S095: Analysis</b><br/>
 * A list of occupations is shown to the user from which he can chose one, after that the user's contact information is updated.<br/>
 * The list of occupations is imported by the aplication from a preconfigured file. <br/>
 * 
 * 
 * <br/>
 * 
 * <b>S095d: Design</b><br/>
 * To complete this task we will need to create a file inside the aplication's directory that contains a list of predetermined occupations. <br/>
 * The aplication will then cicle trough the file and print each occupation to the screen.<br/>
 * After the user selects one occupaton a query is sent to the database updating the corresponding contact's information<br/>
 * The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
 * <img src="../../../csheets/userstories/us095/doc-files/us095_design1.png">
 * <br/>
 * 
 * 
 * 
 * <b>S095c: Coding</b><br/>
 * <br/>
 * 
 * <b>S095u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S095f: Functional Tests</b><br/>
 * <br/>
 * 
 * @author 1120546
 */
/*
 *
  @startuml doc-files/us095_design1.png
  participant "uic : UIController" as UIC
  participant ExtensionManager as ExtM
  participant "ContactExtension" as EExample
  UIC -> ExtM : extensions=getExtensions();
  loop for Extension ext : extensions
  	UIC -> EExample : uiExtension=getUIExtension(ContactExtension);
  end
  	activate EExample
  	EExample -> UIC : getUIUpdateContact()
        UIC -> EExample: updateContact(this)
        EExample -> UIC : getUIUpdateOccupation()
        UIC -> EExample : updateOccuppation(this)
  	deactivate EExample
  @enduml
 *
 */
package csheets.userstories.us095;