import java.util.Scanner;

public class CEx20200214_04 {
	public static void main(String[] args) {
		// 영어단어 맞추기
		
		// 영어 - 한글 설명
		// 영어, 한글 데이터 입력 - 미리 입력
		// 영어 출력 후 한글 입력 받음
		// 한글이 맞는지 확인
		// 결과 출력
		// 다시 문제 출력
		String in_str = "";
		int select = 0; // 번호 선택
		int count = 0;	// 횟수
		int words_count = 10; // 문제 갯수
		int input_count = 0; // 문제 입력 횟수
						
		String[][] words = new String[words_count][2];
		String input_eng = "";
		String input_kor = "";
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			System.out.println("--------------------------");
			System.out.println(" [영어 단어 맞추기 게임]");
			System.out.println("--------------------------");
			System.out.println("1. 문제 입력");
			System.out.println("2. 문제 풀이");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.print("원하는 번호를 입력하세요. : ");
			
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 0 || select > 2) {
				System.out.println("입력을 잘못 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			swit: switch(select) {
				case 1:
					System.out.println("1. 문제 입력을 선택하셨습니다.");
					
					while(input_count < words_count) {
						System.out.print((input_count+1) + "번째 문제의 영어 단어를 입력하세요.(이전화면 : 0) :");
						words[input_count][0] = scan.nextLine();
						
						if(words[input_count][0].equals("0")) {
							break swit;
						}
						
						System.out.print((input_count+1) + "번째 문제의 한글 뜻을 입력하세요.(이전화면 : 0) :");
						words[input_count][1] = scan.nextLine();
					
						if(words[input_count][1].equals("0")) {
							break swit;
						}
						System.out.println("=====================================");
						
						input_count++;
					}
					
					break;
			
				case 2: 
					System.out.println("2. 문제 풀이를 선택하셨습니다.");
					
					for(int i = 0; i < input_count; i++) {
						
						if(words[0][0] == null) {
							System.out.println("문제가 없습니다. 문제 입력 부터 해주세요.");
							break swit;
						}
						
						
						System.out.println(words[i][0] + " 의 뜻을 무엇일까요?");
						in_str = scan.nextLine();
						
						if(in_str.equals("0")) {
							break swit;
						}
												
						// 정답 비교
						if(words[i][1].equals(in_str)) {
							System.out.println("정답입니다. 다음문제 도전!");
						}
						else {
							if(count < 2) {
								System.out.println((count+1) + "번째 오답입니다. 다시 도전!");
								count++;	// 횟수추가
								i--;		// 현재문제 다시 제출
								continue;
							}
							
							System.out.println((count+1) + "번째 오답입니다. 정답은 " + words[i][1]);
							count = 0;	//초기화
						}
						
						System.out.println("=====================================");
					}
					break;
				case 0:
					break Loop1;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}	//main
}	//class
