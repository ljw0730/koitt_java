import java.util.Scanner;

public class CEx20200224_04 {

	public static void main(String[] args) {
		// Student class�� ����Ǿ� ����
		
		// �θ��� �л��� �Է¹޾� - ȫ�浿 100, 100, 90 / �̼��� 80, 90, 70
		// �հ� ��� ���ϱ�.
		
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[2];	// �л�2�� ��ü�迭
		int[] score = new int[3];		// ���� �޴� �迭
		
		int stu_count = 0;
		
		stu_count = stu_input(stu, score, scan, stu_count);
		total_average(stu[0]);
		total_average(stu[1]);
		
		System.out.println("�Էµ� �л� �� : " + stu_count);
		print(stu[0]);
		print(stu[1]);
	}
		
	
	
	static int stu_input(Student[] stu, int[] score, Scanner scan, int stu_count) {
		for(int i = 0; i < stu.length; i++) {
			System.out.println("�̸��� �Է��ϼ���.>>");
			String name = scan.nextLine();
			for(int j = 0; j < 3; j++) {
				System.out.println("���� �Է��ϼ��� >>");
				score[j] = scan.nextInt();
				scan.nextLine();
			}
			stu[i] = new Student(name, score[0], score[1], score[2]);
			
			stu_count++;
		}
		return stu_count;
	}
	
	static void total_average(Student stu) {
		stu.total();
		stu.average();
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
