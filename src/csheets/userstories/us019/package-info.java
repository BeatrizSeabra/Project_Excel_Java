/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.userstories.us019;
/**
echnical documentation regarding the user story 001: setup commentable cells. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Uma oppção para inserir uma imagem na folha de cáculo. A imagem deve ficar a "flutuar" no local onde estava o cursor no momento da inserção
 * <br/>
 * <br/>
 *  
 * <b>S001a: Analysis</b><br/>
 * Inserir uma nova extenção.
 * Inserir uma funcionalidade na extenção criada (inserir umagem).
 * Obter a celula selecionada pelo utilizador.
 * Funcionalidade tem que inserir uma imagem na folha de calculo na celula selecionada e obtida anteriormente.
 * Funcionalidade tem que perguntar ao utilizador qual imagem a ser inserida (FileChooser)
 * 
 * <br/>
 * <br/>
 * <b>S001d: Design</b><br/>
 * Para a realização deste user story precisa-se de criar uma subclasse da class Extension (PictureExtension). 
 * Também será necessário a criação de uma subclass da class UIExtension(PictureUIExtension). 
 * Ainda sera necessário a criação de uma subclass da class JMenu para a definição do Menu (PictureMenu).
 * Por fim uma class que implemente o metodo de inserção da imagem (InserPicture) : 
 * 
 * 
 * 
 * 
 * 
 *
 * <br/>
 * The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us001_design1.png"> 
 * <br/>
 * <br/>
 * 
 * 
 * 
 * 
 * 
 * 
 @startuml doc-files/us019_design1.png
 actor User 
 participant InsertImageAction as EA
 participant JFileChooser as JChooser
 participant "this.uiController : UIController" as UIC
 participant "temp1 : Spreadsheet" as ss
 participant "temp2 : Cell" as cell

 User -> EA : actionPerformed(ActionEvent event)
 EA -> JChooser : chooser= new JFileChooser()
 EA -> FileNameExtensionFilter : filter= new FileNameExtensionFilter("JPG", "jpg")
 EA -> JChooser : setFileFilter(filter)
 EA -> JChooser : getSelectedFile().getName()
 EA -> EA : image = getImage()
 EA -> UIC : temp1 = getActiveSpreadsheet();
 EA -> ss : temp2 = getCell(0, 0)
 EA -> cell : setContent(image);
 

@enduml
 * */