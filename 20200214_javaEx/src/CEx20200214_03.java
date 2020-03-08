public class CEx20200214_03 {
	public static void main(String[] args) {
		// 버블 정렬~  1427548419
		//             1124445789
		
		// 1. 10개의 배열을 만든다.
		// 2. 객 랜덤으로 0~9까지 숫자를 넣는다.
		// 3. 첫번째와 두번재 비교 자리바꿈, 두번째 세번째 비교 자리바꿈, ....
		// 4. 연속으로 체크
		// 5. 출력
		
		int[] arr1 = new int[10];
		int temp = 0;	// 임시저장변수
		boolean check = false;	// 자리변경 체크변수
		
		// 배열에 0~9 넣기
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
		}
		
		// 버블정렬 전 배열 출력
		System.out.print("버블정렬 전    : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 첫번째, 두번째 비교 후 자리변경
		for(int i = 0; i < arr1.length; i++) {
			check = false;
			// 비교는 9번 하기 때문에 -1 을 해준다.
			// 그다음 비교는 8번.. 그 다음은 7번... 그다음은 6번..
			// 그러므로 1씩증가하는 i를 이용해 -i 도 해준다.
			for(int j = 0; j < arr1.length-1-i; j++) {
				if(arr1[j] > arr1[j+1]) {
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
					
					check = true;
				}
			}	// for j
			
			// 정렬진행 배열 출력
			System.out.print((i+1) + "번째 정렬진행 : ");
			for(int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + " ");
			}
			System.out.println();
			
			if(check == false) {	// 자리변경이 한번도 없을 경우
				System.out.println("모든 버블 정렬이 완료 되었습니다.");
				break;
			}
		}	// for i
		
		// 버블졍렬 후 배열 출력
		System.out.print("버블정렬 후    : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}	//main
}	//class
