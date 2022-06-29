//Initialization through reference

class Student12{
	int id ;
	String name ;
	
}
 class TestStudent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student12 s12= new Student12();
		Student12 s21=new Student12();
		s12.id=101;
		s12.name="Prince";
		s21.id=102;
		s21.name="Shailesh";
		System.out.println(s12.id +" "+s12.name);
		System.out.println(s21.id +" "+s21.name);

	}

}
