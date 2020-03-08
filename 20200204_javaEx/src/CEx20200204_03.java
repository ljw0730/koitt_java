import java.util.Scanner;

public class CEx20200204_03 {
	public static void main(String[] args) {
		// O, X
		
		Scanner scan = new Scanner(System.in);
		System.out.print("생각나는 번호를 입력하세요.(1, 2) : ");
		
		int ox_true = scan.nextInt();
		
		// 1 ~ 2 난수발생
		int ox = (int)(Math.random() * 2) + 1;
		
		if(ox_true == ox) {
			System.out.printf("정답입니다. 랜덤난수 %d", ox);
		}
		else {
			System.out.printf("오답입니다. 랜덤난수 %d", ox);
		}
		
		scan.close();
	}
}
