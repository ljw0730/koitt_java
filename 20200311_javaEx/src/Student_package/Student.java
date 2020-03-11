package Student_package;

public class Student {
	
	final int SUBJECT_COUNT = 3; 
	
	static int hak_num_count = 1000;
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank;
	
	{
		hak_num_count++;
		hak_num = hak_num_count;
	}
	
	Student() {
		this("홍길동", 0, 0, 0);
	}
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = this.kor + this.eng + this.math;
		avg = this.total/SUBJECT_COUNT;
		
	}
	
	public String toString() {
		return hak_num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" +
				avg + "\t" + rank + "\t";
	}
}
