import java.util.Scanner;

public class CEx20200219_09 {
	
	public static void main(String[] args) {
		// Student class와 연결되어 있음
		
		// 1. 학생점수입력
		// 2. 학생점수수정
		// 3. 학생점수삭제
		// 4. 학생점수검색
		// 5. 등수처리
		// 6. 종료
		
		Student[] stu = new Student[2];
		
		int select = 0;
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		Loop1: while(true) {
			System.out.println("=============================");
			System.out.println("    [점수처리 프로그램]");
			System.out.println("=============================");
			System.out.println(" 1. 학생점수입력");
			System.out.println(" 2. 학생수정");
			System.out.println(" 3. 학생삭제");
			System.out.println(" 4. 학생검색");
			System.out.println(" 5. 등수처리");
			System.out.println(" 6. 종료");
			System.out.println("------------------------------");
			System.out.print("원하는 번호를 입력해 주세요. : ");
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 1 || select > 6) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			switch(select) {
				case 1:
					System.out.println("학생성적입력 을 선택하셨습니다.");
					System.out.println("------------------------------");
//					insert(scan, stu);
					
					for(int i = 0; i < stu.length; i++) {
						System.out.print((i+1) + "번 학생의 이름을 넣으세요. : ");
						name = scan.nextLine();
						System.out.print(name + " 학생의 국어점수를 넣으세요. : ");
						kor = scan.nextInt();
						System.out.print(name + " 학생의 영어점수를 넣으세요. : ");
						eng = scan.nextInt();
						System.out.print(name + " 학생의 수학점수를 넣으세요. : ");
						math = scan.nextInt();
						scan.nextLine();
						
						stu[i] = new Student(name, kor, eng, math);
						
						System.out.println(stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t" + stu[i].math + "\t" 
											+ stu[i].total + "\t" + stu[i].avg + "\t" );
					}
					
					break;
					
				case 2:
					System.out.println("학생성적수정 을 선택하셨습니다.");
					System.out.println("------------------------------");
					System.out.print("수정하려고 하는 학생명을 입력하세요. : ");
					name = scan.nextLine();
					Loop3 : for(int i = 0; i < stu.length; i++) {
						if(stu[i].name.equals(name)) {
							System.out.println(stu[i].name + " 학생이 검색되었습니다.");
							System.out.print("1. 국어점수 2. 영어점수 3. 수학점수");
							System.out.print("수정하고 싶은 과목의 번호를 입력하세요 :");
							
							switch(scan.nextInt()) {
								case 1 :
									System.out.print("변경점수를 입력하세요. : ");
									stu[i].kor = scan.nextInt();
									scan.nextLine();
									System.out.println("국어점수를" + stu[i].kor + "점으로 변경되었습니다.");
									break Loop3;
									
								case 2 :
									System.out.print("변경점수를 입력하세요. : ");
									stu[i].eng = scan.nextInt();
									scan.nextLine();
									System.out.println("영어점수를" + stu[i].eng + "점으로 변경되었습니다.");
									break Loop3;
									
								case 3 :
									System.out.print("변경점수를 입력하세요. : ");
									stu[i].math = scan.nextInt();
									scan.nextLine();
									System.out.println("수학점수를" + stu[i].math + "점으로 변경되었습니다.");
									break Loop3;
									
							}
						}
						else {
							System.out.println("찾으려고 하는 학생이 없습니다. 다시 입력하세요.");
						}
					}
					break;
			
				case 6:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}	//switch
			
			
		}	//while
		
	}	// main
	
	static void insert(Scanner scan, Student[] stu) {
		
	}
	
}	//class

