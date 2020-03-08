import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_04 {

	public static void main(String[] args) {
		// Stu_info class와 연결되어있음 
		
		Vector<Stu_info> list = new Vector<Stu_info>();
		String[] title = { "학번", "이름", "학과", "학년", "전화" };
		
//		String[] name = { "홍길동","이순신", "홍길동"};
//		String[] major = { "컴공과","영문과", "문정과" };
//		int[] grade = {1, 2, 2};
//		String[] tell = {"02-1666-7777", "010-1111-1111", "010-2222-2222" };
//		list.add(new Stu_info(name[0], major[0], grade[0], tell[0]));
//		list.add(new Stu_info(name[1], major[1], grade[1], tell[1]));
//		list.add(new Stu_info(name[2], major[2], grade[2], tell[2]));
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1) 학생정보입력, 2) 출력, 3) 검색");
			System.out.print("원하는 번호를 입력해 주세요.");
			int num = scan.nextInt();
			scan.nextLine();
			switch (num) {
				case 1:
					while(true) {
						System.out.println("이름을 입력하세요.(이전화면: 99) : ");
						String name1 = scan.nextLine();
						if(name1.equals("99")) {
							System.out.println("이전화면으로 이동합니다.");
							break;
						}
						
						System.out.println("전공을 입력하세요 : ");
						String major1 = scan.nextLine();
						System.out.println("학년을 입력하세요 : ");
						int grade1 = scan.nextInt();
						scan.nextLine();
						System.out.println("전화번호를 입력하세요 : ");
						String tell1 = scan.nextLine();
						
						list.add(new Stu_info(name1, major1, grade1, tell1));
					}
										
					break;
					
				case 2:
					if(list.isEmpty()) {
						System.out.println("데이터가 없습니다.");
						break;
					}
					
					for(int i = 0; i < title.length; i++) {
						System.out.print(title[i] + "\t");
					}
					System.out.println();
					
					for(int i = 0; i < list.size(); i++) {
						Stu_info stu = new Stu_info();
						stu = (Stu_info)list.get(i);
						
						System.out.print(stu.hak_num + "\t");
						System.out.print(stu.name + "\t");
						System.out.print(stu.major + "\t");
						System.out.print(stu.grade + "\t");
						System.out.print(stu.tell + "\t");
						System.out.println();
					}
					
					break;
					
				case 3:
					while(true) {
						System.out.print("검색을 이름을 입력해 주세요.(이전화면 : 99) : ");
						String name2 = scan.nextLine();
						if(name2.equals("99")) {
							System.out.println("이전화면으로 이동합니다.");
							break;
						}
						
						System.out.println("찾는 학생은 ");
						
						for(int i = 0; i < title.length; i++) {
							System.out.print(title[i] + "\t");
						}
						System.out.println();
						
						boolean check = false;
						for(int i = 0; i < list.size(); i++) {
							Stu_info stu = (Stu_info)list.get(i);
							if(name2.equals(stu.name)) {
								
								System.out.print(stu.hak_num + "\t");
								System.out.print(stu.name + "\t");
								System.out.print(stu.major + "\t");
								System.out.print(stu.grade + "\t");
								System.out.print(stu.tell + "\t");
								System.out.println();
								
								check = true;
							}
						}
						
						if(check == false) {
							System.out.println("찾는 학생이 없습니다.");
						}
						
					}
					
					break;
			}
		}
	}
}
