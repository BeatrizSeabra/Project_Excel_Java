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
 * <b>S082a: Analysis</b><br/>
 * With the need to look into the entire local network to see if there are other cleansheets instances we have to investigat how to send a broadcast message and how to respond to said message.
 * We laterhave to sketch an example of the interface as it will be added to the menu and how it will come together with the send and respond operation.
 * <br/>
 * <br/>
 * 
 * <b>S082d: Design</b><br/>
 * For the User Interface we will need to create a subclass Extention. We will also need to create a subclass of UIExtension. For the sub-menu we will need a MenuItem named Find Instances.
 * Since for this US we only need to find every instance that is online there will be a refresh botton that sends a broadcast message saing " Who's online?" to which every instance that recieves it will responde "I am!", then the sender will save the list of ips that responded and it writes it on the UI (Cleansheet - ip). 
 * <br/>
 * <br/>
 * 
 * <b>S082c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/findinstances/package-summary.html">csheets.ext.findinstances</a><br/>
 * <a href="../../../csheets/ext/findinstances/ui/package-summary.html">csheets.ext.findinstances.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S082u: Unit Tests</b><br/>
 * Since the US is all about sending and receiving messages via network and since it only has classes very unique to their functionalities we dont have unit tests for them.
 * <br/>
 * <br/>
 * 
 * <b>S082f: Functional Tests</b><br/>
 * To test this user story, the user should follow these steps:
 * 1- run cleansheets.
 * 2- click on the Extension menu, go to Find Instances. There must appear a menu option containning two options: Find Instances and Start Client Thread;<br/>
 * 3- if the secound option is selected a new thread will be crated: you are now "online". 
 * 4- select the first option will open a new UI. 
 * 5- click on "Refresh" and after 10 secounds it will show every ip of every cleansheet instance that is "online", the thread will be now over.
 * 6- select "Start Client Thread" to start the thread once again.
 * <br/>
 * <br/>
 * @author RafaelChaves
 **/
package csheets.userstories.us082;
