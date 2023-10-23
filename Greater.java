public class Greater{
	public static void main(String[] args)
	{
	 
	 int num1=50; int num2=40; int num3=10;
	 
	 if (num1>num2 && num1>num3)
	 { 
	  System.out.println(num1+ "The num1 is greater than num2 & num3");
	 }
	 else if (num2>num1 && num2>num3)
	 {
	  System.out.println(num3+ "The num2 is greater than num1 & num3");
	 }
	 else if (num3>num1 && num3>num2)
	 { 
	  System.out.println(num3+ "The num3 is greater than num1 & num2");
	 }
	 else
		 
		 {
			 System.out.println("The number is invalid");
		 }
	}
}