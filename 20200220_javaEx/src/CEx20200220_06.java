import java.util.Arrays;
import java.util.Scanner;

public class CEx20200220_06 {
	
	public static void main(String[] args) {
		// 
		// �ζ� 1~45�������� 6���� ����
		// lotto2 �迭�� �־����.
		
		int[] lotto1 = new int[45];
		int[] lotto2 = new int[7];
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < lotto1.length; i++) {
			lotto1[i] = i+1;
		}
		
		shuffle(lotto1, lotto2);
		
		
		
		Loop1 : while(true) {
			System.out.println("[   ��   ��   ]");
			System.out.println("1. �ζ�����ϱ�");
			System.out.println("2. �ٽ� ����");
			System.out.println("3. �ζǹ�ȣ�� ��");
			System.out.println("4. �ζǹ�ȣ ����");
			System.out.println("0. ����");
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. :");
			num = scan.nextInt();
			switch (num) {
				case 1:
					System.out.println("�ζǹ�ȣ�� ���ʽ��� ����մϴ�.");
					printArr(lotto2);
					System.out.println("===========================================");
					break;
					
				case 2:
					System.out.println("�ζǸ� �ٽ� �����ϴ�.");
					shuffle(lotto1, lotto2);
					System.out.println("�ζ� ���Ⱑ �Ϸ� �Ǿ����ϴ�.");
					System.out.println("===========================================");
					break;
					
				case 3:
					System.out.println("�ζǹ�ȣ�� ������ ���մϴ�.");
					int sum = 0;
					sum = sumArr(lotto2);
					System.out.println("�ζǹ�ȣ�� �� : " + sum);
					System.out.println("===========================================");
					break;
					
				case 4:
					System.out.println("�ζǹ�ȣ�� �����մϴ�.");
					sortArr(lotto2);
					System.out.println("������ �������ϴ�.");
					System.out.println("===========================================");
					break;

				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;

			}	// switch
			
			
			
		}	//while
		
		scan.close();
		
	}	// main
	
	static void printArr(int[] lotto2) {
		System.out.print("�ζ� ��ȣ : ");
		for (int i = 0; i < lotto2.length-1; i++) {
			System.out.print(lotto2[i] + " ");
		}
		System.out.print("/ ���ʽ� ��ȣ : " + lotto2[6]);
		System.out.println();
		
	}
	
	static void shuffle(int[] lotto1, int[] lotto2) {
		int temp = 0;
		int ball_index = 0;
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = lotto1[0];
			lotto1[0] = lotto1[ball_index];
			lotto1[ball_index] = temp;
		}
		
		for(int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto1[i];
		}
	}
	
	static int sumArr(int[] lotto2) {
		int result = 0;
		for(int i = 0; i < lotto2.length-1; i++) {
			result += lotto2[i];
		}
		return result;
	}
		
	static void sortArr(int[] lotto2) {
		int temp = 0;
		boolean change = false;
		for (int i = 0; i < lotto2.length-2; i++) {
			// -i���ִ� ������ ���� �񱳸� �Ϸ��ϸ� ���� ū���� �̹� �ǵڷΰ� ����
			// �׷��� ������ ���Ҷ� �������񱳴� ���ص� �ȴ�.
			// �̷������� ������ �񱳶� �ǵھ� �ǵھվ� ... �񱳸� �����൵ �Ǳ⶧����
			// -i�� ���༭ ȿ���� ���δ�. ���� �����൵ ������ ȿ�������� �� �� ���ִ°� ����.
			for(int j = 0; j < lotto2.length-2-i; j++) {
				if(lotto2[j] > lotto2[j+1]) {
					temp = lotto2[j];
					lotto2[j] = lotto2[j+1];
					lotto2[j+1] = temp;
					change = true;
				}
			}
			if(change == false) {
				break;
			}
		}
		// �����ϰ� �Ϸ��� �Ʒ�ó�� �ϸ��.
//		Arrays.sort(lotto2);
	}
}	// class


