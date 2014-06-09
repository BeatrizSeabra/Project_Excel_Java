/**
* Technical documentation regarding the user story 052: Forms editor. 
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve existir uma janela que permita “descrever” um formulário. Os
formulários são janelas que permitem a introdução de dados. Os formulários devem ser simples. Devem ser
constituidos por linhas. Em cada linha deve ser possível deﬁnir 2 compoenentes visuais. Os componentes
visuais suportados são: botao, edit box e text box. Na janela de edição de formulário deve haver um botão
“play” para testar o formulário. Para já apenas é necessário suportar um formulário.
* <br/>
* <br/>
*  
* <b>S052a: Analysis</b><br/>
* US052 consiste em criar uma extensão, que consiste numa janela, cuja tem como principal objectivo criar formulários.
* Isto é, nesta fase inicial, só será possível a existência de um único formulário carregado na memória, isto siginifica que ao criar um novo formulário, esse virá substituir o existente (caso exista), também será possível editar um formulário existente.
* As opções de 'Editar' ou 'Criar novo' são exibidas numa janela a parte, caso seja escolhida a opção 'Criar novo', será necessário o utilizador inserir o número de linhas do formulário.
* O formulário é constituido por linhas, em que cada linha só pode possuir dois componentes visuais que são editáveis, dos três referidos no Requerimento(botão, edit box e text box).
* Existe também um botão 'play' que tem como principal objectivo visualizar o esquema de formulário que o utilizador criou.
* 
* <br/>
* <br/>
* 
* <b>S052d: Design</b><br/>
* 
* <br/>
* <br/>
* 
* <b>S052c: Coding</b><br/>
* 
* 
* <b>S052u: Unit Tests</b><br/>
*
* 
* <br/>
* <br/>
* 
* <b>S052f: Functional Tests</b><br/>
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
