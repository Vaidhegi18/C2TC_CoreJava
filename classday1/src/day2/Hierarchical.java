package day2;
//Hierarchical inheritance
class parent1
{
	void display() {
		System.out.println("parent class");
	}
}
class child1 extends parent1  //c1 extends parent class
{
	void show()
	{
		System.out.println("child 1");
	}
}
class child2 extends parent1    //c2 extends parent class
{
	void print()
	{
		System.out.println("child 2");     //but c1 does not extends from c2 class 
		                                   // these are only access from parent class
	}
}
public class Hierarchical {
	public static void main(String args[]) {
		child1 c1 = new child1();
		 c1.display();
		 c1.show();
		  
	}
	 
	

}
