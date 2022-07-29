package practise;
import java.io.FileOutputStream;
public class FileOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fos=new FileOutputStream("D:\\textout.txt");
	fos.write(543);
	fos.close();
	System.out.println("success");
} catch (Exception e) {
	System.out.println(e);
}//file handling from geekfromgeeks
	}

}

