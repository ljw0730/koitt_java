import java.util.Scanner;

public class CEx20200204_04 {
	public static void main(String[] args) {
		// 1~45 사이의 3개의 숫자를 입력 받아서
		// 1~45 난수 와 비교하여 맞추기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 45 사이의 3개의 숫자를 입력하세요(1/3) : ");
		int i = scan.nextInt();
		System.out.print("1 ~ 45 사이의 3개의 숫자를 입력하세요(2/3) : ");
		int i2 = scan.nextInt();
		System.out.print("1 ~ 45 사이의 3개의 숫자를 입력하세요(3/3) : ");
		int i3 = scan.nextInt();
		
		int ran = (int)(Math.random() * 45) + 1;
				
		if((i == ran) || (i2 == ran) || (i3 == ran) ) {
			System.out.println("당첨입니다. 당첨번호는 " + ran + "이었습니다.");
		}
		else {
			System.out.println("낙첨입니다. 당첨번호는 "+ ran + "이었습니다.");
		}
		System.out.printf("입력하신 숫자는 %d %d %d 입니다.", i, i2, i3);
		
		scan.close();
	}
}
