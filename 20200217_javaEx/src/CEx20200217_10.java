import java.util.Scanner;

public class CEx20200217_10 {
	public static void main(String[] args) {
		// 번호 제목 내용 작성자 조회수
		// 1개 입력 후 모두 출력
		// 2개 입력 후 모두 출력
		// 3개 입력 후 모두 출력...
		
		// - 추후 개발 형태 - 
		// 1. 게시판 리스트/글보기
		// 2. 글쓰기(입력)
		// 3. 글삭제
		// 0. 종료
		
		String[] subject = { "번호", "제목", "내용", "작성자", "조회수" };
		Bulletin_Board[] bb = new Bulletin_Board[2];
		
		int bb_num = 0;
		int bb_view_count = 0;
		
		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i < bb.length; i++) {
			bb[i] = new Bulletin_Board();
			System.out.println("[ 게시판 글 등록 ]");
			
			// 글번호 입력
			bb[i].num = bb_num+1;
						
			// 제목 입력
			System.out.print("제목을 입력해 주세요. (종료 : 0) : ");
			bb[i].title = scan.nextLine();
			if(bb[i].title.equals("0")) {
				bb[i].title = null;
				break;
			}
			
			// 내용 입력
			System.out.print("내용을 입력해 주세요 : ");
			bb[i].content = scan.nextLine();
			
			// 작성자 입력
			System.out.print("작성자를 입력해 주세요. : ");
			bb[i].name = scan.nextLine();

			// 조회수 입력
			bb[i].view_count = bb_view_count;
			
			bb_num++;	// 글번호 자동증가
			
			System.out.println("==============================");
			System.out.println("      [ 글 리스트 출력 ]");
			for(int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + "\t");
			}
			System.out.println();
			
			for(int j = 0; j < bb_num; j++) {
				bb[j].print();
			}
			System.out.println("==============================");
		}
		
		scan.close();
		
	}
}


