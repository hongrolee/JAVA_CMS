
import java.util.ArrayList;

public class MemberManager {
	
	ArrayList<Member> members = new ArrayList<Member>();
	FileManager fm = new FileManager("data.txt");
	
	public void signUpProfessor(String name, String roomNo) {
		Professor p = new Professor (name, roomNo);
		members.add(p);
	}
	
	public void signUpStudent(String name, String dept) {
		Student student = new Student(name, dept);
		members.add(student);
	}
	
	public void viewAllInfo() {
		for(int i = 0; i < members.size(); i++) {
			members.get(i).printAll();
		}		
	}
	
	public void signOut(int sn) {
		for(int i=0; i<members.size(); i++) {
			if (sn==members.get(i).number) {
				System.out.println(members.get(i).name+"님을 탈퇴 완료하였습니다.");
				members.remove(i);
				break;
			}
		}
	}
	
	public void save() {		
		fm.save(members);
	}
	
	public void load() {
		members = (ArrayList<Member>)fm.load();
	}
}
