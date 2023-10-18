package Basics;

public class Kap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=703;
		int square=num*num;
		int que=1;
		int rem;
		int sum=0;
		int d=10;
		int count=0;
		while(que>0)
		{
			rem=square%d;
			que=square/d;
			sum=que+rem;
			d=d*10;
			if(num==sum)
			count++;
		}
		if(count==1)
			
		{
			System.out.println("kaprekar number");
		}
		else
		{
			 System.out.println("not kaprekar");
		}
		
		
	}

}
