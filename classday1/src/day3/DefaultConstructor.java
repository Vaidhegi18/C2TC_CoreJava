package day3;

class ABCD{
	int num1;
	int num2;
	int result;

ABCD(){           //default constructor = class name and constructor name will be same
                  //no return type
	
	num1 = 50;
	num2 = 20;
	result = num1+num2;
}
	void display() {
		System.out.println("result :"+result);
		
	}
}
	 
public class DefaultConstructor {

	public static void main(String[] args) {
		ABCD obj= new ABCD();
		obj.display();

	}

}
