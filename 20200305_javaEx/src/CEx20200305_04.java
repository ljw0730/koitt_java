import java.util.Calendar;

public class CEx20200305_04 {

	public static void main(String[] args) {
		// 2020�� 3�� 14�� 15�� 39�� 42��
		// 2021�� 4�� 14�� 12�� 59�� 59��
		// ���� ��� ��� ���ʰ� ���Ҵ��� ����Ͻÿ�.
		
		// 2021�� 4�� 14���� ������������ ����Ͻÿ�.
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2020, 2, 14, 15, 39, 42); // 3�� �̹Ƿ� 2�� ����
		cal2.set(2021, 3, 14, 12, 59, 59); // 4�� �̹Ƿ� 3�� ����
		
		long cal1_milly = cal1.getTimeInMillis();
		System.out.println(cal1_milly);
		long cal2_milly = cal2.getTimeInMillis();
		System.out.println(cal2_milly);
		int between = (int)(Math.abs(cal1_milly - cal2_milly)/1000);
		
		int date = (between/3600)/24;
		int hour = (between/3600)%24;
		int minute = (between%3600)/60;
		int second = (between%3600)%60;
		
		System.out.println("D-day : " + date + "�� " + hour + "�� "
				+ minute + "�� " + second + "��");
		
		///////////////////////////////////////////////////////
		
		String[] day_str = { "", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2021, 3, 14); // 4�� �̹Ƿ� 3�� ����
		int year3 = cal3.get(Calendar.YEAR);
		int month3 = cal3.get(Calendar.MONTH);
		int date3 = cal3.get(Calendar.DATE);
		int day3 = cal3.get(Calendar.DAY_OF_WEEK);
		System.out.println(year3 + "�� " + (month3+1) + "�� " + date3 + "�� " + day_str[day3]);
		
	}

}
