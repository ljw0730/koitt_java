import java.util.Calendar;

public class CEx20200305_03 {

	public static void main(String[] args) {
		// 현재 시간에서
		// 2020년 7월 24일 금요일 13:59:59
		// 현재까지 몇일 몇분 몇초가 남았는지 계산하시오.
		// 150일 12시 39분 50초 남았습니다.
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 7);
		cal2.set(Calendar.DATE, 24);
		cal2.set(Calendar.DAY_OF_WEEK, 6);
		cal2.set(Calendar.HOUR, 13);
		cal2.set(Calendar.MINUTE, 59);
		cal2.set(Calendar.SECOND, 59);
		
		// 위에 것을 한번에 할 수 있다.
		// cal2.set(2020, 7, 24, 13, 59, 59);
		
		long now = cal.getTimeInMillis();
		long olympic = cal2.getTimeInMillis();
		long d_day_milli = olympic - now;
//		System.out.println(d_day_milli);
		
		int d_day_second = (int)(d_day_milli/1000);
		
//		System.out.println(d_day_second);
		
		int date = (d_day_second/3600)/24;
		int hour = (d_day_second/3600)%24;
		int minute = (d_day_second%3600)/60;
		int second = (d_day_second%3600)%60;
		
		System.out.println("올림픽 남은 시간 : " + date + "일 " + hour + "시 "
							+ minute + "분 " + second + "초");
	}

}
