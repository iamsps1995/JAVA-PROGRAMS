package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

 class TestClass {

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		String text = "this is demo ";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
		
	}
}

class Throws21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		//here we are handling above exception in try and catch block
		try {
			tc.readFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			tc.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			
		}
		System.out.println("hello");
	}
}
