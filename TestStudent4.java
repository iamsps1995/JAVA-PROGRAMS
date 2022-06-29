//Initialization through method
class Student321{
	int roll ;
	String name;

void insrec(int i , String s) {
	roll  = i;
	String name = s; 
	
}
void displayinfo(){
	System.out.println(roll+" "+name); 
}
}
class TestStudent4 {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Student321 s1= new Student321();
		Student321 s2 = new Student321();
		  s2.insrec(222,"Aryan");  
          s1.insrec(111, "PRINCE");
		s1.displayinfo();
		s2.displayinfo();

	}

}
