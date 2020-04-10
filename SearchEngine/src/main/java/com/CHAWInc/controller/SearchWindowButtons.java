package com.CHAWInc.controller;

import com.CHAWInc.controller.MaintenanceWindowButtons;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * Search Engine Program Project #4.
 * 
 * @authors Charles Sanders, Hung Truong, Walter Goes, Anthony Baudoin
 *    
 */


public class SearchWindowButtons {
	
    public static String[][] searchButtonAllRadioButton(String searchText) throws IOException {
    	
    	//get list of files from the index file
    	String[][] indexFiles = MaintenanceWindowButtons.tableFileData();
        
    	String[][] searchFiles = new String[20][2];
    	
    	int row = 0;
    	
    	//loop through the files and search each file for a pattern match
    	while ( indexFiles[row][0] != null ) {
	        
    		File searchIndexFile = new File(indexFiles[row][0]);
    		
    		Scanner sc = new Scanner( searchIndexFile );
        	
	        while (sc.hasNextLine() ) {
 
	        	
			    String inp = sc.nextLine();      
        
        	    Pattern pattern = Pattern.compile(searchText);
        	    Matcher matcher = pattern.matcher(inp);
        	    if (matcher.find()) {
        	        searchFiles[row][0] = indexFiles[row][0]; 
        		}
    	    }
	        ++row;
    	} 
		
 //   	String[][] searchFiles = {
  //  			{"C:/Temp/word-doc-all.docx"},
  //  			{"C:/Temp/excel-doc1-all.xlsx"}
  //  	};
            
        return searchFiles;
    }
    
    public static String[][] searchButtonAnyRadioButton(String searchText) throws IOException {
        // add code to search with radio button selection
        //              and return search results to main window
        // display_Search_Results();
    	
    	
    	String[][] indexFiles = MaintenanceWindowButtons.tableFileData();
    	
    	String[][] searchFiles = {
    			{"C:/Temp/word-doc-any.docx"},
    			{"C:/Temp/excel-doc1-any.xlsx"}
    	};
            
        return searchFiles;
    }
    
    public static String[][] searchButtonExactRadioButton(String searchText) throws IOException {
    	
    	//get list of files from the index file
    	String[][] indexFiles = MaintenanceWindowButtons.tableFileData();
        
    	String[][] searchFiles = new String[20][2];
    	
    	int row = 0;
    	int rowOut=0;
    	//loop through the files and search each file for a pattern match
    	while ( indexFiles[row][0] != null ) {
	        
    		File searchIndexFile = new File(indexFiles[row][0]);
    		
    		Scanner sc = new Scanner( searchIndexFile );
        	
	        while (sc.hasNextLine() ) {
 
	        	
			    String inp = sc.nextLine();      
        
        	    Pattern pattern = Pattern.compile(searchText);
        	    Matcher matcher = pattern.matcher(inp);
        	    if (matcher.find()) {
        	        searchFiles[rowOut][0] = indexFiles[row][0];
        	        ++rowOut;
        		}
    	    }
	        ++row;
    	} 
    	return searchFiles;
    }
    public static void onClickAboutButton() {
        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null,
                "Search Engine 1.0\n" + "Group: CHAWInc\n" +
                        "Project 3\n" +
                        "SP/20 COP-2805C\n","Search Engine",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }
    
    public static int indexFileWatcher() throws IOException {
    	
        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path dir = Paths.get("C:/Users/Public/Documents");
        dir.register(watcher, ENTRY_MODIFY);
        		
        while (true) {
            WatchKey key = null;
            try {
                // wait for a key to be available
                key = watcher.take();
            } catch (InterruptedException ex) {
              
            }
     
            for (WatchEvent<?> event : key.pollEvents()) {
                // get event type
                WatchEvent.Kind<?> kind = event.kind();
     
                // get file name
                @SuppressWarnings("unchecked")
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path fileName = ev.context();
     
                if (kind == OVERFLOW) {
                    continue;
     
                } else if (kind == ENTRY_MODIFY
                       && fileName.toString().equals("SearchEngineIndex.txt")) {
                	return(rowCounter());
                }
            }
     
            // IMPORTANT: The key must be reset after processed
            boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }
        return(rowCounter());
    }
    
    public static int rowCounter() {
    
    //Get index file row count
        String[][] tableFileData = null;
		try {
			tableFileData = MaintenanceWindowButtons.tableFileData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        int rowCount = 0;
        for (int i=0; i < 20; ++i) {
            if (tableFileData[i][0] != null )
        	    ++rowCount;
        }
		return rowCount;
    }
}

