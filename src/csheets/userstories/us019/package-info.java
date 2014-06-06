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
 * <b>S019a: Analysis</b><br/>
 * Inserir uma nova extenção.
 * Inserir uma funcionalidade na extenção criada (inserir umagem).
 * Obter a celula selecionada pelo utilizador.
 * Funcionalidade tem que inserir uma imagem na folha de calculo na celula selecionada e obtida anteriormente.
 * Funcionalidade tem que perguntar ao utilizador qual imagem a ser inserida (FileChooser)
 * 
 * <br/>
 * <br/>
 * <b>S019d: Design</b><br/>
 * Para a realização deste user story precisa-se de criar uma subclasse da class Extension (ImageExtension). 
 * Também será necessário a criação de uma subclass da class UIExtension(ImageUIExtension). 
 * Também será necessário a criação de uma subclass da class UIExtension(ImageUIExtension). 
 * Por fim uma class que implemente o metodo de inserção da imagem (InserImage) : 
 * Para demonstrar a iteração do user com a UI: <img src="../../../csheets/userstories/us019/doc-files/us019_design1.png">. Every event will be added to the EventList by default.

 * <b>S019c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/image/package-summary.html">csheets.ext.image</a><br/>
 * <a href="../../../csheets/ext/image/ui/package-summary.html">csheets.ext.image.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S019u: Unit Tests</b><br/>
 * Não há testes implementados.
 * <br/>
 * <br/>
 * 
 * <b>S019f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:
 * 1- Selecionar a celula onde ira aparecer a imagem
 * 2 -run cleansheets;
 * 3- clicar no Extension menu, depois em Image.De seguida aoparece um submenu para inserir imagem.<br/>
 * 4- Ao clicar ira aparecer um JFileChooser para selecionar a imagem.<br/>
 * 5- A imagem aparecerá na folha no lugar indicado <br/>
 * <br/>
 * <br/>
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