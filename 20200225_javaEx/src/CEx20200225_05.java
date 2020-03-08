
public class CEx20200225_05 {

	public static void main(String[] args) {
		// Student class 와 연결되어 있음
		// Lotto class 와 연결되어 있음
		
		// 배열의 초기화 선언
		Student[] stu = new Student[3];
		String[] name = new String[] { "홍길동", "이순신", "김유신" };	// 정식선언
		int[] grade = { 3, 4, 1 };	// 약식선언 - 경우에 따라 에러날 때가 있음.
		
//		stu[0] = new Student(name[0], grade[0]);
//		stu[1] = new Student(name[1], grade[1]);
//		stu[2] = new Student(name[2], grade[2]);
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student(name[i], grade[i]);
		}
		
		// 기본타입변수의 배열
		// lotto라는 45개 배열을 만들어서 1~45까지 숫자를 넣어보세요.
		int[] lotto = new int[45];
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		// Lotto 객체를 선언하면
		// 1~45까지 숫자가 들어가 있는 배열이 만들어져 생성될 수 있도록 하세요.
		// 선언만 하면 1~45까지 들어가 있는 lotto가 생성 될 수 있도록 해보세요.
		Lotto lotto2 = new Lotto();
		for(int i = 0; i < lotto2.ball.length; i++) {
			System.out.println(lotto2.ball[i]);
		}

	}

}

