
public class Student3 {

	static int count = 0;
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;
		hak_num = count;
	}
	
	Student3() {
		
	}
	
	Student3(String name, int kor, int eng, int math) {
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
	
	void modify() {
		total();
		average();
		this.rank = 0;
	}
	
}
