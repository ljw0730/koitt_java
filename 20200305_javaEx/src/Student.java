
public class Student implements Comparable<Student> {

	int hak_num;
	String name;
	int total;
	
	Student() {
		
	}
	
	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}
	
	public String toString() {
		return "�й� : " + hak_num + " / �̸� : " + name + " / �հ� : " + total;
	}

	@Override
	public int compareTo(Student s) {
		// �̸����� �����Ѵ�.
		// ũ�� 1, ������ 0, ������ -1�� �����Ͽ�
		// ������ �÷��� �����ӿ�ũ�� ������ �Ѵ�.
		//return this.name.compareTo(s.name);
		
		// �հ�� ����
//		if(this.total < s.total) {
//			return -1;
//		} else if(this.total == s.total) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// �й����� �����ϱ�
		if(this.hak_num < s.hak_num) {
			return -1;
		} else if(this.hak_num == s.hak_num) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
