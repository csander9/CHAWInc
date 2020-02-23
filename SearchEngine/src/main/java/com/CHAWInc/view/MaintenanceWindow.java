/* This is the GUI program for the maintenance window
 *
 * @authors Anthony Baudoin, Charles Sanders, Hung Truong
 */

package com.CHAWInc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.CHAWInc.controller.MaintenanceWindowButtons;

public class MaintenanceWindow {

  MaintenanceWindow() {

    // Creat the JFrame and settings its properties.
    final JFrame maint = new JFrame();

    maint.setTitle("Search Engine Maintenance" );

    // heading
    JLabel heading = new JLabel("Search Engine - Index Maintenance");
    heading.setFont(new Font("Arial",Font.BOLD,20));
    heading.setHorizontalAlignment(JLabel.CENTER);

    // Create Add File button for the maintenance window.
    JButton addFile = new JButton("Add File");
    addFile.setBounds(50, 500, 100, 25);
    maint.add(addFile);

    // Create reset windows button for the maintenance window.
    JButton reset = new JButton("Reset Windows");
    reset.setBounds(15, 533, 135, 25);
    maint.add(reset);

    // Create Rebuild Out of date file button for the maintenance window.
    JButton rebuild = new JButton("Rebuild Out-of-Date");
    rebuild.setBounds(300, 500, 155, 25);
    maint.add(rebuild);

    // Create the Remove Selected Files button for the maintenance window.
    JButton remove = new JButton("Remove Selected Files");
    remove.setBounds(550, 500, 175, 25);
    maint.add(remove);

    //headers for the table
    String[] columns = new String[] {
            "File Name", "Status"
    };

    //create table with data
    JTable fileTable = new JTable(MaintenanceWindowButtons.tableFileData(), columns);
    JScrollPane sp = new JScrollPane(fileTable);

    maint.getContentPane().setLayout(new BorderLayout());
    maint.getContentPane().add(heading,BorderLayout.PAGE_START);
    maint.getContentPane().add(sp,BorderLayout.CENTER);

    maint.setSize(800,600);
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