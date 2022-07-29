package practise;
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

public class FileCre {
	public static void main(String[] args)
	{

		try {
			File Obj = new File("D:\\myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
