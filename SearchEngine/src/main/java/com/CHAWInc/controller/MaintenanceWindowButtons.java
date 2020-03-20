package com.CHAWInc.controller;


import javax.swing.JButton;
import javax.swing.JFileChooser;


//This method adds the selected files from the hard disk
//to the index file
public class MaintenanceWindowButtons {
	
	
	public static void main(String [] args) {}
	
	

	public static void clickAddFile() {
	
		
		JButton open = new JButton();
	    JFileChooser fc = new JFileChooser();
	    fc.setCurrentDirectory(new java.io.File("user.home"));
	    fc.setDialogTitle("Add File");
	    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){

	    }

	    System.out.println(fc.getSelectedFile().getAbsolutePath());

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
            {"C:/Temp/excel-doc.xlsx", "Indexed"},
            {"C:/Temp/excel-doc.xlsx", "Indexed"},
            {"C:/Temp/excel-doc.xlsx", "Indexed"},
            {"C:/Temp/excel-doc.xlsx", "Indexed"},
            {"C:/Temp/excel-doc.xlsx", "Indexed"}
            
        };
		
		//TODO add code to retrieve file names from the index

		return files;
	}
	
}