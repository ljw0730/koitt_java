package Student;

public class Student implements Comparable<Student> {
	int hak_num;
	String name;
	int total;
	
	Student() { }
	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}
	
	public String toString() {
		return "학번 : " + hak_num + " / 이름 : " + name + " / 합계 : " + total;
	}
	
	@Override
	// 이 경우에는 리턴이 1개 뿐이기 때문에 한가지로 밖에 정렬이 안된다. 
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);
	}
	
}
