package com.oops;
import practise.Dog;
public class Person {
	 
	
	    public void play() {
	        Dog dog = new Dog();
	        dog.waveTail(); // COMPILE ERROR!
	    }
	}
/*package animal;

public class Dog {
   protected void waveTail() {
       System.out.print("Waving my tail...");
   }
}*/

//showing error because in Dog class method is private
//but dont show error if we make subclass like in Hound.java