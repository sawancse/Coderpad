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
public class Prob6ReverseStringWithPreservingOrder {

	static public String solution(String input) {

		int length = input.length();
		if (length == 0)
			return "";

		String st[] = input.split(" ");
		String reverse = "";
		for (String s : st) {
			char c[] = s.toCharArray();
			for (int k = c.length - 1; k >= 0; k--) {
				reverse += c[k];

			}
			reverse += " ";
		}

		return reverse;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob6ReverseStringWithPreservingOrder obj = new Prob6ReverseStringWithPreservingOrder();
		String output = obj.solution("abcd sawan 123119 $.");
		System.out.println("output: " + output);
	}

}
