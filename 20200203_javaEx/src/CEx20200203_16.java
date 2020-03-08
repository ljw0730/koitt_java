import java.util.Scanner;

public class CEx20200203_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. : ");
		int x = scan.nextInt();
		
		String str = (x >= 60 ? "합격" : "불합격");
		System.out.println("당신은 " + str + "입니다.");
		
		scan.close();

	}

}
