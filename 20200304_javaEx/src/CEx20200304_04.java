
public class CEx20200304_04 extends Object {

	public static void main(String[] args) {
		// Object class�� toString()�޼���
		
		Card2 c1 = new Card2(5, "ȫ�浿", "������ 1��", "����", "010-1111-1111", 350, 100, 10);
		Card2 c2 = new Card2(3, "�̼���", "����", "����", "010-2222-2222", 400, 150, 15);
		Card2 c3 = new Card2(8, "�ں���", "�濵����", "����", "010-3333-3333", 300, 80, 8);
		// 3���� ������ �Է��ϰ� toString�� �������̵��ؼ� ����� ������.
		
		
		System.out.println(c1);
		System.out.println("--------------------------------------------------------------");
		System.out.println(c2);
		System.out.println("--------------------------------------------------------------");
		System.out.println(c3);
	}
}

class Card2 {
	int id_num;
	String name;
	String department; // �μ�
	String position; // ��å
	String tell; // ��ȭ��ȣ
	int salary; // ����
	int period; // �ٹ��Ⱓ
	int v_count; // ����
	
	Card2() { }
	Card2(int id_num, String name, String department, String position, String tell,
			int salary, int period, int v_count) {
		this.id_num = id_num;
		this.name = name;
		this.department = department;
		this.position = position;
		this.tell = tell;
		this.salary = salary;
		this.period = period;
		this.v_count = v_count;
	}
	
	public String toString() {
		String str = "�����ȣ : " + id_num + " / �̸� : " + name + " / �μ� : " + department 
				+ " / ��å : " + position + "\n" 
				+ "��ȭ��ȣ : " + tell + "\n"
				+ "���� : " + salary + " / �ٹ��Ⱓ : " + period + " / ���� : " + v_count; 
		return str;
	}
}