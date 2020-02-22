	package com.CHAWInc.view;



	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

	import javax.swing.JFrame;

	import javax.swing.JRadioButton;

	import javax.swing.JButton;

	public class SearchWindowHung extends JFrame {



	    JRadioButton radioButton1;

	    JRadioButton radioButton2;

	    JRadioButton radioButton3;

	    ButtonGroup radioGroup;



	    public SearchWindowHung() {



	        JFrame f = new JFrame("Search Engine");

	        //GUI Size

	        f.setSize(800,800);

	        f.setLayout(null);

	        f.setVisible(true);



	        //Search button



	        JButton searchButton = new JButton("Search");

	        searchButton.setBounds(650, 30, 95, 30);

	        f.add(searchButton);



	        //Initialize Radio buttons objs

	        radioGroup = new ButtonGroup();

	        JRadioButton radioButton1 = new JRadioButton(); //("All of the Search Terms", true)

	        JRadioButton radioButton2 = new JRadioButton(); //"Any of the Search Terms"

	        JRadioButton radioButton3 = new JRadioButton();//"Exact Phrase");



	        //Set Radio Buttons text

	        radioButton1.setText("All of the Search Terms");

	        radioButton2.setText("Any of the Search Terms");

	        radioButton3.setText("Exact Phrase");



	        //Bounds of Radio Buttons

	        radioButton1.setBounds(20, 75, 200, 50);

	        radioButton2.setBounds(240, 75, 200, 50);

	        radioButton3.setBounds(460, 75, 200, 50);



	        //Add to radioButtons to JFrame

	        f.add(radioButton1);

	        f.add(radioButton2);

	        f.add(radioButton3);



	        //Add radioButton's to radioGroup

	        radioGroup.add(radioButton1);

	        radioGroup.add(radioButton2);

	        radioGroup.add(radioButton3);



	        //Maintenance Button

	        JButton maintenanceButton = new JButton("Maintenance");

	        maintenanceButton.setBounds(100,600,140,40);

	        f.add(maintenanceButton);

	        //About Button

	        JButton aboutButton = new JButton("About");

	        aboutButton.setBounds(600,600,140,40);

	        f.add(aboutButton);

	        maintenanceButton.addActionListener(
	                new ActionListener(){  
	                    public void actionPerformed(ActionEvent e){
	                        new MaintenanceWindow();             
	                    }
	                });
	                
	    }

	}

