package helloproject;

public class Person {
	public String fname;
	public String lname;
	public Person(String first, String last) {
		fname=first;
		lname=last;
	}

	public void print() {
		System.out.print(fname + " " + lname + "\n");
	}
}
