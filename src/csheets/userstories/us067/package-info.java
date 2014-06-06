/**
 * Technical documentation regarding the user story 067: Find workbooks files.
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Find workbooks files in a directory choosed for user throught a file choose window,
 * and then if files exist, will appear a window with table style, to show to user,
 * the name(s) and path(s) of the founded files, otherwise send a message to user,
 * to inform that in the specified directory, don´t have any workbooks files.
 * <br/>
 * <br/>
 *  
 * <b>S067a: Analysis</b><br/>
 * At first sight, I thought implement an option in the application menu,  
 * which serve to perform the functionality to search for workbooks cleansheets files (*.cls), 
 * which are the files supported by the application. Running this option, 
 * the program will search for all files with this extension, in all the hdd directories, 
 * showing to the user, a list of found files.
 * <br/>
 * <br/>
 * 
 * <b>S067d: Design</b><br/> 
 * <br/>
 * To realize this user story we will need to create a submenu option in the menu option Extensions, 
 * named "Find Workbooks Files". We will also need to create a subclass of UIExtension. For select a directory
 * to search workbooks files we need to create a instance of the FileChooser, to perform this operation.
 * To find the files in the directory, we will create a class named FindWorkbooksFiles, and implement
 * a recursive method to search the files in the directory and in his subdirectories, to return a ArrayList
 * with all workbooks files. Finally to show the listing with the names and paths of the files, we need to
 * create a JFrame with components JTable (with DefaultTableModel) and JScroll, to show one window with table style. 
 * The following diagram shows how these new classes will be loaded and "integrated" with cleansheets.<br/><br/>
 * <img src="../../../csheets/userstories/us067/doc-files/us067_design1.png">
 * <br/>
 * 
 * <b>S067c: Coding</b><br/>
*  <br/>
 * <br/>
 * 
 * <b>S067u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S067f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:<br/>
 * 1run cleansheets program<br/>
 * 2go to the menu Extensions, and select the submenu "Find Workbooks Files", and
 * choose option "Find Workbooks Files"<br/>
 * 3will appear file chooser window, to select the directory on computer, where
 * you pretend search for workbook(s) file(s)<br/>
 * Note: depending on the contents of the directory, it may take a few minutes 
 * to be displayed the founded files, on the search results window.
 * 5after this, if files exist, will show to you, a window with table style model,
 * with a listing of the found files, otherwise inform you that don´t have any workbooks
 * files on the choosed directory.<br/>
 * <br/>
 * 
 * @author 1090675 - Tiago Pereira
 */
/*
 *
  @startuml doc-files/us067_design1.png  
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
  participant FindWorkbooksFileAction as FWFA
  participant "<b>fc</b> : FileChooser" as FC
  participant "<b>findWF</b> : FindWorkbooksFiles" as FWF
  participant "<b>windowLWF</b> : WindowListWorkbooksFiles" as WLWF
  participant "ArrayList<File>" as AL
  User -> FWFA : actionPerformed(ActionEvent event)
  FWFA -> FC : <b>fc</b> = new FileChooser()
  FWFA -> FC : <b>fc</b>.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY)
  FWFA -> FC : <b>fc</b>.showDialog()
  ...
  FWFA -> FWF : <b>findWF</b> = new FindWorkbooksFiles()
  FWFA -> FWF : <b>findWF</b>.findWorkbooksFiles(fc.getSelectedFile(), ".*\\.cls")
  ...
  FWF -> AL: <b>listingFiles</b> = new ArrayList<File>
  activate FWF
  deactivate FWF
  loop for File <b>fileDirectory</b> : sub
       FWF -> FWF : <b>listingFiles</b>.add(<b>fileDirectory</b>)
  end
  ...some seconds or minutes later...
  FWF --> FWFA : return <b>listingFiles</b>
  FWF --> FWFA : List<File> <b>listingFiles</b>
  FWFA --> User : if(<b>listingFiles</b>.isEmpty())
  note left
      show a message to inform the user
      that in the specified directory
      has no workbooks files
  end note
  ...
  FWFA -> WLWF : <b>windowLWF</b> = new WindowListWorkbooksFiles(listingF)
  WLWF --> User
  note left
      show to the user a listing of
      all workbooks files found in
      the specified directory
  end note
  @enduml
 *
 */
package csheets.userstories.us067;