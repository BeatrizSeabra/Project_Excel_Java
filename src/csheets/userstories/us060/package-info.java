/**
 * Technical documentation regarding the user story 060: US060 - Extend menus with macros.
 * <br/>
 * <br/>
 * 
 * <b>Requisitos</b><br/>
 * This use case consist in show to the user of the application, a window that allows<br/>
 * he to assign an execution of a macro to a menu option indicates whether you want<br/>
 * the macro to run before (Before Menu Action), after (After Menu Action) or<br/> 
 * instead (Around Menu Action) of the menu item in question.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S060a: Analysis</b><br/>
 * The user storie US060 continues the work of users stories US059 and US058, for<br/> 
 * that was first necessary to make an analysis of what had already been done in the<br/> 
 * previous two iterations, in order to understand the follow-up to this user storie<br/>
 * and see if any functionality needed to be complete before processer with the new<br/>
 * user storie US060. After a review concluded that both were operating, was only<br/> 
 * dependent on the realization of user storie US044 - "Janela de edição de Macros.",<br/>
 * since this is what allows you to edit and create a macro, and next associate<br/> 
 * with a menu option of the cleansheets, for when execute the option chosen this<br/> 
 * can be performed in the cleansheets. To make the association between the<br/>
 * implementation of macro and an option from the menu cleansheets, you need to<br/> 
 * analyze the whole process of the actions of the menu item as well as get a<br/> 
 * macro and therefore can run it.
 * <br/>
 * <br/>
 * 
 * <b>S060d: Design</b><br/>
 * Firstly analyzed the diagrams used in the user stories US059 and US058,<br/>
 * to understand the process used to analyze these features, which depend on the<br/> 
 * implementation of user storie US060. After analysis it was concluded that in<br/> 
 * order to run a macro, would need to be implemented the user storie US044, to<br/> 
 * allow the user to run an macro on the menu item of cleansheets application.<br/>
 * After two days of intensive analysis and design of a solution to the requirement<br/> 
 * of membership options and attempts to actions menu, so that it was possible to<br/> 
 * control the actions of the menu dynamically, so as not to escape of the best<br/> 
 * practicals of the object-oriented programming. Unable to find an analysis of<br/> 
 * design for the desired requirement on instead of running the macro associated<br/> 
 * with a menu item already created the cleansheets, was then associated with a<br/> 
 * new menu item being created on the menu that performs the operation of the<br/> 
 * choice of the macro to be executed on the cleansheets application. The following<br/> 
 * sequence diagram shows the flow of the implementation of this user storie.<br/>
 * <img src="../../../csheets/userstories/us101/doc-files/us060_design1_sequence_diagram.png">
 * <br/>
 * <br/>
 * 
 * <b>S060c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
 * <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
 * see packages:<br/>
 * csheets.ext.macrotomenuitem<br/>
 * csheets.ext.macrotomenuitem.ui<br/>
 * <br/>
 * <br/>
 * 
 * <b>S060u: Unit Tests</b><br/>
 * In the user storie US060, it's no possible to do the unit tests, because<br/>
 * have a class that just instance an object to assign the macro to the menu item,<br/>
 * and classes with graphical interface that interact with the actions associated<br/> 
 * with the GUI objects do not have values ​​for the expected test results, for that<br/>
 * it's not possible to perform the unit tests for this functionality.<br/>
 * <br/>
 * 
 * <b>S0610: Functional Tests</b><br/>
 * To test the extend menus with macros functionality, the user should follow these steps:<br/>
 * 1run cleansheets;<br/>
 * 2create macros on the menu Extensions and selection the submenu Macro and select option Edit Macro;<br/>
 * 3after this create the macros that you want to defined;<br/>
 * 4after create the macros go to the menu Extensions and select the submenu Macro To MenuItem and select option Macro To MenuItem...;<br/>
 * 5will appear an window to selection the macro, the menu item and extension, that you want to associate the running of the macro on the menu item of cleansheets;<br/>
 * 6after this click on button OK, to submit the macro association to the menu;<br/>
 * 7because it was not possible to associate the macros to the existing cleansheets menu options, I create new options on submenu Macro To MenuItem of the menu Extensions, to allow the user to run the specified macros;<br/>
 * 8to test the running of the macro on the menu item, you must select menu Extensions and selection the submenu Macro To MenuItem and appear the menu associated to the macros defined;<br/>
 * 9the option menu appear with the words Macro Run: name of the macro associated;<br/>
 * 10after select this menu item, the macro will run and show the result of the macro on cleansheets workspace.<br/>
 * <br/>
 * <br/>
 * 
 * @author 1090675 - Tiago Pereira
 */
