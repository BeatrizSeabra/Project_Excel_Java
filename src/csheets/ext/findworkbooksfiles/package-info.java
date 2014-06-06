/**
 * Find workbooks files in a directory choosed for user throught a file choose window,
 * and then if files exist, will appear a window with table style, to show to user,
 * the name(s) and path(s) of the founded files, otherwise send a message to user,
 * to inform that in the specified directory, don´t have any workbooks files.
 * Represent the sequence diagram and class diagram design.
 * 
 * <p>
 * <b>Class Diagram</b>
 * <p>
 * <img src="doc-files/class_diagram_image1.png">
 * <p>
 * <b>Sequence Diagrams</b> illustrating the process of find workbooks files in a
 * directory, choosed by user.
 * <img src="doc-files/sequence_diagram_image1.png">
 * 
 * 
 * @author 1090675 - Tiago Pereira
 * 
 */
/*
  @startuml doc-files/sequence_diagram_design1.png
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
 */
package csheets.ext.findworkbooksfiles;


