
public class CEx20200227_02 {

	public static void main(String[] args) {
		// stu02 class와 연결되어 있음
		// singleton 패턴
				
//		Stu02 s1 = new Stu02();
//		s1.setName("홍길동");	// private로 선언되었기 떄문에 name에 값을 넣어주려면
//								// setName 메소드를 통해 값을 넣어줘야한다.
//		s1.setKor(100);
		
//		System.out.println(s1);
		
		Stu02 s2 = Stu02.getInstance();
		// Stu02 class의 s변수의 주소를 가져온다.
		// Time t = new Time();
		// Time t2 = new Time();
		// t2 = t;    와 같은 말이다.
		
		Stu02 s3 = Stu02.getInstance();
		// Stu02 class의 참조 변수 s가 갖고 있는 주소를 가져온다.
		
		s2.setName("홍길동");
		s3.setName("이순신");
		// 같은 주소를 바라보고 있기 때문에 마지막에 값을 넣은 이순신으로 둘다 셋팅된다.
		
		System.out.println(s2);
		System.out.println(s3);

	}

}
