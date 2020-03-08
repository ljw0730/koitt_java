import java.util.Scanner;

public class Homework_student {


	public static void main(String[] args) {
		
		final int TOTAL_STUDENT_COUNT = 5;
		
		String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		Student[] stu = new Student[TOTAL_STUDENT_COUNT];
		int select = 0;
		int stu_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			select = main_print(scan);
			switch (select) {
				case 1:
					System.out.println("--------------------------------");
					System.out.println("학생정보입력을 선택 하셨습니다.");
					stu_count = stu_input(stu, stu_count, subject, scan);	
					
					break;
					
				case 2:
					System.out.println("--------------------------------");
					System.out.println("학생정보출력을 선택 하셨습니다.");
					stu_print(stu, stu_count, subject);
					
					break;
					
				case 3:
					System.out.println("--------------------------------");
					System.out.println("학생등수처리를 선택 하셨습니다.");
					ranking(stu, stu_count);
					System.out.println("등수처리가 완료 되었습니다.");
					
					break;
					
				case 4:
					System.out.println("--------------------------------");
					System.out.println("학생정보검색을 선택 하셨습니다.");
					stu_search(stu, stu_count, scan, "검색");
					
					break;
					
				case 5: 
					System.out.println("--------------------------------");
					System.out.println("학생정보수정을 선택 하셨습니다.");
					stu_modify(stu, stu_count, scan);
					
					break;
				
				case 6: 
					System.out.println("--------------------------------");
					System.out.println("학생정보삭제를 선택 하셨습니다.");
					stu_del(stu, stu_count, subject, TOTAL_STUDENT_COUNT, scan);
					
					break;
					 
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
			
		}
		
	} //main
	
