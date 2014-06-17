/**
* Technical documentation regarding the user story 101: Import/Export Residence with relation with Contacts
* Contacts have associated a reference to the residence, and the contact can take a main residence and
* a secondary residence (optional).
* <br/>
* <br/>
* 
* <b>Requirement</b><br/>
* Import Residence with relation to Contacts from the table Residence and Contacts<br/>
* on database to the cleansheets workspace (cells), to show to user the contacts<br/> 
* with the corresponding main residence and secondary residence (optional).<br/> 
* Export Residence with relation to Contacts from the cells of the cleansheets<br/>
* to the tables of contacts and residence, insert this information in the database</br>
* of application<br/>
* <br/>
* <br/>
*  
* <b>S101a: Analysis</b><br/>
* The user storie US101, continues the work on user storie US100 corresponding to<br/> 
* iteration belonging to the first iteration week 1, which in turn was connected<br/> 
* to the user storie US097, since this two features are related, because they have<br/> 
* a contact associated with an address, which may be a main residence (mandatory)<br/> 
* and a secondary residence (optional). After a detailed analysis of the two previous<br/> 
* user stories, I contacted these are not related, so I have to   change the two<br/> 
*user stories so that you can create a relationship between the two, the latter<br/> 
* has been one of the requisites to change the iteration of week 1. Tour this change,<br/> 
* and after a detailed analysis of the diagrams and codes of iterations did the<br/> 
* currents and changes depending on what was made ​​created to import to the cells<br/> 
* of cleansheets from the database and export the information of residence and contacts<br/>
* from the cleansheet cells into the database of the application.<br/>
* <br/>
* <br/>
* 
* <b>S101d: Design</b><br/>
* Firstly analyzed the diagrams used in the user stories US100 and US097,<br/>
* to understand the process used to analyze these features, which depend on the<br/> 
* implementation of user storie US101. After analysis it was concluded that the<br/> 
* contacts in the table are not related to the residence table, post it was<br/> 
* necessary to create a relationship between contacts and residences, which had<br/> 
* not been created in the previous iteration of week 1, so I will change the<br/> 
* corresponding classes, to define the relationship between the two tables (contacts<br/>
* and residence). It was important to see how the methods of consult and insert<br/>
* on database are defined, because it will be necessary to use these methods to<br/>
* import the data of the two tables into the cells of the cleansheets, and otherwise<br/>
* export the constact(s) and residence(s) from the cells of the cleansheets into<br/>
* the tables of contacts and residence, on the database of the application.<br/>
* <br/>
* <br/>
* <img src="../../../csheets/userstories/us101/doc-files/us101_design1_SD_import_residence.png"> 
* <img src="../../../csheets/userstories/us101/doc-files/us101_design2_SD_export_residence.png">
* <br/>
* <br/>
* 
* <b>S101c: Coding</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* see packages:<br/> 
* csheets.ext.residenceexport<br/>
* csheets.ext.residenceexport.ui<br/>
* csheets.ext.residenceimportcleansheets<br/>
* csheets.ext.residenceimportcleansheets.ui<br/>
* see packages changed to the week1:<br/>
* csheets.PersistenceJPA
* csheets.ext.contacts
* csheets.ext.contacts.ui
* csheets.ext.residence
* csheets.ext.residence.ui
* <br/>
* <br/>
* 
* <b>S101u: Unit Tests</b><br/>
* see:<br/>
* <a href="../../../csheets/ext/comments/package-summary.html">csheets.ext.comments</a><br/>
* <a href="../../../csheets/ext/comments/ui/package-summary.html">csheets.ext.comments.ui</a><br/>
* <br/>
* <br/>
* 
* <b>S101f: Functional Tests</b><br/>
* To test the Import Residence, the user should follow these steps:<br/>
* 1run cleansheets;<br/>
* 2click on the Extensions menu and select the submenu Import and select option Residence.;<br/>
* 3the application will load the fields of the database, this may take some time to do this operation;<br/>
* 3The information corresponding to the contacts and their residence(s) will appear in the cells of cleansheets;<br/>
* To test the Export Residence, the user should follow these steps:<br/>
* 1run cleansheets;<br/>
* 2click on the Extensions menu and select the submenu Export and select option Residence.;<br/>
* 3the application will load and read the information defined by the user on the cells 
* of cleansheets, this may take some time to do this operation;<br/>
* 4the application will export the load information to the table of contacts and resindence,<br/> 
* with the relationship between this tables, and insert the information into<br/>
* the database of application;<br/>
* 5If the data has been correctly entered and recorded on the database, the application<br/>
* will send a message to the user, inform that the data were added successfully to the database,<br/>
* otherwise informs the user that the data were not introduced respecting the order<br/> 
* and it was not possible to insert the information into the database.<br/>
* Addicional Notes to Import Residence:
*  - In the import of the information of residence and contact present on the database,
* the information will appear that way on cells of cleansheets:
* Colunm A - First Name space Last Name, of the contact;<br/>
* Next Row Colunm A - Street name, of the residence;<br/>
* Next Row Colunm B - Locality name, of the residence;<br/>
* Next Row Colunm C - Postal code (example 2344-987), of the residence;<br/>
* Next Row Colunm D - City name, of the residence;<br/>
* Next Row Colunm E - Country name, of the residence;<br/>
* Next Row Colunm F - Inform that the residence is principal or secondary;<br/>
* If the contact have a secondary residence, should follow the same logic of the <br/>
* fields of the Column A to F, on a new row of the cells workbook, and the name of the contact<br/>
* is set in the column A, in the previous line of the main residence defined.</br>
* Addicional Notes to Export Residence:
*  - To export the information of residence and contact to the database, the information<br/>
* must appear on the cells of cleansheets follows that way:<br/>
* Colunm A - First Name space Last Name, of the contact;<br/>
* Colunm B - Street name, of the residence;<br/>
* Colunm C - Locality name, of the residence;<br/>
* Colunm D - Postal code (example 2344-987), of the residence;<br/>
* Colunm E - City name, of the residence;<br/>
* Colunm F - Country name, of the residence;<br/>
* If the contact have a secondary residence, should follow the same logic of the <br/>
* fields of the Column B to F, and the column A (contact name) must be empty,<br/>
* to report that it is a secondary address and belongs to the above contact;<br/>
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