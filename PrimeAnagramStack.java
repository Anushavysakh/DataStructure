package com.datastructure.bridgelabz;

import java.util.Stack;

public class PrimeAnagramStack {

	public static void main(String[] args) {

		StackLinkedListImp obj = new StackLinkedListImp();
		Unordered<Integer> ar = new Unordered<Integer>();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					ar.add(j);
			}
			for (int i = 0; i < ar.size(); i++) {
				for (int j = i + 1; j < ar.size(); j++) {
					if (Utility.anagram(ar.get(i), ar.get(j))) {
						obj.push(ar.get(i));
						obj.push(ar.get(j));
					}
				}
			}
			
obj.display();		
	}

}
