package helloproject;

public class Student extends Person {
	public String stclass;
	public int stid;
	public Student (String fname, String lname, String _class, int id) {
		super(fname, lname);
		stclass=_class;
		stid=id;
	}
	public void print() {
		super.print();
		System.out.print("Student ID: " + stid + "\n" + "Class: " + stclass);
	}
}
