
public class Stu_info {

	// �л� ����
	// 1. �й� - hak_num, �̸� - name, �а� - major, �г� - grade, ��ȭ��ȣ - tell
	// 3���� �Է¹޾� ���
	// ��, Vector �Ǵ� ArrayList����Ұ�
	
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
		this("ȫ�浿", "���������а�", 1, "010-1234-5678");
	}
	
	Stu_info(String name, String major, int grade, String tell) {
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.tell = tell;
	}
	
}
