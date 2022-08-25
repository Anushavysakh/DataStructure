package com.datastructure.bridgelabz;

public class PrimeArray2D {

	
	public static int[][] findPrimesInRange(int[][] arrayOfPrimes) {

		arrayOfPrimes = new int[10][100];
		int n = 2;
		int columnIndexOfArray = 0;

		for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
			for (int columnIndex = 0; columnIndex < 100 && n < ((rowIndex + 1) * 100); columnIndex++) {
				if (Utility.isPrime(n)) {
					arrayOfPrimes[rowIndex][columnIndexOfArray] = n;
					columnIndexOfArray++;
				}
				n++;
			}
			columnIndexOfArray = 0;
		}

		return arrayOfPrimes;
	}

	public static void main(String[] args) {

		System.out.println("Prime numbers between 0-1000 : ");
		int twoDArrayOfPrimes[][] = {};
		twoDArrayOfPrimes = findPrimesInRange(twoDArrayOfPrimes);

		for (int rowIndex = 0; rowIndex < twoDArrayOfPrimes.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < twoDArrayOfPrimes[rowIndex].length; columnIndex++) {
				if (twoDArrayOfPrimes[rowIndex][columnIndex] != 0) {
					System.out.print(twoDArrayOfPrimes[rowIndex][columnIndex] + " ");
				}
			}
			System.out.println();
		}
	}

}
