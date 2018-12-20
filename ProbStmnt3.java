package com.demo.codilitytest.real;

import java.security.InvalidParameterException;

public class ProbStmnt3 {

	static double c[];
	static int count=0;
	static int makeArrC(int[] aa,int[] bb,int length) {
		c=new double[length];
		
		if(aa.length==0 || bb.length==0)
			throw new InvalidParameterException("input is invalid");
		
		for(int i=0;i<length;i++) {
			
				c[i]=aa[i]+(double)bb[i]/1000000;
			
		}
		for(double c1:c) {
			System.out.println("c: " + c1);
		}
		for(int j=0;j<c.length;j++) {
			for(int k=j+1;k<c.length;k++) {
				double cMul=c[j]*c[k];
				double cAdd=c[j]+c[k];
				
				if(cMul >= cAdd ) {
					count++;
					System.out.println("(" + j + "," + k + ")");
				}else if(count>1000000000) {
					return 1000000000;
				}
			}
		}
		return count;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {0,1,2,2,3,5};
		int b[]=new int[] {500000,500000,0,0,0,20000};
		System.out.println("output: " + ProbStmnt3.makeArrC(a,b,a.length));
	}

}
