import java.util.Scanner;

public class CEx20200218_04 {

	public static void main(String[] args) {
		// Student class와 연결되어 있음
		
		// 학생성적 처리 프로그램 (학생 수 : 10명)
		// 학생 - class : 학번 / 이름 / 국어 / 영어 / 수학 / 합계 / 평균 / 등수
		// 학번은 1000번대 에서 자동으로 만들어 지도록...
		// 무한반복
		// [ 학생성적처리프로그램 ]
		// 1. 성적추가 - 성적추가를 입력하셨습니다.-> 학번입력하세요. -> 이름,국어,영어,수학
		// 2. 성적수정 - 수정할 학생의 학번을 입력하세요.
		//     1. 이름 2. 국어 3. 영어 4. 수학
		//      -> 이름을 입력하세요> 홍길동 -> 홍길동 이름이 수정되었습니다.
		// 3. 성적삭제 - 삭제할 학생의 학번을 입력하세요.
		// 4. 성적검색
		// 5. 등수처리
		// 0. 종료
		
		Student[] stu = new Student[3];
		
		
		int select = 0;
		int stu_count = 0;
		int stu_ID_count = 1000;
		int subject_count = 3;
		int change_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop_while : while(true) {
			System.out.println("[ 학생성적처리 프로그램]");
			System.out.println("========================");
			System.out.println("1. 성적추가");
			System.out.println("2. 성적수정");
			System.out.println("3. 성적삭제");
			System.out.println("4. 성적검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("========================");
			System.out.print("원하는 번호를 입력해 주세요 : ");
			select = scan.nextInt();
			scan.nextLine();
			System.out.println("========================");
			
			switch(select) {
				case 1:
					System.out.println("성적추가를 입력하셨습니다.");
					for(int i = stu_count; i < stu.length; i++) {
						stu[i] = new Student();
						stu[i].input(stu[i], stu_ID_count);
						
						stu[i].sum(stu[i]);
						stu[i].average(stu[i], subject_count);
					
						stu_count++;
					}
					
					
					
					Student.output_title();
					for(int i = 0; i < stu.length; i++) {
						stu[i].all_output(stu[i]);
					}
					
					break;
				
				case 2:
					System.out.println("성적수정을 입력하셨습니다.");
					Student.modify(stu);
					
					Student.output_title();
					for(int i = 0; i < stu.length; i++) {
						stu[i].all_output(stu[i]);
					}
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop_while;
					
			}
			
			
			
		}
		
		
	}	// main
	
}	// class

