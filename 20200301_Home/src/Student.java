
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
		this("ȫ�浿", 0, 0, 0);
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// ���� �հ� ���ϱ�
	void total() {
		this.total = this.kor + this.eng + this.math;
	}
	
	// ���� ��� ���ϱ�
	void average() {
		this.avg = this.total / SUBJECT_COUNT;
	}	
}
