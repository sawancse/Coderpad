package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*"How to find is power of 10
Ex:
Input : 100 
ouput: True (because 10 power 2 is 100)
Input: 80
Ouput: false (not power of 10)
*/
public class Prob10PowerOfTen {

	public boolean solution(int input) {
		
		int div=(int) Math.floor(input/10);
		int n1=10,n2=10;
		for(int i=2;i<=div;i++) {
			
			int power=n1*n2;
			n1=power;
			if(power==input) {
				return true;
			}
			
				
		}
		
		return false;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob10PowerOfTen obj = new Prob10PowerOfTen();
		boolean output = obj.solution(200);
		System.out.println("output: " + output);
	}

}
