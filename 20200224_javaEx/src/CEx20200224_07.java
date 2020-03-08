import java.util.Scanner;

public class CEx20200224_07 {

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

		Scanner scan = new Scanner(System.in);
		String[] stu_title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		Student3[] stu = new Student3[3];	// 학생 10명 객체배열
		int[] score =  new int[3];	// 점수받는 배열
		int kor = 0, eng = 0, math = 0;
		int stu_count = 0;
		
		while(true) {
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생등수입력");
			System.out.println("5. 종료");
			
			System.out.println("원하는 번호를 입력하세요.>>");
			int s_num = scan.nextInt();
			
			switch(s_num) {
				case 1: //학생성적입력
					stu_count = stu_input(stu, score, stu_title, stu_count);
					System.out.println("학생성적입력 완료");
					System.out.println("-------------------------");
					break;
					
				case 2: //학생성적출력
					stu_print(stu, stu_title, stu_count);
					System.out.println("학생성적출력 완료");
					System.out.println("-------------------------");
					break;
				case 3: //학생성적수정
					stu_modify(stu);
					System.out.println("학생성적수정 완료");
					System.out.println("-------------------------");
					break;
					
				case 4: 
					
					break;
					
				case 5:
					break;
			}
		}
		
		
		
		
	} //main
	
	static int stu_input(Student3[] stu, int[] score, String[] stu_title, int stu_count) {
		
		Scanner scan = new Scanner(System.in);
		loop1:
		while(true) {
			//성적 입력부분
			for(int i = stu_count; i < stu.length; i++) {
				System.out.println("이름을 입력하세요.>>(99:이전화면)");
				String name = scan.nextLine();
				if(name.equals("99")) {
					break loop1;
				}
				//점수입력부분
				for(int j = 0; j < 3; j++) {
					System.out.println(stu_title[j+2] + "값을 입력하세요 : ");
					score[j] = scan.nextInt();
					scan.nextLine();
				}
				stu_count++;
				stu[i] = new Student3(name, score[0], score[1], score[2]);
				
				if(stu_count == 3) {
					break loop1;
				}
			}
		} //while
		return stu_count;
	} //stu_input 메소드
	
	static void stu_print(Student3[] stu, String[] stu_title, int stu_count) {
		System.out.println("입력된 학생 : " + stu_count);
		System.out.println(stu_title[0]+"\t"+stu_title[1]+"\t"
				+stu_title[2]+"\t"+stu_title[3]+"\t"+stu_title[4]+"\t"+
				stu_title[5]+"\t"+stu_title[6]+"\t"+stu_title[7]);
		for(int i=0;i<stu_count;i++) {
			System.out.println(stu[i].hak_num+"\t"+stu[i].name+"\t"
					+stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math+"\t"+
					stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
		}
	}
	
	//학생성적수정
	static void stu_modify(Student3[] stu) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정하고 싶은 학생 이름을 입력하세요.");
		String s_name = scan.nextLine();
		for(int i = 0; i < stu.length; i++) {
			if(s_name.equals(stu[i].name)) {
				System.out.println(s_name + " 검색되었습니다.");
				System.out.println("1.국어수정 2.영어수정 3.수학수정 4.이름수정 0.이전화면");
				System.out.println("원하는 번호를 입력하세요.>>");
				int s_num1 = scan.nextInt();
				scan.nextLine();
				
				switch(s_num1) {
					case 1:
						sw_modify(stu, i, "국어");
						break;
					case 2:
						sw_modify(stu, i, "영어");
						break;
					case 3:
						sw_modify(stu, i, "수학");
						break;
						
					case 4:
						System.out.println("현재 이름 : " + stu[i].name);
						System.out.println("변경 이름을 입력하세요.>>");
						stu[i].name = scan.nextLine();
						break;
				}
			}
			else {
				System.out.println("이름 불일치. 다시검색 >> ");
			}
		}
	}
	
	static void sw_modify(Student3[] stu, int i, String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.println("현재"+subject+"점수 :"+stu[i].kor);
		System.out.println("변경"+subject+"점수를 입력하세요.>>");

		if(subject.equals("국어")) {
			stu[i].kor = scan.nextInt();
		}else if(subject.equals("영어")) {
			stu[i].eng = scan.nextInt();
		}else {
			stu[i].math = scan.nextInt();
		}
		stu[i].modify();
	}
	
	

} //class
