package com.CHAWInc.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

import com.CHAWInc.controller.MaintenanceWindowButtons; 

public class MaintenanceWindow {

	 MaintenanceWindow() {
		// Creating the JFrame and settings its properties.
		JFrame maint = new JFrame();
		maint.setSize(800,600);  
		maint.setLayout(null);
		maint.setVisible(true); //making the window visible
		
		// Creating exit button for the maintenance window.
		
		JButton bye = new JButton("Exit Maintenance");
		bye.setBounds(500, 500, 200, 40);// Setting location to 500,500 at 100x40 size.
		maint.add(bye);
		// trying to add an action listener for the button to close this 
		// window only on click.
		//bye.addActionListener(goodbye());
		}

	private void goodbye(ActionEvent e) {
		// trying to close the window only when clicked
		// dispatchEvent(new WindowEvent(maint, WindowEvent.WINDOW_CLOSING));
		// trying to figure out how to make a call for closing the window without closing the program.


	}

}

