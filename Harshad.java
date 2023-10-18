package Basics;
public class Harshad {

	public static void main(String[] args) {
		
		
		int num=156;
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
			if(temp%sum==0) {
				System.out.println(temp+ " is harshad number");
		
			}
			else {
				System.out.println(temp+ " is not harshad number");
			}
  }
}