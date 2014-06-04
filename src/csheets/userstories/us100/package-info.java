/**
* Technical documentation regarding the user story 100: Addresses - Residences. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Editing Residences.
* <br/>
* <br/>
*  
* <b>S001a: Analysis</b><br/>
* Definition content of each residence, for exemple: Street, Locality, Postal Code, City, Country and Type: primary or secundary.</br></br>
* Definition layout for presentation, remotion and update residences.
* <br/>
* <br/>
* 
* <b>S001d: Design</b><br/>
* Choice of the resources used for store the residences.<br/><br/>
* Creation of diagrams to represent a solution for the problem.<br/><br/>
* <img src="../../../csheets/userstories/us001/doc-files/us100_design1.png"> 
* <br/>
* <br/>
* 
* <b>S001c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001f: Functional Tests</b><br/>
* To test this user story, the user should follow these steps:<br/>
* 1run cleansheets;<br/>
* 2click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
* 3the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
* 4the sidebar window should have only one editbox. <br/>
* <br/>
* <br/>
* 
* @author alexandrebraganca
*/
/*
*
 @startuml doc-files/us100_design1.png
 participant "uic : UIExtensionResidence" as UIC
 participant ExtensionResidence as ExtM
 participant "extension : ResidenceMenu" as EExample
 participant "uiExtension : ResidenceAction" as UIExt
 participant "ResidencePanel : JPanel" as cp
 UIC -> ExtM : extensions=getExtensions();
 loop for Extension ext : extensions
 	UIC -> EExample : uiExtension=getMenu(this);
 	activate EExample
 	create UIExt
 	EExample -> UIExt : new(extension, uic)
 	deactivate EExample
 	UIExt -> UIExt : getMenu();
 	activate UIExt
 	create cp
 	UIExt -> cp :  new (uic)  	
 	deactivate UIExt
 	UIC -> UIC : uiExtensions.add(uiExtension);
 end
 @enduml
*
*/

package csheets.userstories.us100;