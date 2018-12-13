package com.demo.codilitytest;

import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Write a program to find the second smallest number from a array of numbers recursively
*/
public class Prob8SecondSmallestNo_2 {

	public int solution(int[] input) {

		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		System.out.println("first: " + first);
		for (int i = 0; i < input.length; i++) {

			if (input[i] < first) {
				System.out.println("if condition...");
				second = first;
				first = input[i];
			} else {
				System.out.println("else condition...");
				if (input[i] < second && input[i] != first) {
					second = input[i];
				}
			}
		}
		if(second==Integer.MAX_VALUE) {
			System.out.println("There is no second smallest element");
		}else {
			System.out.println("the second smallest element: " + second);
			
		}
		return second;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Prob8SecondSmallestNo_2 obj = new Prob8SecondSmallestNo_2();
		int output = obj.solution(new int[] { 100, 500, 0, 4, 5, 9, 7, 8 });
		System.out.println("output: " + output);
	}

}
