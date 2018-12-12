package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*"Find Reverse String With Preserving Order.
Ex:
  Input = abcd, output = dcba
  Input = I am Java Developer, Output  = r ep olev eDavajamI"
*/
public class Prob7Fibonacci {

	static public void solution(int input) {

		int n1 = 0, n2 = 1, n3=0, i, count = 10;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; ++i)// 
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

		

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob7Fibonacci obj = new Prob7Fibonacci();
		obj.solution(10);
	}

}
