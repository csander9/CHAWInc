package com.CHAWInc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
	public static void clickRebuildOutOfDate() throws FileNotFoundException {
		
		//Rebuild the out-of-date index
        int i = -1;

		//Retrieve file names from the index
        File indexFile = new File("C:/Users/Public/Documents/SearchEngineIndex.txt");

        String[] files = new String[20];
        String[] outFiles = new String[20];
        
		@SuppressWarnings("resource")
		Scanner sc = new Scanner( indexFile );
	
		int j = -1;
		
        while (sc.hasNextLine() ) {
            i+=1;
	        files[i] = sc.nextLine();
	        
	        String fileName = files[i].substring( 0, files[i].indexOf(","));	        
	        File fileDate = new File(fileName);
       
        	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	    	String currentDate = sdf.format(fileDate.lastModified());
        
	    	j+=1;
	    	if (currentDate.equals( "12/31/1969 19:00:00" ))
                j-=1;
	    	else
	    		outFiles[j] = fileName + "," + currentDate;
	    	
        }
        
        // Save original out stream.
        PrintStream originalOut = System.out;
        
        // Create a new file output stream.
        PrintStream fileOut = new PrintStream("C:/Users/Public/Documents/SearchEngineIndex.txt");
        
        // Redirect standard out to file.
        System.setOut(fileOut);
   
        int x = 0;
        for ( x=0; x <= j; ++x) {
            System.out.println(outFiles[x]);
        }
        
        System.setOut(originalOut);

        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null,
                "Please Re-Open the Maintenance Window to refresh the list",
                null, JOptionPane.PLAIN_MESSAGE,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);
	}

//This method resets the position of the windows
	public static void clickResetWindows() {
		
		//TODO add code to move 1 or both windows
		// to the center of the screen
		
	}

//This method retrieves the file names from the index file
// to display in the maintenance window.  It checks to see if the files are
//out of date and	
	public static String[][] tableFileData() throws FileNotFoundException {

        int i = -1;

    	String ind = "Indexed";
    	String notInd = "File Changed Since Last Indexed";

		//Retrieve file names from the index
        File indexFile = new File("C:/Users/Public/Documents/SearchEngineIndex.txt");

        String[][] files = new String[20][2];
    	
        @SuppressWarnings("resource")
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

            files[i][0] = fileName;

        }	

        return files;
	}
	
 

}