import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CEx20200304_12 {
	
	public static void main(String[] args) {
		// 날짜
		
		// 현재시간 가져오기
		Calendar today = Calendar.getInstance();
		
		// 영문포멧으로 출력이됨
		// Wed Mar 04 17:18:31 KST 2020
		System.out.println(today.getTime());
		
		// 지금 날짜/시간을 입력한 포멧으로 맞추어 준다.
		// MM, HH 대문자 주의
		// MM - 월 / mm - 분
		// HH - 24시간 기준 / hh - 12시간 기준
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(format1.format(today.getTime()));
		
		System.out.println("현재 년도 : " + today.get(Calendar.YEAR));
		// 월은 + 1을 해주어야 한다. 0 - 1월, 1 - 2월, ... , 11 - 12월
		System.out.println("현재 월 : " + today.get(Calendar.MONTH));
		System.out.println("현재 일 : " + today.get(Calendar.DAY_OF_MONTH));
		
		
	}
	
}
