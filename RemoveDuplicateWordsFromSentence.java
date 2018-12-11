package com.demo.codilitytest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Remove the duplicate words from the given Sentence.
Ex:
Input: Good day day bye bye 
output: Good day bye
*/
public class RemoveDuplicateWordsFromSentence {

	static public StringBuilder solution(String st) {
		String[] st1=st.split(" ");
		
		Set<String> setObj=new HashSet<>();
		for(String st2:st1) {
			setObj.add(st2);
		}
		StringBuilder sb = new StringBuilder();
		String[] array = setObj.stream().toArray(String[]::new);
		for(String str:array) {
			sb.append(str);
			
			sb.append(" ");
		}
		return sb;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		RemoveDuplicateWordsFromSentence obj = new RemoveDuplicateWordsFromSentence();
		StringBuilder sent = obj.solution("Good day day bye bye");
		System.out.println("new string after removal: " + sent);
	}

}
