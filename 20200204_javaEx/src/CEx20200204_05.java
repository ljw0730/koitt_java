
public class CEx20200204_05 {

	public static void main(String[] args) {
						
//		난수 범위 지정
//		1 <= x < 70   => *70)+1
//		0 <= x < 50   => *50
//		2 <= x < 20   => *19)+2
//		2 <= x < 10   => *9)+2
		
		// 4 <= x < 11 ( 4 ~ 10 )
		int ox = (int)(Math.random() * 7) + 4;
				
		System.out.printf("랜덤난수 %d", ox);
		

	}

}
