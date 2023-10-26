public class Triangle{
	public static void main(String[] args)
	{
	 int side1=50; int side2=10; int side3=20;
	 
	 if (side1==side2 && side2==side3)
	 { 
	  System.out.println("The triangle is equilateral triangle");
	 }
	 else if(side1==side2 || side2==side3 || side1==side3)
	 {
	  System.out.println("The triangle is Isoscales triangle");
	 }
	 else
	 {
	  System.out.println("The triangle is scalens triangle");
	 }
	}
}
	 