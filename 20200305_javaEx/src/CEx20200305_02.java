import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CEx20200305_02 {

	public static void main(String[] args) {
		// 2020-03-05 10:40:55 ���� ��¥/�ð��� ������Ͻÿ�.
		// 2020�� 3�� 5�� ����� -> ����Ͻÿ�. DAY_OF_WEEK
		// DAY_OF_WEEK�� ��ȯ Ÿ���� integer �̹Ƿ� ������ switch
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("���� ��¥/�ð� : " + format1.format(cal.getTime()));
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] day_str = { "", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		
		System.out.println("���� ��¥ : " + year + "�� " + (month+1) + "�� " 
							+ date + "�� " + day_str[day]);
		
		cal2.set(Calendar.YEAR, 2021);
		cal2.set(Calendar.MONTH, 3);
		cal2.set(Calendar.DATE, 5);
		
		System.out.println("�Է��� �⵵ : " + cal2.get(Calendar.YEAR));
		System.out.println("�Է��� �� : " + cal2.get(Calendar.MONTH));
		System.out.println("�Է��� �� : " + cal2.get(Calendar.DATE));
		
	}

}
