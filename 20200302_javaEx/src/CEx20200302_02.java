import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_02 {

	public static void main(String[] args) {
		// Student class �� ����Ǿ� ����
		// Vector<Student> list = new Vector<Student>();
		
		Scanner scan = new Scanner(System.in);
		
		Vector<Student> list = new Vector<Student>();
		ArrayList<Student> list2 = new ArrayList<Student>();
		// Vector �� ArrayList�� �����ϴ�.
		// ���̰� �ִٸ� Vector�� ������, ArrayList�� �Ź����̸�,
		// Vector�� ��Ƽ�����带 �����ϴ� �ݸ� ArrayList�� �̱۽����带 �����Ѵ�.
		
		String[] name1 = {"ȫ�浿", "�̼���", "������"};
		int[] kor1 = {100, 90, 95};
		int[] eng1 = {80, 70, 89};

		// ���Ϳ� Student ��ü�� ����
		// ���Ϳ� ���� ���� �ڵ����� Object�� ����ȯ�Ǿ� ���� ����.
//		Student s1 = new Student(name1[0], kor1[0], eng1[0]);
//		list.add(s1); 
		list.add(new Student(name1[0], kor1[0], eng1[0]));
		list.add(new Student(name1[1], kor1[1], eng1[1]));
		list.add(new Student(name1[2], kor1[2], eng1[2]));
		
		if(list.isEmpty()) {	//Vector�� ��� ������... ��, �Էµ� ���� ���ٸ�
			System.out.println("�л��Է��� �����ϴ�.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				System.out.print((i+1) + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.total + "\t");
				System.out.print(s.avg + "\t");
				System.out.println();
			}
		}
		
//		String name2 = "";
//		int kor2 = 0;
//		int eng2 = 0;
//		
//		while(true) {
//			System.out.print("�̸��� �Է��� �ּ���. : ");
//			name2 = scan.nextLine();
//			System.out.print("���������� �Է��� �ּ���. : ");
//			kor2 = scan.nextInt();
//			System.out.print("���������� �Է��� �ּ��� : ");
//			eng2 = scan.nextInt();
//			scan.nextLine();
//			
//			list.add(new Student(name2, kor2, eng2));
//			System.out.println("1�� ������ �߰� �Ǿ����ϴ�.");
//		}
		
	}

}
