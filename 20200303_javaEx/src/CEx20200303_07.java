import java.util.Scanner;
import java.util.Vector;

public class CEx20200303_07 {

	public static void main(String[] args) {
		// 1)학생정보입력, 2)학생성적입력,
		// 3)학생정보출력(모두 출력), 4)학생성적 출력(모두 출력)
		// 5)학생정보검색 - 학번, 이름검색 6)학생성적검색 - 학번, 이름검색
		// 1)학생정보입력 -> 학번, 이름, 과, 학년
		// 2)학생성적처리 -> 학번, 이름, 국어, 영어, 합계, 평균, 등수
		// 2)의 학번입력시 1)의 학번과 비교하여 있으면 성적추가 없으면 없다고 출력
		// 2)학번입력 시 이름 자동으로 입력
		// ArrayList로 작성
		
		Vector<Stu_info> info = new Vector<Stu_info>();
		String[] info_title = { "학번", "이름", "학과", "학년" };
		
		Vector<Stu_score> score = new Vector<Stu_score>();
		String[] score_title = { "학번", "이름", "국어", "영어", "합계", "평균", "등수" };
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			switch (select) {
				case 1:
					System.out.println("학생 정보 입력을 선택하셨습니다.");
					info_input(info, scan);
					
					break;
					
				case 2:
					System.out.println("학생 성적 입력을 선택하셨습니다.");
					score_input(info, score, info_title, scan);
										
					break;
					
				case 3:
					System.out.println("학생 정보 출력을 선택하셨습니다.");
					info_print(info, info_title);
					
					break;
					
				case 4:
					System.out.println("학생 정보 출력을 선택하셨습니다.");
					score_print(score, score_title);
					
					break;
					
				case 5:
					System.out.println("학생 정보 검색을 선택하셨습니다.");
					
					Loop2: while(true) {
						
						System.out.print("1. 학번 검색, 2. 이름 검색 / 999. 이전화면 : ");
						select = scan.nextInt();
						scan.nextLine();
						
						switch (select) {
						case 1:
							search_info_hak_num(info, info_title, scan);
							
							break;

						case 2:
							search_info_name(info, info_title, scan);
							
							break;
							
						case 999 :
							System.out.println("이전화면으로 이동합니다.");
							break Loop2;
						}
					}
					
					break;
					
				case 6:
					System.out.println("학생 성적 검색을 선택하셨습니다.");
					Loop3: while(true) {
						System.out.print("1. 학번 검색, 2. 이름 검색 / 999. 이전화면 : ");
						select = scan.nextInt();
						scan.nextLine();
						
						switch (select) {
						case 1:
							search_score_hak_num(score, score_title, scan);
							
							break;

						case 2:
							search_score_name(score, score_title, scan);
							
							break;
							
						case 999 :
							System.out.println("이전화면으로 이동합니다.");
							break Loop3;
						}
					}
					
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
			
		}
		
		
	} //main
	
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("===================================");
		System.out.println("[ 학생 정보/성적 관리 프로그램 ]");
		System.out.println(" 1. 학생 정보 입력");
		System.out.println(" 2. 학생 성적 입력");
		System.out.println(" 3. 학생 정보 출력");
		System.out.println(" 4. 학생 성적 출력");
		System.out.println(" 5. 학생 정보 검색");
		System.out.println(" 6. 학생 성적 검색");
		System.out.println(" 0. 종료");
		System.out.println("-----------------------------------");
		System.out.print("원하는 번호를 입력해 주세요 : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static void info_input(Vector<Stu_info> info, Scanner scan) {
		String name = "";
		String major = "";
		int grade = 0;
		
		while(true) {
			System.out.print("학생의 이름을 입력해 주세요.(이전화면 : 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
				break;
			}
			
			System.out.print(name + " 학생의 과를 입력해 주세요. : ");
			major = scan.nextLine();
			System.out.print(name + " 학생의 학년을 입력해 주세요. : ");
			grade = scan.nextInt();
			scan.nextLine();
			
			info.add(new Stu_info(name, major, grade));
			System.out.println(name + " 학생의 정보 입력이 완료 되었습니다.");
		}
	}
	
