import java.io.Serializable;

public class Member implements Serializable  {
	String name = null ;
	int number = 0; 
	
	public Member(String name, int number) {
		this.name = name;
		this.number = number;
	}

	void printAll() {
		System.out.println("이름:"+name);
//		System.out.println("번호:"+number);
	}
}
