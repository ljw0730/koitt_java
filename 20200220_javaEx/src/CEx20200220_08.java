import java.util.Scanner;

public class CEx20200220_08 {
	
	public static void main(String[] args) {
		// 1~25까지 랜덤으로 5개의 숫자를 배열에 넣고
		// 그 가운데 최대값을 구하시오.
		
		int[] arr1 = new int[25];
		int[] arr2 = new int[5];
		
		int max = 0;
		inArr(arr1);
		shuArr(arr1);
		copyArr(arr1, arr2);
		printArr(arr2);

		max = max(arr2);
		
		System.out.println("max : " + max);
		
	}	// main
	
	static void inArr(int[] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
	}
	
	static void shuArr(int[] arr1) {
		int temp = 0;
		int index = 0;
		for(int i = 0; i < 200; i++) {
			index = (int)(Math.random()*25);
			
			temp = arr1[0];
			arr1[0] = arr1[index];
			arr1[index] = temp;
		}
	}
	
	static void copyArr(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
	}
	
	static int max(int[] arr2) {
		int max = Math.max(arr2[0], Math.max(arr2[1], Math.max(arr2[2], Math.max(arr2[3], arr2[4]))));
		return max;
	}
 	
	static void printArr(int[] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
}	// class


