import java.util.Scanner;

public class CEx20200219_03 {
	
	public static void main(String[] args) {
		// ���� ���ϱ� ���α׷�
		// 1. ���簢�� 2. ���ﰢ�� 3. ������ 4. ���簢�� 5.��
		// ���簢�� -> ����*����
		// ���ﰢ�� -> ����*����*0.5
		// ������ -> �밢��*�ٸ��밢��*0.5
		// ���簢�� -> ����*����
		// �� -> ������*������*3.14
		// while(true) -> switch 1,2,3 -> �޼ҵ�� �и� �غ���
		// 1. 2�� �޾ƾ���, 2. 2�� �޾ƾ���, 3. 1�� �޾ƾ���.
		// 4. 1�� �޾ƾ���, 5. 1�� �޾ƾ���
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		double result = 0;
				
		Loop1 :while(true) {
			print();
			
			select = scan.nextInt();
			
			switch (select) {
				case 1:
					System.out.println("���簢�� ����");
					result = rectangle();
					System.out.println("���̴� : " + result);
					break;
	
				case 2:
					System.out.println("���ﰢ�� ����");
					result = right_triangle();
					System.out.println("���̴� : " + result);
					break;
					
				case 3:
					System.out.println("������ ����");
					result = diamond();
					System.out.println("���̴� : " + result);
					break;
				case 4:
					System.out.println("���簢�� ����");
					result = square();
					System.out.println("���̴� : " + result);
					break;
				case 5:
					System.out.println("�� ����");
					result = circle();
					System.out.println("���̴� : " + result);
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}

		}
		
	}	// main
	
	static int input(String str) {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print(str + " ���̸� �Է� ���ּ���. : ");
		input = scan.nextInt();	
		scan.nextLine();
		
		return input;
	}
	
	static void print() {
		System.out.println("=============================");
		System.out.println("  [ ���� ���ϱ� ���α׷� ]");
		System.out.println("=============================");
		System.out.println(" 1. ���簢�� / 2. ���ﰢ��");
		System.out.println(" 3. ������   / 4. ���ﰢ��");
		System.out.println(" 5. ��       / 0. ����");
		System.out.println("-----------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��� �ּ���.");
	}
	
	static double rectangle() {
		double result = 0.0d;
		int input1 = input("����");
		int input2 = input("����");
		
		result = input1 * input2;
		return result;
	}
	
	static double right_triangle() {
		double result = 0;
		int input1 = input("�غ�");
		int input2 = input("����");
		
		result = input1 * input2 * 0.5;
		return result;
	}
	
	static double diamond() {
		double result = 0;
		int input1 = input("�밢��");
		int input2 = input("�ٸ� �밢��");
		
		result = input1 * input2 * 0.5;
		return result; 
	}
	
	static double square() {
		double result = 0;
		int input1 = input("����");
		
		result = input1 * input1;
		return result;
	}
	
	static double circle() {
		double result = 0;
		int input1 = input("������");
		
		result = input1 * input1 * 3.14;
		return result;
	}
}	//class

