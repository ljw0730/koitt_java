
public class Student {
	
	Student() {
		
	}
	
	Student(String n, int k, int e, int m){
		this.name = n;
		this.kor = k;
		this.eng = e;
		this.math = m;
		
		this.total = kor+eng+math;
		this.avg = total/3;
	}
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
}
