package com.CHAWInc.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;

//Assigned to Charles Sanders

//This method adds the selected files from the hard disk
//to the index file
public class MaintenanceWindowButtons {
	
	public static String[][] clickAddFile() throws IOException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		//Add to FIle Name list
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		
		int result = fileChooser.showOpenDialog(fileChooser);
		
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    
		    BufferedWriter writer = new BufferedWriter(
	                  new FileWriter("c:/Users/Public/Documents/SearchEngineIndex.txt", true)  //Set true for append mode
	                            );
		    String currentDate = sdf.format(selectedFile.lastModified());
		    String textToAppend = selectedFile.getAbsolutePath() + "," + currentDate;
	        writer.newLine();   //Add new line
	        writer.write(textToAppend);
	        writer.close();
		}
		
		String[][] files = tableFileData();
		return files;
		
	}
	
//This method removes the selected file form the index file.
	public static void clickRemoveSelectedFiles() {
		
		//TODO display Yes/No/Cancel popup with
		//text "Remove these files from the index?" 
		// < FIle Name >
	}
	
//This method rebuild the index file.
	public static String[][] clickRebuildOutOfDate() throws FileNotFoundException {
		
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	
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
        for ( x=0; x <= j; ++x ) {
            System.out.println(outFiles[x]);
        }
        
        System.setOut(originalOut);

        //Object[] options = {"OK"};
        //JOptionPane.showOptionDialog(null,
         //       "Please Re-Open the Maintenance Window to refresh the list",
         //       null, JOptionPane.PLAIN_MESSAGE,
         //       JOptionPane.WARNING_MESSAGE,
         //       null,
         //       options,
         //       options[0]);
        
        
		String[][] files2 = tableFileData();

		return files2;
		
	}

//This method retrieves the file names from the index file
// to display in the maintenance window.  It checks to see if the files are
//out of date and	
	public static String[][] tableFileData() throws FileNotFoundException {

        int i = -1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    	String ind = "Indexed";
    	String notInd = "File Changed Since Last Indexed";

		//Retrieve file names from the index
        File indexFile = new File("C:/Users/Public/Documents/SearchEngineIndex.txt");

        String indexFileDate = sdf.format(indexFile.lastModified());
    	if (indexFileDate.equals( "12/31/1969 19:00:00" )) {
            // Save original out stream.
            PrintStream originalOut = System.out;
            
            // Create a new file output stream.
            PrintStream fileOut = new PrintStream("C:/Users/Public/Documents/SearchEngineIndex.txt");
    		
            // Redirect standard out to file.
            System.setOut(fileOut);
    		
    		System.out.println("");
    		
    		System.setOut(originalOut);
    	}        
        
        
        String[][] files = new String[20][2];
    	
        @SuppressWarnings("resource")
		Scanner sc = new Scanner( indexFile );
	
        while (sc.hasNextLine() ) {
        	
        	i+=1;
	        files[i][0] = sc.nextLine();
	        
	        if (files[0][0].equals(""))
	        	break;
	        
	        String fileName = files[i][0].substring( 0, files[i][0].indexOf(","));	        
	        File fileDate = new File(fileName);
       
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