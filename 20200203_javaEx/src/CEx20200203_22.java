import java.util.Scanner;

public class CEx20200203_22 {

	public static void main(String[] args) {
		// 90 A, 80 B, 70 C, 60 D F
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		
		int i = scan.nextInt();
		
		switch (i/10) {
		case 10 : case 9 :
			System.out.println("학점 A");
			break;
		case 8 : 
			System.out.println("학점 B");
			break;
		case 7 :
			System.out.println("학점 C");
			break;
		case 6:
			System.out.println("학점 D");
			break;
		default :
			System.out.println("학점 F");
	}
		
		
//		if(i <= 100 && i >= 90) {
//			System.out.println("학점 A");
//		} else if(i < 90 && i >= 80) {
//			System.out.println("학점 B");
//		} else if(i < 80 && i >= 70) {
//			System.out.println("학점 C");
//		} else if(i < 70 && i >= 60) {
//			System.out.println("학점 D");
//		} else {
//			System.out.println("학점 F");
//		}
		
		scan.close();
	}

}
