import java.util.Scanner;

public class CEx20200203_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���.");
		int check = scan.nextInt();
		
		if(check > 60) {
			System.out.println("�հ�");
		}
		else if(check==60){
			System.out.println("�����");
		}
		else {
			System.out.println("���հ�");
		}
		
		scan.close();
	}

}
