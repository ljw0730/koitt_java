
public class Stu_score {
	
	int hak_num;
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	int rank;
	
	Stu_score() {
		this(1, "ȫ�浿", 0, 0);
	}
	
	Stu_score(int hak_num, String name, int kor, int eng) {
		this.hak_num = hak_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		this.total = kor + eng;
		this.avg = (double)total / 2.0;
	}
}
