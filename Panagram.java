package com.demo.codilitytest;
/*Check the given String is Anagram or Not.*/
public class Panagram {

	static public boolean solution(String st) {
		
		String alphabets="abcdefghijklmnopqrstuvwxvj";
		for(Character i: alphabets.toCharArray()) {
			if(!st.contains(i.toString())){
				return false;
			}
		}
		
		return true;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Panagram obj = new Panagram();
		boolean bool = obj.solution("The quick brown x jumps over the lazy dog");
		System.out.println("is Panagram: " + bool);
	}

}
