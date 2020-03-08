import java.util.Scanner;

public class CEx20200211_16 {
	public static void main(String[] args) {
		// 2. 배열에 값 넣기
		//    - 1차원 배열 크기 10으로 하는 2개를 만든다.
		// 2-1. 배열 값에 0, 500, 1000, 3000 중에 1개를 랜덤으로 넣는다.
		// 2-2. 배열값에 랜덤으로 
		// 		0, 10, 100, 1000 만들어서 넣어보세요.
		//      (배열에 값에 0 또는 10 또는 100 또는 1000이 들어가도록)
		
		
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
		
		System.out.println("[ 배열 arr의 값 ]");
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
		
		System.out.println("[ 배열 arr2의 값 ]");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}	//main
}	//class
