public class CEx20200214_03 {
	public static void main(String[] args) {
		// ���� ����~  1427548419
		//             1124445789
		
		// 1. 10���� �迭�� �����.
		// 2. �� �������� 0~9���� ���ڸ� �ִ´�.
		// 3. ù��°�� �ι��� �� �ڸ��ٲ�, �ι�° ����° �� �ڸ��ٲ�, ....
		// 4. �������� üũ
		// 5. ���
		
		int[] arr1 = new int[10];
		int temp = 0;	// �ӽ����庯��
		boolean check = false;	// �ڸ����� üũ����
		
		// �迭�� 0~9 �ֱ�
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
		}
		
		// �������� �� �迭 ���
		System.out.print("�������� ��    : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// ù��°, �ι�° �� �� �ڸ�����
		for(int i = 0; i < arr1.length; i++) {
			check = false;
			// �񱳴� 9�� �ϱ� ������ -1 �� ���ش�.
			// �״��� �񱳴� 8��.. �� ������ 7��... �״����� 6��..
			// �׷��Ƿ� 1�������ϴ� i�� �̿��� -i �� ���ش�.
			for(int j = 0; j < arr1.length-1-i; j++) {
				if(arr1[j] > arr1[j+1]) {
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
					
					check = true;
				}
			}	// for j
			
			// �������� �迭 ���
			System.out.print((i+1) + "��° �������� : ");
			for(int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + " ");
			}
			System.out.println();
			
			if(check == false) {	// �ڸ������� �ѹ��� ���� ���
				System.out.println("��� ���� ������ �Ϸ� �Ǿ����ϴ�.");
				break;
			}
		}	// for i
		
		// �������� �� �迭 ���
		System.out.print("�������� ��    : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}	//main
}	//class
