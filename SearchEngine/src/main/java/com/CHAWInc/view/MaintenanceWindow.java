package com.CHAWInc.view;
import javax.swing.*; 

public class MaintenanceWindow {

	public static void main(String[] args) {
		// Creating the JFrame and settings its properties.
		JFrame maint = new JFrame();
		maint.setSize(800,600);  
		maint.setLayout(null);
		maint.setVisible(true); //making the window visible
		
		// Creating exit button for the maintenance window.
			
		JButton bye = new JButton("Exit Maintenance");
		bye.setBounds(500, 500, 200, 40);// Setting location to 500,500 at 100x40 size.
		maint.add(bye);
	}
}

