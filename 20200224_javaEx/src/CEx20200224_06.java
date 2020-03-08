import java.util.Scanner;

public class CEx20200224_06 {

	public static void main(String[] args) {
		// Student2 Class와 연결되어 있음.
		
		// 3명의 학생을 입력받아
		// 학번 이름 국어 영어 수학 합계 평균 등수
		// 학번은 1에서 1씩 증가 - 자동입력되도록
		// 입력부분은 메소드로 분리
		// 출력부분도 메소드로 분리
		// 등수처리 메소드로 분리
		// 무한 루프
		// 1. 학생성적입력
		// 2. 학생성적출력
		// 3. 학생성적수정
		// 4. 학생등수처리
		// 5. 종료

		Student2[] stu = new Student2[3];
		String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		Loop1: while(true) {
			select = mainPrint(scan);
			
			switch(select) {
			case 1:
				System.out.println("학생성적입력을 선택 하셨습니다.");
				stuInput(stu, subject, scan);							
				
				break;
				
			case 2:
				System.out.println("학생성적출력을 선택 하셨습니다.");
				stuPrint(stu, subject);
				
				break;
				
			case 3:
				System.out.println("학생성적수정을 선택 하셨습니다.");
				modify(stu, scan);				
				break;
				
			case 4:
				System.out.println("학생등수처리를 선택 하셨습니다.");
				ranking(stu);				
				System.out.println("학생등수처리가 완료 되었습니다.");

				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break Loop1;
			}
			
		}
		
	}

	static int mainPrint(Scanner scan) {
		int select = 0;
		System.out.println("=========================");
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println(" 1. 학생성적입력");
		System.out.println(" 2. 학생성적출력");
		System.out.println(" 3. 학생성적수정");
		System.out.println(" 4. 학생등수처리");
		System.out.println(" 5. 종료");
		System.out.println("-------------------------");
		System.out.print("원하는 번호를 입력해 주세요 : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static void stuInput(Student2[] stu, String[] subject,  Scanner scan) {
		Loop2: for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student2();
			System.out.print(stu[i].hak_num + "번 학생의 이름을 입력해 주세요.(이전화면 : 999) : ");
			stu[i].name = scan.nextLine();
			if(stu[i].name.equals("999")) {
				stu[i].name = "";
				break;
			}
			while(true) {
				System.out.print(stu[i].name + " 학생의 " + subject[2] + "점수를 입력해 주세요.(이전화면 : 999) : ");
				stu[i].kor = scan.nextInt();
				if(stu[i].kor == 999) {
					stu[i].kor = 0;
					break Loop2;
				}
				else if (stu[i].kor < 0 || stu[i].kor > 100){
					System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				else {
					break;
				}
			}
			while(true) {
				System.out.print(stu[i].name + " 학생의 " + subject[3] + "점수를 입력해 주세요.(이전화면 : 999) : ");
				stu[i].eng = scan.nextInt();
				if(stu[i].eng == 999) {
					stu[i].eng = 0;
					break Loop2;
				}
				else if (stu[i].eng < 0 || stu[i].eng > 100){
					System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				else {
					break;
				}
			}
			while(true) {
				System.out.print(stu[i].name + " 학생의 " + subject[4] + "점수를 입력해 주세요.(이전화면 : 999) : ");
				stu[i].math = scan.nextInt();
				scan.nextLine();
				if(stu[i].math == 999) {
					stu[i].math = 0;
					break Loop2;
				}
				else if (stu[i].math < 0 || stu[i].math > 100){
					System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
					continue;
				}
				else {
					break;
				}
			}
			
			stu[i].total();
			stu[i].average();
		}
	}
	
	static void stuPrint(Student2[] stu, String[] subject) {
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < stu.length; i++) {
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
		System.out.println();
	}
	
	static void modify(Student2[] stu, Scanner scan) {
		int check_hak_num = 0;
		int count = 0;
		int change_select = 0;
		String change_name = "";
		int change_score = 0;
		
		System.out.print("수정할 학생의 학번을 입력해 주세요.(이전화면 : 999) : ");
		check_hak_num = scan.nextInt();
		scan.nextLine();
		if(check_hak_num == 999) {
			return;
		}
		
		for(int i = 0; i < stu.length; i++) {
			if(check_hak_num == stu[i].hak_num) {
				break;
			}
			count++;
		}
		
		System.out.println("1. 이름 / 2. 국어점수 / 3. 영어점수 / 4. 수학점수 / 999. 이전화면");
		System.out.print("수정할 항목을 선택하세요. : ");
		change_select = scan.nextInt();
		scan.nextLine();
		
		switch(change_select) {
			case 1:
				System.out.print("수정할 이름을 입력해 주세요.(메인화면 : 999) : ");
				change_name = scan.nextLine();
				if(change_name.equals("999")) {
					return;
				}
				stu[count].name = change_name;
				break;
			
			case 2:
				System.out.print("수정할 국어점수를 입력해 주세요.(메인화면 : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].kor = change_score;
				break;

			case 3:
				System.out.print("수정할 영어점수를 입력해 주세요.(메인화면 : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].eng = change_score;
				break;
				
			case 4:
				System.out.print("수정할 수학점수를 입력해 주세요.(메인화면 : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].math = change_score;
				break;
				
			case 999:
				return;
		}
		stu[count].total();
		stu[count].average();
		ranking(stu);
		System.out.println("수정이 완료 되었습니다.");
	}
	
	static void ranking(Student2[] stu) {
		for(int i = 0; i < stu.length; i++) {
			int rank_count = 1;
			for(int j = 0; j < stu.length; j++) {
				if(stu[i].total < stu[j].total) {
					rank_count++;
				}
			}
			stu[i].rank = rank_count;
		}
	}
	
}
