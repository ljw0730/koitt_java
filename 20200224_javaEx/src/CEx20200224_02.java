
public class CEx20200224_02 {

	public static void main(String[] args) {
		// Car class�� ����Ǿ� ����
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		// ��ũ, ����, 5 - 100��
		Car[] c = new Car[100];
		for(int i = 0; i < c.length; i++) {
			c[i] = new Car();
		}
		
		Car c4 = new Car("white", "����", 4);
		Car c5 = new Car("red", "����", 5);
		Car c6 = new Car("blue", "����", 4);
		
		System.out.println(c1.color + " " + c1.gearType + " " + c1.door);
		System.out.println(c4.color + " " + c4.gearType + " " + c4.door);
		System.out.println(c5.color + " " + c5.gearType + " " + c5.door);
		System.out.println(c6.color + " " + c6.gearType + " " + c6.door);
	}
	
}
