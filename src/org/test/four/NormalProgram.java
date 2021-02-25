package org.test.four;

public class NormalProgram {

	public static void main(String[] args) {

		// datatypes var[][] = new datatypes[rowSize][columnSize];
		int a[][] = new int[2][3]; // we can store 5 integer value in a single refName of "a"
		a[0][0] = 10;
		a[0][1] = 20; // } a[0]
		a[0][2] = 30;

		a[1][0] = 40;
		a[1][1] = 50; // } a[1]
		a[1][2] = 60;

		// to get particular value in the array

		System.out.println(a[0][2]);

		// Normal forloop
		for (int i = 0; i < 2; i++) { // outer forloop for ----> row
			for (int j = 0; j < 3; j++) { // inner forloop for ----> column
				System.out.println("a[" + i + "][" + j + "] value is : " + a[i][j]);
			}
		}

		// enhanced forloop
		for (int[] l : a) {
			for (int x : l) {
				System.out.println(x);
			}
		}

		System.out.println("*******Enhanced forloop*********");
		for (int x[] : a) {
			for (int k : x) {
				System.out.println(k);
			}
		}

	}
}
