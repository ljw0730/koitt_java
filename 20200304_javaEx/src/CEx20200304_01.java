
public class CEx20200304_01 {

	public static void main(String[] args) {
		// Object class�� equals()�޼���
		
		Person p1 = new Person(88801011105519L);
		Person p2 = new Person(88801011105519L);
		System.out.println("p1�� id �� : " + p1);
		System.out.println("p2�� id �� : " + p2);

		System.out.println("== �񱳿��� ��� : " + (p1 == p2));
		// ��ü�� ==���� �񱳸� �ϸ� �ּҰ��� ���ϱ� ������ false �� ���´�.
		
		System.out.println("equals�� �� ��� : " + p1.equals(p2));
	}

}

class Person {
	//�ν��Ͻ� ����
	long id;
	
	// ������
	Person() {
		
	}
	
	// ������
	Person(long id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {

		if(obj != null && obj instanceof Person) {
//			Person p = (Person)obj;
//			if(this.id == p.id) {
//				return true;
//			}
			return id == ((Person)obj).id;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "���� �� : "+id;
	}
}