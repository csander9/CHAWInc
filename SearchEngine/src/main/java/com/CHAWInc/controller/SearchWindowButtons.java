package com.CHAWInc.controller;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class SearchWindowButtons extends JFrame {



    public SearchWindowButtons() {
        //Search button
        JButton searchButton = new JButton("Search");
        //Radio buttons
        JRadioButton radioButton1 = new JRadioButton("All of the Search Terms", true);
        JRadioButton radioButton2 = new JRadioButton("Any of the Search Terms");
        JRadioButton radioButton3 = new JRadioButton("Exact Phrase");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioGroup.add(radioButton3);

        setLayout(new FlowLayout());

        add(radioButton1);

        add(radioButton2);

        add(radioButton3);
        //Maintenance button
        JButton maintenanceButton = new JButton("Maintenance");
        //About button
        JButton aboutButton = new JButton("About");

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

