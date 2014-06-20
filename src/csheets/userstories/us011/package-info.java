/**
 * Technical documentation regarding the user story 011: Dynamic Extension Loading. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Allow to select the directory where an extension is and load it.
 * <br/>
 * <br/>
 *  
 * <b>S011a: Analysis</b><br/>
 * With the help of a Filechooser, the user will be able to choose the Extension .class file.
 * After the load we just need to add the Extension's menu into the extensions Menu.
 * <br/>
 * <br/>
 * 
 * <b>S011d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named Load Extension.
 * The follwoing diagram examples the user-UI-system interaction:<img src="../../../csheets/userstories/us011/doc-files/us011_design1.png">.
 * We then just need to build the classname (csheets.ext...) and transform the .class file path into an URL.
 * With all the variables made before we then load the class.
 * <br/>
 * <br/>
 * 
 * <b>S011c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ui/package-summary.html">csheets.ui</a><br/>
 * <a href="../../../csheets/ext/loadextensions/ui/package-summary.html">csheets.ext.loadextensions.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S011u: Unit Tests</b><br/>
 * Since this US if for loading class, I saw no need for unit tests, to test this US see Functional Tests below.
 * <br/>
 * <br/>
 * 
 * <b>S011f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1- run cleansheets;<br/>
 * 2- click on the Extension menu, go to ExtensionManager. There must appear a menu option containning one option named Load Extensions;<br/>
 * 3- select the .class file of the extensions wanted to be loaded.<br/>
 * 4- the new extension's menu will appear at the end of the extensions menu.<br/>
 * <br/>
 * <br/>
 * @author RafaelChaves
 **/
/*
@startuml doc-files/us011_design1.png
    participant LoadExtensionAction as LEA
    participant LoadExtensionMenu as LEM
    participant JFileChoose as jf
    participant ClassLoader as cl
    participant ExtensionManager as load
    activate LEA
    create LEM
    LEA -> LEM : create()
    create jf
    LEA -> jf: create()
    jf -> cl: compile()
    loop
    cl ->load: load()
    end
    LEM->LEA: sucess
   deactivate LEA
  @enduml  
*/
package csheets.userstories.us011;
