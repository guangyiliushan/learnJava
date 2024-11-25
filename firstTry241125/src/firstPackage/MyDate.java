package firstPackage;

public class MyDate{
	private int year,month,day;
	public MyDate() {
		this.day=1;
		this.month=1;
		this.year=1970;
	}
	public MyDate(int y,int m,int d) {
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public MyDate(MyDate date) {
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	public boolean isLeapYear(MyDate d) {
		return d.year%400==0||(d.year%100!=0 && d.year%4==0);
	}
	
	public int maxDayOfMonth(MyDate d) {
		switch (d.month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			return 31;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			return 30;
		}
		case 2:{
			return isLeapYear(d)?29:28;
		}
		default:
			return -1;
		}
	}
	
	public void increaseDay() {
		this.day++;
		if(this.day>maxDayOfMonth(this)) {
			day=1;
			increaseMonth();
		}
	}
	
	public void increaseMonth() {
		this.month++;
		if(this.month>12) {
			this.month=1;
			increaseYear();
		}
	}
	
	public void increaseYear() {
		this.year++;
	}
	public String stringDate() {
		return this.year+"年"+this.month+"月"+this.day+"日";
	}
	
}
