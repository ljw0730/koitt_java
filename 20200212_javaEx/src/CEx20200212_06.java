import java.util.Scanner;

public class CEx20200212_06 {
	public static void main(String[] args) {
		// String �迭 12��¥��
		
		String[] ganji = {
							"��", "��", "ȣ����", "�䳢",
							"��", "��", "��", "��",
							"������", "��", "��", "����"
						 };
		// �� �� �� ��    �� �� �� ��    �� �� �� �� 
		String[] ganji2 = {
							"��", "��", "��", "��",
							"��", "��", "��", "��",
							"��", "��", "��", "��"
		};
		
		String select = "";
				
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̰����� �Է��ϼ���.(���� : 0)");
			select = scan.next();
			
			if(select.equals("0")) {
				break;
			}
			
			for(int i = 0; i <ganji2.length; i++) {
				if(select.equals(ganji[i])) {
					System.out.println(select + "��(��) ���̰������� "+ (i+1) +"��° " + ganji2[i]);
				}
				else if(select.equals(ganji2[i])) {
					System.out.println(select + "��(��) �������� "+ (i+1) +"��° " + ganji[i]);
				}
			}
			System.out.println("=========================");
		
			
		}	//while

		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
	} // main
} //class
