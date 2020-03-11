package com.CHAWInc.controller;
//import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;


public class Project {

	public static void main(String[] args) {
		final JFileChooser selectedFile = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		selectedFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		selectedFile.setDialogTitle("Choose a file to index: ");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text based files", "txt", "TXT");
		selectedFile.addChoosableFileFilter(filter);
		
		
		int returnValue = selectedFile.showOpenDialog(null);
		
		String stringPath = getSelectedFile(selectedFile).getAbsolutePath(selectedFile);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			
			final ArrayList <String> indexList = new ArrayList<String>() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					indexList.add(stringPath);
				}
			};
			
			System.out.println("ArrayList : " + indexList);
		}

	}

}