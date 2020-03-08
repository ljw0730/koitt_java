
public class CEx20200220_09 {
	
	public static void main(String[] args) {
		// 1~100번까지 숫자를 랜덤으로 10개를 배열에 넣어서
		// 작은숫자로 정렬해서 출력하시오.
		
		int[] arr1 = new int[100];
		int[] arr2 = new int[10];
		
		inArr(arr1);
		shuArr(arr1);
		copyArr(arr1, arr2);
		
		System.out.print("정렬 전 : ");
		printArr(arr2);
		
		sortArr(arr2);
		System.out.print("정렬 후 : ");
		printArr(arr2);
		
		
		
		
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
			index = (int)(Math.random()*100);
			
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
	
	static void printArr(int[] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
	static void sortArr(int[] arr2) {
		int temp = 0;
		boolean change = false;
		for(int i = 0; i < arr2.length-1; i++) {
			for(int j = 0; j < arr2.length-1-i; j++ ) {
				if(arr2[j] > arr2[j+1]) {
					temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
					
					change = true;
				}
			}
			if(change == false) {
				break;
			}
		}
	}
}	// class

