
public class CEx20200304_04 extends Object {

	public static void main(String[] args) {
		// Object class의 toString()메서드
		
		Card2 c1 = new Card2(5, "홍길동", "연구소 1팀", "차장", "010-1111-1111", 350, 100, 10);
		Card2 c2 = new Card2(3, "이순신", "영업", "부장", "010-2222-2222", 400, 150, 15);
		Card2 c3 = new Card2(8, "박보검", "경영관리", "과장", "010-3333-3333", 300, 80, 8);
		// 3명의 직원을 입력하고 toString을 오버라이딩해서 출력해 보세요.
		
		
		System.out.println(c1);
		System.out.println("--------------------------------------------------------------");
		System.out.println(c2);
		System.out.println("--------------------------------------------------------------");
		System.out.println(c3);
	}
}

class Card2 {
	int id_num;
	String name;
	String department; // 부서
	String position; // 직책
	String tell; // 전화번호
	int salary; // 월급
	int period; // 근무기간
	int v_count; // 년차
	
	Card2() { }
	Card2(int id_num, String name, String department, String position, String tell,
			int salary, int period, int v_count) {
		this.id_num = id_num;
		this.name = name;
		this.department = department;
		this.position = position;
		this.tell = tell;
		this.salary = salary;
		this.period = period;
		this.v_count = v_count;
	}
	
	public String toString() {
		String str = "사원번호 : " + id_num + " / 이름 : " + name + " / 부서 : " + department 
				+ " / 직책 : " + position + "\n" 
				+ "전화번호 : " + tell + "\n"
				+ "월급 : " + salary + " / 근무기간 : " + period + " / 년차 : " + v_count; 
		return str;
	}
}