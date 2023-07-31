package day2;

public class SwitchCase {

	public static void main(String[] args) {
		
		 int name = 5;  //this will be used to find name five
		 switch(name) {  
		 case 1:
		 System.out.println("vaidhegi");
		 break;//java code will be reach break keyword, it breaks out of the switch block.
		 case 2:
		 System.out.println("selva");
		 break;
		 case 3:
			 System.out.println("keerthi");
			 break;
		 case 4:
			 System.out.println("riya");
			 break;
		 case 5:
			 System.out.println("AK");
			 break;
			 default:
				 System.out.println("switch case ended");  //this method will be used  to print default case
				          // like if you have case 6 , it does not in this method it will print default
				 
		 }

	}

}
