package com.unorderedlist.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ReadWriteData readWriteData = new ReadWriteData();
        ArrayList<String> dataArray = readWriteData.readFile();

        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        LinkedList<String> unorderedImplementation = new LinkedList<>(array);
        unorderedImplementation.insertBefore();
        unorderedImplementation.insertEnd();
        unorderedImplementation.insertAt();
        System.out.print("List after insertion in the linked list: ");
        unorderedImplementation.display();

        System.out.println();
        //Take input from the user to search for the word
        System.out.print("Enter the word you want to search from the file: ");
        String value = sc.next();

        System.out.println("Element found " +unorderedImplementation.search(value));
        if(unorderedImplementation.search(value) == true)
            unorderedImplementation.deleteNode(value);
        else
            unorderedImplementation.appendAtEnd(value);

        System.out.print("New list:\n");
        ArrayList<String> data = unorderedImplementation.display();

        readWriteData.writeFile(data);
    }
}
