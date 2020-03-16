package com.CHAWInc.controller;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import javax.swing.JOptionPane;


public class SearchWindowButtons {
	
    public static String[][] onClickSearchButton() {
        // add code to search with radio button selection
        //              and return search results to main window
        // display_Search_Results();
    	
    	String[][] searchFiles = {
    			{"C:/Temp/word-doc.docx"},
    			{"C:/Temp/excel-doc1.xlsx"}
    	};
            
        return searchFiles;
    }
    public static void onClickAboutButton() {
        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null,
                "Search Engine 1.0\n" + "Group: CHAWInc\n" +
                        "Project 3\n" +
                        "SP/20 COP-2805C\n","Search Engine",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }
    
    public static Boolean indexFileWatcher() throws IOException {
        
        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path dir = Paths.get("C:/Users/Public/Documents");
        dir.register(watcher, ENTRY_MODIFY);
    
        Boolean flag = false;
        
        while (true) {
            WatchKey key;
            try {
                // wait for a key to be available
                key = watcher.take();
            } catch (InterruptedException ex) {
                return false;
            }
     
            for (WatchEvent<?> event : key.pollEvents()) {
                // get event type
                WatchEvent.Kind<?> kind = event.kind();
     
                // get file name
                @SuppressWarnings("unchecked")
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path fileName = ev.context();
     
                System.out.println(kind.name() + ": " + fileName);
     
                if (kind == OVERFLOW) {
                    continue;
     
                } else if (kind == ENTRY_MODIFY
                       && fileName.toString().equals("SearchEngineIndex.txt")) {
                       flag = true;
                }
            }
     
            // IMPORTANT: The key must be reset after processed
            boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }
        return flag;
    }

}

