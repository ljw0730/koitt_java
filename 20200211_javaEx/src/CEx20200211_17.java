import java.util.Scanner;

public class CEx20200211_17 {
	public static void main(String[] args) {
		// 2. �迭�� �� �ֱ�
		//    - 1���� �迭 ũ�� 10���� �ϴ� 2���� �����.
		// 2-1. �迭 ���� 0, 500, 1000, 3000 �߿� 1���� �������� �ִ´�.
		// 2-2. �迭���� �������� 
		// 		0, 10, 100, 1000 ���� �־����.
		//      (�迭�� ���� 0 �Ǵ� 10 �Ǵ� 100 �Ǵ� 1000�� ������)
		
		
		int[] pay = new int[10];
		int[] pay2 = new int[10];
		
		int select = 0;
		
		int[] money = {0, 500, 1000, 3000};
		
		
		for(int i = 0; i < pay.length; i++) {
			select = (int)(Math.random()*4);
			pay[i] = money[select];
		}
		
		System.out.print("1���� �迭 �� : ");
		for(int i = 0; i < pay.length; i++) {
			System.out.print(pay[i] + " ");
		}
		System.out.println("");
		
//////////////////////////////////////////////////////////
		
		System.out.println("================================================");
		
		for(int i = 0; i < pay.length; i++) {
			select = (int)(Math.random()*4);
			switch(select) {
				case 0:
					pay[i] = 1;
					break;
				case 1:
					pay[i] = (10*1);
					break;
				case 2:
					pay[i] = (10*10);
					break;
				case 3:
					pay[i] = (10*10*10);
					break;
			}
		}
		
		System.out.print("1���� �迭 �� : ");
		for(int i = 0; i < pay.length; i++) {
			System.out.print(pay[i] + " ");
		}
		System.out.println("");
		
		
		
		
	}	//main
}	//class
