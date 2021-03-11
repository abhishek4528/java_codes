import java.util.Scanner;

public class Season_activity_informer {

	public static void main(String[] args) {
		System.out.println("Enter the Month number(eg-1,2,3 - where 1 denotes january)");
		Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	String res;
		
	res = (n==3||n==4||n==5) ? "Spring-Season(Vasant Ritu)\n"   : 
          (n==6||n==7||n==8)?  "Summer-Season(Grishma Ritu)\n"  :      //using ternary operator.
          (n==9||n==10||n==11)?"Autumn Season(Sharad Ritu)\n"   :
          (n==12||n==1||n==2)? "Winter Season(Shishir Ritu)\n"  : "No result\n";
		
    String decision = s.nextLine();
    
	System.out.print(res);
	
	
	if(decision=="N"||decision=="n")
       {
    	System.exit(0); 
       }
       else
       {
    	   System.out.println("Do you want to Quit (Enter -> n/N");
    	   main(null);
       }
    	   
	}
}
