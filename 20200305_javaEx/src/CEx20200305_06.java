
import java.util.ArrayList;
import java.util.Collections;

public class CEx20200305_06 {

	public static void main(String[] args) {
		//ArrayList add, remove
		
		ArrayList list = new ArrayList();
		
//		Student stu1 = new Student(1, "ȫ�浿", 300);
//		Student stu2 = new Student(2, "�̼���", 289);
//		Student stu3 = new Student(3, "������", 270);
//		Student stu4 = new Student(4, "�ں���", 250);
//		Student stu5 = new Student(5, "�庸��", 270);
				
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		// ����ڽ� - �⺻���� List�� ���� ������
		// �ڵ����� ��ü�� ��ȯ�ؼ� ���� �ִ´�.
		list.add(3);
	
		// Ư�� ��ġ�� �� �ֱ�
		list.add(3, new Integer(7));
		// 0, 1, 2, 3 -> �� 4��° �ڸ��� 7�� ����
		
		list.add(5, new Integer(8));
		// 0, 1, 2, 3, 4, 5 -> �� 6��° �ڸ��� 8�� ����
		
		// Ư�� ��ġ �� �����
//		list.remove(1);
		// 0, 1 -> �� 2��° �ڸ��� ��4�� ������
		
		// ��ü�� ����� ���� for������ ����� �Ǹ�
		// 1��° ����� ���� ���ܿ���
		// ���ܿ� ���·� 2��°�� ����� �� ���ܿ���
		// ���ܿ� ���·� 3��°�� ����� �� ���ܿ���
		// �̷��� ����� ������ �� �������� �ʴ´�.
//		for(int i = 0; i < list.size(); i++) {
//			list.remove(i);
//			System.out.println(list);
//		}
		
		// �̸� �����ϱ� ���� ���ʿ��� �����.
//		for(int i = list.size()-1; i>=0; i--) {
//			list.remove(i);
//			System.out.println(list);
//		}
		
		// �Ǵ� clear() �޼��带 ����Ѵ�.
		list.clear();
		
		System.out.println(list);
		
	}

}
