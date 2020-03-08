
public class CEx20200220_01 {
	
	public static void main(String[] args) {
		
		Data d = new Data();	// ��ü����
		d.x = 10;
		d.y = 100;
		
		change(d.x);
		System.out.println("main1 d.x : " + d.x);
		
		System.out.println("===============");
		
		change2(d);
		System.out.println("main2 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.x = change3(d.x);
		System.out.println("main3 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.y = 100;
		change4(d);
		System.out.println("main4 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.y = 100;
		d.y = change5(d.x, d.y);
		System.out.println("main5 d.y : " + d.y);
		
		System.out.println("===============");
		
		d.y = 100;
		change6(d);
		System.out.println("main6 d.y : " + d.y);
		
	}	// main
	
	// �Ű������� ���� x�� 1000���� �ٲ�� d���� ������ ���� �ʴ´�.
	static void change(int x) {
		x = 1000;
		System.out.println("change : " + x);
	}
	
	// �Ű������� �ּҸ� ���� �ϱ� ������ main�� d�� ������ �ش�.
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("change2 : " + d.x);
	}
	
	// ������ �̿��Ͽ� d.x�� ���� �����Ѵ�.
	static int change3(int x) {
		x = 1000;
		System.out.println("change3 : " + x);
		return x;
	}
	
	// �Ű������� �ּҸ� ���� �ϱ� ������ main�� d�� ������ �ش�.
	static void change4(Data d) {
		d.x = d.x + d.y;
		System.out.println("change4 : " + d.x);
	}
	
	// ������ �̿��Ͽ� d.y�� ���� �����Ѵ�.
	static int change5(int a, int b) {
		int result = 0;
		result = a-b;
		System.out.println("change5 : " + result);
		return result;
		
	}
	
	// main d�� �ּҰ��� �̿��Ͽ� d.y�� ���� �����Ѵ�.
	static void change6(Data d) {
		d.y = 2000;
		System.out.println("change6 : " + d.y);
	}
	
}	// class


class Data {
	int x;
	int y;	
}