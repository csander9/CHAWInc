#Pseudocode for Search Engine Project 4

#	For Maintenace Window

clickAddFileButton() //ArrayList // java.util.ArrayList
	
	-opens operating system window "Select File to Index"
		java.nio.file.Files.inputStream()
	-add file object's absolute path to index // "C:/Users/Hung/Random.txt" //java.nio.file.Path
		arrayListObject.add("Filename.txt");
	-show Status, "Indexed || "File Changed Since Last Index"
		a Watch* event in java.nio.files
clickRestWindowButton()
	
	-resets Maintenance Window to starting position
	
rebuildOutOfDateButton()
	
	... // I'm unclear here
	
removedSelectedFiles //JOptionPane
	
	options: select all, select one, select a few
	JOptionPane: title: "Select an option", "Remove these files from the Index:", Yes,No,Cancel
		arrayListObject.remove(int index)
		arrayListObject.remove()
		arrayListObject.clear()
		
arrayListObject.size(); 
	
	//from java.util.ArrayList 
	//"Numbers of Files Indexed" JLabel


//Pseudocode for Search Engine Window
	
	import java.util.ArrayList
	//possible?  
		ListIterator<E>	listIterator​(int index)
