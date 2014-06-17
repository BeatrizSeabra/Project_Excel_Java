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
 * With the help of a Filechooser, the user will be able to choose the the direcotory where all the extension's .java files are.
 * We then need to compile those .java files into .class using javac (Java Compiler).
 * With the .class files all in a new dir we just need to call the load method in the ExtensionManager class.
 * <br/>
 * <br/>
 * 
 * <b>S011d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named Load Extension.
 * The follwoing diagram examples the user-UI-system interaction: <img src="../../../csheets/userstories/us011/doc-files/us011_design1.png">
 * <br/>
 * <br/>
 * 
 * <b>S011c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/loadextensions/package-summary.html">csheets.ext.loadextensions</a><br/>
 * <a href="../../../csheets/ext/loadextensions/ui/package-summary.html">csheets.ext.loadextensions.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S011u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S011f: Functional Tests</b><br/>
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
