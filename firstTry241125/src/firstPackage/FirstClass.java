package firstPackage;

public class FirstClass {
	public static void main(String[] args) {
		System.out.println("Hello World");
		MyTime t=new MyTime();
		t.printTime();
		t=new MyTime(2024,11,30,10,30,59);
		t.printTime();
		t.increaseSecond();
		t.printTime();
		t.increaseDay();
		t.printTime();
	}
}
