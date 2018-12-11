package com.demo.codilitytest;
/*Let A be a non-empty zero-indexed array consisting of N integers.
 * The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.
 * For example, the following array A:*/
public class Problem8{

	static public int solution(int[] A) {
	  int N=A.length;
	     int sum=0; int min=0;
	    int[] arrNew=new int[N];
	    for (int i = 0; i < A.length; i++) {
	    	sum=A[i];
	       for(int j=i;j<A.length;j++) {
	    	   sum+=A[j];
	    	   if(A[i]<sum) {
	    		   min=A[i];
	    	   }
	    	   else {
	    		   min=sum;
	    	   }
	    	   
	       }
	       arrNew[i]=min;
	    }
	    int min1=arrNew[0];
	    for(int k=1;k< arrNew.length;k++) {
	    	min=arrNew[k];
	    	if(min<min1)
	    	{
	    		min1=min;
	    	}
	    	
	    }
	    return min1;
	}
	 
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Problem8 obj = new Problem8();
		int arr[] = { 100, 4, 1, 1000, 9, 10 };
		int min = obj.solution(arr);
		System.out.println("min: " + min);
	}

}
