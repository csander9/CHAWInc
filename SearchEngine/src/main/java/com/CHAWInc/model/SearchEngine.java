// import the index file (need name)
package com.CHAWInc.model;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SearchEngine
{
    public static void main( String[] args )
    {

        //we need a path to our .txt file


        //need to make an arraylist

        //String searchFile = getInput();  //this will be the method??

        //need to display the search results somehow

        // APB- If we are using getInput() to look through the list for a
        // specific named file that should work.


    }

    //user input method, doing a scanner i think is the best way
    // feel free to change or give suggestions to improve
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your search: ");
        String nameTitle = sc.nextLine();
        sc.close();

        // temporary assignment to remove errors for the moment
        String titlename = nameTitle;
        return titlename;
            /* APB - this titlename variable seems undefined,
               What is it we want it to return exactly, an input from the user?
               I am setting a temporary variable to remove the error flag.
            */
    }

}