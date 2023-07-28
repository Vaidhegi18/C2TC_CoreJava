package day2;
//multilevel inheritance 
class grandparent { //superclass
    int a;
    void display()
   {
	     System.out.println(" this is grand parent class");
   }
}
class superclass extends grandparent //sub class extends superclass
{  
   int b;
   void show() {
	System.out.println("this is parent class");

}	
}
class subclass extends superclass { //sub class extends superclass
    int c;
    void print() {
	System.out.println("this is child class");

}	   //child class will be access from grandparent and parent 
       //but parent class only access from grandparent
}

public class Multilevel {
public static void main(String args[]) {
	subclass c = new subclass();
	c.a = 20; // access from super class by using extends 
	c.b = 30; // this child class value
 
	System.out.println(c.a);
    System.out.println(c.b);
    
	c.display();
	c.show();
	 
}
}




