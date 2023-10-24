
// Display total marks and average
public class Marks{
	public static void main(String[] args)
	{
		int s1,s2,s3,s4,s5,s6,totalMarksObt,average;
		
		s1=95;
		s2=90;
		s3=85;
		s4=80;
		s5=75;
		s6=70;
		
		totalMarksObt=s1+s2+s3+s4+s5+s6;
		System.out.println("Total marks obtained are: "+totalMarksObt);
		
		average=totalMarksObt/6;
		System.out.println("The Average is: "+average);
	}
}