//Pseudocode for Search Engine Project 4
//For Maintenace Window

clickAddFileButton() //ArrayList
	-opens operating system window "Select File to Index"
	-add file object's absolute path to index // "C:/Users/Hung/Random.txt"
	-show Status, "Indexed || "File Changed Since Last Index"
clickRestWindowButton()
	-resets Maintenance Window to starting position
rebuildOutOfDateButton()
	... // I'm unclear here
removedSelectedFiles //JOptionPane
	options: select all, select one, select a few
	JOptionPane: title: "Select an option", "Remove these files from the Index:", Yes,No,Cancel
numberOfFilesIndex.size(); //from java.util.ArrayList
