
public class Stu_info {
	static int hak_num_count = 0;
	
	int hak_num;
	String name;
	String major;
	int grade;
	
	{
		hak_num_count++;
		hak_num = hak_num_count;
	}
	
	Stu_info() {
		this("홍길동", "문정과", 1);
	}
	
	Stu_info(String name, String major, int grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;				
	}
}
