package com.CHAWInc.model;

import java.io.IOException;

import com.CHAWInc.view.*;

/**
 * Search Engine Program Project #3.
 * 
 * @authors Charles Sanders, Hung Truong, Walter Goes, Anthony Baudoin
 *    
 */
public class SearchEngine {
	
    public static void main(String args[]) {

        //Create and display the main Search Engine window 
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                try {
					new SearchWindow();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
    }
}