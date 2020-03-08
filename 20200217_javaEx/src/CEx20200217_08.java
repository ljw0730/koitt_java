import java.util.Scanner;

public class CEx20200217_08 {
	public static void main(String[] args) {
		// 시 - int, 분 - int , 초 - float(소수점 첫째자리)
		// 10개의 time을 받습니다.
		// 배열을 선언해서 받으세요.
		// 알람 시간 맟춤 프로그램
		
		int[] hour = new int[10];
		int[] minute = new int[10];
		float[] second = new float[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < hour.length; i++) {
			System.out.println("[ 알람시간 설정 프로그램 ]");
			System.out.print("시간을 입력하세요. : ");
			hour[i] = scan.nextInt();
			System.out.print("분을 입력하세요 : ");
			minute[i] = scan.nextInt();
			System.out.print("초을 입력하세요 : ");
			second[i] = scan.nextFloat();
			
			System.out.println("알람설정 : " + hour[i] + "시 " + minute[i] + "분 " + second[i] + "초");
			
		}
		
	}
}


