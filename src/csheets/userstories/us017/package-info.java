/**
* Technical documentation regarding the user story 017: Enviar Email<br/> 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Acrescentar uma janela que permite enviar um email. Deve ser possível <br/>
* indicar os destinatários do email, o assunto e a mensagem. Deve ser possivel anexar um ficheiro. <br/>
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
* Neste caso de uso (US017) não foi possível realizar teste unitários devido ao facto de os metodos a serem testados (que estão dentro de uma classe JForm) não terem return.<br/>
* Devido à falta de return é dificil de esperar um resultado para casos de testes.<br/>
* Por exemplo:<br/>
* Como o metodo run não possui um return logo é dificil de ter um resultado esperado para confirmar o caso de teste.<br/>
*Os metodos no package csheets.ext.email serem metodos void <br/>
* <br/>
* <br/>
* 
* <b>S016f: Functional Tests</b><br/>
** Abrir uma instancia do cleansheet e ir ao menu extensions e escolher o Menu - > Email Configuration. <br/>
* Preencher com os dados do email (email e password) o host e a porta. <br/>
* Se escolher o botao save ele grava os dados num ficheiro e carrega-o automaticamente nas proximas vezes.<br/>
* Tambem pode escolher o botao test que envia um email para o seu email como teste.
* host que utilizei : smtp.gmail.com <br/>
* port: 857 <br/>
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
