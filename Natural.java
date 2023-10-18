package Basics;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=36;
       int sum=0;
       
       for(int i=1;i<num;i++) {
    	   if(num%i==0) {
    		   sum=sum+i;
    		   
    	   }
       }
       System.out.println(sum);
    	   
	}

}
