package com.CHAWInc.controller;

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
	public static String[][] tableFileData() {
		
		//Stub Data for the file array
        String[][] files = new String[][] {
            {"C:/Temp/word-doc.docx", "Indexed"},
            {"C:/Temp/excel-doc1.xlsx", "Indexed"},
            {"C:/Temp/excel-doc2.xlsx", "Indexed"},
            {"C:/Temp/excel-doc3.xlsx", "Indexed"},
            {"C:/Temp/excel-doc4.xlsx", "Indexed"},
            {"C:/Temp/excel-doc5.xlsx", "Indexed"}
            
        };
		
		//TODO add code to retrieve file names from the index

		return files;
	}
	
}