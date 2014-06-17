/**
* Technical documentation regarding the user story 053: Propriedades dos formulários <br/> 
* <br/> 
 * Cada formulario tem um nome e cada componente tem um nome. Deve ser possivel <br/>
 * alterar as propiedades dos componentes (pelo menos cores e dimensões). Deve <br/>
 * ser possível ter vários formulários associados a um workbook. <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Deve haver uma janela para configurar os dados da conta de email <br/>
* e do serviço que será usado para enviar emails. Deve haver um botão para enviar um email de teste. <br/>
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
* <img src="../../../csheets/userstories/us053/doc-files/us053_design1.png"> <br/>
* <img src="../../../csheets/userstories/us053/doc-files/us053_design2.png"> <br/>
* <br/>
* <br/>
* 
* <b>S053c: Coding</b><br/>
* <br/>
* <br/>
* 
* <b>S053u: Unit Tests</b><br/>

* <br/>
* <br/>
* 
* <b>S053f: Functional Tests</b><br/>

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
FormEditorMenu -> FormEditorNewAction : new(UIController);
FormEditorNewAction -> FormLinesWindow : new(UIController);
FormLinesWindow -> FormEditorWindow : new(int nLines, String[] selected);
FormEditorWindow -> FormEditorWindow : newForm();
 @enduml
 
 @startuml doc-files/us53_design2.png
UIController -> ExtensionFormEditor : getUIExtension(this);
ExtensionFormEditor -> UIExtensionFormEditor : new();
FormEditorMenu -> FormEditorEditAction : new(UIController);
FormEditorEditAction -> InMemoryForm : getInstance();
FormEditorEditAction -> FormEditorWindow : new(Form form, ArrayList<JTextField> dataList)
FormEditorWindow -> FormEditorWindow : loadForm();
 @enduml 
*
*/
package csheets.userstories.us053;
