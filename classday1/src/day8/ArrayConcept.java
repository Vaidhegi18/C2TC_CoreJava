package day8;

public class ArrayConcept {

	 public static void printArray(int c[][]) {
		 System.out.println("array concepts");
		 for(int i = 0;i<c.length;i++) {
			 for(int j = 0; j<c[i].length;j++)
				 System.out.println(c[i][j]+" ");
			 System.out.println();
		 }
	 }
}
