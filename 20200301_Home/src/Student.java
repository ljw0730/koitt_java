
public class Student {
	
	static final int SUBJECT_COUNT = 3;
	static int hak_count = 0;
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank;
	
	{
		hak_count++;
		hak_num = hak_count;
	}
	
	Student() {
		this("홍길동", 0, 0, 0);
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 성적 합계 구하기
	void total() {
		this.total = this.kor + this.eng + this.math;
	}
	
	// 성적 평균 구하기
	void average() {
		this.avg = this.total / SUBJECT_COUNT;
	}	
}
