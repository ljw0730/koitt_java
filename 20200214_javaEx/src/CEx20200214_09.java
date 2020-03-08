import java.util.Scanner;

public class CEx20200214_09 {
	public static void main(String[] args) {
		// 3개의 숫자를 입력받아
		// 3항식을 사용하여 제일 큰수를 찾아라.
		
		int[] num = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력해 주세요. : ");
			num[i] = scan.nextInt();
		}
		
		int max = 0;
		
		// 2개의 숫자를 입력 받는다고 했을 때
//		max = a > b ? a : b
		
		// 3개의 숫자를 입력 받는다고 했을 때
//		max =(a > b && a > c) ? a : (b > c) ? b : c;
//		System.out.println("최대값은 : " + max);
		
		System.out.println("삼항식으로 한다면");
		max = (num[0] > num[1] && num[0] > num[2]) ? num[0] : (num[1] > num[2]) ? num[1] : num[2];
		System.out.println("삼항식으로 한 max : " + max);
		
		
		System.out.println("if문으로 한다면");
		if(num[0] > num[1] && num[0] > num[2]) {
			max = num[0];
		}
		else if(num[1] > num[0] && num[1] > num[2]) {
			max = num[1];
		}
		else if(num[2]>num[0] && num[2]>num[1]) {
			max = num[2];
		}
		else {
			System.out.println("똑같은 수가 있습니다.");
		}
		System.out.println("if문으로 한 max : " + max);
		
		scan.close();
		
	}	//main
}	//class
