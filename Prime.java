import java.util.Scanner;
public class Prime{
	
	
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	
	
     int count=0;
	 int num= sc.nextInt();
	 sc.close();
	  for(int i=2;i<num;i++)
	  {
	   if(num%i==0){
	   count++;
	   break;
	   }
	  }
		if (count == 0)
		{
			 System.out.println(num + " is prime");
		}
		else 
		{
			 System.out.println("not prime");
		}
	}
}