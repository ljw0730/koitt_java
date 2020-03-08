import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CEx20200305_01 {

	public static void main(String[] args) {
		//calendar

		Calendar today = Calendar.getInstance();
		
		//today가 갖고 있는 모든 변수들의 값을 보여준다.
		System.out.println(today);
		
		// 날짜 및 시간 출력 형식 바꾸기
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 안하면 미국기준의 형식으로 나온다.
		System.out.println("포멧없는 일시출력 : " + today.getTime());
		System.out.println("포멧있는 일시출력 : " + format1.format(today.getTime()));
		
		// 1970.01.01 일 시작으로 현재 시간을 밀리 세컨드로 나타낸다.
		System.out.println("현재시간을 밀리세컨드로 표시 : " + today.getTimeInMillis());
		
		int year = today.get(Calendar.YEAR);
		System.out.println("today 현재 년도 : " + year);
		// 월을 출력하는 데 0~11 값을 출력 0->1월, 1->2월, 2->3월, ... , 11->12월
		// 따라서 +1 을 해주어야 한다. 괄호주의
		int month = today.get(Calendar.MONTH);
		System.out.println("today 현재 월 : " + (month+1));
		int date = today.get(Calendar.DATE);
		System.out.println("today 현재 일 : " + date);
		
		System.out.println("============================================");
		
		//특정한 날짜 지정하기 - Date
		String d_day = "2020-03-14 11:59:59";
		long between = 0L;
		// parse는 SimpleDateFormat의 참조변수를 통해
		// Date, Calendar에 특정 포멧으로 특정 날짜/시간을 넣어준다.
		// parse는 예외처리를 해야한다.
		try {
			Date end_date = format1.parse(d_day);
			System.out.println("직접입력 일시 : " + end_date.getTime());
			System.out.println("현재시간과 직접입력시간 차이 : " + (today.getTimeInMillis() - end_date.getTime()));
			System.out.println("현재시간과 직접입력시간 차이(abs) : " + Math.abs((today.getTimeInMillis() - end_date.getTime())) );
			// long타입으로 변환할 수 있다.
			between = Math.abs((today.getTimeInMillis() - end_date.getTime()));
			System.out.println("long타입 변수 : " + between);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("============================================");
		
		//특정한 날짜 지정하기 - Calendar
		Calendar today2 = Calendar.getInstance();
		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 03);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);
		
		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 지정 년도 : " + year2);
		// 월을 출력하는 데 0~11 값을 출력 0->1월, 1->2월, 2->3월, ... , 11->12월
		// 따라서 +1 을 해주어야 한다. 괄호주의
		int month2 = today2.get(Calendar.MONTH);
		System.out.println("today2 지정 월 : " + (month2+1));
		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 지정 일 : " + date2);
		System.out.println("today2 밀리세컨드 : " + today2.getTimeInMillis());
		
	}

}
