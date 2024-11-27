package dateAndTime;

public class MyDateAndTime {

	public static void main(String[] args) {
		MyTime t = new MyTime(2024, 12, 31, 23, 59, 59);
		t.printTime();
		t.increaseSecond();
		t.printTime();
	}
}
