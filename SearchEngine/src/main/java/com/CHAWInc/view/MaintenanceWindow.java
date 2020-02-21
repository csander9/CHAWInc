package com.CHAWInc.view;
import javax.swing.*; 

public class MaintenanceWindow {

	public static void MaintGUI (String[] args) {
		JFrame maint = new JFrame();//creating instance of JFrame  	
		maint.setSize(600,800); //600 width and 800 height  
		maint.setVisible(true); //making the window visible
		
		// Creating exit button for the maintenance window.
			
		JButton bye = new JButton("Exit Maintenance");
		bye.setBounds(500, 500, 100, 40);// Setting location to 500,500 at 100x40 size.
		
	}
}

