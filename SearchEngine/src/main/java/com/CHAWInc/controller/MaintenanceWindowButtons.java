package com.CHAWInc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

//Assigned to Charles Sanders

//This method adds the selected files from the hard disk
//to the index file
public class MaintenanceWindowButtons {
	
	public static void clickAddFile() {
	
		//TODO open File window
		//Add to FIle Name list
		
	}
	
//This method removes the select ed file form the index file.
	public static void clickRemoveSelectedFiles() {
		
		//TODO display Yes/No/Cancel popup with
		//text "Remove these files from the index?" 
		// < FIle Name >
	}
	
//This method rebuild the index file.
	public static void clickRebuildOutOfDate() {
		
		//TODO add code to rebuild the index
		
	}

//This method resets the position of the windows
	public static void clickResetWindows() {
		
		//TODO add code to move 1 or both windows
		// to the center of the screen
		
	}

//This method retrieves the file names from the index file
// to display in the maintenance window.
	public static String[][] tableFileData() throws FileNotFoundException {

        int i = -1;

    	String ind = "Indexed";
    	String notInd = "File Changed Since Last Indexed";

		//Retrieve file names from the index
        File indexFile = new File("/Users/csand/searchEngine/SearchEngineIndex.txt");

        String[][] files = new String[20][2];
    	
    	
        Scanner sc = new Scanner( indexFile );
	
        while (sc.hasNextLine() ) {
            i+=1;
	        files[i][0] = sc.nextLine();
	        
	        String fileName = files[i][0].substring( 0, files[i][0].indexOf(","));	        
	        File fileDate = new File(fileName);
	        
        	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        	String indexDate = files[i][0].substring(files[i][0].indexOf(",")+1, files[i][0].length());
	    	String currentDate = sdf.format(fileDate.lastModified());
	    	
	    	if (indexDate.equals(currentDate))
	    		files[i][1] = ind;
	    	else
	    		files[i][1] = notInd;
	    		
        }	
		

        return files;
	}
	
 

}