	static void score_input(Vector<Stu_info> info, Vector<Stu_score> score, String[] info_title, Scanner scan) {
		String name = "";
		int kor = 0;
		int eng = 0;
		
		while(true) {
			int scan_hak_num = 0;
			System.out.print("성적을 입력할 학생의 학번을 입력해 주세요. (이전화면 : 999) : ");
			scan_hak_num = scan.nextInt();
			scan.nextLine();
			if(scan_hak_num == 999) {
				break;
			}

			boolean check_hak_num = false;
			for(int i = 0; i < info.size(); i++) {
				Stu_info si = (Stu_info)info.get(i);
				if(si.hak_num == scan_hak_num) {
					info_title_print(info_title);
					info_print_sub(si);
					
					name = si.name;
					
					System.out.print(name + " 학생의 국어성적을 입력해 주세요 : ");
					kor = scan.nextInt();
					System.out.print(name + " 학생의 영어성적을 입력해 주세요 : ");
					eng = scan.nextInt();
					scan.nextLine();
					
					score.add(new Stu_score(scan_hak_num, name, kor, eng));
					
					check_hak_num = true;
				} //if
			}// for
			if(check_hak_num == false) {
				System.out.println("입력하신 학번의 학생이 없습니다. 다시 입력해 주세요.");
			}
			
		}//while
	}// score_input 메소드
	
	static void info_print(Vector<Stu_info> info, String[] info_title) {
		info_title_print(info_title);
		
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			info_print_sub(si);
		}
	}
	
	static void info_title_print(String[] info_title) {
		for(int i = 0; i < info_title.length; i++) {
			System.out.print(info_title[i] + "\t");
		}
		System.out.println();
	}
	
	static void info_print_sub(Stu_info si) {
		System.out.print(si.hak_num + "\t");
		System.out.print(si.name + "\t");
		System.out.print(si.major + "\t");
		System.out.print(si.grade + "\t");
		System.out.println("");
	}
	
	static void score_print(Vector<Stu_score> score, String[] score_title) {
		score_title_print(score_title);
		
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			score_print_sub(ss);
		}
	}
	
	static void score_title_print(String[] score_title) {
		for(int i = 0; i < score_title.length; i++) {
			System.out.print(score_title[i] + "\t");
		}
		System.out.println();
	}
	
	static void score_print_sub(Stu_score ss) {
		System.out.print(ss.hak_num + "\t");
		System.out.print(ss.name + "\t");
		System.out.print(ss.kor + "\t");
		System.out.print(ss.eng + "\t");
		System.out.print(ss.total + "\t");
		System.out.print(ss.avg + "\t");
		System.out.print(ss.rank + "\t");
		System.out.println();
	}
		
	static void search_info_hak_num(Vector<Stu_info> info, String[] info_title, Scanner scan) {
		int scan_hak_num = 0;
		System.out.print("검색할 학생의 학번을 입력해 주세요. (이전화면 : 999) : ");
		scan_hak_num = scan.nextInt();
		scan.nextLine();
		
		boolean check_hak_num = false;
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			if(si.hak_num == scan_hak_num) {
				info_title_print(info_title);
				info_print_sub(si);
				check_hak_num = true;
			}
		}
		if(check_hak_num == false) {
			System.out.println("입력하신 학번의 학생이 없습니다. 다시 입력해 주세요.");
		}
		
	}
	
	static void search_info_name(Vector<Stu_info> info, String[] info_title, Scanner scan) {
		String scan_name = "";
		System.out.print("검색할 학생의 이름을 입력해 주세요. (이전화면 : 999)");
		scan_name = scan.nextLine();
		
		boolean check_name = false;
		
		info_title_print(info_title);
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			if(si.name.equals(scan_name)) {
				info_print_sub(si);
				check_name = true;
			}
		
		}
		if(check_name = true) {
			System.out.println("입력하신 이름의 학생이 없습니다. 다시 입력해 주세요.");
		}
	}
	
	static void search_score_hak_num(Vector<Stu_score> score, String[] score_title, Scanner scan) {
		int scan_hak_num = 0;
		System.out.print("검색할 학생의 학번을 입력해 주세요. (이전화면 : 999) : ");
		scan_hak_num = scan.nextInt();
		scan.nextLine();
		
		boolean check_hak_num = false;
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			if(ss.hak_num == scan_hak_num) {
				score_title_print(score_title);
				score_print_sub(ss);
				check_hak_num = true;
			}
		}
		
		if(check_hak_num == false) {
			System.out.println("입력하신 학번의 학생이 없습니다. 다시 입력해 주세요.");
		}
	}
	
	static void search_score_name(Vector<Stu_score> score, String[] score_title, Scanner scan) {
		String scan_name = "";
		System.out.print("검색할 학생의 이름을 입력해 주세요. (이전화면 : 999)");
		scan_name = scan.nextLine();
		
		boolean check_name = false;
		
		score_title_print(score_title);
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			if(ss.name.equals(scan_name)) {
				score_print_sub(ss);
				check_name = true;
			}
		}
		if(check_name == false) {
			System.out.println("입력하신 이름의 학생이 없습니다. 다시 입력해 주세요.");
		}
	}
	
} //class
