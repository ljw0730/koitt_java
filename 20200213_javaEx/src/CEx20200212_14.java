import java.util.Scanner;

public class CEx20200212_14 {
	public static void main(String[] args) {
		// 미완성
		
		
		// 게시판 프로그램
		// 번호(순차적)-int, 이름-String, 제목-String,
		// 글 내용-String, 조회수-int,
		// 1	홍길동	게시판완성		게시판이 완성되었습니다.	0
		// 2	이순신	프로그램질문	프로그램질문이 있습니다.	0
		// 글 2개까지 입력하고 출력하시오.
		
		// 옵션=> 글은 10개 까지 입력이 가능한데, 1개 하고 더 할지 물어보기
		// 옵션=> 1) 글 쓰기  2) 목록 - 리스트 1)읽기 2)수정 3)삭제

		int num = 0;						//번호
		int arr_first = 0;					//arr배열 첫번째 인덱스
		int arr_second = 0;					//arr배열 두번째 인덱스
		int[] number = new int[2];			//번호 저장
		String[][] arr = new String[2][3];	//이름 제목 글내용
		int[] hits = new int[2];			//조회수 저장
		
		String more = "";
		
		String[] menu = { "번호", "이름", "제목", "글내용", "조회수" };
		
		Scanner scan = new Scanner(System.in);
				
		while(true) {
			// 번호 입력
			number[num] = num+1;
						
			// 작성자 입력
			System.out.print("작성자 명을 입력해 주세요. : ");
			arr[arr_first][arr_second] = scan.next();;
			scan.nextLine();
			arr_second++;
			
			// 제목 입력
			System.out.print("제목을 입력해 주세요. : ");
			arr[arr_first][arr_second] = scan.nextLine();
			arr_second++;
			
			// 내용 입력
			System.out.print("내용을 입력하세요. : ");
			arr[arr_first][arr_second] = scan.nextLine();
						
			//작성더 할것인가?
			System.out.println("게시물을 더 작성 하시겠습니까?(yes/no)");
			more = scan.next();
			if(more.equals("no")) {
				System.out.println("작성을 마침니다.");
				break;
			}
			
			num++;
			arr_first++;
			arr_second = 0;
		}
		
		//출력
		for(int i = 0; i < menu.length; i++) {
			System.out.print(menu[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(hits[i]);
		}
		
		
		
	} // main
} //class
