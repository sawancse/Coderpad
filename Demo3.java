
public class Demo3 {
	public int solution(int A[]) {
		int length=A.length;
		if(length==0)
			return -1;
		
		int min=0; int temp,sum=0;int j=0; int counter=0;
		for(int i=0;i<length;i++) {
			
			temp=A[i];
			System.out.println("temp: " + temp);
			while(j<length-1) {
				 j=counter++;
				sum=temp;
				sum+=A[j];
				min=Math.min(Math.abs(temp), Math.abs(sum));
				System.out.println("min: " + min);
				temp=min;
								
			}
			
			
			
		}
		return min;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Demo3 obj=new Demo3();
		int arr[]= {2,4,0,3,9,10};
		int min=obj.solution(arr);
		System.out.println("min: " + min);
	}

}
