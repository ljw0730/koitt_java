import java.util.Scanner;

public class CEx20200219_01 {
	
	public static void main(String[] args) {
		// ��Ģ���� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		
//		int input1 = 0, input2 = 0;
		int[] input = new int[2];
		int result = 0;
		
		Loop_while : while(true) {
			System.out.println("  [ ��Ģ���� ���α׷� ]");
			System.out.println("-------------------------");
			System.out.println("1. ���ϱ� / 2. ����");
			System.out.println("3. ���ϱ� / 4. ������");
			System.out.println("0. ����");
			System.out.println("-------------------------");
			System.out.print("�ش��ϴ� ���α׷��� �����ϼ���. : ");
			
			switch(scan.nextInt()) {
				case 1:
					System.out.println("���ϱ� ���α׷�");
					input = print(input);
					
					//add�޼ҵ� ȣ��
					result = CEx20200219_01.add(input[0], input[1]);
					System.out.println("����� : " + result);
					break;
					
				case 2:
					System.out.println("���� ���α׷�");
					input = print(input);
					
					// subtract �޼ҵ� ȣ��
					result = CEx20200219_01.subtract(input[0], input[1]);
					System.out.println("��� �� : " + result);
					break;
					
				case 3:
					System.out.println("���ϱ� ���α׷�");
					input = print(input);
					
					
					// Multiplication �޼ҵ� ȣ��
					result = CEx20200219_01.multiplication(input[0], input[1]);
					System.out.println("��� �� : " + result);
					
					break;
					
				case 4:
					System.out.println("������ ���α׷�");
					input = print(input);
					
					result = CEx20200219_01.division(input[0], input[1]);
					System.out.println("��� �� : " + result);
					
					break;
					
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop_while;
			}
			
		}
		
	}	//main
	
	// print �޼ҵ�
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		input[0] = scan.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		input[1] = scan.nextInt();
		
		return input;
	}
	
	// ���ϱ� �޼ҵ�
	static int add(int a, int b) {
		int result = 0;
		result = a + b;
		
		return result;
	}
	
	// ���� �޼ҵ�
	static int subtract(int a, int b) {
		int result = 0;
		result = a - b;
		
		return result;
	}
	
	// ���ϱ� �޼ҵ�
	static int multiplication(int a, int b) {
		int result = 0;
		result = a * b;
		
		return result;
	}
	
	// ������ �޼ҵ�
	static int division(int a, int b) {
		int result = 0;
		result = a / b;
		
		return result;
	}
	
	
}	//class
