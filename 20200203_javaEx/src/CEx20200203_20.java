import java.util.Scanner;

public class CEx20200203_20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ��� ��ȣ�� �Է��ϼ���. : ");
		
		int check = scan.nextInt();

		switch(check) {
			case 1 :
				System.out.println("SK�ڷ��� �Դϴ�.");
				break;
			case 6 : 
				System.out.println("KTF �Դϴ�.");
				break;
			case 9 :
				System.out.println("LGu+ �Դϴ�.");
				break;
			default :
				System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		
		
		scan.close();
	}

}
