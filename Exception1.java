package practise;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int i = 10;
        	int j =i % 0 ;
		System.out.println(j);	
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
