/* This is the GUI program for the maintenance window
 * 
 * @authors Anthony Baudoin, Charles Sanders, Hung Truong
 */

package com.CHAWInc.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.CHAWInc.controller.MaintenanceWindowButtons;

public class MaintenanceWindow {

	 MaintenanceWindow() throws IOException {
		 
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
		final JButton remove = new JButton();
		remove.setText(removeString);
		remove.setMnemonic(KeyEvent.VK_R);
		remove.setActionCommand(removeString);
		remove.setBounds( 550, 500, 175, 25 );
		maint.add(remove);
	    
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
        String[][] tableFileData = MaintenanceWindowButtons.tableFileData();

        int rowCount = 0;
        for (int i=0; i < 20; ++i) {
            if (tableFileData[i][0] != null )
            	++rowCount;
        }
        
        final JTable fileTable = new JTable( tableFileData, columns );
        JScrollPane sp = new JScrollPane( fileTable );
       
    	final JLabel numFilesIndexed2 = new JLabel();
    	numFilesIndexed2.setText("Number of Files Indexed: " + rowCount);
    	numFilesIndexed2.setBounds(300,533,200,25);
    	maint.add(numFilesIndexed2);
        
		maint.getContentPane().setLayout( new BorderLayout() );
        maint.getContentPane().add(heading,BorderLayout.PAGE_START);
        maint.getContentPane().add(sp,BorderLayout.CENTER);

        maint.setLocation( 375, 100 );
		maint.setSize( 800,600 );
		maint.setVisible(true); //making the window visible
		maint.setResizable(true);
    	
       // numFilesIndexed2.setText("Number of Files Indexed:::: " + rowCount);
    //	maint.add(numFilesIndexed2);
    //	maint.setVisible(true);
		
		// listener for the Add File Button
	    addFile.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	try {
				//	MaintenanceWindowButtons.clickAddFile();
	            	String[][] fileArray = MaintenanceWindowButtons.clickAddFile();
	            	
	            	for(int row = 0; row < fileArray.length; ++row) {
	            		for (int col = 0; col < 2; ++col) {
	            		 
	            			fileTable.setValueAt( (Object)fileArray[row][col], row, col);
	            		}	
	            	}
	            	
	                int rowCount = 0;
	                for (int i=0; i < 20; ++i) {
	                    if (fileArray[i][0] != null )
	                    	++rowCount;
	                }
	            	
	                //Number of Files Indexed
	                numFilesIndexed2.setText("Number of Files Indexed: " + rowCount);
	                
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	        }
	    });

		// listener for the Reset Windows Button	    
	    reset.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	
	        	maint.setLocation( 375, 100 );
	        //	f.setLocation( 450, 25 );
	        }
	    });
	    
	    // listener for the Rebuild index button
	    rebuild.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	try {
	            	String[][] fileArray = MaintenanceWindowButtons.clickRebuildOutOfDate();
	            	
	            	for(int row = 0; row < fileArray.length; ++row) {
	            		for (int col = 0; col < 2; ++col) {
	            	        fileTable.setValueAt( (Object)fileArray[row][col], row,col);
             		    }
	            	}
	            	
	                int rowCount = 0;
	                for (int i=0; i < 20; ++i) {
	                    if (fileArray[i][0] != null )
	                    	++rowCount;
	                }
	            	
	                //Number of Files Indexed
	                numFilesIndexed2.setText("Number of Files Indexed: " + rowCount);
	    	    	
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				             
	        }
	        
	    });

	    //Listeners for the Select File and the Remove Selected File
	    fileTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	        public void valueChanged(ListSelectionEvent e) {
	        	
	            fileTable.setRowSelectionAllowed(true);
	            
	            final int sel = fileTable.getSelectedRow();
	            final String sel1 = (String) fileTable.getValueAt(sel, 0);
	            
	    	    remove.addActionListener(new ActionListener(){  
	    	        public void actionPerformed(ActionEvent e){
	    	        	
	    	        	String selection = sel1;
	    	        	try {
	    	        		String[][] fileArray = MaintenanceWindowButtons.clickRemoveSelectedFiles(selection);
	    	        		
	    	            	for(int row = 0; row < fileArray.length; ++row) {
	    	            		for (int col = 0; col < 2; ++col) {
	    	            	        fileTable.setValueAt( (Object)fileArray[row][col], row,col);
	                 		    }
	    	            	}
	    	            	
	    	                int rowCount = 0;
	    	                for (int i=0; i < 20; ++i) {
	    	                    if (fileArray[i][0] != null )
	    	                    	++rowCount;
	    	                }
	    	            	
	    	                //Number of Files Indexed
	    	                numFilesIndexed2.setText("Number of Files Indexed: " + rowCount);
	    	    	    	
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
          
	    	        }
	    	    });        
	            
	        }    
	    });
	    


	}

}