/**
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * US064- Iniciar partilha. Permitir estabelecer uma conexão com uma outra instância do cleansheets
 * e enviar um range de celulas para a outra instância. O conteúdo recebido deve ser apresentado no mesmo
 * “local”. Para isso, em cada instância do cleansheets deve ser possível deﬁnir uma porta para ligações.
 * <br/>
 * <br/>
 *  
 * <b>S064a: Analysis</b><br/>
 * Na UserStory 064 é pedido que seja efectuado uma ligação entre duas instâncias do projecto cleansheets, esta ligação vai partilhar o conteúdo de um dado número de células no mesmo local onde estavam na primeira janela de cleansheets.
 * Vai ser adicionado uma opção no menu "extensions" para fazer parte das opções do utilizador.
 * Na analise do codigo do projecto que nos foi fornecido a classe CellListener no package csheets.core contem um metodo, cellCopied, que deverá ser utilizado para copiar os valores das celulas de uma folha de calculo para a outra.
 * 
 * 
 * <br/>
 * 
 * <b>S064d: Design</b><br/>
 * <br/>
 * 
 * <b>S064c: Coding</b><br/>
 * <br/>
 * 
 * <b>S064u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S064f: Functional Tests</b><br/>
 * <br/>
 * 
 * @author 1110506
 */
/*
 *
  @startuml doc-files/us064_design1.png
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
package csheets.userstories.us064;