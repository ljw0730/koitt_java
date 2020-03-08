import java.util.Scanner;

public class CEx20200203_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수를 입력하세요.");
		int check = scan.nextInt();
		
		if(check > 60) {
			System.out.println("합격");
		}
		else if(check==60){
			System.out.println("재시험");
		}
		else {
			System.out.println("불합격");
		}
		
		scan.close();
	}

}
