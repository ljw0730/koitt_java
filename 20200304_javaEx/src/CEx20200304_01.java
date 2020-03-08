
public class CEx20200304_01 {

	public static void main(String[] args) {
		// Object class의 equals()메서드
		
		Person p1 = new Person(88801011105519L);
		Person p2 = new Person(88801011105519L);
		System.out.println("p1의 id 값 : " + p1);
		System.out.println("p2의 id 값 : " + p2);

		System.out.println("== 비교연산 결과 : " + (p1 == p2));
		// 객체를 ==으로 비교를 하면 주소값을 비교하기 때문에 false 가 나온다.
		
		System.out.println("equals로 비교 결과 : " + p1.equals(p2));
	}

}

class Person {
	//인스턴스 변수
	long id;
	
	// 생성자
	Person() {
		
	}
	
	// 생성자
	Person(long id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {

		if(obj != null && obj instanceof Person) {
//			Person p = (Person)obj;
//			if(this.id == p.id) {
//				return true;
//			}
			return id == ((Person)obj).id;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "변수 값 : "+id;
	}
}