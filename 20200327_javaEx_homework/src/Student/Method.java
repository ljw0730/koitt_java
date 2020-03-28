package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
	
	ArrayList<Student> stu = new ArrayList<Student>();
	String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	Scanner scan = new Scanner(System.in);
	
	// 메인화면 출력
	public int main_print() {
		int select = 0;
		System.out.println("========================");
		System.out.println(" 학생성적처리 프로그램 ");
		System.out.println(" 1. 학생성적입력");
		System.out.println(" 2. 학생성적출력");
		System.out.println(" 3. 학생정보검색");
		System.out.println(" 4. 학생정보수정");
		System.out.println(" 5. 학생정보삭제");
		System.out.println(" 0. 종료");
		System.out.println("-----------------------");
		System.out.print(" 원하는 번호를 입력해 주세요 : ");
		if(!scan.hasNextInt()) {
			scan.next();
			System.out.println("숫자만 입력 가능합니다.");
			return 999;
		}
		else {
			select = scan.nextInt();
			scan.nextLine();
			return select;
		}
	}
	
	// 1.학생 성적 입력 ----------------------------------------------------------------------------------
	// 학생 이름, 성적 입력
	public void input_sut() {

//		input_dumy();
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("학생의 이름을 입력해 주세요.(이전화면 - 999) : ");
		name = scan.nextLine();
		if(name.equals("999")) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		kor = score_input(name, 2);
		eng = score_input(name, 3);
		math = score_input(name, 4);
		
		Student ss = new Student(name, kor, eng, math);
		stu.add(ss);
		
		ranking();
		
		print_title();
		System.out.println(ss);
	}
	
	// 성적입력
	public int score_input(String name, int subject_num) {
		int score = 0;
		while(true) {
			System.out.print(name + " 학생의 " + title[subject_num] 
								+ "점수를 입력해 주세요. : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			else {
				score = scan.nextInt();
				scan.nextLine();
				if(score < 0 || score > 100) {
					System.out.println("점수는 0 ~ 100 까지 입력 가능합니다.");
					score = 0;
					continue;
				}
				else {
					return score;
				}
			}
		}
	}
	
	// 더미데이터 입력
	public void input_dumy() {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// 데미데이터
		String nameArr[] = {"홍길동", "박보검", "이초홍", "강감찬", "김홍도" };
		int korArr[] = {100, 80, 70, 90, 60};
		int engArr[] = {100, 80, 70, 90, 60};
		int mathArr[] = {100, 80, 70, 90, 60};
		
		for(int i = 0; i < nameArr.length; i++) {
			name = nameArr[i];
			kor = korArr[i];
			eng = engArr[i];
			math = mathArr[i];
			
			Student ss = new Student(name, kor, eng, math);
			stu.add(ss);
		}
	}
	
	// 등수 계산
	public void ranking() {
		int count = 1;
		for(int i = 0; i < stu.size(); i++) {
			count = 1;
			Student ss1 = (Student)stu.get(i); 
			for(int j = 0; j < stu.size(); j++) {
				Student ss2 = (Student)stu.get(j);
				if(ss1.total < ss2.total) {
					count++;
				}
			}
			ss1.rank = count;
//			stu.set(i, ss1);
		}
	}
	
	// 2.학생 성적 출력 ----------------------------------------------------------------------------------
	// 타이틀 출력
	void print_title() {
		for(int i = 0; i < title.length; i++) {
			System.out.print( title[i] + "\t");
		}
		System.out.println();
	}
	// 전체 출력
	void print_stu() {
		print_title();
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			System.out.println(ss);
		}
	}
	
	// 3.학생 정보 검색 ----------------------------------------------------------------------------------
	// 이름 검색
	public void search_stu() {
		String name = "";
		while(true) {
			System.out.print("검색할 학생의 이름 전체 또는 일부를 입력해 주세요. (이전화면 - 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
				return;
			}
			boolean check = false;
			print_title();
			for(int i = 0; i < stu.size(); i++) {
				Student ss = (Student)stu.get(i);
				if(ss.name.contains(name)) {
					System.out.println(ss);
					check = true;
				}
			}
			if(check == false) {
				System.out.println(name + " 의 검색 결과가 없습니다.");
			}
		}
	}
	
	// 4.학생 정보 수정 ----------------------------------------------------------------------------------
	// 학생 정보 수정
	public void modify_stu() {
		while(true) {
			System.out.println("===============================================");
			print_stu();			
			int select = 0;
			System.out.print("수정 할 학생의 학번을 입력해 주세요.(이전화면 - 999) : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			else {
				select = scan.nextInt();
				scan.nextLine();
				if(select == 999) {
					System.out.println("이전화면으로 이동합니다.");
					break;
				}
			}
			
			Student ss = null;
			boolean hak_num_check = false;
			loop_for: for(int i = 0; i < stu.size(); i++) {
				ss = (Student)stu.get(i);
				if(ss.hak_num == select) {
					hak_num_check = true;
					modify_2 : while(true) {
						System.out.println("1) 이름, 2) 국어점수, 3) 영어점수, 4) 수학점수, 999) 이전화면");
						System.out.print("변경할 항목의 숫자를 입력해 주세요. : ");
						if(!scan.hasNextInt()) {
							scan.next();
							System.out.println("숫자만 입력 가능합니다.");
							continue;
						}
						else {
							select = scan.nextInt();
							scan.nextLine();
							if(select == 999) {
								System.out.println("이전 화면으로 이동합니다.");
								break;
							}
							if(select < 1 || select > 4) {
								System.out.println("1~4, 999 숫자만 입력 가능합니다.");
								select = 0;
								continue;
							}
						}
						
						switch(select) {
							case 1:
								modify_name(ss);
								break loop_for;
							case 2:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
							case 3:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
							case 4:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
								
							case 999:
								break modify_2;
						}
						
					}// 안쪽 while
				} // if(ss.hak_num == select) 
			} // for 문
			print_title();
			if(hak_num_check == true) {
				System.out.println(ss);
			}
			else {
				System.out.println("검색하는 학번은 없는 학번 입니다.");
			}
			
		}// 바깥 while
	} // modify_stu()
	
	// 이름 수정
	public void modify_name(Student ss) {
		String name;
		System.out.print("수정할 이름을 입력해 주세요 : ");
		name = scan.nextLine();
		ss.name = name;
	}
	
	// 성적 수정
	public void modify_score(Student ss, int select) {
		int score = 0;
		loop_while: while(true) {
			System.out.print("수정할 점수를 입력해 주세요. : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			else {
				score = scan.nextInt();
				scan.nextLine();
				if(score < 0 || score >100) {
					System.out.println("점수는 0 ~ 100 까지 입력 가능합니다.");
					score = 0;
					continue;
				}
				
				switch (select) {
					case 2: 
						ss.kor = score;
						break loop_while;
					case 3: 
						ss.eng = score;
						break loop_while;
					case 4: 
						ss.math = score;
						break loop_while;
				}
			}
		}
	}
	
	// 5.학생 정보 삭제 ----------------------------------------------------------------------------------
	// 학생 정보 수정
	public void delete_stu() {
		System.out.println("===============================================");
		print_stu();			
		int del_hak_num = 0;
		while(true) {
			System.out.print("삭제 할 학생의 학번을 입력해 주세요.(이전화면 - 999) : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			else {
				del_hak_num = scan.nextInt();
				scan.nextLine();
				if(del_hak_num == 999) {
					System.out.println("이전화면으로 이동합니다.");
					break;
				}
			}

			for(int i = 0; i < stu.size(); i++) {
				Student ss = (Student)stu.get(i);
				String yn_check = "";
				if(ss.hak_num == del_hak_num) {
					System.out.print("정말로 삭제 하시겠습니까?(y, n) : ");
					yn_check = scan.nextLine();
					if(yn_check.equalsIgnoreCase("y")) {
						stu.remove(i);
						System.out.println(del_hak_num + " 학번의 학생의 정보를 삭제 하였습니다.");
						break;
					}
					else if(yn_check.equalsIgnoreCase("n")) {
						System.out.println("삭제를 취소 하였습니다.");
						break;
					}
					else {
						System.out.println("y, n 만 입력 가능합니다.");
						i--;
						continue;
					}
				}
				
				
				
			}
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
