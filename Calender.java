public class Calender{
	public static void main(String[] args){
		int year,month,week,day;
		int rem1,rem2,rem3;
		int InputDays=1001;
		
		year=InputDays/365;
		rem1=InputDays%365;
		
		month=rem1/30;
		rem2=rem1%30;
		
		week=rem2/7;
		day=rem2%7;
		
		System.out.println(year+" year "+month+" months "+week+" weeks "+day+" days ");
	}
}