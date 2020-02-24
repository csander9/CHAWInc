package com.CHAWInc.controller;
import javax.swing.JOptionPane;


public class SearchWindowButtons {
    public static void onClickSearchButton() {
        // add code to search with radio button selection
        //              and return search results to main window
        // display_Search_Results();

    }
  
    public static void onClickAboutButton() {
        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(null,
                "Search Engine 1.0\n" + "Group: CHAWInc\n" +
                        "Project 3\n" +
                        "SP/20 COP-2805C\n","Search Engine",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }
}