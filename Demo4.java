import java.util.Arrays;

public class Demo4 {

	static public int solution(int[] A) {
	  int N=A.length;
	    int min_avg = Integer.MAX_VALUE; int sum=0; int min=0;int temp=0; int node=0;
	    int[] arrNew=new int[N];
	    for (int i = 0; i < A.length; i++) {
	    	sum=A[i];
	       for(int j=i+1;j<A.length;j++) {
	    	   sum+=A[j];
	    	   System.out.println("sum: " + sum);
	    	   if(A[i]<sum) {
	    		   min=A[i];
	    	   }
	    	   else {
	    		   min=sum;
	    	   }
	    	   
	       }
	       arrNew[i]=min;
	    }
	    for(int k=0;k< arrNew.length;k++) {
	    	min=arrNew[k];
	    	if(min>arrNew[k+1])
	    	{
	    		min=arrNew[k+1];
	    	}
	    	System.out.println("min: " + min);
	    }
	    return min;
	}
	 
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Demo4 obj = new Demo4();
		int arr[] = { 100, 4, 1, 3, 9, 10 };
		int min = obj.solution(arr);
		System.out.println("min:-== " + min);
	}

}
