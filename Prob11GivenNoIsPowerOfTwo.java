package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*"Check the given number is power of 2.
Ex:
Input : 100 
ouput: False (not power of 2)
Input: 4
Ouput: True (2 power 2 is 4)
*/
public class Prob11GivenNoIsPowerOfTwo {

	public boolean solution(int input) {

		int n2 = (int) Math.floor(input / 2); int n1=0;
		int power = n2 * n2;
		if(power==input) {
			return true;
		}
		while (power >= input) {
			n1 = (int) Math.floor(n2 / 2);
			n2=n1;
			power = n1 * n1;
			if(power==input)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob11GivenNoIsPowerOfTwo obj = new Prob11GivenNoIsPowerOfTwo();
		boolean output = obj.solution(16);
		System.out.println("output: " + output);
	}

}
