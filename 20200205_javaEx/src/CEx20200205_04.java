import java.util.Scanner;

public class CEx20200205_04 {

	public static void main(String[] args) {
	
		// 입력을 받아 해당하는 구구단만 출력
	
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요. : ");
		int input = scan.nextInt();
	
		
		for(int i = 2; i <= 9; i++) {
			if (i != input) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}

		scan.close();
	}

}
