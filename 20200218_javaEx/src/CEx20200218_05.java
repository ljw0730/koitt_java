import java.util.Scanner;

public class CEx20200218_05 {

	static int stu_count = 0; 
	
	public static void main(String[] args) {
		// Student2 class와 연결되어 있음
		
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

		Scanner scan = new Scanner(System.in);
		
		Student2[] stu = new Student2[3];
		
		
			
		Loop_while : while(true) {
			main_print();
			
			switch(scan.nextInt()) {
			case 1:
				System.out.println("성적 추가를 선택하셨습니다.");
				insert(stu);	//학생성적추가 메서드 - 메서드 분리
				break;
				
				
			case 2:
				System.out.println("성적 수정를 선택하셨습니다.");
				break;
				
				
			case 3:
				System.out.println("성적 삭제를 선택하셨습니다.");
				break;
				
				
			case 4:
				System.out.println("성적 검색를 선택하셨습니다.");
				break;
				
				
			case 5:
				System.out.println("등수 처리를 선택하셨습니다.");
				break;
				
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break Loop_while;
				
				
			} //switch
			
		} //while
		
				
	}	// main
	
	// main 출력 메소드
	static void main_print() {
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
	}
	
	// 학번/이름/국어/영어/수학/합계/평균 입력 메서드
	static void insert(Student2[] stu) {
		Scanner scan = new Scanner(System.in);
		
		String insert_name ="";
		
		scan.nextLine();
		
		for(int i = stu_count; i < stu.length; i++) {
			stu[i] = new Student2();	// 값을 넣을 수 있는 공간생성
			System.out.print("이름을 입력하세요.(999 : 이전화면) : ");
			insert_name = scan.nextLine();
			if(insert_name.equals("999")) {
				System.out.println("이전 화면으로 이동합니다.");
				break;
			}
			stu[i].stu_num = (Student2.first_num += 1);
			// stu[i].stu_num = (Student2.first_num = Student2.first_num + 1)
			stu[i].stu_name = insert_name;
			System.out.print("국어점수를 입력하세요 : ");
			stu[i].stu_kor = scan.nextInt();
			scan.nextLine();
			System.out.print("영어점수를 입력하세요 : ");
			stu[i].stu_eng = scan.nextInt();
			scan.nextLine();
			System.out.print("수학점수를 입력하세요 : ");
			stu[i].stu_math = scan.nextInt();
			scan.nextLine();
			
			stu[i].totla();
			stu[i].average();
			
			CEx20200218_05.stu_count++;
			
			System.out.println(stu_count + "번째 학생 : " + stu[i].stu_num + "\t" + stu[i].stu_name + "\t" + stu[i].stu_kor + "\t" 
								+ stu[i].stu_eng + "\t" + stu[i].stu_math + "\t" + stu[i].stu_total + "\t" + stu[i].stu_avg + "\t");
		}
	}
}	// class

