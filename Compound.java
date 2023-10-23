// Calculate compound interest
import java.lang.Math.*;
public class Compound{
	public static void main(String[] args){
		
		int p = 10000;
		float r=0.05f;
		int n = 12;
		int t =3;
		
		// A=p(1+(r/n))^ (n*t)
		
		double fPart = (1+(r/n));
		int sPart = (n*t);
		
		float amount=(float) (p * Math.pow(fPart,sPart));
		System.out.println("Amount is: "+amount);
	}
}