	// 메인화면 출력
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==================================");
		System.out.println("    [학생성적관리 프로그램] ");
		System.out.println("      1. 학생정보입력");
		System.out.println("      2. 학생정보출력");
		System.out.println("      3. 학생등수처리");
		System.out.println("      4. 학생정보검색");
		System.out.println("      5. 학생정보수정");
		System.out.println("      6. 학생정보삭제");
		System.out.println("      0. 종료");
		System.out.println("----------------------------------");
		System.out.print("   원하는 번호를 입력해 주세요 : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	// 학생 이름, 국어성적, 영어성적, 수학성적 입력
	// 입력된 결과로 합계와 평균 계산
	static int stu_input(Student[] stu, int stu_count, String[] subject, Scanner scan) {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = stu_count; i < stu.length; i ++) {
			System.out.print("학생의 이름을 입력해 주세요.(이전화면 : 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
				break;
			}
			while(true) {
				System.out.print(name + " 학생의 " + subject[2] + " 성적을 입력해 주세요 : ");
				kor = scan.nextInt();
				if(kor < 0 || kor > 100) {
					System.out.println("성적을 잘못 입력 하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.print(name + " 학생의 " + subject[3] + " 성적을 입력해 주세요 : ");
				eng = scan.nextInt();
				if(eng < 0 || eng > 100) {
					System.out.println("성적을 잘못 입력 하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.print(name + " 학생의 " + subject[4] + " 성적을 입력해 주세요 : ");
				math = scan.nextInt();
				if(math < 0 || math > 100) {
					System.out.println("성적을 잘못 입력 하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				break;
			}
			scan.nextLine();
			stu[i] = new Student(name, kor, eng, math);
			stu_count++;
			
			stu[i].total();
			stu[i].average();
		}
			
		return stu_count;
	}
	
	// 학생정보 출력
	static void stu_print(Student[] stu, int stu_count, String[] subject) {
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
			
		for(int i = 0; i < stu_count; i++) {
			one_stu_print(stu, i);
		}
	}
	
	// 한명의 정보 출력
	static void one_stu_print(Student[] stu, int i) {
		System.out.print(stu[i].hak_num + "\t");
		System.out.print(stu[i].name + "\t");
		System.out.print(stu[i].kor + "\t");
		System.out.print(stu[i].eng + "\t");
		System.out.print(stu[i].math + "\t");
		System.out.print(stu[i].total + "\t");
		System.out.print(stu[i].avg + "\t");
		System.out.print(stu[i].rank + "\t");
		System.out.println();
	}
	
	// 학생 등수 처리
	static void ranking(Student[] stu, int stu_count) {
		int rank_count = 1;
		
		for(int i = 0; i < stu_count; i++) {
			rank_count = 1;
			for(int j = 0; j < stu_count; j++) {
				if(stu[i].total < stu[j].total) {
					rank_count++;
				}
			}
			
			stu[i].rank = rank_count;
		}
	}
	
	// 학생정보 검색
	// 학생정보 수정의 첫 이름 검색시 에도 사용 
	static int[] stu_search(Student[] stu, int stu_count, Scanner scan, String menu) {
		System.out.print("정보를 "+ menu + "할 학생의 이름을 입력해 주세요. (이전화면 : 999) : ");
		String name = "";
		name = scan.nextLine();

		int[] save_hak_num = new int[stu_count];
		int save_hak_num_count = 0;
		
		if(name.equals("999")) {
			System.out.println("이전화면으로 이동합니다.");
			for(int i = 0; i < save_hak_num.length; i++) {
				save_hak_num[i] = 0;
			}
			return save_hak_num;
		}
		
		for(int i = 0; i < stu_count; i++) {
			if(name.equals(stu[i].name)) {
				one_stu_print(stu, i);
				save_hak_num[save_hak_num_count] = stu[i].hak_num;
				save_hak_num_count++;
			}
		}
		
		return save_hak_num;
	}
	
	//학생정보 수정
	static void stu_modify(Student[] stu, int stu_count, Scanner scan) {
		while(true) {
			int[] save_hak_num = new int[stu_count];
			save_hak_num = stu_search(stu, stu_count, scan, "수정");
			
			if(save_hak_num[0] == 0) {
				break;
			}
			
			int select_hak_num = 0;
			while(true) {
				System.out.print("정보를 수정할 학생의 학번을 입력해 주세요. : ");
				select_hak_num = scan.nextInt();
				scan.nextLine();
				
				boolean check = false;
				for(int i = 0; i < save_hak_num.length; i++) {
					if(save_hak_num[i] == select_hak_num) {
						check = true;
					}
				}
				if(check == false) {
					System.out.println("학번을 잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				break;
			}
			
			System.out.println("1. 이름, 2. 국어성적, 3. 영어성적, 4. 수학성적");
			System.out.print("수정할 항목을 입력해 주세요. : ");
			int select_num = 0;
			select_num = scan.nextInt();
			scan.nextLine();
			switch (select_num) {
				case 1:
					System.out.print("수정할 이름을 입력해 주세요 : ");
					stu[select_hak_num - 1].name = scan.nextLine();
					break;
				case 2:
					System.out.print("수정할 국어점수를 입력해 주세요 : ");
					stu[select_hak_num - 1].kor = scan.nextInt();
					scan.nextLine();
					break;
				case 3:
					System.out.print("수정할 영어점수를 입력해 주세요 : ");
					stu[select_hak_num - 1].eng = scan.nextInt();
					scan.nextLine();
					break;
				case 4:
					System.out.print("수정할 수학점수를 입력해 주세요 : ");
					stu[select_hak_num - 1].math = scan.nextInt();
					scan.nextLine();
					break;
			}
			
			one_stu_print(stu, select_hak_num-1);
			
			System.out.print("수정을 더 하시겠습니까?(Y, N)");
			String more = scan.nextLine();
			if(more.equals("Y") || more.equals("y")) {
				continue;
			}
			break;
		}
	}
	
	//학생정보 삭제
	static void stu_del(Student[] stu, int stu_count, String[] subject, int TOTAL_STUDENT_COUNT ,Scanner scan) {
		stu_print(stu, stu_count, subject);
		
		System.out.print("학생정보를 삭제할 학번을 입력해 주세요. (이전화면 : 999) : ");
		int del_hak_num = scan.nextInt();
		scan.nextLine();
		
		if(del_hak_num == 999) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		Student[] temp_stu = new Student[TOTAL_STUDENT_COUNT];
		System.arraycopy(stu, 0, temp_stu, 0, del_hak_num-1);
		System.arraycopy(stu, del_hak_num, temp_stu, del_hak_num-1, (stu.length-del_hak_num));
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = null;
		}
		System.arraycopy(temp_stu, 0, stu, 0, temp_stu.length);
		
		stu_count--;
		
		stu_print(stu, stu_count, subject);
	}
	
}
