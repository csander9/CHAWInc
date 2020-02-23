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
import javax.swing.JFrame;

import com.CHAWInc.controller.MaintenanceWindowButtons;

public class MaintenanceWindow {

	 MaintenanceWindow() {
		// Creating the JFrame and settings its properties.
		
		final JFrame maint = new JFrame();
		
		//maint.setLocationRelativeTo(null);
		//maint.setLayout(null);
		//maint.setLocation(500,250);
		
		maint.setTitle("Search Engine Maintenance" );
		
	
	    
	    JTextArea fileArea = new JTextArea(" ");
	    maint.add(fileArea);
	    fileArea.setBounds(0, 100, 800, 400);

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
        JScrollPane sp = new JScrollPane(fileTable);
		fileTable.setFillsViewportHeight(true);

		// heading
		JLabel heading = new JLabel("Search Engine - Index Maintenance");
	    heading.setFont(new Font("Arial",Font.BOLD,20));
		Color customColor = new Color(50,50,50);
		heading.setBackground(customColor);
		heading.setHorizontalAlignment(JLabel.CENTER);
		
		maint.getContentPane().setLayout(new BorderLayout());
        maint.getContentPane().add(heading,BorderLayout.PAGE_START);
        maint.getContentPane().add(sp,BorderLayout.CENTER);
	    //heading.setBounds(175, 10, 420, 35);

		//end code

		maint.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		maint.setSize(800,600);
		maint.setVisible(true); //making the window visible
	}
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MaintenanceWindow();//.setVisible(true);

            }
        });
	}
}