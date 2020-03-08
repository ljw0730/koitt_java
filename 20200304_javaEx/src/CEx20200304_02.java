
public class CEx20200304_02 {

	public static void main(String[] args) {
		// Object class�� equals()�޼���
		
		People p1 = new People(10001);
		People p2 = new People(10001);
		
		//equals �޼ҵ带 ����ؼ� �񱳸� �غ�����.

		System.out.println("== �� : " + (p1==p2));
		System.out.println("equals �� : " + (p1.equals(p2)));
		// equals �޼ҵ带 �������̵� ���� �ʰ� �׳� ����ϸ� false �� ���´�.
		// �� ������ ���� == �񱳶� ���� ���̱� �����̴�.
		// �׷��Ƿ� �������̵��� �ؼ� ����Ѵ�.
		
		
	}

}

class People {
	int stu_number;
	
	People() { }
	
	People(int stu_number) {
		this.stu_number = stu_number;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof People) {
			return stu_number == ((People)obj).stu_number;
		}
		else {
			return false;
		}
	}
}