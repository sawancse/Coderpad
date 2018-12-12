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
public class Prob6ReverseStringWithPreservingOrder_2 {

	public static String solution(String input) {

	    String[] words = input.split(" ");
	    String reversestr = "";

	    for(int i = words.length-1; i >= 0; i--){
	        if(i == words.length-1){
	            reversestr = reversestr + new StringBuffer(words[i]).reverse().toString();
	        }else{
	            reversestr = reversestr + " " + new StringBuffer(words[i]).reverse().toString();
	        }
	    }

	    return reversestr;
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob6ReverseStringWithPreservingOrder_2 obj = new Prob6ReverseStringWithPreservingOrder_2();
		String output = obj.solution("abcd sawan 123119  $.");
		System.out.println("output: " + output);
	}

}
