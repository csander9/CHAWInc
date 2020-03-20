package com.CHAWInc.view;

import java.io.IOException;

import com.CHAWInc.controller.SearchWindowButtons;


/**
 * Search Engine Program Project #3.
 * 
 * @authors Charles Sanders, Hung Truong, Walter Goes, Anthony Baudoin
 *    
 */
public class SearchEngine {
	
    public static void main(String args[]) throws IOException {
    	
		 SearchWindow searchWin = new SearchWindow();
		 
		 while (true) {
		     searchWin.numFilesIndexed.setText("Number of Files Indexed: " + SearchWindowButtons.indexFileWatcher());
		 }
		 
		 
    }
					               
}