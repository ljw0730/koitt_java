import java.util.Scanner;

public class CEx20200212_14 {
	public static void main(String[] args) {
		// �̿ϼ�
		
		
		// �Խ��� ���α׷�
		// ��ȣ(������)-int, �̸�-String, ����-String,
		// �� ����-String, ��ȸ��-int,
		// 1	ȫ�浿	�Խ��ǿϼ�		�Խ����� �ϼ��Ǿ����ϴ�.	0
		// 2	�̼���	���α׷�����	���α׷������� �ֽ��ϴ�.	0
		// �� 2������ �Է��ϰ� ����Ͻÿ�.
		
		// �ɼ�=> ���� 10�� ���� �Է��� �����ѵ�, 1�� �ϰ� �� ���� �����
		// �ɼ�=> 1) �� ����  2) ��� - ����Ʈ 1)�б� 2)���� 3)����

		int num = 0;						//��ȣ
		int arr_first = 0;					//arr�迭 ù��° �ε���
		int arr_second = 0;					//arr�迭 �ι�° �ε���
		int[] number = new int[2];			//��ȣ ����
		String[][] arr = new String[2][3];	//�̸� ���� �۳���
		int[] hits = new int[2];			//��ȸ�� ����
		
		String more = "";
		
		String[] menu = { "��ȣ", "�̸�", "����", "�۳���", "��ȸ��" };
		
		Scanner scan = new Scanner(System.in);
				
		while(true) {
			// ��ȣ �Է�
			number[num] = num+1;
						
			// �ۼ��� �Է�
			System.out.print("�ۼ��� ���� �Է��� �ּ���. : ");
			arr[arr_first][arr_second] = scan.next();;
			scan.nextLine();
			arr_second++;
			
			// ���� �Է�
			System.out.print("������ �Է��� �ּ���. : ");
			arr[arr_first][arr_second] = scan.nextLine();
			arr_second++;
			
			// ���� �Է�
			System.out.print("������ �Է��ϼ���. : ");
			arr[arr_first][arr_second] = scan.nextLine();
						
			//�ۼ��� �Ұ��ΰ�?
			System.out.println("�Խù��� �� �ۼ� �Ͻðڽ��ϱ�?(yes/no)");
			more = scan.next();
			if(more.equals("no")) {
				System.out.println("�ۼ��� ��ħ�ϴ�.");
				break;
			}
			
			num++;
			arr_first++;
			arr_second = 0;
		}
		
		//���
		for(int i = 0; i < menu.length; i++) {
			System.out.print(menu[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(hits[i]);
		}
		
		
		
	} // main
} //class
