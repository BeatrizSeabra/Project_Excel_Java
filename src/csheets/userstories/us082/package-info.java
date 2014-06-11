/**
 * Technical documentation regarding the user story 082: Find cleansheets instances. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Everytime the user selects this new menu option all of the cleansheets instances within the local network have to apear in a list.
 * <br/>
 * <br/>
 *  
 * <b>S055a: Analysis</b><br/>
 * With the need to look into the entire local network to see if there are other cleansheets instances we have to investigat how to send a broadcast message and how to respond to said message.
 * We laterhave to sketch an example of the interface as it will be added to the menu and how it will come together with the send and respond operation.
 * <br/>
 * <br/>
 * 
 * <b>S055d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named Find Instances.
 * Since for this US we only need to find every instance that is online there will be a refresh botton that sends a broadcast message saing " Who's online?" to which every instance that recieves it will responde "I am!", then the sender will save the list of ips that responded and it writes it on the UI (Cleansheet - ip). 
 * <br/>
 * <br/>
 * 
 * 
 * @author RafaelChaves
 **/


/*
 * 
* 
**/
package csheets.userstories.us082;
