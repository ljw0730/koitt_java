
public class CEx20200218_03 {

	public static void main(String[] args) {
		// Data class�� ����Ǿ� ����
		
		Data d = new Data();
		d.x = 10;

		System.out.println("1��° d.x : " + d.x);
		
		// Ŭ������.������
		Data.y = 50;
		Data.ch();
		
		// ���� Ŭ���� ������ ����, �޼ҵ� ����� ���
		// Ŭ���� ���� �Է����� �ʾƵ� �ȴ�.
		change(d.x);
		System.out.println("2��° d.x : " + d.x);
		
		d.x = change2(d.x);
		System.out.println("3��° d.x : " + d.x);

		change3(d);
		System.out.println("4��° d.x : " + d.x);
		
		
	}	// main

	static void change(int x) {
		x = 20;	//int x = d.x
	}

	// �޼ҵ带 �̿��� �ν��Ͻ� �� ����
	// ù���� ��� - return�̿�
	static int change2(int x) {
		x = 20;	//int x = d.x
		return x;
	}
	
	// �ι�° ��� - ��ü�ּ��̿�
	static void change3(Data d) {
		d.x = 30;	
	}
	
	
}	// class

