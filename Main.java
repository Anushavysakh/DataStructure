package com.orderedlinkedlist.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
      
		Scanner input = new Scanner(System.in);

        ReadWriteData readWriteData = new ReadWriteData();
        ArrayList<String> dataArray = readWriteData.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        LinkedList<String> orderedImplementation = new LinkedList<>(array);

        orderedImplementation.insertBefore();
        orderedImplementation.insertEnd();
        orderedImplementation.insertAt();

        System.out.print("List after insertion in the linked list: ");
        orderedImplementation.display();

        System.out.println();
        //Take input from the user to search for the word
        System.out.print("Enter the word you want to search from the file: ");
        String value = input.next();

        System.out.println("Element found " +orderedImplementation.search(value));
        if(orderedImplementation.search(value) == true)
            orderedImplementation.deleteNode(value);
        else
            orderedImplementation.appendAtEnd(value);

        //sort the linked list
        orderedImplementation.sortList();

        System.out.print("New list: ");
        ArrayList<String> data = orderedImplementation.display();
        ReadWriteData.writeFile(data);
    }
}
