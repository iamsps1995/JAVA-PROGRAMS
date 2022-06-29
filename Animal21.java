// initialisation through method
 class Animal21 {
String colour ;
int age ;


void insthmet(String s , int i) {
	colour= s ;
	age = i ;
}
void display ()
{
	System.out.println(colour+"  "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Animal21 buzo = new Animal21();
          buzo.insthmet("black", 20);
          //buzo.insthmet("white", 10);
         
          buzo.display();
          
	}

}
