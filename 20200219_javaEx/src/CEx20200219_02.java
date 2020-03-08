import java.util.Scanner;

public class CEx20200219_02 {
	
	public static void main(String[] args) {
		// 1. �ִ�/�ּҰ� ���ϱ� (3���� ���ڸ� �־, 1�ִ밪, 2�ּҰ�)
		// 2. ���밪 ���ϱ�(1���� ���ڸ� �־ ���밪�� ���ϴ� ��)
		// 3. ������ ���ϱ� (ù��° ���� 5, ������ 2�� ������ 5*5 = 25
		// 1, 2���ϴ� ��ȣ�� �����ϼ���.
		
		
		Scanner scan = new Scanner(System.in);
		
//		int select_num = 0;
//		int input0 = 0, input1 =0, input2 = 0;
		int[] s_num = new int[3];
		int max = 0;
		int min = 0;
		
		
		Loop_while: while(true) {
			// ȭ�� ��� �޼ҵ�
			print();
			
			switch (scan.nextInt()) {
				case 1:
					//�ִ밪 ���ϱ� �޼ҵ�
					System.out.println("=== �ִ밪 ���ϱ� ===");
					max(s_num);
					break;
	
				case 2: 
					//�ּҰ� ���ϱ� �޼ҵ�
					System.out.println("=== �ִ�� ���ϱ� ===");
					min(s_num);
					break;
					
				case 3: 
					System.out.println("=== ���밪 ���ϱ� ===");
					abs(s_num);
					//math.abs(1);
					break;
					
				case 4: 
					System.out.println("=== ������ ���ϱ� ===");
					pow(s_num);
					//math.pow(5,2);
					break;
					
				case 0:
					break Loop_while;
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}	// main
	
	// ȭ����� �޼ҵ�
	static void print() {
		System.out.println("===============================");
		System.out.println("  [ �ִ�/�ּ�/����/���� �� ]");
		System.out.println("-------------------------------");
		System.out.println(" 1. �ִ밪 ���ϱ�");
		System.out.println(" 2. �ּҰ� ���ϱ�");
		System.out.println(" 3. ���밪 ���ϱ�");
		System.out.println(" 4. ������ ���ϱ�");
		System.out.println(" 0. ����");
		System.out.println("===============================");
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
	}
	
	// �Է� �޴� �޼ҵ�
	static int[] for_int(int[] s_num, int count) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < count; i++) {
			System.out.print("���ڸ� �Է��ϼ���.(����ȭ�� :99) : ");
			s_num[i] = scan.nextInt();
			if( s_num[i] == 99 ) { //����ȭ�� �̵�
				s_num[0] = 99;
				return s_num;
			}
		}	//for
		
		return s_num;
	}
	
	// �ִ밪 �޼ҵ�
	static void max(int[] s_num) {
		int max = 0;
		
		while(true) {	// �ּҰ� ���ѹݺ�
			s_num = for_int(s_num, 3); 	//�Է� 3�� �޼ҵ�
										// �迭 �ּҰ� �ѱ�
			if(s_num[0] == 99) {
				break;
			}
						
			//Math.max(Math.max(1, 2), 3);
			max = Math.max(Math.max(s_num[0], s_num[1]), s_num[2]);
			System.out.println("�ִ밪 : " + max);
			
		}	//while
	}	//max�޼ҵ�
	
	// �ּҰ� �޼ҵ�
	static void min(int[] s_num) {
		int min = 0;
		
		while(true) {	// �ּҰ� ���ѹݺ�
			s_num = for_int(s_num, 3); 	//�Է� 3�� �޼ҵ�
			if( s_num[0] == 99 ) { //����ȭ�� �̵�
				System.out.println("����ȭ������ �̵��մϴ�.");
				break ;	//while����
			}
			
			//Math.min(Math.max(1, 2), 3);
			min = Math.min(Math.min(s_num[0], s_num[1]), s_num[2]);
			System.out.println("�ּҰ� : " + min);
			
		}	//while
	}	//min �޼ҵ�
	
	// ���밪 �޼ҵ�
	static void abs(int[] s_num) {
		int abs = 0;
		
		while(true) {	// �ּҰ� ���ѹݺ�
			s_num = for_int(s_num, 1); 	//�Է� 1�� �޼ҵ�
			if( s_num[0] == 99 ) { //����ȭ�� �̵�
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;	//while����
			}
			
			//Math.abs(1);
			abs = Math.abs(s_num[0]);
			System.out.println("���밪 : " + abs);
		}	//while
	}	// abs �޼ҵ�
	
	static void pow(int[] s_num) {
		double pow = 0;
		
		while(true) {	// �ּҰ� ���ѹݺ�
			s_num = for_int(s_num, 2); 	//�Է� 23�� �޼ҵ�
			if( s_num[0] == 99 ) { //����ȭ�� �̵�
				System.out.println("����ȭ������ �̵��մϴ�.");
				break ;	//while����
			}
			
			//Math.pow(5, 2);
			pow = Math.pow(s_num[0], s_num[1]);
			System.out.println("������ : " + pow);
		}	//while
	}	// pow �޼ҵ�
	
	
}	//class

