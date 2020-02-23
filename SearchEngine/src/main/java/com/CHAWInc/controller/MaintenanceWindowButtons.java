package com.CHAWInc.controller;

//Assigned to Charles Sanders

public class MaintenanceWindowButtons {
	
	public static void clickAddFile() {
	
		//TODO open File window
		//Add to FIle Name list
		
	}
	
	public static void clickRemoveSelectedFiles() {
		
		//TODO display Yes/No/Cancel popup with
		//text "Remove these files from the index?" 
		// < FIle Name >
	}
	
	public static void clickRebuildOutOfDate() {
		
		//TODO add code to rebuild the index
		
	}
	
	public static void clickResetWindows() {
		
		//TODO add code to move 1 or both windows
		// to the center of the screen
		
	}

	public static String[][] tableFileData() {
		
		//Stub Data for the file array
        String[][] files = new String[][] {
            {"C:/Temp/word-doc.docx", "Indexed"},
            {"C:/Temp/excel-doc.xlsx", "Indexed"} 
        };
		
		//TODO add code to retrieve file names from the index

		return files;
	}
	
}
