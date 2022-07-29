package practise;

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      // code that generates exception
		      int divideByZero = 5 / 0;
		      System.out.println(divideByZero);
		    }

		    catch (ArithmeticException e) {
		      e.printStackTrace();
		    }
		    
		    finally {
		      System.out.println("This is the finally block");
		    }
	}

}
