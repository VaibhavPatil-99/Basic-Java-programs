import java.lang.Math.*;
class Nested{
	public static void main(String[] args){
	
	int num=-10;
	
	if(num>0)
	{
	 System.out.println(num+ " is positive number" );
	 if(num%2==0)
	 {
	  System.out.println(num+ "is even");
	 }
	 else 
	 {
	  System.out.println(num+ "is odd");
	 }
	}
	else if(num<0)
	{
	 System.out.println(num+ "is negative number");
	}
	else 
	{
	 System.out.println(num+ "is zero");
	}
	}
	}