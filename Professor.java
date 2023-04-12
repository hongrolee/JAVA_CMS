import java.io.Serializable;

public class Professor extends Member implements Serializable  {
	
	String roomNo = null;
	static int cnt = 202210000;
	
	public Professor(String name, String roomNo) {
		super(name, ++cnt);
		this.roomNo = roomNo;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("교번:"+super.number);
		System.out.println("연구실:"+this.roomNo);
		System.out.println();
	}
}
