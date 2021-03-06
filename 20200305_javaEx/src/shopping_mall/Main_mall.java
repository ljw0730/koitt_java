package shopping_mall;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_mall {

	public static void main(String[] args) {
		// 화면단
		
//		1. 회원가입
//		 - 아이디 중복체크
//		 - 아이디 길이 3자리 이상
//		 - 객체로 ArrayList 저장
//		 - 아이디, 패스워드, 이름, 전화, 보유금액, 보유포인트
//
//		2. 로그인
//		 - 아이디/패스워드 확인
//		 - 객체생성해서 Map 저장
//
//		3. 로그아웃
//		 - ID를 물어봄 있으면 로그아웃.
//		 - 객체삭제
//
//		4. 상품구매
//		 -> ID만 한번더 물어보기
//		 -> Map에 ID가 있으면 계속진행, 아니면 로그인하시오.
//		 1) LCDTV, 2)LEDTV, 3)OLEDTV
//		 4) 일반냉장고, 5) 양문형냉장고
//		 6) 통돌이 세탁기, 7) 드럼세탁기 8) 드럼건조세탁기
//		  - Product 상속 price, bonusPoint, name, color
//		   TV : screen, inch / hdr기능(OLED에만 있음)
//		   냉장고 : liter, door / d_cooling(양문형에만 있음)
//		   세탁기 : size, shape / Sterilization (드럼건조세탁기에만 있음)
//
//		5. 상품구매 목록보기
//		 - 상품구매한 리스트 보여주기
//		
//		8. 회원정보검색
//		 - 회원 검색 기능 : 
//		   (홍으로 검색하면 홍길동, 홍길순, 김무홍 등 이 출력)
//
//		9. 회원정보보기
//			1) 가입 순서대로 보기
//			1) 이름 오름차순 정렬
//		 - 회원전체 보여짐
		
		Mall_excute mall_excute = new Mall_excute();
				
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = mina_print(scan);
			switch (select) {
				case 1:
					System.out.println("--------------------------------");
					System.out.println("회원가입을 선택하셨습니다.");
					mall_excute.join_membership(scan);
					break;
					
				case 2:
					System.out.println("--------------------------------");
					System.out.println("로그인을 선택하셨습니다.");
					mall_excute.login(scan);
										
					break;
					
				case 3:
					System.out.println("--------------------------------");
					System.out.println("로그아웃을 선택하셨습니다.");
					mall_excute.logout(scan);
					
					break;
					
				case 4:
					System.out.println("--------------------------------");
					System.out.println("상품구매를 선택하셨습니다.");
					mall_excute.product_buy(scan);
					
					break;
					
				case 5:
					System.out.println("--------------------------------");
					System.out.println("구매품목보기를 선택하셨습니다.");
					mall_excute.purchase_list_print();
					break;
					
				case 8:
					System.out.println("--------------------------------");
					System.out.println("회원검색을 선택하셨습니다.");
					mall_excute.member_search(scan);
					
					break;
					
				case 9:
					System.out.println("--------------------------------");
					System.out.println("회원정보보기를 선택하셨습니다.");
					mall_excute.member_print(scan);
					break;
					
				case 0:
					System.out.println("--------------------------------");
					System.out.println("프로그램을 종료합니다.");
					break Loop1;

			}
		}
		
		
	}

	static int mina_print(Scanner scan) {
		int select = 0;
		System.out.println("=================================");
		System.out.println(" [ 쇼핑몰 프로그램 ] ");
		System.out.println("   1. 회원가입");
		System.out.println("   2. 로그인");
		System.out.println("   3. 로그아웃");
		System.out.println("   4. 상품구매");
		System.out.println("   5. 구매목록보기");
		System.out.println("   8. 회원정보검색");
		System.out.println("   9. 회원정보보기");
		System.out.println("   0. 종료");
		System.out.println("--------------------------------");
		System.out.print(" 원하는 번호를 입력해 주세요 : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
}
