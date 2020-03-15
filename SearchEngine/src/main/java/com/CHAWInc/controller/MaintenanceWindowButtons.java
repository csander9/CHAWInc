package com.CHAWInc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
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
		    //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    
		    PrintWriter writer = new PrintWriter(
		    		    new FileWriter ("c:/Users/Public/Documents/SearchEngineIndex.txt",true));
		    
		    String currentDate = sdf.format(selectedFile.lastModified());
		    String textToAppend = selectedFile.getAbsolutePath() + "," + currentDate;
		    
	        writer.println(textToAppend);
	        writer.close();
		}
		
		String[][] files = tableFileData();
		return files;
		
	}
	
//This method removes the selected file form the index file.
	public static String[][] clickRemoveSelectedFiles(String selection) throws IOException {
	//	System.out.println(selection);
		
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
	    	if ( fileName.equals(selection) )
                j-=1;
	    	else
	    		outFiles[j] = fileName + "," + currentDate;
	    	
        }
        
	    PrintWriter writer = new PrintWriter(
    		    new FileWriter ("c:/Users/Public/Documents/SearchEngineIndex.txt",false));
		
        for (int x=0; x <= j; ++x ) {
        		writer.println(outFiles[x]);
        }

        writer.close();
        
		String[][] files2 = tableFileData();

		return files2;

	}
	
//This method rebuild the index file.
	public static String[][] clickRebuildOutOfDate() throws IOException {
		
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
        
	    PrintWriter writer = new PrintWriter(
    		    new FileWriter ("c:/Users/Public/Documents/SearchEngineIndex.txt",false));
		
        for (int x=0; x <= j; ++x ) {
        		writer.println(outFiles[x]);
        }

        writer.close();
        
		String[][] files2 = tableFileData();

		return files2;
		
	}

//This method retrieves the file names from the index file
// to display in the maintenance window.  It checks to see if the files are
//out of date and	
	public static String[][] tableFileData() throws IOException {

        int i = -1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    	String ind = "Indexed";
    	String notInd = "File Changed Since Last Indexed";

		//Retrieve file names from the index
        File indexFile = new File("C:/Users/Public/Documents/SearchEngineIndex.txt");

        String indexFileDate = sdf.format(indexFile.lastModified());
    	if (indexFileDate.equals( "12/31/1969 19:00:00" )) {
    		
    		indexFile.createNewFile();
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