public class Vaibhav{
	public static void main(String[] args){
	
		int num=156;
		int rem;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
		 rem = num%10;
		 sum = sum+rem;
		 num =num/10;
		}
		if(temp%sum==0)
		{
		 System.out.println("Harshad number");
		}
		else
		{
		 System.out.println("not harshad");
		}
	}
}