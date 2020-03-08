
public class Student2 {
	
	static int first_num = 1000;
	int stu_num;
	String stu_name;
	int stu_kor;
	int stu_eng;
	int stu_math;
	int stu_total;
	double stu_avg;
	int rank;
	
	void totla() {
		stu_total = stu_kor + stu_eng + stu_math;
	}
	
	void average() {
		stu_avg = stu_total/3;
	}
}
