import java.util.Scanner;

public class CEx20200211_16 {
	public static void main(String[] args) {
		// 2. �迭�� �� �ֱ�
		//    - 1���� �迭 ũ�� 10���� �ϴ� 2���� �����.
		// 2-1. �迭 ���� 0, 500, 1000, 3000 �߿� 1���� �������� �ִ´�.
		// 2-2. �迭���� �������� 
		// 		0, 10, 100, 1000 ���� �־����.
		//      (�迭�� ���� 0 �Ǵ� 10 �Ǵ� 100 �Ǵ� 1000�� ������)
		
		
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			temp = (int)(Math.random()*4);
			if(temp == 0) {
				arr[i] = 0;
			}
			else if(temp == 1) {
				arr[i] = 500;
			}
			else if(temp == 2) {
				arr[i] = 1000;
			}
			else if(temp == 3) {
				arr[i] = 3000;
			}
		}
		
		System.out.println("[ �迭 arr�� �� ]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("==================");
		
		temp = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			temp = (int)(Math.random()*4);
			if(temp == 0) {
				arr2[i] = 0;
			}
			else if(temp == 1) {
				arr2[i] = 10;
			}
			else if(temp == 2) {
				arr2[i] = 100;
			}
			else if(temp == 3) {
				arr2[i] = 1000;
			}
		}
		
		System.out.println("[ �迭 arr2�� �� ]");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}	//main
}	//class
