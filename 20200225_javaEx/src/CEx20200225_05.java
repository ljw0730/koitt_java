
public class CEx20200225_05 {

	public static void main(String[] args) {
		// Student class �� ����Ǿ� ����
		// Lotto class �� ����Ǿ� ����
		
		// �迭�� �ʱ�ȭ ����
		Student[] stu = new Student[3];
		String[] name = new String[] { "ȫ�浿", "�̼���", "������" };	// ���ļ���
		int[] grade = { 3, 4, 1 };	// ��ļ��� - ��쿡 ���� ������ ���� ����.
		
//		stu[0] = new Student(name[0], grade[0]);
//		stu[1] = new Student(name[1], grade[1]);
//		stu[2] = new Student(name[2], grade[2]);
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student(name[i], grade[i]);
		}
		
		// �⺻Ÿ�Ժ����� �迭
		// lotto��� 45�� �迭�� ���� 1~45���� ���ڸ� �־����.
		int[] lotto = new int[45];
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		// Lotto ��ü�� �����ϸ�
		// 1~45���� ���ڰ� �� �ִ� �迭�� ������� ������ �� �ֵ��� �ϼ���.
		// ���� �ϸ� 1~45���� �� �ִ� lotto�� ���� �� �� �ֵ��� �غ�����.
		Lotto lotto2 = new Lotto();
		for(int i = 0; i < lotto2.ball.length; i++) {
			System.out.println(lotto2.ball[i]);
		}

	}

}

