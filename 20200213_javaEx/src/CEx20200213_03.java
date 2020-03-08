import java.util.Scanner;

public class CEx20200213_03 {
	public static void main(String[] args) {
		// 16���� -> 2����
		
		// �Է��� �޾� ���
		// 0~9 / �빮�� �� �Է°���
	
		// 0~9, A=10, B=11, C=12, D=13, E=14, F=15
		String[] binary = {
				"0000", "0001", "0010", "0011",	// 0  1  2  3
				"0100", "0101", "0110", "0111",	// 4  5  6  7
				"1000", "1001", "1010", "1011",	// 8  9 10 11
				"1100", "1101", "1110", "1111",	//12 13 14 15
		};
		
		String str ="";
		String result = "";		// result = result + "0100";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0~9 / �빮�� A~F�� �Է����ּ���. : ");
		str = scan.next();
		
		
		char[] hex2 = new char[str.length()]; 
		
		for(int i = 0; i < str.length(); i++) {
			hex2[i] = str.charAt(i);
		}
		
		
				
		for(int i = 0; i < str.length(); i++) {
			if(hex2[i] >= '0' && hex2[i] <= '9') {
				result += binary[hex2[i] - '0'];
				result += " ";
			}
			else {
				result += binary[(hex2[i] - 'A') +10];	// 'C'�� �ƽ�Ű�ڵ� 67, 'A'�� �ƽ�Ű�ڵ� 65.
														// ���� 'C'-'A' = 2 ==>> 2 + 10 = 12
				result += " ";
			}
		}
		
		
		for(int i = 0; i < hex2.length; i++) {
			System.out.print(hex2[i] + " ");
		}
		System.out.println();
		
		System.out.println(result);
		
		scan.close();
	}
}
