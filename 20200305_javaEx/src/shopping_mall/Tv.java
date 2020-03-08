package shopping_mall;

public class Tv extends Product {
	String screen;
	int inch;
	boolean hdr;
	
	Tv() { };
	Tv(String screen, int inch, boolean hdr) {
		this.screen = screen;
		this.inch = inch;
		this.hdr = hdr;
	}
}

class LcdTv extends Tv {
	
	final int LCDTV_PRICE = 1000;
	
	LcdTv() {
		super("LCD", 55, false);
		price = LCDTV_PRICE;
		point = (int)(LCDTV_PRICE*0.1);
		name = "LCDTV";
		color = "Black";
	}
}

//Product
//int price;
//int point;
//String name;
//String color;

//1. 회원가입
//- 아이디 중복체크
//- 아이디 길이 3자리 이상
//- 객체로 ArrayList 저장
//- 아이디, 패스워드, 이름, 전화, 보유금액, 보유포인트
//
//2. 로그인
//- 아이디/패스워드 확인
//- 객체생성해서 Map 저장
//
//3. 로그아웃
//- ID를 물어봄 있으면 로그아웃.
//- 객체삭제
//
//4. 상품구매
//-> ID만 한번더 물어보기
//-> Map에 ID가 있으면 계속진행, 아니면 로그인하시오.
//1) LCDTV, 2)LEDTV, 3)OLEDTV
//4) 일반냉장고, 5) 양문형냉장고
//6) 통돌이 세탁기, 7) 드럼세탁기 8) 드럼건조세탁기
// - Product 상속 price, bonusPoint, name, color
//  TV : screen, inch / hdr기능(OLED에만 있음)
//  냉장고 : liter, door / d_cooling(양문형에만 있음)
//  세탁기 : size, shape / Sterilization (드럼건조세탁기에만 있음)
//
//5. 상품구매 목록보기
//- 상품구매한 리스트 보여주기
//
//8. 회원정보검색
//- 회원 검색 기능 : 
//  (홍으로 검색하면 홍길동, 홍길순, 김무홍 등 이 출력)
//
//9. 회원정보보기
//	1) 가입 순서대로 보기
//	1) 이름 오름차순 정렬
//- 회원전체 보여짐