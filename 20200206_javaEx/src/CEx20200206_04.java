import java.util.Scanner;

public class CEx20200206_04 {
	public static void main(String[] args) {
		// [지하철 요금계산 프로그램]
		// 1호선 (가산 ~ 외대앞)
		// 기본요금 1250원
		// 5정거장 마다 100원 추가 
		// 1 ~ 5 - 0원
		// 6 ~ 10 - 100원 추가
		// 11 ~ 15 - 200원 추가
		// 16 ~ 20 - 300원 추가
		
		// 1.가산디지털단지 - 2.구로 - 3.신도림 - 4.영등포 - 5.실길
		// 6.대방 - 7.노량진 - 8.용산 - 9.남영 - 10.서울역
		// 11.시청 - 12.종각 - 13.종로3가 - 14.종로5가 - 15.동대문
		// 16.동묘앞 - 17.신설동 - 18.제기동 - 19.청량리 - 20.회기
		
		// 출발하실 역을 입력하세요. (종료 : 0) :1
		// 도착하실 역을 입력하세요. (종료 : 0) :5
		// 5-1+1 = 5구간
		
		// 절대값 구하기 : math.abs(5-1)
		
		// 출발역 : 가산디지털단지역
		// 도착역 : 신길역
		
		// 한구간에 2분 30초
		
		int start_station = 0;			// 출발역 번호
		int end_station = 0;			// 도착역 번호
		int gab = 0;					// 출발역과 도착역 사이의 역 수
		int absolute = 0;				// gab의 절대값
		int charge = 0;					// 내야하는 비용
		final int basic_charge = 1250;	// 기본요금
		
		int section_won = 100;			// 일정구간당 추가 비용
				
		int min = 0;					// 걸리는 시간에서 분
		int sec = 0;					// 걸리는 시간에서 초
		final int min_basic = 2;		// 한 구간당 걸리는 시간
		final int sec_basic = 30;		// 2분 30초
		
		String yn = "";					// 다시 시작하기 변수
		
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {
			System.out.println("============================");
			System.out.println(" [ 지하철 요금계산 프로그램 ] ");
			System.out.println("1.가산디지털단지 - 2.구로 - 3.신도림 - 4.영등포 - 5.신길");
			System.out.println("6.대방 - 7.노량진 - 8.용산 - 9.남영 - 10.서울역");
			System.out.println("11.시청 - 12.종각 - 13.종로3가 - 14.종로5가 - 15.동대문");
			System.out.println("16.동묘앞 - 17.신설동 - 18.제기동 - 19.청량리 - 20.회기");
			System.out.printf("출발하실 역을 입력하세요.(종료 : 0) : ");
			start_station = scan.nextInt();
			
			if(start_station == 0) {
				break;
			}
			
			System.out.println("============================");
			System.out.println("1.가산디지털단지 - 2.구로 - 3.신도림 - 4.영등포 - 5.신길");
			System.out.println("6.대방 - 7.노량진 - 8.용산 - 9.남영 - 10.서울역");
			System.out.println("11.시청 - 12.종각 - 13.종로3가 - 14.종로5가 - 15.동대문");
			System.out.println("16.동묘앞 - 17.신설동 - 18.제기동 - 19.청량리 - 20.회기");
			System.out.printf("도착하실 역을 입력하세요.(종료 : 0) : ");
			end_station = scan.nextInt();
			
			if(end_station == 0) {
				break;
			}
			
			if(end_station >= start_station) {
				gab = end_station - start_station + 1;
			}
			else {
				gab = end_station - start_station - 1;
			}
 			absolute = Math.abs(gab);
 			
 			min = min_basic * (absolute - 1);
 			sec	= sec_basic * (absolute - 1);
 			int divided_value = sec/60;
 			int remaining_values = sec%60;
 			min += divided_value;
 			sec = remaining_values;
					
			switch(absolute) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					charge = basic_charge + 0 * section_won;
					
					break;
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					charge = basic_charge + 1 * section_won;
					break;
					
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
					charge = basic_charge + 2 * section_won;
					break;
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					charge = basic_charge + 3 * section_won;
					break;	
				
			}
			System.out.println("============================");
			System.out.println("출발역 : " + start_station);
			System.out.println("도착역 : " + end_station);
			System.out.println("요금은 " + charge + "원 입니다.");
			System.out.println("소요시간은 " + min + "분 " + sec + "초 입니다." );
			
			while(true) {
				System.out.println("다시 지하철 요금 계산을 하시겠습니까?(Y/N)");
				yn = scan.next();
				
				//equalsIgnoreCase : 대소문자 상관없이 비교
				if(yn.equalsIgnoreCase("y")) {
					continue Loop1;
				}
				else if(yn.equalsIgnoreCase("n")) {
					break Loop1;
				}
				else {
					System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				}
			}
			
			
			
		}
		System.out.println("============================");
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
		
		
	}	//main
}	// class
	