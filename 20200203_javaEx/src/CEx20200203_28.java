import java.util.Scanner;

public class CEx20200203_28 {
	public static void main(String[] args) {
		// 95점 이상 -> A+ A-, 85좀이상 B+, B-
		// C+ C- D+ D- F
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요. : ");
		
		int score = scan.nextInt();
		String str = "";
		
		if(score >= 90) {
			str = "A";
			if(score >= 95) {
				str += "+";
			}
			else {
				str += "-";
			}
		}
		else if (score >= 80){
			str = "B";
			if(score >= 85) {
				str += "+";
			}
			else {
				str += "-";
			}
		}
		else if (score >= 70){
			str = "C";
			if(score >= 75) {
				str += "+";
			}
			else {
				str += "-";
			}
		}
		else if (score >= 60){
			str = "D";
			if(score >= 65) {
				str += "+";
			}
			else {
				str += "-";
			}
		}
		else {
			str = "F";
		}
		
		System.out.printf("당신의 점수 는 %s입니다.", str);
		
		scan.close();
			
	}
}
