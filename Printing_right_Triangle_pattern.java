package java_training;

import java.util.Scanner;

public class Printing_right_Triangle_pattern {

	public static void main(String[] args) {
		int i,j;
	 System.out.print("Enter the pattern size");
	 Scanner obj = new Scanner(System.in);
	 
	         int n =obj.nextInt();
			for( i=0;i<n;i++)
	         {
	        	 for( j=0;j<=i;j++)
	        		 
	        	 {
	        		 System.out.print("*"); 
	        	 }
	        	 System.out.println(); 
	         }
		
			
	}
	
}
