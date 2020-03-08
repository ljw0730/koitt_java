import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CEx20200305_02 {

	public static void main(String[] args) {
		// 2020-03-05 10:40:55 현재 날짜/시간을 출력을하시오.
		// 2020년 3월 5일 목요일 -> 출력하시오. DAY_OF_WEEK
		// DAY_OF_WEEK의 반환 타입은 integer 이므로 요일은 switch
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("현재 날짜/시간 : " + format1.format(cal.getTime()));
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] day_str = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		
		System.out.println("현재 날짜 : " + year + "년 " + (month+1) + "월 " 
							+ date + "일 " + day_str[day]);
		
		cal2.set(Calendar.YEAR, 2021);
		cal2.set(Calendar.MONTH, 3);
		cal2.set(Calendar.DATE, 5);
		
		System.out.println("입력한 년도 : " + cal2.get(Calendar.YEAR));
		System.out.println("입력한 월 : " + cal2.get(Calendar.MONTH));
		System.out.println("입력한 일 : " + cal2.get(Calendar.DATE));
		
	}

}
