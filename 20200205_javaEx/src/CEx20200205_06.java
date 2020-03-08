import java.util.Scanner;

public class CEx20200205_06 {

	public static void main(String[] args) {
	
		// 입력을 받아 해당하는 단만 출력 하지 않기
	
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요.(1~9 / 0:종료) : ");
		int dan = scan.nextInt();
	
		for(int i = dan; i <= dan; i ++) {
			for (int j = 1; j <=9; j ++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}
		
		scan.close();
	}

}
