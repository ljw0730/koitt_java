package Student;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m = new Method();
		int select = 0;
				
		while(true) {
			select = m.main_print();
			
			switch (select) {
				case 1:
					System.out.println("�л������Է��� ���� �ϼ̽��ϴ�.");
					m.input_sut();
					break;
				case 2:
					System.out.println("�л���������� ���� �ϼ̽��ϴ�.");
					m.print_stu();
					break;
				case 3:
					System.out.println("�л������˻��� ���� �ϼ̽��ϴ�.");
					m.search_stu();
					break;
				case 4:
					System.out.println("�л����������� ���� �ϼ̽��ϴ�.");
					m.modify_stu();
					break;
				case 5:
					System.out.println("�л����������� ���� �ϼ̽��ϴ�.");
					m.delete_stu();
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
			}
		}
		 
	}

}
