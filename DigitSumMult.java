import java.util.Scanner;
public class DigitSumMult {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sum = 0, mult = 1;
		
		System.out.println("num 1 :");

		System.out.println("num 2 :");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();

        if(b>a) {
        	
        	for(int i = a+1; i < b ; i++ ) {
        		
        		sum = sum + i;
        		
        		mult = mult * i;
        		
        	}
        	 System.out.println("Sum of digits :"+sum+ " mult of digits :"+mult);
        }
        	else
        	{
        		System.out.println("error....");
        		
        	}
       
	}

}
