package Student;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method mm = new Method();
		
		int select = 0;
		while(true) {
			select = mm.main_print();
			
			switch (select) {
				case 1:
					System.out.println("학생성적입력을 선택 하셨습니다.");
					mm.input_stu();
					break;
	
				case 2:
					System.out.println("학생성적출력을 선택 하셨습니다.");
					mm.print_stu();
					break;
					
				case 3:
					System.out.println("학생정보검색을 선택 하셨습니다.");
					mm.search_stu();
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				
				case 999:
					System.out.println("잘못 입력 하셨습니다. 숫자를 입력해 주세요.");
					break;
			}
		}
		
		
	}

}
