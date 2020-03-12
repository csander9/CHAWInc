/* This is the GUI program for the maintenance window
 * 
 * @authors Anthony Baudoin, Charles Sanders, Hung Truong, and Walter Goes
 */

package com.CHAWInc.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

import com.CHAWInc.controller.MaintenanceWindowButtons;

public class MaintenanceWindow {

	 MaintenanceWindow() {
		 
		// Create the JFrame and settings its properties.
		final JFrame maint = new JFrame();
		
		maint.setTitle( "Search Engine Maintenance" );
		
		// heading
		JLabel heading = new JLabel( "Search Engine - Index Maintenance" );
	    heading.setFont(new Font( "Arial",Font.BOLD,20 ));
		heading.setHorizontalAlignment(JLabel.CENTER);
	    
		// Create Add File button for the maintenance window.
		String addFileString = "Add File";
		JButton addFile = new JButton();
		addFile.setText(addFileString);
		addFile.setMnemonic(KeyEvent.VK_A);
		addFile.setActionCommand(addFileString);
		addFile.setBounds( 50, 500, 100, 25 );
		maint.add( addFile );

		// Create reset windows button for the maintenance window.
		String resetString = "Reset Windows";
		JButton reset = new JButton();
		reset.setText(resetString);
		reset.setMnemonic(KeyEvent.VK_W);
		reset.setActionCommand(resetString);
		reset.setBounds( 15, 533, 135, 25 );
		maint.add( reset );
		
		// Create Rebuild Out of date file button for the maintenance window.
		String rebuildString = "Rebuild Out-of-date";
		JButton rebuild = new JButton();
		rebuild.setText(rebuildString);
		rebuild.setMnemonic(KeyEvent.VK_O);
		rebuild.setActionCommand(rebuildString);
		//rebuild.setBounds( 50, 500, 100, 25 );
		rebuild.setBounds( 300, 500, 155, 25 );
		maint.add(rebuild);
		
		// Create the Remove Selected Files button for the maintenance window.
		String removeString = "Remove Selected Files";
		JButton remove = new JButton();
		remove.setText(removeString);
		remove.setMnemonic(KeyEvent.VK_R);
		remove.setActionCommand(removeString);
		remove.setBounds( 550, 500, 175, 25 );
		maint.add(remove);
		
	    //Number of Files Indexed
	    JLabel numFilesIndexed2 = new JLabel();
	    numFilesIndexed2.setText("Number of Files Indexed: 6 ");
	    numFilesIndexed2.setBounds(300,533,200,25);
	    maint.add(numFilesIndexed2);
	    
	    //Search Engine Version
	    JLabel searchEngineVersion = new JLabel();
	    searchEngineVersion.setText("Search Engine Version 1.0 ");
	    searchEngineVersion.setBounds(560,533,200,25);
	    maint.add(searchEngineVersion);
	    
	    
        //headers for the table
        String[] columns = new String[] {
            "File Name", "Status"
        };
        
        //create table with data
        JTable fileTable = new JTable( MaintenanceWindowButtons.tableFileData(), columns );
        JScrollPane sp = new JScrollPane( fileTable );
        
		maint.getContentPane().setLayout( new BorderLayout() );
        maint.getContentPane().add(heading,BorderLayout.PAGE_START);
        maint.getContentPane().add(sp,BorderLayout.CENTER);

        maint.setLocation( 375, 100 );
		maint.setSize( 800,600 );
		maint.setVisible(true); //making the window visible
		
		// listener for the Add File Button
	    addFile.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	MaintenanceWindowButtons.clickAddFile();             
	        }
	    });

		// listener for the Reset Windows Button	    
	    reset.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	MaintenanceWindowButtons.clickResetWindows();             
	        }
	    });
	    
	    // listener for the Rebuild button
	    rebuild.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	MaintenanceWindowButtons.clickRebuildOutOfDate();             
	        }
	    });
	    
	    remove.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	MaintenanceWindowButtons.clickRemoveSelectedFiles();             
	        }
	    });

	}

}