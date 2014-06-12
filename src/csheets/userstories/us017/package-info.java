/**
* Technical documentation regarding the user story 017: Enviar Email<br/> 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Acrescentar uma janela que permite enviar um email. Deve ser possível <br/>
* indicar os destinatários do email, o assunto e a mensagem. Deve ser possível anexar um ﬁcheiro. <br/>
* <br/>
* <br/>
*  
* <b>S016a: Analysis</b><br/>
* Escolher o local onde vai ser implementada a funcionalidade. Como e uma extensão, será colocada no Menu Extensions->Email. <br/>
* Vou ter de fazer uma nova UI para o utilizador escrever os destinatários para onde quero enviar o email, o assunto e a mensagem. Pode ou não anexar-se <br/>
* um ficheiro <br/>
* dividir os emails da jtextfield por ";" e depois coloca-los num arraylist para depois fazer um ciclo for que em cada iteracao enviar o mesmo email para um email diferente. <br/>
* <br/>
* 
* <b>S016d: Design</b><br/>
* <br/>
* O Diagrama de sequencia é muito parecido com o do us016 porque faz basicamente o mesmo muda só o local no menu a seleccionar e o metodo que chama. <br/>
* <br/>
* 
* <b>S016c: Coding</b><br/>
* <br/>
* <br/>
* 
* <b>S016u: Unit Tests</b><br/>
 * <br/>
* <br/>
* <br/>
* 
* <b>S016f: Functional Tests</b><br/>
* <br/>
* <br/>
* 
* @author Rui 1110506
*/
/*
*
 @startuml doc-files/us017_design1.png
UIController -> EmailExtension : getUIExtension(this);
EmailExtension -> UIExtensionEmail : new();
UIExtensionEmail -> EmailMenu : getMenu();
EmailMenu -> SendAction : new EmailAction();
SendAction -> EmailSetup : new();
EmailSetup -> EmailAccount : new EmailAccount();
EmailAccount -> EmailSetup : EmailAccount data;
EmailSetup -> EmailSetup : sendEmail();
 @enduml
*
*/
package csheets.userstories.us017;
