import java.util.Scanner;

public class CEx20200214_09 {
	public static void main(String[] args) {
		// 3���� ���ڸ� �Է¹޾�
		// 3�׽��� ����Ͽ� ���� ū���� ã�ƶ�.
		
		int[] num = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��� �ּ���. : ");
			num[i] = scan.nextInt();
		}
		
		int max = 0;
		
		// 2���� ���ڸ� �Է� �޴´ٰ� ���� ��
//		max = a > b ? a : b
		
		// 3���� ���ڸ� �Է� �޴´ٰ� ���� ��
//		max =(a > b && a > c) ? a : (b > c) ? b : c;
//		System.out.println("�ִ밪�� : " + max);
		
		System.out.println("���׽����� �Ѵٸ�");
		max = (num[0] > num[1] && num[0] > num[2]) ? num[0] : (num[1] > num[2]) ? num[1] : num[2];
		System.out.println("���׽����� �� max : " + max);
		
		
		System.out.println("if������ �Ѵٸ�");
		if(num[0] > num[1] && num[0] > num[2]) {
			max = num[0];
		}
		else if(num[1] > num[0] && num[1] > num[2]) {
			max = num[1];
		}
		else if(num[2]>num[0] && num[2]>num[1]) {
			max = num[2];
		}
		else {
			System.out.println("�Ȱ��� ���� �ֽ��ϴ�.");
		}
		System.out.println("if������ �� max : " + max);
		
		scan.close();
		
	}	//main
}	//class
