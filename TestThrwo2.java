package practise;
import java.util.Scanner;
public class TestThrwo2 {
	public static void votingAge(int age) {
		if (age < 18) {
			 throw new ArithmeticException("Person is not eligible to vote");    

		} else {
			System.out.println("Person is eligible to vote!!");  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter age");
		int n=s.nextInt();
         votingAge(n);
         s.close();
         System.out.println("successs");
	}

}
//throw works within the method and throws work along with methods
//throws exception works only with checked exception