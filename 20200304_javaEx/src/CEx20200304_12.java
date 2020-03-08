import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CEx20200304_12 {
	
	public static void main(String[] args) {
		// ��¥
		
		// ����ð� ��������
		Calendar today = Calendar.getInstance();
		
		// ������������ ����̵�
		// Wed Mar 04 17:18:31 KST 2020
		System.out.println(today.getTime());
		
		// ���� ��¥/�ð��� �Է��� �������� ���߾� �ش�.
		// MM, HH �빮�� ����
		// MM - �� / mm - ��
		// HH - 24�ð� ���� / hh - 12�ð� ����
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(format1.format(today.getTime()));
		
		System.out.println("���� �⵵ : " + today.get(Calendar.YEAR));
		// ���� + 1�� ���־�� �Ѵ�. 0 - 1��, 1 - 2��, ... , 11 - 12��
		System.out.println("���� �� : " + today.get(Calendar.MONTH));
		System.out.println("���� �� : " + today.get(Calendar.DAY_OF_MONTH));
		
		
	}
	
}
