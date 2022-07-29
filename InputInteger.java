package practise;
import java.util.Scanner;
public class InputInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num ;
      System.out.println("Enter the number");
      Scanner s = new Scanner(System.in);
      num=s.nextInt();
      System.out.println("The number is :" + num);
      
      s.close();
	}

}
