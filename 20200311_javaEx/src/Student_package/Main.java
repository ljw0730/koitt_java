package Student_package;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//학번, 이름, 국어, 영어, 수학, 합계, 평균, 등수
		// 3개정도는 기본으로 입력 시켜놓고
		// 입력을 1개씩 추가 받을 수 있도록 만들어보세요.
		// Main 1개, Excute 1개 - 모든 메서드, Student 1개
		
		// * 관리자 로그인 기능
		//1. 학생입력 - 자동 학번입력, 합계, 등수 자동입력
		//2. 학생출력 - 전체출력
		//3. 학생검색 - 학생 이*로 검핵하면 모두
		//4. 등수확인 - 등수계산해서 입력후 등수출력
		
//		System.out.println("BBB");
		
		Excute ex = new Excute();
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Main_Loop: while(true) {
			select = ex.main_print(scan);
			
			switch (select) {
				case 1 :
					System.out.println("학생성적입력을 선택하셨습니다.");
					ex.input_student_grades(scan);
										
					break;
					
				case 2 :
					System.out.println("학생성적출력을 선택하셨습니다.");
					ex.print_student_grades();
					
					break;
					
				case 3 :
					System.out.println("학생정보검색을 선택하셨습니다.");
					ex.search(scan);
					
					break;
					
				case 4 :
					System.out.println("등수확인을 선택하셨습니다.");
					ex.ranking();
					ex.print_student_grades();
					break;

				case 0 :
					System.out.println("프로그램을 종료합니다.");
					break Main_Loop;
			}
			
			
		}
		
	}
}
