package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*"Find the weight of given String.
(A-Z/a-z) we have 26 alphabetic, consider the position of a-z alphabets as 1-26. Based on that find the weight of the given String.
Ex:
Given String: Apple
Output: 1+16+16+12+5 = 50"

*/
public class WeightOfAString {

	static public int solution(String st) {
		
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		char arr[]=alphabets.toCharArray();
		Map<Character,Integer> mapObj=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			mapObj.put(arr[i],i+1);
		}
		char inputChar[]=st.toCharArray();  Integer wt=0; int sum=0;
		for(int i=0;i<inputChar.length;i++) {
			char c=inputChar[i];
			wt=mapObj.get(Character.toLowerCase(c));
			if(wt!=null) {
				sum+=wt;
				wt=sum;
			}
			
		}
		return wt;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WeightOfAString obj = new WeightOfAString();
		int sent = obj.solution("apple");
		System.out.println("weight of a string: " + sent);
	}

}
