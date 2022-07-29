package practise;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("enter float number");
		float f1 =s.nextFloat();
		System.out.println("float value :"+ f1);
		
		System.out.println("enter float number");
		float f2 = s.nextFloat();
		System.out.println("float value :"+f2);
		
		float f3= f1*f2 ;
		System.out.println("value ="+f3);
		
		s.close();
		
	}

}
