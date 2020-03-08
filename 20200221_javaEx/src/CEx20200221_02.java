import java.util.Arrays;
import java.util.Scanner;

public class CEx20200221_02 {

	public static void main(String[] args) {
		// 랜덤으로 10개의 1차원 배열을 만들어서
		// 1~45 값을 넣어보세요.
		// 단 중복은 허락하지 않음.
		
		int[] arr1 = new int[45];
		int[] arr2 = new int[10];
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			
			select = mainPrint(scan);
			
			switch (select) {
				case 1:
					inArr(arr1);
					System.out.println("값 넣기가 완료 되었습니다.");
					break;
					
				case 2:
					shuArr(arr1);
					System.out.println("랜덤 섞기가 완료 되었습니다.");
					break;
					
				case 3:
					copyArr(arr1, arr2);
					System.out.println("10개 값 넣기가 완료 되었습니다.");
					break;
					
				case 4:
					printArr(arr2);
					System.out.println("10개 값 출력이 완료 되었습니다.");
					break;
					
				case 5:
					int result = sumArr(arr2);
					System.out.println("10개의 값 합 : " + result);
					System.out.println("10개 값 합구하기가 완료 되었습니다.");
					break;
					
				case 6:
					int[] arr3 = new int[10];
					copyArr(arr2, arr3);
					arr2 = sortArr(arr2);
					printArr(arr3);
					printArr(arr2);
					System.out.println("10개 값 정렬이 완료 되었습니다.");
					break;
	
				case 0:
					System.out.println("시스템을 종료합니다.");
					break Loop1;
			}
			
		}
		
	}	// main
	
	static int mainPrint(Scanner scan) {
		int select = 0;
		System.out.println("============================");
		System.out.println("1. 45개의 값 넣기");
		System.out.println("2. 랜덤 섞기");
		System.out.println("3. 10개 값 넣기");
		System.out.println("4. 10개 출력");
		System.out.println("5. 10개 합구하기");
		System.out.println("6. 10개 정렬하기");
		System.out.println("0. 종료");
		System.out.println("-----------------------------");
		System.out.print("원하는 번호를 입력하세요 : ");
		
		select = scan.nextInt();
		scan.nextLine();
		return select;
	}
	
	// 1~45 값 넣기
	static void inArr(int[] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i +1;
		}
	}
	
	// 1~45 수 섞기
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
	
	// 새로운 10짜리 1차원 배열에 복사하기
	static void copyArr(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
	}
	
	// 10개 1차원 배열 출력
	static void printArr(int[] arr) {
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 10개 1차원 배열 값 합하기
	static int sumArr(int[] arr2) {
		int result = 0;
		for(int i = 0; i < arr2.length; i++) {
			result += arr2[i];
		}
		return result;
	}
	
	// 10개 1차원 배열 값 정렬하기
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
	
		// 쉽게하려면
		//Arrays.sort(arr2);
		
		return arr2;
	} // sortArr
} // class
