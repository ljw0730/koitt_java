import java.util.Scanner;

public class CEx20200203_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ��� ��ȣ�� �Է��ϼ���. : ");
		
		int check = scan.nextInt();
		if(check == 1) {
			System.out.println("SK�ڷ��� �Դϴ�.");
		} else if (check == 6) {
			System.out.println("KTF �Դϴ�.");
		} else if (check == 9) {
			System.out.println("LGu+ �Դϴ�.");
		} else {
			System.out.println("�߸��� ��ȣ �Դϴ�.");
		}
		
		scan.close();

	}	//main

}	// class
