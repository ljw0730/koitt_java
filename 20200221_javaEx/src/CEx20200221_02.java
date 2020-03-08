import java.util.Arrays;
import java.util.Scanner;

public class CEx20200221_02 {

	public static void main(String[] args) {
		// �������� 10���� 1���� �迭�� ����
		// 1~45 ���� �־����.
		// �� �ߺ��� ������� ����.
		
		int[] arr1 = new int[45];
		int[] arr2 = new int[10];
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			
			select = mainPrint(scan);
			
			switch (select) {
				case 1:
					inArr(arr1);
					System.out.println("�� �ֱⰡ �Ϸ� �Ǿ����ϴ�.");
					break;
					
				case 2:
					shuArr(arr1);
					System.out.println("���� ���Ⱑ �Ϸ� �Ǿ����ϴ�.");
					break;
					
				case 3:
					copyArr(arr1, arr2);
					System.out.println("10�� �� �ֱⰡ �Ϸ� �Ǿ����ϴ�.");
					break;
					
				case 4:
					printArr(arr2);
					System.out.println("10�� �� ����� �Ϸ� �Ǿ����ϴ�.");
					break;
					
				case 5:
					int result = sumArr(arr2);
					System.out.println("10���� �� �� : " + result);
					System.out.println("10�� �� �ձ��ϱⰡ �Ϸ� �Ǿ����ϴ�.");
					break;
					
				case 6:
					int[] arr3 = new int[10];
					copyArr(arr2, arr3);
					arr2 = sortArr(arr2);
					printArr(arr3);
					printArr(arr2);
					System.out.println("10�� �� ������ �Ϸ� �Ǿ����ϴ�.");
					break;
	
				case 0:
					System.out.println("�ý����� �����մϴ�.");
					break Loop1;
			}
			
		}
		
	}	// main
	
	static int mainPrint(Scanner scan) {
		int select = 0;
		System.out.println("============================");
		System.out.println("1. 45���� �� �ֱ�");
		System.out.println("2. ���� ����");
		System.out.println("3. 10�� �� �ֱ�");
		System.out.println("4. 10�� ���");
		System.out.println("5. 10�� �ձ��ϱ�");
		System.out.println("6. 10�� �����ϱ�");
		System.out.println("0. ����");
		System.out.println("-----------------------------");
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
		
		select = scan.nextInt();
		scan.nextLine();
		return select;
	}
	
	// 1~45 �� �ֱ�
	static void inArr(int[] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i +1;
		}
	}
	
	// 1~45 �� ����
	static void shuArr(int[] arr1) {
		int temp = 0;
		int index = 0;
		
		for (int i = 0; i < 200; i++) {
			index = (int)(Math.random() * 45);
			
			temp = arr1[0];
			arr1[0] = arr1[index];
			arr1[index] = temp;
		}
	}
	
	// ���ο� 10¥�� 1���� �迭�� �����ϱ�
	static void copyArr(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
	}
	
	// 10�� 1���� �迭 ���
	static void printArr(int[] arr) {
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 10�� 1���� �迭 �� ���ϱ�
	static int sumArr(int[] arr2) {
		int result = 0;
		for(int i = 0; i < arr2.length; i++) {
			result += arr2[i];
		}
		return result;
	}
	
	// 10�� 1���� �迭 �� �����ϱ�
	static int[] sortArr(int[] arr2) {
		int temp = 0;
		boolean check = false;
		
		for(int i = 0; i < arr2.length-1; i++) {
			for(int j = 0; j < arr2.length-1-i; j++) {
				if(arr2[j] > arr2[j+1]) {
					temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
					
					check = true;
				}
			} // for j
			if(check == false) {
				break;
			} // if
		} //for i
	
		// �����Ϸ���
		//Arrays.sort(arr2);
		
		return arr2;
	} // sortArr
} // class
