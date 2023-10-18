package Basics;

public class Sum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=123;
         int sum=0;
         int rem=0;  
	     int count;
	while(num>0)
	{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	System.out.println(sum);

}
}
