package day5;
//Hierarchical inheritance
	class College
	{
		String a;
	void display() {
	System.out.println("IFET colege of engineering");
	}
	}
	class student extends College //c1 extends parent class
	{
		String b;
	void show()
	{
	System.out.println("student name");
	}
	}
	class employee extends College //c2 extends parent class
	{
		String c;
	void print()
	{
	System.out.println("employee name");    //but c1 does not extends from c2 class 
	                                        // these are only access from parent class
	}
	}
public class Hierarchical {
	public static void main(String args[]) {
		student obj1 = new student();
		obj1.display();
		obj1.show();
		 
		}
}

	 