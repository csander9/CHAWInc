package com.CHAWInc.controller;

import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class SearchWindowButtons extends JFrame {

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    ButtonGroup radioGroup;
    //JLabel Label;


    public SearchWindowButtons() {

        JFrame f = new JFrame("Search Engine");
        //GUI Size
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);

        //Search button

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(600, 30, 95, 30);
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
        radioButton1.setBounds(120, 30, 120, 50);
        radioButton2.setBounds(250, 30, 120, 50);
        radioButton3.setBounds(380, 30, 120, 50);

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
        aboutButton.setBounds(600,600, 140,40);
        f.add(aboutButton);





        //Radio buttons



    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchWindowButtons().setVisible(true);
            }
        });
    }
}

