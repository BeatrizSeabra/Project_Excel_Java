/**
 * Technical documentation regarding the user story 087: Tic Tac Toe.
 * <br/>
 * <br/>
 *
 * <b>Requirement</b><br/>
 * Make Tic Tac Toe between 2 instances of cleansheets.
 * <br/>
 * <br/>
 *
 * <b>S087a: Analysis</b><br/>
 * This funcionality will allow play Tic tac Toe between two instances of cleansheets. For his implementation
 * will be perfomed an analysis to US086 that contains a similar approach since it allows the communication
 * client-server in a game. So it will be needed implementation of Game class' methods and construction of Tic Tac Toe logic.  
 * <br/>
 * <br/>
 *
 * <b>S087d: Design</b><br/>
 * In order to implement this US it will be needed to create class TicTacToe with game logic and TicTacToeUI.
 * This sequence diagram shows how game will be instantiated.
 * <br/><br/>
 * <img src="../../../csheets/userstories/us001/doc-files/us087_design1.png">
 * <br/>
 * <br/>
 *
 * <b>S087c: Coding</b><br/>
 * <br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S087u: Unit Tests</b><br/>
 * see:<br/>
 * <a
 * href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a
 * href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S087f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1run cleansheets;<br/>
 * 2insert on the formula bar the block to be executed;<br/>
 * 3to test insert some instructions splitted by ";" between brackets (ex. "={A1+4;A1+3}").
 * The result of last instruction appears in the cell.<br/>
 * 
 * <br/>
 * <br/>
 * 
* @author alexandrebraganca
 */
/*
 *
 @startuml doc-files/us087_design1.png
    participant "uic : UIController" as UIC
    participant ExtensionManager as ExtM
    participant "extension : NetworkGameController" as netC
    participant "uiExtension : UITicTacToe" as UIt
    UIC -> ExtM : extensions=getExtensions();
    loop for Extension ext : extensions
    UIC -> netC : uiExtension=getUIExtension(this);
    activate netC
    netC -> UIt : new(extension, uic)
    deactivate netC
    end
  @enduml
 *
 */
package csheets.userstories.us087;
