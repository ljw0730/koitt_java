import java.util.ArrayList;
import java.util.Collections;

public class CEx20200305_05 {

	public static void main(String[] args) {
		//ArrayList �����ϱ�
		
		// �⺻�� �����ϱ�
		ArrayList list = new ArrayList();
		
		Student stu1 = new Student(1, "ȫ�浿", 300);
		Student stu2 = new Student(2, "�̼���", 289);
		Student stu3 = new Student(3, "������", 270);
		Student stu4 = new Student(4, "�ں���", 250);
		Student stu5 = new Student(5, "�庸��", 270);
				
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		// ����ڽ� - �⺻���� List�� ���� ������
		// �ڵ����� ��ü�� ��ȯ�ؼ� ���� �ִ´�.
		list.add(3);
		
		// ����Ʈ �������� ����
		Collections.sort(list);
		// toString�� �������̵� �Ǿ� �ִ�.
		System.out.println(list);
		
		// ����Ʈ �������� ����
		Collections.reverse(list);
		System.out.println(list);

		System.out.println("===============================================");
		
		// ��ü �����ϱ�
		ArrayList list2 = new ArrayList();
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);
		
		// ��ü�� ��쿡�� ��üŬ������ ��������� ���־�� �Ѵ�.
		// implements Comparable<Student>
		// public int Comparable () { }
		Collections.sort(list2);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("------------------------------------------------");
		
		Collections.reverse(list2);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
