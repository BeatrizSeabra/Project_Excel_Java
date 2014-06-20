/**
* Technical documentation regarding the user story 053: Propriedades dos formulários <br/> 
* <br/> 
* <br/>
* 
* <b>Requirement</b><br/>
 * Cada formulario tem um nome e cada componente tem um nome. Deve ser possivel <br/>
 * alterar as propiedades dos componentes (pelo menos cores e dimensões). Deve <br/>
 * ser possível ter vários formulários associados a um workbook. <br/>
* <br/>
* <br/>
*  
* <b>S053a: Analysis</b><br/>
*  Analisar o codigo desenvolvido pelo colega no US052. <br/>
*  Analisar as propriedades dos componentes.<br/>
*  Analisar como associar varios formulários a um workbook. <br/>
* <br/>
* <br/>
* 
* <b>S053d: Design</b><br/>
* <br/>
* <br/>
* 
* <b>S053c: Coding</b><br/>
* <br/>
* <br/>
* 
* <b>S053u: Unit Tests</b><br/>
 * Neste caso de uso (US053) não foi possível realizar teste unitários devido ao facto de os metodos a serem testados (que estão dentro de uma classe JForm) não terem return.<br/>
 * Devido à falta de return é dificil de esperar um resultado para casos de testes.<br/>
 * Por exemplo:<br/>
 * Como o metodo run não possui um return logo é dificil de ter um resultado esperado para confirmar o caso de teste.<br/>
* <br/>
* <br/>
* 
* <b>S053f: Functional Tests</b><br/>
* Criar Formulario: <br/>
* Ir ao Menu Forms -> New Forms. Escolher o numero de linhas do formulario e em cima como são constituidas. <br/>
* No fim disso, atribuir um nome ao formulario <br/>
* Irá aparecer o formulario para o preencher todos os campos. <br/>
* <br/>
*Editar: <br/>
* Depois de criar, existe a funcionalidade de editar. <br/>
* Ir ao Menu Form - > Edit Forms, de seguida aparece uma combobox com os nomes de todos os formularios e tem de escolher um e depois carregar no botao "Actualize Lines" e escolher uma linha a editar.<br/>
* Irá aparecer uma janela onde vai escolher o tamanho e cores dos dois componentes da linha. <br/>
* Play: <br/>
* Ir ao Menu Form - > Play Forms e escolher na combobox o formulario a apresentar.<br/>
* Pode ser já editado ou por editar <br/>
* <br/>
* <br/>
* <br/>
* <br/>
* 
* @author Rui 1110506
*/
/*
*
 @startuml doc-files/us053_design1.png
	UIController -> ExtensionFormEditor : getUIExtension(this);
ExtensionFormEditor -> UIExtensionFormEditor : new();
UIExtensionFormEditor -> FormEditorMenu :  new()
FormEditorMenu -> FormEditorEditAction : new(UIController);
FormEditorEditAction -> inMemoryForm : getInstance();
FormEditorEditAction -> FormEditorWindow : new(Form form,ArrayList<TextField> dataList);
FormEditorWindow -> FormEditorWindow : loadForm();
 @enduml
 
 @startuml doc-files/us053_design2.png
	UIController -> ExtensionFormEditor : getUIExtension(this);
ExtensionFormEditor -> UIExtensionFormEditor : new();
UIExtensionFormEditor -> FormEditorMenu :  new()
FormEditorMenu -> FormEditorPlayAction : new(UIController);
FormEditorPlayAction -> inMemoryForm : getInstance();
FormEditorPlayAction -> FormPlayWindow : new(Form form,ArrayList<TextField> dataList);
FormEditorWindow -> FormEditorWindow : loadForm();
 @enduml
 
*
*/
package csheets.userstories.us053;
