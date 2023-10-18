package Basics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n=10;
		int fTerm=0;
		int secTerm=1;
		int nextTerm=0;
		
		System.out.print(fTerm+ " " + secTerm);
		
		for(int i=1;i<=10;i++)
		{
			nextTerm=fTerm+secTerm;
			System.out.print(" " + nextTerm);
			
			fTerm=secTerm;
			secTerm=nextTerm;
		}
	}
	

}
