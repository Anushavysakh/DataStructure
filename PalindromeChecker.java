package com.datastructure.bridgelabz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {

	public static boolean isPalindrome(String str) {
		
        Deque<Character> deque = new ArrayDeque<>();

        for (Character c: str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
           
        	Character front = deque.removeFirst();
            Character rear = deque.removeLast();

            if (front != rear)
            	
            	return false;
        }

        return true;
    }
    
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        
    	System.out.println("Enter a String:");
        String str = sc.next();
        
        boolean checker = isPalindrome(str);
        System.out.println("The Entered String is Palindrome:"+checker);
    }
}