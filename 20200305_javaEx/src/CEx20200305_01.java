import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CEx20200305_01 {

	public static void main(String[] args) {
		//calendar

		Calendar today = Calendar.getInstance();
		
		//today�� ���� �ִ� ��� �������� ���� �����ش�.
		System.out.println(today);
		
		// ��¥ �� �ð� ��� ���� �ٲٱ�
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ���ϸ� �̱������� �������� ���´�.
		System.out.println("������� �Ͻ���� : " + today.getTime());
		System.out.println("�����ִ� �Ͻ���� : " + format1.format(today.getTime()));
		
		// 1970.01.01 �� �������� ���� �ð��� �и� ������� ��Ÿ����.
		System.out.println("����ð��� �и�������� ǥ�� : " + today.getTimeInMillis());
		
		int year = today.get(Calendar.YEAR);
		System.out.println("today ���� �⵵ : " + year);
		// ���� ����ϴ� �� 0~11 ���� ��� 0->1��, 1->2��, 2->3��, ... , 11->12��
		// ���� +1 �� ���־�� �Ѵ�. ��ȣ����
		int month = today.get(Calendar.MONTH);
		System.out.println("today ���� �� : " + (month+1));
		int date = today.get(Calendar.DATE);
		System.out.println("today ���� �� : " + date);
		
		System.out.println("============================================");
		
		//Ư���� ��¥ �����ϱ� - Date
		String d_day = "2020-03-14 11:59:59";
		long between = 0L;
		// parse�� SimpleDateFormat�� ���������� ����
		// Date, Calendar�� Ư�� �������� Ư�� ��¥/�ð��� �־��ش�.
		// parse�� ����ó���� �ؾ��Ѵ�.
		try {
			Date end_date = format1.parse(d_day);
			System.out.println("�����Է� �Ͻ� : " + end_date.getTime());
			System.out.println("����ð��� �����Է½ð� ���� : " + (today.getTimeInMillis() - end_date.getTime()));
			System.out.println("����ð��� �����Է½ð� ����(abs) : " + Math.abs((today.getTimeInMillis() - end_date.getTime())) );
			// longŸ������ ��ȯ�� �� �ִ�.
			between = Math.abs((today.getTimeInMillis() - end_date.getTime()));
			System.out.println("longŸ�� ���� : " + between);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("============================================");
		
		//Ư���� ��¥ �����ϱ� - Calendar
		Calendar today2 = Calendar.getInstance();
		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 03);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);
		
		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 ���� �⵵ : " + year2);
		// ���� ����ϴ� �� 0~11 ���� ��� 0->1��, 1->2��, 2->3��, ... , 11->12��
		// ���� +1 �� ���־�� �Ѵ�. ��ȣ����
		int month2 = today2.get(Calendar.MONTH);
		System.out.println("today2 ���� �� : " + (month2+1));
		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 ���� �� : " + date2);
		System.out.println("today2 �и������� : " + today2.getTimeInMillis());
		
	}

}
