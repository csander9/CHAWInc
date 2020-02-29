Pseudocode for
Search Engine Maintenace Window

//1 
	clickAddFileButton()
		opens Select File to Index;
		add Files's absolutePath to Index;
		show Status("Indexed" or "File Changed Since Last Index")
//2
	clickRestWindowsButton()
		puts Maintenace Window back to original set position
//3
	rebuildOutofDateButton()	//unclear
	
//4	
	removeSelectedFiles
		options: select all, select one, select a few
		JOptionPane
			title: "Select an option"
			"Remove these files from the Index:"
			Yes,No,Cancel
//5	
	numberOfFilesLabel 	//updates with changes to index
