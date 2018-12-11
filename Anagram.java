package com.demo.codilitytest;
/*Check the given String is Anagram or Not.*/
public class Anagram {

	static public boolean solution(String st1,String st2) {
		
		int l1=st1.length();
		int l2=st2.length();
		int c=0;
		boolean bool[]=new boolean[l1];
		if(l1!=l2) {
			return false;
		}
		
		if(l1==l2) {
			for(Character i:st1.toCharArray()) {
				
				bool[c]=st2.contains(i.toString());
				if(bool[c] ==false)
					return false;
				c++;
			}
			System.out.println("bool 11: " + bool);
		
		}
		
		
		return true;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Anagram obj = new Anagram();
		boolean bool = obj.solution("The yes","They see");
		System.out.println("bool: " + bool);
	}

}
