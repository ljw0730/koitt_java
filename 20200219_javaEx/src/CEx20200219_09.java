import java.util.Scanner;

public class CEx20200219_09 {
	
	public static void main(String[] args) {
		// Student class�� ����Ǿ� ����
		
		// 1. �л������Է�
		// 2. �л���������
		// 3. �л���������
		// 4. �л������˻�
		// 5. ���ó��
		// 6. ����
		
		Student[] stu = new Student[2];
		
		int select = 0;
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		Loop1: while(true) {
			System.out.println("=============================");
			System.out.println("    [����ó�� ���α׷�]");
			System.out.println("=============================");
			System.out.println(" 1. �л������Է�");
			System.out.println(" 2. �л�����");
			System.out.println(" 3. �л�����");
			System.out.println(" 4. �л��˻�");
			System.out.println(" 5. ���ó��");
			System.out.println(" 6. ����");
			System.out.println("------------------------------");
			System.out.print("���ϴ� ��ȣ�� �Է��� �ּ���. : ");
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 1 || select > 6) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			switch(select) {
				case 1:
					System.out.println("�л������Է� �� �����ϼ̽��ϴ�.");
					System.out.println("------------------------------");
//					insert(scan, stu);
					
					for(int i = 0; i < stu.length; i++) {
						System.out.print((i+1) + "�� �л��� �̸��� ��������. : ");
						name = scan.nextLine();
						System.out.print(name + " �л��� ���������� ��������. : ");
						kor = scan.nextInt();
						System.out.print(name + " �л��� ���������� ��������. : ");
						eng = scan.nextInt();
						System.out.print(name + " �л��� ���������� ��������. : ");
						math = scan.nextInt();
						scan.nextLine();
						
						stu[i] = new Student(name, kor, eng, math);
						
						System.out.println(stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t" + stu[i].math + "\t" 
											+ stu[i].total + "\t" + stu[i].avg + "\t" );
					}
					
					break;
					
				case 2:
					System.out.println("�л��������� �� �����ϼ̽��ϴ�.");
					System.out.println("------------------------------");
					System.out.print("�����Ϸ��� �ϴ� �л����� �Է��ϼ���. : ");
					name = scan.nextLine();
					Loop3 : for(int i = 0; i < stu.length; i++) {
						if(stu[i].name.equals(name)) {
							System.out.println(stu[i].name + " �л��� �˻��Ǿ����ϴ�.");
							System.out.print("1. �������� 2. �������� 3. ��������");
							System.out.print("�����ϰ� ���� ������ ��ȣ�� �Է��ϼ��� :");
							
							switch(scan.nextInt()) {
								case 1 :
									System.out.print("���������� �Է��ϼ���. : ");
									stu[i].kor = scan.nextInt();
									scan.nextLine();
									System.out.println("����������" + stu[i].kor + "������ ����Ǿ����ϴ�.");
									break Loop3;
									
								case 2 :
									System.out.print("���������� �Է��ϼ���. : ");
									stu[i].eng = scan.nextInt();
									scan.nextLine();
									System.out.println("����������" + stu[i].eng + "������ ����Ǿ����ϴ�.");
									break Loop3;
									
								case 3 :
									System.out.print("���������� �Է��ϼ���. : ");
									stu[i].math = scan.nextInt();
									scan.nextLine();
									System.out.println("����������" + stu[i].math + "������ ����Ǿ����ϴ�.");
									break Loop3;
									
							}
						}
						else {
							System.out.println("ã������ �ϴ� �л��� �����ϴ�. �ٽ� �Է��ϼ���.");
						}
					}
					break;
			
				case 6:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}	//switch
			
			
		}	//while
		
	}	// main
	
	static void insert(Scanner scan, Student[] stu) {
		
	}
	
}	//class

