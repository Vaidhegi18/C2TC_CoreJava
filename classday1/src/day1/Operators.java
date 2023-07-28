package day1;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value :");
		int t = s.nextInt();
		System.out.println("enter b value :");
		int f = s.nextInt();
		System.out.println("add value is :"+(t+f)); // arithmetic operator
		System.out.println("sub value is :"+(t-f));
		System.out.println("mul value is :"+(t*f));
		if(t<=f) {      //relational operator [<,>,<=,>=,==,!=]
			
			System.out.println("true"); //true or false [boolean]
		}
		else {
			System.out.println("false");
		}
		s.close();
	 
		 
		int a,b,c;
		a=7;
		b=5;
        c=a&b;  //bitwise operator [&,/,^,~]
        
		System.out.println("bitwise op is:"+ c);	
		a=a++;  //increment op [post increment]
		
		b=++b;   //[pre increment]
		
		System.out.println("incrrement op is :"+b);
		 a=a>>4;  //shift operator
		
		System.out.println("right shift is :"+a);
			
		}
		}
	



