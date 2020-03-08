import java.util.Scanner;

public class CEx20200212_06 {
	public static void main(String[] args) {
		// String 배열 12개짜리
		
		String[] ganji = {
							"쥐", "소", "호랑이", "토끼",
							"용", "뱀", "말", "양",
							"원숭이", "닭", "개", "돼지"
						 };
		// 자 축 인 묘    진 사 오 미    신 유 술 해 
		String[] ganji2 = {
							"자", "축", "인", "묘",
							"진", "사", "오", "미",
							"신", "유", "술", "해"
		};
		
		String select = "";
				
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("십이간지를 입력하세요.(종료 : 0)");
			select = scan.next();
			
			if(select.equals("0")) {
				break;
			}
			
			for(int i = 0; i <ganji2.length; i++) {
				if(select.equals(ganji[i])) {
					System.out.println(select + "는(은) 십이간지에서 "+ (i+1) +"번째 " + ganji2[i]);
				}
				else if(select.equals(ganji2[i])) {
					System.out.println(select + "는(은) 동물에서 "+ (i+1) +"번째 " + ganji[i]);
				}
			}
			System.out.println("=========================");
		
			
		}	//while

		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	} // main
} //class
