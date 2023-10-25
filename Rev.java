// reverse number
public class Rev{
 public static void main(String[] args){
   
   int rem=0;
   int num=12345;
   int sum=0;
   
   while(num>0)
   {
    rem=num%10;
	sum=sum*10+rem;
	num=num/10;
}
 System.out.println(sum);
 }
 }