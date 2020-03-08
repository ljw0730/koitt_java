import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_03 {

	public static void main(String[] args) {
		// Stu_info class와 연결되어있음 
		
		Vector<Stu_info> stu_info = new Vector<Stu_info>();
		String[] str = { "학번", "이름", "학과", "학년", "전화" };
		
		Scanner scan = new Scanner(System.in);
		
		int stu_count = 0;
		
		stu_info_input(stu_info, stu_count, scan);
		stu_info_print(stu_info, str);
	}
	
	static void stu_info_input(Vector<Stu_info> stu_info, int stu_count, Scanner scan) {
		String name = "";
		String major = "";
		int grade = 0;
		String tell = "";
		
		while(true) {
			if(stu_count == 2) {
				break;
			}
			
			System.out.print("이름을 입력해 주세요 : ");
			name = scan.nextLine();
			
			System.out.print("학과를 입력해 주세요 : ");
			major = scan.nextLine();
			
			System.out.print("학년을 입력해 주세요 : ");
			grade = scan.nextInt();
			scan.nextLine();
			
			System.out.print("전화번호를 입력해 주세요 : ");
			tell = scan.nextLine();
			
			stu_info.add(new Stu_info(name, major, grade, tell));
			
			System.out.println("1명의 학생정보가 입력완료 되었습니다.");
			
			stu_count++;
		}
	}

	static void stu_info_print(Vector<Stu_info> stu_info, String[] str) {
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < stu_info.size(); i++) {
			Stu_info s = new Stu_info();
			s = stu_info.get(i);
			
			System.out.print(s.hak_num + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.major + "\t");
			System.out.print(s.grade + "\t");
			System.out.print(s.tell + "\t");
			System.out.println();
		}
	}
}
