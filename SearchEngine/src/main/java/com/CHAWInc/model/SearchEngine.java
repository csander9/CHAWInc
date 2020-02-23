package com.CHAWInc.model;

import javax.swing.SwingUtilities;

import com.CHAWInc.view.*;

/**
 * Search Engine
 *
 */
public class SearchEngine {

  public static void main(String args[]) {

    //Create and display the main Search Engine window
    //  java.awt.EventQueue.invokeLater(new Runnable() {
    //     public void run() {
    //          new SearchWindow().setVisible(true);
    //      }
    //  });


    //Hungs GUI
    SwingUtilities.invokeLater(new Runnable() {

      public void run() {

        new SearchWindow();
      }
    });

  }
}