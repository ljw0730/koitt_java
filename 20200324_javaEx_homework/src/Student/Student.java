package Student;

public class Student {

	static int count = 1000;
	final int SUBJECT_COUNT = 3;
	
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
		hak_num = count;
	}
	
	Student() {
		
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total/SUBJECT_COUNT;
	}
	
	public String toString() {
		return this.hak_num + "\t" + this.name + "\t" + this.kor + "\t" +
				this.eng + "\t" + this.math + "\t" + this.total + "\t" +
				this.avg + "\t" + this.rank;
	}
}
