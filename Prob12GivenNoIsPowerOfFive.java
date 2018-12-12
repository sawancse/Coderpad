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
public class Prob12GivenNoIsPowerOfFive {

	public boolean solution(int input) {

		int pow = 1; 
		if (input == 1) 
            return true; 
		
        while (pow < input) {
        	 pow = pow * 5; 
        	  
             return (pow == input); 
             
        }
           

		return false;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob12GivenNoIsPowerOfFive obj = new Prob12GivenNoIsPowerOfFive();
		boolean output = obj.solution(25);
		System.out.println("output: " + output);
	}

}
