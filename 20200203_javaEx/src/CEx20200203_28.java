import java.util.Scanner;

public class CEx20200203_28 {
	public static void main(String[] args) {
		// 95�� �̻� -> A+ A-, 85���̻� B+, B-
		// C+ C- D+ D- F
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���. : ");
		
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
		
		System.out.printf("����� ���� �� %s�Դϴ�.", str);
		
		scan.close();
			
	}
}
