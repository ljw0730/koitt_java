import java.util.Scanner;

public class CEx20200211_17 {
	public static void main(String[] args) {
		// 2. 배열에 값 넣기
		//    - 1차원 배열 크기 10으로 하는 2개를 만든다.
		// 2-1. 배열 값에 0, 500, 1000, 3000 중에 1개를 랜덤으로 넣는다.
		// 2-2. 배열값에 랜덤으로 
		// 		0, 10, 100, 1000 만들어서 넣어보세요.
		//      (배열에 값에 0 또는 10 또는 100 또는 1000이 들어가도록)
		
		
		int[] pay = new int[10];
		int[] pay2 = new int[10];
		
		int select = 0;
		
		int[] money = {0, 500, 1000, 3000};
		
		
		for(int i = 0; i < pay.length; i++) {
			select = (int)(Math.random()*4);
			pay[i] = money[select];
		}
		
		System.out.print("1차원 배열 값 : ");
		for(int i = 0; i < pay.length; i++) {
			System.out.print(pay[i] + " ");
		}
		System.out.println("");
		
//////////////////////////////////////////////////////////
		
		System.out.println("================================================");
		
		for(int i = 0; i < pay.length; i++) {
			select = (int)(Math.random()*4);
			switch(select) {
				case 0:
					pay[i] = 1;
					break;
				case 1:
					pay[i] = (10*1);
					break;
				case 2:
					pay[i] = (10*10);
					break;
				case 3:
					pay[i] = (10*10*10);
					break;
			}
		}
		
		System.out.print("1차원 배열 값 : ");
		for(int i = 0; i < pay.length; i++) {
			System.out.print(pay[i] + " ");
		}
		System.out.println("");
		
		
		
		
	}	//main
}	//class