/*
 *
    @startuml doc-files/us060_design1_sequence_diagram.png
        hide footbox
        skinparam backgroundColor #EEEBDC

        skinparam sequence {
                ArrowColor DeepSkyBlue
                ActorBorderColor DeepSkyBlue
                LifeLineBorderColor blue
                LifeLineBackgroundColor #A9DCDF

                ParticipantBorderColor DeepSkyBlue
                ParticipantBackgroundColor DodgerBlue
                ParticipantFontName Impact
                ParticipantFontSize 17
                ParticipantFontColor #A9DCDF

                ActorBackgroundColor blue
                ActorFontColor DeepSkyBlue
                ActorFontSize 17
                ActorFontName Aapex
        }
        actor User
          participant "<b>wmtmi</b> : WindowMacroToMenuItem" as WMTMI
          participant "<b>uiController</b> : UIController" as UIC
          participant "ArrayList<>" as L
          participant "<b>app</b> : CleanSheets" as CS
          participant "<b>frame</b> : csheets.ui.Frame" as F
          participant "<b>jCb</b> : JComboBox" as JCB
          participant "<b>uiExtension<b> : UIExtensionas" as UIE
          participant "<b>itemMenu</b> : JMenuItem" as JMI
          participant "<b>actionListener</b> : ActionListener" as AL
          participant "JButton<>" as JB   
          participant "<b>macro</b> : Macro" as M
          participant ExtensionManager as ExtM
          participant "extension : MenuExtension" as EM
          participant "uiExtension : UIExtension" as UIE
            User -> WMTMI : actionPerformed(ActionEvent event)
            WMTMI -> L : arrayMenuItem = new ArrayList()
            WMTMI -> L : uiController.getActiveWorkbook().getMacros()
            WMTMI -> CS : new CleanSheets()
            WMTMI -> F : new csheets.ui.Frame(app) 
            ... 
            WMTMI -> WMTMI : formWindowActivated(WindowEvent)
            activate WMTMI
                 loop for (Macro macro : arrayMacros)       
                     WMTMI -> JCB : CbMacroRun.addItem(macro)
                 end   
            deactivate WMTMI
            ...
            WMTMI -> WMTMI : getMenuItemsOfApplication(frame.getJMenuBar())
            activate WMTMI
                 loop for(JMenuItem jMenuItem : arrayMenuItem)
                     WMTMI -> JCB : CbMenuItem.addItem(jMenuItem)
                 end   
            deactivate WMTMI
            ...
            WMTMI -> JB : btnOKActionPerformed()
            WMTMI -> M : new Macro()       
            UIC -> ExtM : extensions=getExtensions();
            loop for UIExtension uiExtension : listExtension
               UIC -> EM : uiExtension=getUIExtension(this);
               JB -> JMI : new JMenuItem
               JB -> AL : actionListener = new ActionListener()
               M -> AL : m.compiler()
               M -> AL : m.results()
               ...
               JMI -> AL : itemMenu.addActionListener(actionListener)
               JB -> UIE : uiExtension.getMenu().add(itemMenu)
            end
         UIC -> User
         note left
             show to user the result
             of the running of the macro
             associated to the menu item 
             selection on the cleansheets
         end note
    @enduml
 *
 */

package csheets.userstories.us060;