import java.util.Scanner;

public class CEx20200203_07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�빮�ڸ� �Է��ϼ���.");
		//charAt(n) : String�� �Է� �޴� ���ڿ��� n��° ���ڸ� �����´�.
		//���⼭ n�� �迭�� �ּ�ó�� ó���ε����� 0�̴�.
		char ch = scan.next().charAt(0);
		System.out.println("�ҹ��ڴ� : " + (char)(ch + 32));
		
		System.out.println("\n�ҹ��ڸ� �Է��ϼ���.");
		char ch2 = scan.next().charAt(0);
		System.out.println("�빮�ڴ� : " + (char)(ch2 - 32));
		
		scan.close();
		
	}
}
