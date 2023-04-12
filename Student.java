import java.io.Serializable;

public class Student extends Member implements Serializable {
	static int counter = 202200000;
	
	String dept = null;
	
	Student(String name, String dept) {
		super(name, ++counter);
		this.dept = dept;						
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("학번:"+super.number);
		System.out.println("학과:"+this.dept);
		System.out.println();
	}
}
