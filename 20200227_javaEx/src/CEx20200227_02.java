
public class CEx20200227_02 {

	public static void main(String[] args) {
		// stu02 class�� ����Ǿ� ����
		// singleton ����
				
//		Stu02 s1 = new Stu02();
//		s1.setName("ȫ�浿");	// private�� ����Ǿ��� ������ name�� ���� �־��ַ���
//								// setName �޼ҵ带 ���� ���� �־�����Ѵ�.
//		s1.setKor(100);
		
//		System.out.println(s1);
		
		Stu02 s2 = Stu02.getInstance();
		// Stu02 class�� s������ �ּҸ� �����´�.
		// Time t = new Time();
		// Time t2 = new Time();
		// t2 = t;    �� ���� ���̴�.
		
		Stu02 s3 = Stu02.getInstance();
		// Stu02 class�� ���� ���� s�� ���� �ִ� �ּҸ� �����´�.
		
		s2.setName("ȫ�浿");
		s3.setName("�̼���");
		// ���� �ּҸ� �ٶ󺸰� �ֱ� ������ �������� ���� ���� �̼������� �Ѵ� ���õȴ�.
		
		System.out.println(s2);
		System.out.println(s3);

	}

}
