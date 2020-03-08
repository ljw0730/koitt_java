import java.util.Scanner;

public class CEx20200220_07 {
	
	public static void main(String[] args) {
		// 5x5 �������
		
		// 1~25������ ���ڸ� 5�� ¥�� �迭5���� �������� �־����.
		
		int[] arr = new int[25];
		int[][] arr2 = new int[5][5];
		
		Scanner scan = new Scanner(System.in);
		String xy = "";
		int x = 0;
		int y = 0;
		
		inArr(arr);			// �� �ֱ�
		shuArr(arr);			// �� ����
		sixArr(arr, arr2);	// �迭 ����
		
		while(true) {
			
			printArr(arr2);
			
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ���.(x, y) -> (0,0) : ");
			xy = scan.nextLine();	// 15 -> 1,5
			x = xy.charAt(0)-'0';
			y = xy.charAt(1)-'0';
			
			if(!(arr2[x][y] == 0)) {
				arr2[x][y] = 0;
				
			}else {
				System.out.println("�̹� �����߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
			
			
		}
		
//		scan.close();
		
	}	// main
	
	static void inArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	static void shuArr(int[] arr) {
		int temp = 0;
		int index = 0;
		
		for(int i = 0; i < 200; i++) {
			index = (int)(Math.random()*25);
			
			temp = arr[0];
			arr[0] = arr[index];
			arr[index] = temp;
		}
	}
	
	static void sixArr(int[] arr, int[][] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[(i*5)+j];
			}
		}
	}
	
	static void printArr(int[][] arr2) {
		System.out.print("\t0\t1\t2\t3\t4");
		System.out.println();
		System.out.println("=============================================");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(i + "\t");
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=============================================");
	}
	
}	// class


