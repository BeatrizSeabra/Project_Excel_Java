/**
* Technical documentation regarding the user story 016: Configuração de email <br/> 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve haver uma janela para configurar os dados da conta de email <br/>
* e do serviço que será usado para enviar emails. Deve haver um botão para enviar um email de teste. <br/>
* <br/>
* <br/>
*  
* <b>S016a: Analysis</b><br/>
* Escolher o local onde vai ser implementada a funcionalidade. Como é uma extensão, será colocada no Menu Extensions. <br/>
* Analise do protocolo SMTP (Simple Mail Transfer Protocol) que  é o protocolo padrão para envio de e-mails através da Internet e actua na camada de <br/>
* aplicação. <br/>
* A porta de padrão é a 25.<br/>
* <br/>
* Criação de um objecto javax.mail.Session.
* Criação de um objecto javax.mail.internet.MimeMessage, Tenho de definir diferentes propriedades neste objecto como o email receptor email, <br/>
* o tema do email e o conteudo do email.<br/>
* Usar javax.mail.Transport para enviar o email. <br/>
* <br/>
* <br/>
* 
* <b>S016d: Design</b><br/>
* <br/>
* <br/>
* 
* <b>S016c: Coding</b><br/>
* <br/>
* <br/>
* 
* <b>S016u: Unit Tests</b><br/>
 * Neste caso de uso (US016) não foi possível realizar teste unitários devido ao facto de os metodos a serem testados (que estão dentro de uma classe JForm) não terem return.<br/>
 * Devido à falta de return é dificil de esperar um resultado para casos de testes.<br/>
 * Por exemplo:<br/>
 * Como o metodo run não possui um return logo é dificil de ter um resultado esperado para confirmar o caso de teste.<br/>
 * <br/>
* <br/>
* <br/>
* 
* <b>S016f: Functional Tests</b><br/>
 Para ter acesso a esta funcionalidade deve ir ao menu Extensions -> Email -> Send Email. <br/>
* Convem em primeiro lugar ver se as configuracoes estao correctas(mas sendo esta parte relativa à US016). <br/>
* Ao seleccionar a opcao no Menu irá aparecer uma janela onde poderá escrever os destinatarios, assunto, mensagem e ainda inserir um ficheiro como anexo. <br/>
* Poderá enviar o mesmo email para varios destinatarios tendo de separar os emails por ";" na jTextField referente aos destinatarios <br/>
* Ao premir o botão "Attach File" abre um file chooser para escolher qual é o ficheiro que deseja anexar ao email. <br/>
* <br/>
* <br/>
* <br/>
* <br/>
* 
* @author Rui 1110506
*/
/*
*
 @startuml doc-files/us016_design1.png
UIController -> EmailExtension : getUIExtension(this);
EmailExtension -> UIExtensionEmail : new();
UIExtensionEmail -> EmailMenu : getMenu();
EmailMenu -> EmailAction : new EmailAction();
EmailAction -> EmailSetup : new();
EmailSetup -> EmailAccount : new EmailAccount();
EmailAccount -> EmailSetup : EmailAccount data;
EmailSetup -> EmailSetup : send();
 @enduml
*
*/
package csheets.userstories.us016;
