// Largest digit

public class Largest{
	public static void main(String[] args){
		
		int num=565;
		int temp=0;
		int rem;
		
		while(num>0)
		{
			rem= num%10;
			
			if(rem>temp){
				temp=rem;
			}
			num=num/10;
		}
		System.out.println(temp);
	}
}
		
		
		
		