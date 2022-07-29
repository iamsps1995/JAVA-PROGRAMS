package practise;
//Java program to demonstrate working of Scanner in Java
import java.util.Scanner;
 public class Scanner1{
	 public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
		 
		 System.out.println("enter string ");
		 String st = sc.nextLine();
		 System.out.println("String is :"+ st);
		 
		 System.out.println("enter int");
		 int i = sc.nextInt();
		 System.out.println("int number is :" +i);
		 
		 System.out.println("enter float");
		 float f = sc.nextFloat();
		 System.out.println("float number is :"+f);
		 
		 sc.close();
	 }
	 
 }
 
 