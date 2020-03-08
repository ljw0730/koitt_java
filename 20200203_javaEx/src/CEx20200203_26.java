import java.util.Scanner;

public class CEx20200203_26 {
	public static void main(String[] args) {
		//생년을 입력받아 20세이상 이면
		//이벤트에 당첨되셨습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요. : ");
		
		String str = scan.nextLine();
		
		//substring(index1, index2) : index1 자리부터 index2 자리 전까지 복사
		String str1 = str.substring(0, 4);
		String str2 = str.substring(4, 6);
		String str3 = str.substring(6, 8);
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		int year = Integer.parseInt(str1);
		
		if (2020 - year + 1 >= 20) {
			if(str2.equals("02")) {
				System.out.println("항공권에 당첨 되셨습니다.");
			}
			else {
				System.out.println("02월 생만을 위한 이벤트 입니다.");
			}
		}
		else {
			System.out.println("20세 이상만 이벤트에 참여 할 수 있습니다.");
		}
		
		scan.close();
	}
}
