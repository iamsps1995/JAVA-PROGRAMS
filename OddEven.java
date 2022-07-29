package practise;
import java.util.Scanner;
//Java Program to Check if Given Integer is Odd or Even
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter any number ");
		int i = s.nextInt();
		
		if (i%2==0) {
			System.out.println("number is even");
		
		}
		else {
			System.out.println("number is odd");
		}
		
		s.close();

	}

}
