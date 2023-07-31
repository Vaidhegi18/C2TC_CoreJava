package day1;
import java.util.Scanner;    //input get from user using scanner
public class DataTypes {
		    public static void main(String[] args) {
		         Scanner scanner = new Scanner(System.in);
		         System.out.println("enter string val :");
		         String strval = scanner.nextLine();
		         System.out.println("int val :");
		         int intval = scanner.nextInt();   //non primitive data types = int,float,double,long,short,boolean.
		         
		         System.out.println("enter boolean val :");
		         boolean boolval = scanner.nextBoolean();
		         System.out.println("enter double val :");
		         double doubleval = scanner.nextDouble();
		         System.out.println("enter float val :");
		         float floatval = scanner.nextFloat();
		         
		         System.out.println("str val is :" +strval);
		         System.out.println("\nint val is :" +intval);
		          System.out.println("\nbool val is :" +boolval);
		           System.out.println("\ndouble val is :" +doubleval);
		           System.out.println("float val is :" +floatval);
		         scanner.close();
		    }
		}

       