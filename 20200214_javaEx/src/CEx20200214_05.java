import java.util.Scanner;

public class CEx20200214_05 {
	public static void main(String[] args) {
		// 영어단어 맞추기
				// 강사님 ver.
				
				// 영어 - 한글 설명
				// 영어, 한글 데이터 입력 - 미리 입력
				// 영어 출력 후 한글 입력 받음
				// 한글이 맞는지 확인
				// 결과 출력
				// 다시 문제 출력
				
				String[][] words = new String[10][2];
				String in_str = "";
				int s_num = 0; 	// 선택번호
				int count = 0;	// 횟수
				int words_num = 0; // 문제번호
				int ex_num = 0;
				
				String eng = ""; // 영어입력변수
				
				Scanner scan = new Scanner(System.in);
				
				while(true) {
					System.out.println("--------------------------");
					System.out.println("      퀴즈 프로그램");
					System.out.println("--------------------------");
					System.out.println("1. 문제 입력");
					System.out.println("2. 문제 풀이");
					System.out.println("0. 프로그램 종료");
					System.out.println("--------------------------");
					System.out.print("원하는 번호를 입력하세요. : ");
					
					s_num = scan.nextInt();
					scan.nextLine();
					
					
					s_loop:
						switch(s_num) {
						case 1:
							System.out.println("문제입력을 선택하셨습니다.");
							
							for(int i = 0; i < words.length; i++) {
								System.out.println("----------------------------");
								System.out.println("영어를 입력하세요.(이전화면 : 99) >>");
								eng = scan.next();
								if(eng.equals("99")) {
									break s_loop;
								}							
								words[i][0] = eng;
								System.out.println("한글을 입력하세요.(이전화면 : 99) >>");
								words[i][1] = scan.next();
								
								words_num++;
								
							}
							
							if(words_num == 10) {
								System.out.println("10개가 모두 입력되었습니다. 더 이상 입력할 수 없습니다.");
								break;
							}
							
							
						case 2:
							for(int i = ex_num; i < words_num; i++) {
								System.out.println(words[i][0] + " 의 뜻을 무엇일까요? (이전화면 : 99)");
								in_str = scan.nextLine();
								
								if(in_str.equals("99")) {
									System.out.println("이전화면으로 이동합니다.");
									break;
								}
								
								// 정답 비교
								if(words[i][1].equals(in_str)) {
									System.out.println("정답입니다. 다음문제 도전!");
									ex_num++;	//문제풀이 1추가 2번째 문제 풀이
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
									ex_num++;	//문제풀이 1추가 2번째 문제 풀이
								}
								
								System.out.println("=====================================");
							}
							break;
						}
					
				}	// while
				
	}	//main
}	//class
