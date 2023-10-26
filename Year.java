public class Year{
	public static void main(String[] args){
		
		int numOfDays=376;
		System.out.println("The no of days are: "+numOfDays);
		
		int year = numOfDays/365;
		System.out.println("Year: "+year);
		
		int rem1 = numOfDays%365;
		
		int month = rem1/30;
		System.out.println("month: "+month);
		
		int rem2 = rem1%30;
		
		int week =rem2/7;
		System.out.println("week: "+week);
		
		int days = rem2%7;
		
		System.out.println("days: "+days);
	}
}
		
		