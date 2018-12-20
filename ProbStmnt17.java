package com.demo.codilitytest.real;

import java.security.InvalidParameterException;

public class ProbStmnt17 {

	static int count = 0;

	static int makeArrC(int[] aa, int length) {

		if (aa.length == 0)
			throw new InvalidParameterException("input is invalid");

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {
				if (j > i) {

					if (aa[i] == aa[j]) {
						count++;
						System.out.println("(" + i + "," + j + ")");
					} else if (count > 1000000000) {
						return 1000000000;
					}
				}
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 3, 5, 6, 3, 3, 5 };
		System.out.println("output: " + ProbStmnt17.makeArrC(a, a.length));
	}

}
