import java.util.Scanner;

public class CEx20200211_11 {
	public static void main(String[] args) {
		
		// �ð�ǥ ���
		//  ��     ȭ     ��     ��     ��
		//1 ����   ����   ����   ����   ����
		//2 ����1  ����   ����   ����2  �����
		//3 ����   ����1  ����   ����   ü��
		//4 ����   �̼�   ü��   ����   ����
		
		String[][] subject = new String[4][5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < subject.length; i++) {
			for(int j = 0; j < subject[0].length; j++) {
				System.out.printf((i*5)+j+1 + "������ �Է��� �ּ���. : ");
				subject[i][j] = scan.next();
			}
		}
		
				
		System.out.println("\t\t[   ��   ��   ǥ   ]");
		System.out.printf("\t��\tȭ\t��\t��\t��\n");
		
		for(int i = 0; i < subject.length; i++) {
			for(int j = 0; j < subject[0].length; j++) {
				if(j == 0) {
					System.out.printf("%d", (i+1));					
				}
				System.out.printf("\t%s", subject[i][j]);
			}
			System.out.println("");
		}
		
		scan.close();
	}	//main
}	//class
