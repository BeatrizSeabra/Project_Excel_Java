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
 * Editar propriedades da Imagem. Uma opção para editar as propriedades da
 * imagem: dimensão e posição (relativa à sheet). A imagem deve ser alterada em
 * função dos valores das suas propriedades.
 * <br/>
 * <br/>
 *
 * <b>S020a: Analysis</b><br/>
 * Aceder à extensão criada anteriormente para a inserção de imagem, ExtensionImage. Escolher o local onde vai ser implementada a funcionalidade e, como é uma extensão, <br/>
 * será colocada no Menu Extensions->Image->EditImage.<br/>
 * Criação de uma nova UI para o utilizador definir as propriedades a alterar.<br/>
 * Inserir uma funcionalidade na extensao criada (editar uma imagem). Verificar a celula seleccionada pelo utilizador. <br/>
 * Funcionalidade tem que verificar se  * existe uma imagem na folha de calculo na celula seleccionada e obtida anteriormente.<br/>
 * Criação de uma JDialog para a edição das propriedades da imagem.<br/>
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
 * <br/>
 *
 * <b>S020u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 *
 * <b>S020f: Functional Tests</b><br/>
 *
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
    "menu:ImageMenu" -> "action:EditImageAction" : new EditImageAction(uic)
    "action:EditImageAction" -> "action:EditImageAction" : verifyImage();
    "action:EditImageAction" -> "JDialogEditImage" : show();
    "JDialogEditImage" -> "JDialogEditImage" : defineProperties();
 @enduml
 * 
 */
