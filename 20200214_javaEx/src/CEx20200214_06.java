import java.util.Scanner;

public class CEx20200214_06 {
	public static void main(String[] args) {
		// [성적처리 프로그램]
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
				
		int select = 0;
		int rank_count = 1;
		int stu_num = 0;	//학생입력수
		String y_or_n = "";
		String name_ch = "";
		int check_num = 0;
				
		Scanner scan = new Scanner(System.in);
		
		while_Loop: while(true) {
			System.out.println("--------------------------");
			System.out.println("    성적처리 프로그램");
			System.out.println("--------------------------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 등수 계산");
			System.out.println("4. 학생 성적 검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.print("원하는 번호를 입력하세요. : ");
			
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 0 || select > 4) {
				System.out.println("잘못입력 하셧습니다. 다시 입력해 주세요.");
				continue;
			}
			
			swit_Loop: switch(select) {
				case 1:
					System.out.println("성적 입력을 선택하셨습니다.");
					for(int i = stu_num; i < name.length; i++) {
						System.out.print((i+1) + "번 학생의 이름을 입력해 주세요.(이전화면 :999) : ");
						name[i] = scan.next();
						
						if(name[i].equals("999")) {
							name[i] = null;
							break swit_Loop;
						}
						
						for(int j = 0; j < score[i].length-1; j++) {
							System.out.print(name[i] + " 학생의 " + subject[j+1] + "점수를 입력해 주세요.(이전화면 :999) : ");
							score[i][j] = scan.nextInt();
							
							if(score[i][j] == 999) {
								score[i][j] = 0;
								break swit_Loop;
							}
							if(score[i][j] < 0 || score[i][j] > 100) {
								System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
								j--;
								continue;
							}
							
							score[i][score[i].length-1] += score[i][j];
						}
						
						avg[i] = score[i][score[i].length-1] / (score[i].length-1);
						
						stu_num++;	//입력된 학생 수
					}
														
					break;
					
				case 2:
					while(true) {
						System.out.println("성적을 출력합니다.");
						for(int i = 0; i < subject.length; i++) {
							System.out.print(subject[i] + "\t");
						}
						System.out.println();
						
						for(int i = 0; i < score.length; i++) {
							if(name[i] == null) {
								continue;
							}
							System.out.print(name[i] + "\t");
							for(int j = 0; j < score[i].length; j++) {
								System.out.print(score[i][j] + "\t");
							}
							System.out.print(avg[i] + "\t");
							System.out.print(rank[i] + "\t");
							System.out.println();
						}
						
						System.out.println("다시 출력 하시겠습니까?(y/n)");
						y_or_n = scan.nextLine();
						if(y_or_n.equals("N") || y_or_n.equals("n")) {
							System.out.println("이전화면으로 이동합니다.");
							break;
						}
					}
					break;
					
				case 3: 
					System.out.println("등수를 계산 합니다.");
					for(int i = 0; i < score.length; i++) {
						rank_count = 1;
						
						for(int j = 0; j < score.length; j++) {
							if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
								rank_count++;
							}
						}
						
						rank[i] = rank_count;
					}
					break;
				
				case 4:
					System.out.println("학생성적검색을 입력하셨습니다.");
					System.out.println("------------------------------");
					System.out.print("원하는 학생의 이름을 입력하세요. : ");
					name_ch = scan.nextLine();
					
					// 학생이름으로 학생 전체를 검색
					for(int i = 0; i < name.length; i++) {
						if(name_ch.equals(name[i])) {
							check_num = i;
							break;
						}
						check_num = -1;
					}
					
					if(!(check_num == -1)) {
						System.out.println(name[check_num] + "성적을 출력합니다.");
						for(int i = 0; i < subject.length; i++) {
							System.out.print(subject[i] + "\t");
						}
						System.out.println();
						
						
						System.out.print(name[check_num] + "\t");
						for(int j = 0; j < score[0].length; j++) {
							System.out.print(score[check_num][j] + "\t");
						}
						System.out.print(avg[check_num] + "\t");
						System.out.print(rank[check_num] + "\t");
						System.out.println();
						
//						System.out.println("다시 출력 하시겠습니까?(y/n)");
//						y_or_n = scan.nextLine();
//						if(y_or_n.equals("N") || y_or_n.equals("n")) {
//							System.out.println("이전화면으로 이동합니다.");
//							break;
//						}
						
						break;
					
					}
					System.out.println("원하는 학생이 없습니다.");
					
					//학생을 입력
					//이름을 비교 in_name.equals(name[i])
					
					break;
				case 0:
					break while_Loop;
			}	// switch
		}	// while
		
		System.out.println("프로그램을 종료합니다.");
		
	}	//main
}	//class
