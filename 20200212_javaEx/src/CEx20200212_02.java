import java.util.Scanner;

public class CEx20200212_02 {

	public static void main(String[] args) {
		// 16진수를 2진수로 치환

		//a=10, b=11, c=12, d=13, e=14, f=15
		char[] hex = { '7', 'c' , 'a', 'f', 'e' };	
		
		String[] binary = { 
							"0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1001", "1010", "1011",
							"1100", "1101", "1110", "1111"
						  };
		
		String result = "";
		
		for(int i= 0; i < hex.length; i++) {
			if(hex[i] >='0' && hex[i] <='9') {
				result += binary[hex[i] - '0'];	//result = result + binary[hex[i] - '0']
				result += " ";
			}
			else {
					if(hex[i] >= 'A' && hex[i] <='Z') {
					hex[i] = (char)(hex[i]+32);		// A -> a, F -> f
													// 대문자를 소문자로
				}
				result += binary[hex[i] - 'a' + 10];
				// 만약 C라면 99(아스키 코드 c)-97(아스키코드 a)=2 -> 2+10 = 12
				result += " ";
			}
		}
		
		System.out.println("hex : " + new String(hex));
		System.out.print("result : ");
		System.out.print(result + " ");
				
	}	//main

}	//class
