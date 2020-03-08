import java.util.Scanner;

public class CEx20200217_09 {
	public static void main(String[] args) {
		// 시 - int, 분 - int , 초 - float(소수점 첫째자리)
		// 10개의 time을 받습니다.
		// 배열을 선언해서 받으세요.
		// 알람 시간 맟춤 프로그램
		
		Time[] time = new Time[3];
//		String[] subject = { "시", "분", "초" };
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알람을 설정해 주세요.");
		for(int i = 0; i < time.length; i++ ) {
			time[i] = new Time();
			
			System.out.print((i+1) + "번째 '시' 를 입력해 주세요. : ");
			time[i].hour = scan.nextInt();
			
			System.out.print((i+1) + "번째 '분' 을 입력해 주세요. : ");
			time[i].minute = scan.nextInt();
			
			System.out.print((i+1) + "번째 '초' 을 입력해 주세요. : ");
			time[i].second = scan.nextFloat();
			scan.nextLine();
			
			time[i].print();
		}
		
	}
}


