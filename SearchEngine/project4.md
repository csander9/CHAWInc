#	Pseudocode for Search Engine Project 4

#	For Maintenace Window

clickAddFileButton() 

	
	***finish by 3/8***
	
	-opens operating system window "Select File to Index"
		-JFileChooser						
		//wrong? java.nio.file.Files.inputStream()
		- filter .txt files as default
	-add file object's absolute path to index // "C:/Users/Hung/Random.txt" //java.nio.file.Path
		arrayListObject.add("Filename.txt");
		also
			//example List<Movie> listOfMovies = new ArrayList<Movie>()
		from https://www.java67.com/2016/01/difference-between-list-and-arraylist-variable-in-java.html
	-show Status, "Indexed || "File Changed Since Last Index"
		a Watch* event in java.nio.files
		
clickRestWindowButton() ***finish by 3/8***
	
	-resets Maintenance Window to starting position
	
rebuildOutOfDateButton()
	
	- Tooltip says: "Re-index any files modified since they were indexed."
		updates Index
	
removedSelectedFiles //JOptionPane ***finish by 3/8***
	
	options: select all, select one, select a few
	JOptionPane: title: "Select an option", "Remove these files from the Index:", Yes,No,Cancel
		arrayListObject.remove(int index)
		arrayListObject.remove()
		arrayListObject.clear()
		
JLabel that updates "Number of Files Indexed"
	
	//from java.util.ArrayList 
	//"Numbers of Files Indexed" JLabel


//populating files for Search Engine Window
	***Assigned Chuck*** 
	import java.util.ArrayList
	//possible?  
		ListIterator<E>	listIterator​(int index)
