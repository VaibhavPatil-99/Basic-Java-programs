// palindrome number or not
public class Palindrome{
	public static void main(String[] args){
		
		int num = 53131;
		int rem,sum=0;
		int num1=num;
		
		while(num1 !=0)
		{
			 rem = num1%10;
			 sum = sum*10+rem;
			 num1 = num1/10;
			 
		}
		 if(num==sum)
		 {
			  System.out.println("palindrome");
		 }
		  else
		  {
			   System.out.println("not palindrome");
		  }
	}
}