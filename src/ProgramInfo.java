/********************************************************************
 * Programmer:	Amy Mittal
 * Class:       CS30S-002
 *
 * Assignment:      Program Info Exercise 2.1
 * Program Name:    programInfo
 *
 * Description:     class for printing banners and closing messages
 ***********************************************************************/

// import libraries as needed

public class ProgramInfo {
    // **** class variables ****
    
    // **** instance variables ****
    
    // **** constructors ****
     /*********************************************
     * Description: create a new programInfo object
     * 
     ***********************************************/
    public ProgramInfo(){
        
    } // end constrcutor
    
    // **** getters ****    
    /*********************************************
     * Description: construct and return a banner string
     * 
     * Interface:
     * 
     * @return  banner string containing the banner information
     ***********************************************/
    public String getBanner(String assignmentName){
        String banner = "";
        
        banner = "*******************************************\n";
    	banner += "Name:		Amy Mittal\n";
    	banner += "Class:		CS30S\n";
    	banner += "Assignment:     " + assignmentName + "\n";
    	banner += "*******************************************\n\n"; 
        
        return banner;
    } // end getBanner
    
    /*********************************************
     * Description: construct and return a closing message
     * 
     * Interface:
     * 
     * @return  closing message
     ***********************************************/
    public String getClosingMessage(String closingMessage){
        
        return "end of processing";
        
    } // end closingMessage
    
    // **** setters ****
    
} // end public class
