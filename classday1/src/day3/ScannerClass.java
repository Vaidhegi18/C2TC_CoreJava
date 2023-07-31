package day3;
import java.util.Scanner;     
  //Scanner class will be used to get input from user
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yr name :");
		String name = sc.nextLine();
		System.out.println("Enter yr age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter yr email address :");
		String email = sc.nextLine();
		System.out.println("Enter yr phone no :");
		int phone = sc.nextInt();
		 
		System.out.println("yr name is :"+name);
		System.out.println("yr age is :"+age);
		System.out.println("yr email address is :"+email);
		System.out.println("yr phon  no is :"+phone);
	
	}

}
