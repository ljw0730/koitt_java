package Student;

public class Student {
	
	final int SUBJECT_COUNT = 3;
	static int count = 1000;
	
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank;
	
	{
		count++;
		this.hak_num = count;
	}
	
	Student() {
		this("ȫ�浿", 0, 0, 0);
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		set_total_avg();
	}
	
	public void set_total_avg() {
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total/SUBJECT_COUNT;
	}
	
	public String toString() {
		return this.hak_num + "\t" + this.name + "\t" + this.kor + "\t" +
				this.eng + "\t" + this.math + "\t" + this.total + "\t" +
				this.avg + "\t" + this.rank + "\t";
	}
	
}
