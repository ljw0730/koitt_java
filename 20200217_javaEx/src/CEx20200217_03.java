import java.util.Scanner;

public class CEx20200217_03 {
	public static void main(String[] args) {
		// 성적처리 프로그램
		// 기본 - 이름 , 국어 , 영어, 수학, 합계, 평균, 등수
		// 옵션 - 1.학생추가 2.학생출력 3.등수처리. 0.종료
		
		// 변수 선언
		// 이름 입력
		// 점수 입력
		// 합계 계산
		// 평균 계산
		// 등수 계산
		// 타이틀 / 이름 / 점수,합계 / 평균 / 등수 출력 
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		int select = 0;
		int rank_count = 1;
		int stu_count = 0;
		String search_name = "";
		int searched_num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[ 성적처리 프로그램 ]");
			System.out.println("=====================");
			System.out.println("1. 학생추가");
			System.out.println("2. 성적출력");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("=====================");
			System.out.print("원하는 번호를 입력해 주세요 : ");
			select = scan.nextInt();
			
			if(select < 0 || select >5) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			if(select == 0) {
				break;
			}
			
			switch(select) {
				case 1:
					System.out.println("=== 학생추가를 선택 하셨습니다. ===");
					for(int i = stu_count; i < name.length; i++) {
						System.out.print((i+1) + "번째 학생의 이름을 입력해 주세요. (이전단계:999): ");
						name[i] = scan.next();
						scan.nextLine();
						
						if(name[i].equals("999")) {
							name[i] = null;
							break;
						}
						
						for(int j = 0; j < score[i].length-1; j++) {
							System.out.print(name[i] + " 학생의 " + subject[j+1] + "점수를 입력해 주세요 (이전단계:999): ");
							score[i][j] = scan.nextInt();
							scan.nextLine();
							
							if(score[i][j] == 999) {
								break;
							}
							
							if(score[i][j] < 0 || score[i][j] > 100) {
								System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
								j++;
								continue;
							}
							
							score[i][score[i].length-1] += score[i][j];
						}
						
						avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
						
						stu_count++;
					}
					break;
					
				case 2:
					System.out.println("=== 성적 출력을 선택 하셨습니다. ===");
					
					for(int i = 0; i < subject.length; i++) {
						System.out.print(subject[i] + "\t");
					}
					System.out.println();
					
					for(int i = 0; i < score.length; i++) {
												
						if (name[i] == null) {
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
					break;
				
				case 3:
					System.out.println("=== 학생 검색을 선택 하셨습니다. ===");
					System.out.print("원하시는 학생의 이름을 입력해 주세요. : ");
					search_name = scan.next();
					scan.nextLine();
					searched_num = 0;
					for(int i = 0; i < name.length; i++) {
						if(name[i].equals(search_name)) {
							break;
						}
						searched_num++;
					}
					
					System.out.println(name[searched_num] +" 학생의 성적을 출력합니다.");
					
					for(int i = 0; i < subject.length; i++) {
						System.out.print(subject[i] + "\t");
					}
					System.out.println();
					
					
					System.out.print(name[searched_num] + "\t");
					
					for(int j = 0; j < score[searched_num].length; j++) {
						System.out.print(score[searched_num][j] + "\t");
					}
					
					System.out.print(avg[searched_num] + "\t");
					System.out.print(rank[searched_num] + "\t");
					System.out.println();
					
					break;
					
				case 4:
					System.out.println("=== 학생 성적 삭제를 선택 하셨습니다. ===");
					System.out.print("원하시는 학생의 이름을 입력해 주세요. : ");
					search_name = scan.next();
					scan.nextLine();
					searched_num = 0;
					for(int i = 0; i < name.length; i++) {
						if(name[i].equals(search_name)) {
							break;
						}
						searched_num++;
					}
					
					name[searched_num] = null;
					for(int j = 0; j < score[searched_num].length; j++) {
						score[searched_num][j] = 0;
					}
					avg[searched_num] = 0.0d;
					rank[searched_num] = 0;
				
					
				case 5:
					System.out.println("=== 등수처리를 선택 하셨습니다. ===");
					for(int i = 0; i < score.length; i++) {
						rank_count = 1;
						for(int j = 0; j < score.length; j++) {
							if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
								rank_count++;
							}
						}
						
						rank[i] = rank_count;
					}
					System.out.println("등수처리가 완료 되었습니다.");
					break;
			}
			
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
	}
}
