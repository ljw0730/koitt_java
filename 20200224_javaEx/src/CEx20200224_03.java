
public class CEx20200224_03 {

	public static void main(String[] args) {
		// Student class�� ����Ǿ� ����
		
		// �θ��� �л� - ȫ�浿 100, 100, 90 / �̼��� 80, 90, 70
		// �հ� ��� ���ϱ�.
		
		Student stu1 = new Student("ȫ�浿", 100, 100, 100);
		Student stu2 = new Student("�̼���", 80, 90, 70);
		
		stu1.total();
		stu1.average();
		
		stu2.total();
		stu2.average();
		
		print(stu1);
		print(stu2);
				
	}
	
	static void print(Student stu) {
		System.out.print(stu.name + "\t");
		System.out.print(stu.kor + "\t");
		System.out.print(stu.eng + "\t");
		System.out.print(stu.math + "\t");
		System.out.print(stu.total + "\t");
		System.out.print(stu.avg + "\t");
		System.out.println();
	}
	
}
