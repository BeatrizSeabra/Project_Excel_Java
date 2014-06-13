/**
* Technical documentation regarding the user story 101: Import/Export Residence with relation Contacts
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Import Residence with relation to Contacts from the table Residence and Contacts on database
* to the cleansheets workspace (cells), to show to user the contacts with the residence
* Export Residence with relation to Contacts from the cleansheets workspace (cells),
* to the table Residence and Contacts, insert on database application.
* <br/>
* <br/>
*  
* <b>S001a: Analysis</b><br/>
* Definition content of each residence, for exemple: Street, Locality, Postal Code, City, Country and Type: primary or secundary.</br></br>
* Definition layout for presentation, remotion and update residences.
* <br/>
* <br/>
* 
* <b>S001d: Design</b><br/>
* Choice of the resources used for store the residences.<br/><br/>
* Creation of diagrams to represent a solution for the problem.<br/><br/>
* <img src="../../../csheets/userstories/us001/doc-files/us100_design1.png"> 
* <br/>
* <br/>
* 
* <b>S001c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S001f: Functional Tests</b><br/>
* To test this user story, the user should follow these steps:<br/>
* 1run cleansheets;<br/>
* 2click on the View menu and select sidebars. There must appear a list of menu options containning one option for the comments sidebar;<br/>
* 3the previous option is a check box that: when checked, the sidebar should appear; when not checked, the sidebar should disappear;<br/>
* 4the sidebar window should have only one editbox. <br/>
* <br/>
* <br/>
* 
* @author 1090675 - Tiago Pereira
*/
/*
*
 @startuml doc-files/us101_design1_SD_import_residence.png
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
  participant ResidenceImportAction as RIA
  participant "<b>residenceImport</b> : ResidenceImport" as RI
  participant "<b>uiController</b> : UIController" as UIC
  participant "List<>" as L
  participant ResidenceRepository as RR
  participant ContactsRepository as CR
    User -> RIA : actionPerformed(ActionEvent event)
    RIA -> RI : <b>residenceImport</b> = new ResidenceImport()
    RIA -> RI : <b>residenceImport</b>.importContactsResidenceToCleansheets(uiController)    
    ...
    RI -> L : <b>listResidence</b> = new List<Residence>()
    RI -> L : <b>listContact</b> = new List<Contact>()
    ...
    L -> RR : ResidenceRepository.getAll()
    L -> CR : ContactRepository.getAll()
    activate RI
    deactivate RI
         loop for Residence <b>r</b> : listResidence
             RI -> UIC : <b>uiController</b>.getActiveSpreadsheet().getCell(X,Y).setContent(TABLE_FIELD);
         end
    ...some seconds or minutes later...   
    ...
    UIC --> User
    note left
	show to the user a listing of all
	contacts and residences and the
        relation between two introducing
        the result into the cells of 
        cleansheets
    end note
 @enduml
 @startuml doc-files/us101_design2_SD_export_residence.png
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
      participant ResidenceExportAction as REA
      participant "<b>residenceExport</b> : ResidenceExport" as RE
      participant "<b>uiController</b> : UIController" as UIC
      participant "List<>" as L
      participant ": Residence" as RP
      participant "<b>contact</b> : Contact" as C
      participant ResidenceRepository as RR
      participant ContactsRepository as CR
        User -> REA : actionPerformed(ActionEvent event)
        REA -> RE : <b>residenceImport</b> = new ResidenceImport()
        REA -> RE : <b>residenceImport</b>.importContactsResidenceToCleansheets(uiController)    
        ...
        RE -> L : <b>listResidence</b> = new List<Residence>()
        ...
        L -> RR : ResidenceRepository.getAll()
        L -> CR : ContactRepository.getAll()
        activate RE
             loop while(!uiController.getActiveSpreadsheet().getCell(0, i).getContent().isEmpty())
                 RE -> RP : <b>residencePrincipal</b> = new Residence()
                 RE -> C : <b>contact</b> = new Contact()
                 RE -> RP : <b>residenceSecondary</b> = new Residence()
                 RE -> UIC : uiController.getActiveSpreadsheet().getCell(X, Y).getContent();
                 RE -> RR : ResidenceRepository.insert(residenceSecondary);
                 RE -> CR : ContactsRepository.add(contact);
             end
        deactivate RE
        ...some seconds or minutes later... 
        UIC --> User
        note left
            if any parameter of the input
            on cells of the contact or residence
            it´s wrong, will be shown to user
            a message box that the data inset on
            cells is not valid to do this export
        end note  
        ...
        UIC --> User
        note left
            show to the user a message
            box to inform that the process
            of export to database has successfully
        end note 
 @enduml
*
*/

package csheets.userstories.us101;