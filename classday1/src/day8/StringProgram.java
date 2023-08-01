package day8;

public class StringProgram {

	public static void main(String[] args) {
		 String str1 = "Tamil";
		 String str2="Nadu";

		 char[] ch = {'v','a','i','d','h','e','g','i'};
		 System.out.println(ch);
		 
		 System.out.println("UpperCase method :" + str1.toUpperCase());   
		 System.out.println("LowerCase method : " + str2.toLowerCase());
		  System.out.println("empty is :"+str1.isEmpty());
		  System.out.println("SubString  is " +str2.substring(2));
		  System.out.println("Concat is :" +str1.concat(str2));
		  System.out.println("Length is :"+str1.length());
		  System.out.println("compare is :"+str1.compareTo(str2));
		  System.out.println(str2.hashCode());
		 


	}

}
