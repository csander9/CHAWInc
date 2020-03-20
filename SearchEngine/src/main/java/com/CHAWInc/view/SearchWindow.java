package com.CHAWInc.view;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.CHAWInc.controller.SearchWindowButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class SearchWindow extends JFrame {

  /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    JRadioButton allRadioButton;
    JRadioButton anyRadioButton;
    JRadioButton exactRadioButton;
    ButtonGroup radioGroup;

    static String allString = "All of the Search Terms";
    static String anyString = "Any of the Search Terms";
    static String exactString = "Exact Phrase";

    static String maintenanceString = "Maintenance";
    static String aboutString = "About";
    static String searchString = "Search";
    
    final JFrame f = new JFrame("Search Engine");
    final JLabel numFilesIndexed = new JLabel();
    
    public SearchWindow() throws IOException {
        

        //GUI Size
        f.setLocation( 450, 25 );
        f.setSize(660,800);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        JLabel heading = new JLabel();
        heading.setText("Search Engine");
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(160, 5, 280, 35);
        Font fontHeading = new Font("Arial", Font.BOLD, 20);
        heading.setFont(fontHeading);
        Color color = new Color(238,238,238);
        heading.setBackground(color);
        f.add(heading);

        //Search Terms:
        JLabel topLabel = new JLabel();
        topLabel.setText("Search Terms: ");
        topLabel.setBounds(45,30,115,50);
        f.add(topLabel);

        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(150,43,300,25);
        f.add(searchTextField);

        //Search button
        JButton searchButton = new JButton();
        searchButton.setText(searchString);
        searchButton.setMnemonic(KeyEvent.VK_S);
        searchButton.setActionCommand(searchString);
        searchButton.setBounds(500, 43, 95, 30);
        f.add(searchButton);

        //Initialize Radio buttons objects
        radioGroup = new ButtonGroup();
        JRadioButton allRadioButton = new JRadioButton();
        JRadioButton anyRadioButton = new JRadioButton();
        JRadioButton exactRadioButton = new JRadioButton();

        //Set Radio Buttons text with Mnemonic and ActionCommand
        allRadioButton.setText(allString);
        allRadioButton.setMnemonic(KeyEvent.VK_A);
        allRadioButton.setActionCommand(allString);
        anyRadioButton.setText(anyString);
        anyRadioButton.setMnemonic(KeyEvent.VK_O);
        anyRadioButton.setActionCommand(anyString);
        exactRadioButton.setText(exactString);
        exactRadioButton.setMnemonic(KeyEvent.VK_P);
        exactRadioButton.setActionCommand(exactString);

        //Bounds of Radio Buttons
        allRadioButton.setBounds(40, 75, 200, 50);
        anyRadioButton.setBounds(240, 75, 200, 50);
        exactRadioButton.setBounds(460, 75, 200, 50);

        //Add to radioButtons to JFrame
        f.add(allRadioButton);
        f.add(anyRadioButton);
        f.add(exactRadioButton);

        //Add radioButton's to radioGroup
        radioGroup.add(allRadioButton);
        radioGroup.add(anyRadioButton);
        radioGroup.add(exactRadioButton);

        //Text Area
//        JTextArea textArea = new JTextArea();
//        textArea.setBounds(50,140, 550, 550);
//        f.add(textArea);


        //Maintenance Button
        JButton maintenanceButton = new JButton();
        maintenanceButton.setText(maintenanceString);
        maintenanceButton.setMnemonic(KeyEvent.VK_M);
        maintenanceButton.setActionCommand(maintenanceString);
        maintenanceButton.setBounds(50,718, 110, 30);
        f.add(maintenanceButton);
  	
        //Number of Files Indexed
        numFilesIndexed.setHorizontalAlignment(JLabel.CENTER);
        numFilesIndexed.setText("Number of Files Indexed: " + SearchWindowButtons.rowCounter());
        numFilesIndexed.setBounds(230,709,200,50);
        f.add(numFilesIndexed);

        //About Button
        JButton aboutButton = new JButton();
        aboutButton.setText(aboutString);
        aboutButton.setMnemonic(KeyEvent.VK_B);
        aboutButton.setActionCommand(aboutString);
        aboutButton.setBounds(500,720,95,30);
        f.add(aboutButton);
    	      
        String[][] searchFiles = new String[20][1];
        
	    String colHeading[] = {"Search Results"};

        final JTable searchTable = new JTable(searchFiles, colHeading);

        JScrollPane sp = new JScrollPane( searchTable );
	    
        f.getContentPane().setLayout( new BorderLayout() );
    	f.getContentPane().add(sp,BorderLayout.SOUTH);
    			
        f.setVisible(true);
        
        //Number of Files Indexed
        //final JLabel numFilesIndexed = new JLabel();
        //numFilesIndexed.setHorizontalAlignment(JLabel.CENTER);
        //numFilesIndexed.setText("Number of Files Indexed: " + SearchWindowButtons.indexFileWatcher());
       // numFilesIndexed.setBounds(230,709,200,50);
        //f.add(numFilesIndexed);
        
        //ActionListener Maintenance button
        maintenanceButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
					new MaintenanceWindow();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        });

        //ActionListener About button
        aboutButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	SearchWindowButtons.onClickAboutButton();   
            }
        });

        //ActionListener Search button
        searchButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){

            	String[][] fileArray = SearchWindowButtons.onClickSearchButton();
            	
            	for(int row = 0; row < fileArray.length; ++row) {                   
            	    searchTable.setValueAt( (Object)fileArray[row][0], row, 0);
            	}
            	

            }
        });

    }
    
}