package day5;
class Country
{
String College;
void display()
{
System.out.println("India");
}
}
class State extends Country //sub class extends superclass
{ 
          String IFET;
          void show() {
           System.out.println("TamilNadu");

} 
}
class city extends State { //sub class extends superclass
 String gangarampalayam;
      void print() {
           System.out.println("Villupuram");

}                    //child class will be access from grandparent and parent 
                    //but parent class only access from grandparent
}

public class MultiLevel {
	public static void main(String args[]) {
		city c = new city();
		c.College = "ifet";        // access from super class by using extends 
		c.IFET = "college";           // this child class value
		System.out.println(c.College);
		System.out.println(c.IFET);
		c.display();
		c.show();
		}
		}


