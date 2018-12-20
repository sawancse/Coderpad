import java.awt.List;
import java.util.ArrayList;

public class BinaryGap4 {
	
	public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println("binary is: " + binary);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') {
            i--;
        }
        int gap = 0;
        int counter = 0;
        for(; i>=0; i--) {
            if(binary.charAt(i)=='1') {
                gap = Math.max(gap, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        gap = Math.max(gap, counter);
        return gap;
    }
	public static void main(String[] args) {
		BinaryGap4 obj=new BinaryGap4();
		System.out.println("binary gap is: " + obj.solution(20));
	}
}