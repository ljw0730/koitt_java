
public class Stu_info {

	// 학생 정보
	// 1. 학번 - hak_num, 이름 - name, 학과 - major, 학년 - grade, 전화번호 - tell
	// 3명을 입력받아 출력
	// 단, Vector 또는 ArrayList사용할것
	
	static int count = 0;
	
	int hak_num;
	String name;
	String major;
	int grade;
	String tell;
	
	{
		count++;
		hak_num = count;
	}
	
	Stu_info() {
		this("홍길동", "문학정보학과", 1, "010-1234-5678");
	}
	
	Stu_info(String name, String major, int grade, String tell) {
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.tell = tell;
	}
	
}
