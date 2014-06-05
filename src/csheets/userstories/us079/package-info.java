/**
 * Documentacao tecnica para a user story 079: Enviar mensagem. 
 * <br/>
 * <br/>
 * 
 * <b>Requisitos</b><br/>
 * Fazer uma extensao que permite enviar uma mensagem para outra instancia do cleansheets (para a qual conhecemos o endereço) e essa mensagem aparece numa janela na outra instancia.
 * <br/>
 * <br/>
 *  
 * <b>S079a: Analysis</b><br/>
 * Analisar como se inserem extensoes no cleansheets. <br/>
 * Como se implementa o processamento em paralelo em linguagem Java. <br/>
 * Qual a melhor forma de conectar as duas instâncias do cleansheet. <br/>
 * Quando a extensão esta activada, a instancia tem que estar a espera de mensagens. <br/>
 * Separar as mensagens das diferentes instâncias em várias janelas, ou tudo na mesma janela?* <br/>
 * <br/>
 * 
 * <b>S079d: Design</b><br/>
 * Para realizar esta user story temos de criar uma subclasse de Extension(ChatExtension),  UIExtension(UIExtensionChat).<br/>
 * Alem destas temos que criar a classe Receiver, sender, e UIChat<br/>
 * Os seguintes diagramas mostram como irá ser integrada esta extensao.
 * <br/>
 * Activar a Extensao:
 * <img src="../../../csheets/userstories/us079/doc-files/us079_getExtension.png"> <br/>
 * Receber mensagem:
 * <img src="../../../csheets/userstories/us079/doc-files/us079_design_receiver.png"> <br/>
 * Enviar mensagem
 * <img src="../../../csheets/userstories/us079/doc-files/us079_design_sender.png"> <br/>
 * <br/>
 * <br/>
 * 
 * <b>S079c: Coding</b><br/>
 * Foram criadas duas extensões ChatExtension  e UIExtensionChat.<br/>
 * Alem das extensões foi criado um controller, chatcontroller, e duas JFrames ( Chat e UIChat ).<br/>
 * ChatAction e ChatMenu para integrar a extensão na aplicacao.<br/>
 * Classe Server criada em conjunto com 2 colegas.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S079u: Unit Tests</b><br/>
 * Foram realizados testes ao envio de mensagens, sendo que nao foram realizados com JUnit.<br/>
 * Foram realizados testes unitarios a classe ChatController<br/>
 * <br/>
 * 
 * <b>S079f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author Fábio Carvalho 1121228
 */


/**
 @startuml doc-files/us079_getExtension.png
 participant "uic : UIController" as UIC
 participant ExtensionManager as ExtM
 participant "extension : ChatExtension" as EExample
 UIC -> ExtM : extensions=getExtensions();
 loop for Extension ext : extensions
        UIC -> EExample : uiExtension=getUIExtension(this);
 	activate EExample
 	deactivate EExample
 end

 @enduml
 * 
@startuml doc-files/us079_design_receiver.png
participant "extension : ChatExtension" as EExample
participant "uiExtension : UIExtensionChat" as UIExt
participant "receiver : Receiver" as rcv
participant "chat : UIChat" as ch
activate EExample
create UIExt
EExample -> UIExt : new(extension, uic)
deactivate EExample
activate UIExt
create rcv
UIExt -> rcv : new ()
UIExt -> rcv : start()
rcv -> UIExt: messageReceived(message, sender)	
create ch
UIExt -> ch : new (message, target)
deactivate UIExt
@enduml
* 
* 
 * @startuml doc-files/us079_design_sender.png
 participant "extension : ChatExtension" as EExample
 participant "uiExtension : UIExtensionChat" as UIExt
 participant "chat : UIChat" as ch
 participant "sender : Sender" as snd
 	activate EExample
 	create UIExt
 	EExample -> UIExt : new(extension, uic)
 	deactivate EExample
 	activate UIExt
 	create ch
        UIExt -> ch: new(target)
        create snd
        ch -> snd: new(target)
 	deactivate UIExt

@enduml
 * 
 * 
*/
package csheets.userstories.us079;
