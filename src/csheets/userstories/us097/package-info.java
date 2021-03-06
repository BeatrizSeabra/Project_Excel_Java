/**
 * Technical documentation regarding the user story 097: contact edition.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Window that allows create, edit and remove a contact. Contacts have first and
 * last name and a photo/picture associated.
 * <br/>
 * <br/>
 *
 * <b>S097a: Analysis</b><br/>
 * This functionality allows user create, edit and remove a contact. Its
 * provided to user three options:</br>
 * if he chooses create, application shows fields to fill, if he chooses edit,
 * application list editable contacts and allows selection and then edition if
 * he chooses remove, application list contacts and allows remove a contact.
 * <br/>
 * <br/>
 *
 * <b>S097d: Design</b><br/>
 * To realize this user story we will need to create a subclass of Extension. We
 * will also need to create a subclass of UIExtension.<br/>
 * The following diagram shows how classes interacte.<br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us097_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S097c: Coding</b><br/>
 * see:<br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S097u: Unit Tests</b><br/>
 * see:<br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S097f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1run cleansheets;<br/>
 * 2click on the Extension menu and select contacts. There must appear a contacts list.<br/>
 * 3to test create option, he should click on create button it will show a new window, now user must fill data, if succeed the contact created is visible on the list.<br/>
 * 4to test edit/remove option, he should click on contact he wants edit, it will pop a window with contact information, then if chooses to remove and confirm and get succeed it will be removed from the list,
 * if he chooses to edit user is able to edit the textfields, then if fields edited and confirmed and get succeed contact will appear edited on the list.  <br/>
 * 
 * <br/>
 * <br/>
 * 
* @author alexandrebraganca
 */
/*
 *
 @startuml doc-files/us097_design1.png
 participant "uic : UIController" as UIC
 participant ExtensionManager as ExtM
 participant "extension : ContactsExtension" as contExt
 participant "uiExtension : UIExtensionContacts" as UIExt
 participant "jpaContacts" as jpa
 UIC -> ExtM : extensions=getExtensions();
 loop for Extension ext : extensions
 UIC -> contExt : uiExtension=getUIExtension(this);
 activate contExt
 create UIExt
 contExt -> UIExt : new(extension, uic)
 deactivate contExt
 alt option==create
 UIExt->jpa : add();
 end
 alt option==edit
 UIExt->jpa : update();
 end
 alt option==remove
 UIExt->jpa : remove();
 end
 end
 @enduml
 *
 */
package csheets.userstories.us097;
