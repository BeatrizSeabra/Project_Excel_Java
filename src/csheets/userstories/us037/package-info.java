/**
 * Documentação tecnica da user story 037 : Operador de atribuição. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *Acrescentar o operator ":=" para atribuicao. Este operador deve atribuir a
 * esquerda o resultado da expressao a 
 * direita do operador. Para ja a esquerda deve se possivel colocar o nome de uma celula.
 * <br/>
 * <br/>
 *  
 * <b>S001a: Analysis</b><br/>
 * Vai ser criada uma nova formula,
 * verifica la na celulua
 * colocar um novo token :=
 * Fazer a funçao para atribuiçao e colocar na celula certa
 *  
 * <br/>
 * <br/>
 * 
 * <b>S001d: Design</b><br/>
 * To realize this user story we will need to create a subclass of Extension. We will also need to create a subclass of UIExtension. For the sidebar we need to implement a JPanel.<br/>
 * The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us001_design1.png"> 
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
 * 1- run cleansheets;<br/>
 * 2- click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
 * 3- the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
 * 4- the sidebar window should have only one editbox. <br/>
 * <br/>
 * <br/>
 * 
 * @author JSilva314 - 1040314 - João Paulo Silva
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
package csheets.userstories.us037;