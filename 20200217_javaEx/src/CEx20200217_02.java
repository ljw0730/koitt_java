import java.util.Scanner;

public class CEx20200217_02 {

	public static void main(String[] args) {
		// 4. �빮�� �Է½� �ҹ��� ��� ���α׷�
		// ( �⺻ - �빮�ڸ� 1�� �Է½� �ҹ��ڷ� ��ȯ ) 
		// ( �ɼ� - �빮�� �Է½� �ҹ��ڷ�, �ҹ��� �Է½� �빮�ڷ� ���ڿ� �Է� ���� )

		String str = "";
		int len = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��� �ּ��� : ");
		str = scan.next();
		
		len = str.length();
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				result += (char)((str.charAt(i))-32);
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				result += (char)((str.charAt(i))+32);
			} 
		}
		
		System.out.println("���� �� : " + str);
		System.out.println("���� �� : " + result);
	}

}
