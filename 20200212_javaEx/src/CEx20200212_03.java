import java.util.Scanner;

public class CEx20200212_03 {
	public static void main(String[] args) {
		// ���� �ҹ��ڸ� �Է� �޾Ƽ� 
		// �빮�� ��ȯ�ϴ� ���α׷�
		
		char input = ' ';
		char output = ' ';
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("�빮�� �Ǵ� �ҹ��ڸ� �Է��ϼ���.(���� : 0) : ");
			input = scan.next().charAt(0);
			
			if(input == '0') {
				break;
			}
			
			if(input >= 'a' && input <= 'z') {
				output = (char)(input - 32);
			}
			else if (input >= 'A' && input <='Z')	{
				output = (char)(input + 32);
			}
			System.out.println("�Է��� �� : " + input);
			System.out.println("����� �� : " + output);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
