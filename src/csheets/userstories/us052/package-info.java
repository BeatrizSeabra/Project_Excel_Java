/**
* Technical documentation regarding the user story 052: Forms editor. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve existir uma janela que permita "descrever" um formulario. Os
formularios sao janelas que permitem a introducao de dados. Os formularios devem ser simples. Devem ser
constituidos por linhas. Em cada linha deve ser possivel definir 2 componentes visuais. Os componentes
visuais suportados sao: botao, edit box e text box. Na janela de edicao de formulario deve haver um botao
"play" para testar o formulario. Para ja apenas e necessario suportar um formulario.
* <br/>
* <br/>
*  
* <b>S052a: Analysis</b><br/>
* US052 consiste em criar uma extensao, que consiste numa janela, cuja tem como principal objectivo criar formularios.
* Isto e, nesta fase inicial, sa sera possível a existência de um único formulario carregado na memaria, isto siginifica que ao criar um novo formulario, esse vira substituir o existente (caso exista), tambem sera possível editar um formulario existente.
* As opcões de 'Editar' ou 'Criar novo' sao exibidas numa janela a parte, caso seja escolhida a opcao 'Criar novo', sera necessario o utilizador inserir o número de linhas do formulario.
* O formulario e constituido por linhas, em que cada linha sa pode possuir dois componentes visuais que sao editaveis, dos tres referidos no Requerimento(botao, edit box e text box).
* Existe também um botao 'play' que tem como principal objectivo visualizar o esquema de formulario que o utilizador criou.
* 
* <br/>
* <br/>
* 
* <b>S052d: Design</b><br/>
* Para realizar este User Story sera necessario criar elementos de Interface Grafica, subclasse da UIExtension.
* Classe da Extensao FormEdit subclasse da Extension. E ainda uma classe que contenha informação de um Formulário.
* Serao necessarias varias janelas de interface com o utilizador.
* As classes serao implementadas de forma que a instancia de um formulario criado/editado fiquei gravada na memória, InMemoryForm.
* <img src="../../../csheets/userstories/us052/doc-files/us052_design1.png"> 
* <br/>
* <br/>
* 
* <b>S052c: Coding</b><br/>
* Ver:<br/>
* <a href="../../../csheets/ext/formeditor/package-summary.html">csheets.ext.formeditor</a><br/>
* <a href="../../../csheets/formeditor/ui/package-summary.html">csheets.ext.formeditor.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S052u: Unit Tests</b><br/>
* Ver:<br/>
* <a href="../../../csheets/ext/formeditor/package-summary.html">csheets.ext.formeditor</a><br/>
* <br/>
* <br/>
*
* 
* <b>S052f: Functional Tests</b><br/>
* Para testar este US, é necessário correr a aplicação CleanSheets, abrir o menu "Extensions".
* De seguida seleccionar a opção "Form Editor".
* (aqui há duas possíveis escolhas:)
* 
* *** 1 - CRIAR UM NOVO FORMULARIO***
* Seleccionar a opção "New Form".
* Na janela que será disponibilizada é necessário introduzir o número de linhas que é pretendido o formulário ter e carregar no botão "Apply".
* Consoante o número de linhas seleccionadas serão disponibilizadas janelas onde é pedido escolher o tipo de cada linha através de uma "Combo Box", carregar no botão "OK".
* Realizar o procedimento descrito na linha anterior até seleccionar as linhas todas.
* Será disponibilizada uma janela onde está o formulário com o número e tipo de linhas seleccionado. Deve se introduzir todos as informações pedidas, tais como, nome do botão,
* texto na edit box e na text box. Carregando no botão "Play" o programa irá validar o formulário criado e gravar o mesmo em memória.
* 
* *** 2 - EDITAR UM FORMULARIO PREVIAMENTE CRIADO EXISTENTE EM MEMORIA***
* Caso quer aceder a um formulário já previamente criado deve seleccionar a opção "Edit".
* É disponibilizada uma janela com o formulário já preenchido anteriormente.
* Para editar o nome dos botões, edit box e text box deve proceder à mesmos passos descritos em cima.
* O botão "Play" irá validar os campos que editou e gravar o novo formulário em memória, substituido desta forma o anterior existente.
* 
* <br/>
* <br/>
* 
*
*/
/*
*
* @startuml doc-files/us052_design1.png
 actor User
 participant UIController as UIC
 participant UIExtensionFormEditor as UIE
 User -> UIC : Initialize process
 Create UIE 
 UIC -> UIE : create()
 loop while stop
    User -> UIC : select option 
    UIC -> UIE : addOption();
 end  
@enduml
*/
package csheets.userstories.us052;
