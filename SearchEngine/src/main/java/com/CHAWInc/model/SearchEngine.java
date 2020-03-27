// import the index file (need name)
package com.CHAWInc.model;
import java.util.*; //resolving error on line 29

/**
 * Hello world!
 *    
 */
public class SearchEngine 
{
    public static void main( String[] args )
    {
        
        //we need a path to our .txt file
        
        
        //need to make an arraylist
        
        //String searchFile = getInput();  //this will be the method??
        
        //need to display the search results somehow
        
     
    }

        //user input method, doing a scanner i think is the best way
        // feel free to change or give suggestions to improve
        public static String getInput() {
            Scanner sc = new Scanner(System.in); // was getting error Scanner was not accepted, importing java.util.* resolved.
            System.out.println("Enter your search: ");
            String nameTitle = sc.nextLine();
            sc.close();
            String titlename = nameTitle; 	// temporary placeholder to resolve error for no return value. 
            								// setting to nameTitle as that was not used, which cleared a warning of unused variable.
            return titlename; 	//what should be used for the titlename? currently it is a non existing object.
            					//adding a temporary value to clear error message.
        }

}
