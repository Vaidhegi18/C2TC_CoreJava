package day3;
class ABCDE{
	int num1;
	int num2;
	int result;
	ABCDE(int a,int b){         //parameterized constructor = the value will be store in ()     
         num1 = a;
         num2 = b;
         result = num1 + num2;
	}
          void display() {
                 System.out.println("result :"+result);

   }
}
public class ParaConstructor {

	public static void main(String[] args) {

		ABCDE obj= new ABCDE(40,30);
		obj.display();

	}

}
 