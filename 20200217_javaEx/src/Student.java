
public class Student {

	String name;	// �̸�
	int kor;		// ��������
	int eng;		// ��������
	int math;		// ��������
	int total;		// �հ�
	double avg;		// ���
	int rank;		// ���
	
	int rank_count = 1;
	
	void total() {
		total = kor + eng + math;
	}
	
	void average() {
		avg = total/3;
	}
}
