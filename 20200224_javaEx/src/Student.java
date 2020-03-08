
public class Student {
	
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	Student() {
		this("test", 50, 50, 50);
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void total() {
		this.total = this.kor + this.eng + this.math;
	}
	
	void average() {
		this.avg = this.total/3;
	}
	
}
