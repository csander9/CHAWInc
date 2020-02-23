package com.CHAWInc.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.TextAction;

import com.CHAWInc.controller.MaintenanceWindowButtons; 

public class MaintenanceWindow {

	 MaintenanceWindow() {
		// Creating the JFrame and settings its properties.
		Font  H1  = new Font(Font.DIALOG,  Font.BOLD, 25); 
		
		JFrame maint = new JFrame();
		maint.setLocationRelativeTo(null);		
		maint.setSize(800,600);  
		//maint.setLayout(null);
		maint.setLocation(500,250);
		maint.setVisible(true); //making the window visible
		maint.setTitle("Search Engine Maintenance" );
		
		Color customColor = new Color(238,238,238);
		
	    JLabel textArea= new JLabel("Search Engine - Index Maintenance");
	    textArea.setFont(H1);
	    textArea.setBackground(customColor);
	    maint.add(textArea);
	    textArea.setBounds(175, 10, 420, 35);
	    
	    JTextArea fileArea = new JTextArea(" ");
	    fileArea.setBounds(0, 100, 800, 400);
	    maint.add(fileArea);
	    

		// Creating Add File button for the maintenance window.
		JButton addFile = new JButton("Add File");
		addFile.setBounds(50, 500, 100, 25);
		maint.add(addFile);

		// Creating reset windows button for the maintenance window.
		JButton reset = new JButton("Reset Windows");
		reset.setBounds(15, 533, 135, 25);
		maint.add(reset);
		
		// Creating Rebuild Out of date file button for the maintenance window.
		JButton rebuild = new JButton("Rebuild"); //Out-of-Date");
		rebuild.setBounds(300, 500, 100, 25);
		maint.add(rebuild);
		
		// Create the Remove Selected Files button for the maintenance window.
		JButton remove = new JButton("Remove Selected Files");
		remove.setBounds(550, 500, 175, 25);
		maint.add(remove);

        //headers for the table
        String[] columns = new String[] {
            "File Name", "Status"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {"word-doc.docx", "Indexed"},
            {"excel-doc.xlsx", "Indexed"}
        };
        
        //create table with data
        JTable fileTable = new JTable(data, columns); 
        //fileTable.setLayout(null);
        //fileTable.setBounds( 0, 300, 100, 100 );

        //fileTable.setPreferredScrollableViewportSize(new Dimension(50,50));
        //fileTable.setFillsViewportHeight(true);
        JScrollPane sp = new JScrollPane(fileTable);
        fileTable.setLocation(0,200);
        fileTable.setSize(50,50);
        //fileTable.setBounds( 0, 300, 200, 200 );
        maint.add(sp);
		
	}

}


