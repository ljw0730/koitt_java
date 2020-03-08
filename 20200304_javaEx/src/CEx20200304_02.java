
public class CEx20200304_02 {

	public static void main(String[] args) {
		// Object class의 equals()메서드
		
		People p1 = new People(10001);
		People p2 = new People(10001);
		
		//equals 메소드를 사용해서 비교를 해보세요.

		System.out.println("== 비교 : " + (p1==p2));
		System.out.println("equals 비교 : " + (p1.equals(p2)));
		// equals 메소드를 오버라이딩 하지 않고 그냥 사용하면 false 가 나온다.
		// 그 이유는 위의 == 비교랑 같은 말이기 때문이다.
		// 그러므로 오버라이딩을 해서 사용한다.
		
		
	}

}

class People {
	int stu_number;
	
	People() { }
	
	People(int stu_number) {
		this.stu_number = stu_number;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof People) {
			return stu_number == ((People)obj).stu_number;
		}
		else {
			return false;
		}
	}
}