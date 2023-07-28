package day2;
//SINGLE LEVEL INHERITANCE

class parent { //superclass
     int a;
     void display()
    {
	     System.out.println("This is a SuperClass");
    }
}
  class child extends parent { //sub class extends superclass
     int b;
     void show() {
	System.out.println("This is a SubClass");
}
}
public class Inheritance {  //main class
	public static void main(String args[]) {
		child c = new child();
		c.a = 20; // access from parent class by using extends 
		c.b = 30;   // this child class value
		System.out.println(c.a);
	    System.out.println(c.b);
		c.display();
		c.show();
	}
}

