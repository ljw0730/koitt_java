import java.util.Scanner;

public class CEx20200204_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		
		int score = scan.nextInt();
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
				// grade = grade + "+"
			}
			else {
				grade += "-";
			}
		}
		else if (score >= 80) {
			grade ="B";
			if(score >=85) {
				grade += "+";
			}
			else {
				grade += "-";
			}
		}
		else if (score >= 70) {
			grade ="C";
			if(score >=75) {
				grade += "+";
			}
			else {
				grade += "-";
			}
		}
		else if (score >= 60) {
			grade ="D";
			if(score >=65) {
				grade += "+";
			}
			else {
				grade += "-";
			}
		}
		else {
			grade = "F";
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		scan.close();	
	}
}
