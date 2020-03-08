import java.util.Scanner;

public class CEx20200304_05 extends Object {

	public static void main(String[] args) {
		//String 메서드 - charAt(), equals(), equalsIgnoreCase()
		
		//1) 주민번호를 받아서 이사람이 남자인지 여자인지 확인하시오.
		//2) 컴퓨터학과 c0001 / 영문학과 e0002 / 국문학과 k0003 학과번호를 입력받아 무슨과인지를 확인하시오.
		//3) 대한항공
		
		System.out.println("1)");
		String[] id = { "881010-1111111", "850101-2222222"
						,"030730-3333333", "060324-4444444"
		};
		
		for(int i = 0; i < id.length; i++) {
			char c = id[i].charAt(8);
			if(c == '1' || c =='3') {
				System.out.println(id[i] + " : 남자입니다.");
			}
			else if(c == '2' || c == '4') {
				System.out.println(id[i] + " : 여자입니다.");
			}
		}
		
		System.out.println("========================================================");
		System.out.println("2)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("학과 번호를 입력해 주세요. (종료 : 0 ) : ");
			String major = scan.nextLine();
			if(major.equals("0")) {
				System.out.println("학과 확인을 중지합니다.");
				break;
			}
			if(major.equals("c0001")) {
				System.out.println("컴퓨터 학과 입니다.");
			} else if(major.equals("e0002")) {
				System.out.println("영문 학과 입니다.");
			} else if(major.equals("k0003")) {
				System.out.println("국문 학과 입니다.");
			}
		}
		
		System.out.println("========================================================");
		System.out.println("3)");
		while(true) {
			System.out.print("항공사를 입력해 주세요. (KE,ke / OZ,oz / AF,af) (종료 : 0) : ");
			String air = scan.nextLine();
			if(air.equals("0")) {
				System.out.println("항공사 확인을 중지합니다.");
				break;
			}
			
			if(air.equalsIgnoreCase("ke")) {
				System.out.println("대한항공 항공사 입니다.");
			}
			else if(air.equalsIgnoreCase("oz")) {
				System.out.println("아시아나 항공사 입니다.");
			}
			else if(air.equalsIgnoreCase("AF")) {
				System.out.println("AF 항공사 입니다.");
			}
		}
		
		
	}
	
}

