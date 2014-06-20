/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.userstories.us020;

/**
 * Technical documentation regarding the user story 020: Editar propriedades da
 * Imagem.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Editar propriedades da Imagem. Uma opção para editar as propriedades da imagem: dimensão e posição (relativa à sheet). A imagem deve ser alterada em
 * função dos valores das suas propriedades.
 * <br/>
 * <br/>
 *
 * <b>S020a: Analysis</b><br/>
 * Aceder à extensão criada anteriormente para a inserção de imagem, ExtensionImage. Escolher o local onde vai ser implementada a funcionalidade e, como é uma extensão, <br/>
 * será colocada no Menu Extensions->Image->InsertImage.<br/>
 * Criação de uma nova frame para o utilizador definir as propriedades a alterar.<br/>
 * Inserir uma funcionalidade na extensao criada (editar uma imagem). Verificar a celula seleccionada pelo utilizador. <br/>
 * Funcionalidade tem que verificar se  existe uma imagem na folha de calculo na celula seleccionada e obtida anteriormente.<br/>
 * Criação de uma JDialog para a edição das propriedades da imagem.<br/>
 * Incialmente eram estes os passos a seguir mas como não foi possivel conseguir dessa maneira foi que logo ao inserir uma imagem, o utilizador pode editar ou não uma imagem</br>
 *
 * <br/>
 * <br/>
 * <b>S020d: Design</b><br/>
 * O diagrama referente a este us020 é muito parecido porque faz basicamente o mesmo muda só o local no menu a seleccionar e o metodo que chama. <br/>
 * Para a realização deste user story é necessário aceder à lista de extensóes e, mais especificamente à extensão criada anteriormente no us019, à ExtensionImage. <br/>
 * Será necessário também aceder à subcalsse da UIExtension, UIExtensionImage, e será necessário também criar uma JDialog para a edição das propriedades da imagem. <br/>
 * O diagrama abaixo mostra como as classes são carreagadas e são implementadas nas cleansheets<br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us020_design1.png">
 * <br/>
 *
 *
 * <b>S020c: Coding</b><br/>
 * <br/>
 * see:<br/>
 * <a href="../../../csheets/ext/image/package-summary.html">csheets.ext.image</a><br/>
 * <a href="../../../csheets/ext/image/ui/package-summary.html">csheets.ext.image.ui</a><br/>
 * <br/>
 *
 * <b>S020u: Unit Tests</b><br/>
 * Neste caso de uso (US020) não foi possível realizar muitos teste unitários devido ao facto de os metodos a serem testados (que estão dentro de uma classe JDialog) não terem return.<br/>
 * Devido à falta de return é dificil de esperar um resultado para casos de testes.<br/>
 * Foi apenas possivel uma tentativa na classe InsertImageController com o método OpenImage
 * <br/>
 *
 * <b>S020f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1- Selecionar a celula onde ira aparecer a imagem<br/>
 * 2 -run cleansheets;<br/>
 * 3- clicar no Extension menu, depois em Image.De seguida aoparece um submenu para inserir imagem.<br/>
 * 4- Ao clicar ira aparecer um JFileChooser para selecionar a imagem.<br/>
 * 5- A imagem aparecerá na folha no lugar indicado <br/>
 * 6- Ao expanidr a JFrame onde está a imagem aparece um JButton que permite a edição da imagem ou não<br/>
 * 7- Ao clicar no botão Editar irá aparecer uma JFrame com 3 botões("height","width","position") para as alterações das imagens<br/>
 * e um botao "Confirm" para confirmar as alterações<br/>
 * 8- Ao clicar no botao "Height" e aparece um showInputDialog para introduzir um valor para a altura
 * 9- Ao clicar no botao "Width" e aparece um showInputDialog para introduzir um valor para a largura
 * 10- Ao clicar no botao "Position" e aparece um showInputDialog para introduzir um valor para a posicao
 * 11-Clicar no botao Confirm e aparece a imagem com as mudanças feitas
 *
 * @author Tiago 1090673
 *
 *
 * 
 *
 @startuml doc-files/us020_design1.png
    "uic:UIController" -> ExtensionManager : extensions = getExtensions()
    "uic:UIController" -> "extension:ExtensionImage" : uiExtension=getUIExtension(this)
    "extension:ExtensionImage" -> "uiExtension:UIExtensionImage" : new UIExtensionImage(extension,uic)
    "uiExtension:UIExtensionImage" -> "menu:ImageMenu" : getMenu()
    "menu:ImageMenu" -> "action:InsertImageAction" : new InsertImageAction(uic)
    "action:InsertImageAction" -> "action:InsertImageAction": openImage()
    "action:InsertImageAction" -> "action:InsertImageAction": showImage()
    "action:InsertImageAction" -> "JDialog: InsertImage" : new InsertImage();
    "JDialog: InsertImage" -> "TrataEvento" : new TrataEvento();
    "TrataEvento" -> "TrataEvento": actionPerformed();
 @enduml
 * 
 */
