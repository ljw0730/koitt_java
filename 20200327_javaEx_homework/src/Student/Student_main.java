package Student;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m = new Method();
		int select = 0;
				
		while(true) {
			select = m.main_print();
			
			switch (select) {
				case 1:
					System.out.println("학생성적입력을 선택 하셨습니다.");
					m.input_sut();
					break;
				case 2:
					System.out.println("학생성적출력을 선택 하셨습니다.");
					m.print_stu();
					break;
				case 3:
					System.out.println("학생정보검색을 선택 하셨습니다.");
					m.search_stu();
					break;
				case 4:
					System.out.println("학생정보수정을 선택 하셨습니다.");
					m.modify_stu();
					break;
				case 5:
					System.out.println("학생성적삭제를 선택 하셨습니다.");
					m.delete_stu();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
			}
		}
		 
	}

}
