import java.util.Scanner;

public class Main {
	
	static Scanner scn;	
	static MemberManager mm = new MemberManager();

	public static void main(String[] args) {
		
		load();
		scn = new Scanner(System.in);
		
		while(true) {
		
			printMenu();
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1:
				signUp();
				break;
			case 2:
				viewAllInfo();
				break;
			case 3:
				signOut();
				break;
			case 4:
				save();
				break;
			case 5:
				System.out.println("안녕히 가십시요~");
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;			
			}		
		}		
	}
	
	static void printMenu() {//메뉴출력 기능
		System.out.println();
		System.out.println("1.회원가입");
		System.out.println("2.조회");
		System.out.println("3.탈퇴");
		System.out.println("4.저장하기");
		System.out.println("5.종료");
		System.out.print("* 메뉴를 선택하세요:");		
	}
	
	static void signUp() { //회원가입 기능
		System.out.print("신분을 선택하시오 1:학생, 2:교수");
		int st = scn.nextInt();
		
		switch(st) {
		case 1 :
			signUpStudent();
			break;
		case 2:
			signUpProfessor();
			break;
		default :
			System.out.print("잘못 선택하셨습니다.");
		
		}
	}
	
	private static void signUpProfessor() {
		System.out.print("이름: ");
		String name = scn.next();
		System.out.print("연구실: ");
		String roomNo = scn.next();
		
		mm.signUpProfessor(name, roomNo);		
	}

	private static void signUpStudent() {
		System.out.print("이름 :");
		String name = scn.next();
		System.out.print("학과 :");
		String dept = scn.next();
		
		mm.signUpStudent(name, dept);
	}

	static void viewAllInfo() { //조회기능
		mm.viewAllInfo();
	}
	
	static void signOut() { //탈퇴
		System.out.println("탈퇴할 분의 학번 또는 교번을 입력하세요:");
		int sn = scn.nextInt();	
		mm.signOut(sn);
	}
	
	static void save() { //저장하기
		mm.save();
	}
	
	static void load() {
		mm.load();
	}
}






