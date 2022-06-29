
public class Animal {
	public void eat(){
		System.out.println("eating");
	}

	public static void main(String[] args) {
		
		System.out.println("1");
              Animal buzo= new Animal();
              buzo.eat();
              buzo.run();
              Birds b1=new Birds();
              b1.fly();
              
	}
    public void run(){
    	System.out.println("running");
    }
    
}

class Birds{
	void fly() {
		System.out.println("flying");
	}
}