package firstPackage;

public class MyTime extends MyDate {
	private int hour, minute, second;

	public MyTime() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public MyTime(int y, int mo, int d, int h, int mi, int s) {
		super(y, mo, d);
		this.hour = h;
		this.minute = mi;
		this.second = s;
	}

	public MyTime(MyTime time, MyDate date) {
		super(date);
		this.hour = time.hour;
		this.minute = time.minute;
		this.second = time.second;
	}

	public void increaseSecond() {
		this.second++;
		if (this.second >= 60) {
			this.second = 0;
			increaseMinute();
		}
	}

	public void increaseMinute() {
		this.minute++;
		if (this.minute >= 60) {
			this.minute = 0;
			increaseHour();
		}
	}

	public void increaseHour() {
		this.hour++;
		if (this.hour >= 24) {
			this.hour = 0;
			super.increaseDay();
		}
	}

	public String stringTime() {
		return super.stringDate() + " " + this.hour + ":" + this.minute + ":" + this.second;
	}

	public void printTime() {
		System.out.println(stringTime());
	}
}
