package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*"Print all perfect numbers between 1 to 100.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
For example: 6 is the first perfect number
Proper divisors of 6 are 1, 2, 3
Sum of its proper divisors = 1 + 2 + 3 = 6.
Hence 6 is a perfect number."
49 
*/
public class Prob14PerfectNo {
	
	public void solution(int input) {
		int divisor[]=new int[input];
		divisor[0]=1; int sum=1; int temp=0;
		for(int i=2 ;i<input;i++) {
			if(input%i==0) {
				divisor[i-1]=i;
			}
		}
		for(int i=0 ;i<divisor.length;i++) {
			if(divisor[i]!=0) {
				sum=temp+divisor[i];
				temp=sum;
				if(sum==input) {
					int j=i;
					for(int k=0;k<j+1;k++) {
						System.out.println("perfectNo: " + divisor[k]);	
					}
					
				}
			}
			
			
		}
		
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob14PerfectNo obj = new Prob14PerfectNo();
		obj.solution(7);
	}

}
