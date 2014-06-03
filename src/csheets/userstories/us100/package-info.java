/**
* Technical documentation regarding the user story 001: setup commentable cells. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Edição de Moradas.
* <br/>
* <br/>
*  
* <b>S001a: Analysis</b><br/>
* Definição do conteúdo de cada morada, por exemplo: Rua, Localidade, Código Postal, Cidade, País e tipo: a principal e a secundária.</br></br>
* Definição do layout para apresentação, remoção e actualização das moradas.
* <br/>
* <br/>
* 
* <b>S001d: Design</b><br/>
* Escolha dos recursos a utilizar para guardar as moradas.<br/><br/>
* Criação dos diagramas que melhor representem a solução para o problema.<br/><br/>
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
 @startuml doc-files/us001_design1.png
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

package csheets.userstories.us100;