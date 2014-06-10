/**
 * Technical documentation regarding the user story 085: Jogos Simples em Rede 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Jogo do Enforcado. Utilizar a extensão criada no US085 para conectar duas instancias do cleansheets para jogarem o jogo do enforcado.
 * <br/>
 * <br/>
 *  
 * <b>S086a: Analysis</b><br/>
 * Utilizando o exemplo fornecido posso constatatar que terei que fazer algumas modificações no que foi desenvolvido,
 * nomeadamente expandir a forma como os jogos possoveis estão a ser carregados, talvez usar um metodo semelhante ao que carrega as extensões?.
 * Depois disso basta exteder a class Game e rescrever os metodos abstractos
 * 
 * O jogo do enforcado consiste numa palavra que vai gerar uma palavra. 
 * 
 * <b>S086d: Design</b><br/>
 * 
 * 
 * <br/>
 * <br/>
 * 
 * 
 * @author 1120588
 */

/*
*
 @startuml doc-files/us085_design1.png
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

package csheets.userstories.us086;