
public class Student implements Comparable<Student> {

	int hak_num;
	String name;
	int total;
	
	Student() {
		
	}
	
	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}
	
	public String toString() {
		return "학번 : " + hak_num + " / 이름 : " + name + " / 합계 : " + total;
	}

	@Override
	public int compareTo(Student s) {
		// 이름으로 정렬한다.
		// 크면 1, 같으면 0, 작으면 -1을 리턴하여
		// 스스로 컬랙션 프레임워크가 정렬을 한다.
		//return this.name.compareTo(s.name);
		
		// 합계로 정렬
//		if(this.total < s.total) {
//			return -1;
//		} else if(this.total == s.total) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// 학번으로 정렬하기
		if(this.hak_num < s.hak_num) {
			return -1;
		} else if(this.hak_num == s.hak_num) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
