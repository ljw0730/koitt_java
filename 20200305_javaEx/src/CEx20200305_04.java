import java.util.Calendar;

public class CEx20200305_04 {

	public static void main(String[] args) {
		// 2020년 3월 14일 15시 39분 42초
		// 2021년 4월 14일 12시 59분 59초
		// 몇일 몇시 몇분 몇초가 남았는지 계산하시오.
		
		// 2021년 4월 14일은 무슨요일인지 출력하시오.
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2020, 2, 14, 15, 39, 42); // 3월 이므로 2를 넣음
		cal2.set(2021, 3, 14, 12, 59, 59); // 4월 이므로 3을 넣음
		
		long cal1_milly = cal1.getTimeInMillis();
		System.out.println(cal1_milly);
		long cal2_milly = cal2.getTimeInMillis();
		System.out.println(cal2_milly);
		int between = (int)(Math.abs(cal1_milly - cal2_milly)/1000);
		
		int date = (between/3600)/24;
		int hour = (between/3600)%24;
		int minute = (between%3600)/60;
		int second = (between%3600)%60;
		
		System.out.println("D-day : " + date + "일 " + hour + "시 "
				+ minute + "분 " + second + "초");
		
		///////////////////////////////////////////////////////
		
		String[] day_str = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2021, 3, 14); // 4월 이므로 3을 넣음
		int year3 = cal3.get(Calendar.YEAR);
		int month3 = cal3.get(Calendar.MONTH);
		int date3 = cal3.get(Calendar.DATE);
		int day3 = cal3.get(Calendar.DAY_OF_WEEK);
		System.out.println(year3 + "년 " + (month3+1) + "월 " + date3 + "일 " + day_str[day3]);
		
	}

}
