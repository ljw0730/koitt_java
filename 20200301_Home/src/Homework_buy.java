import java.util.Scanner;

public class Homework_buy {

	public static void main(String[] args) {
		// 1) ��ǻ�� ����, 2) TV����, 3) ����� ����, 4) ��Ź�� ����, 5) ������ ����
		// 6) ���Ź�ǰ, ���űݾ� ���
		// 7) �����ݾ�, ���ʽ�����Ʈ ���
		// 8) �����ݾ� ����
		// 9) ���Ź�ǰ ��� �˻�
		// 10) ��ǰ���
		// 0) ����
		
		User user = new User();
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("----------------------------------");
					System.out.println("��ǰ ���Ÿ� ���� �ϼ̽��ϴ�.");
					select = pro_buy_print(scan);
					switch (select) {
						case 1:
							user.buy(new Com());			
							break;
						case 2:
							user.buy(new Tv());
							break;
						case 3:
							user.buy(new Ref());
							break;
						case 4:
							user.buy(new Wash());
							break;
						case 5:
							user.buy(new Air());
							break;
						case 0:
							System.out.println("����ȭ������ �̵��մϴ�.");
							break;
					}
							
					break;

				case 2:
					System.out.println("----------------------------------");
					System.out.println("���Ź�ǰ, �� ���űݾ� ����� ���� �ϼ̽��ϴ�.");
					user.summary();
					
					break;

				case 3:
					System.out.println("----------------------------------");
					System.out.println("�����ݾ�, ���ʽ�����Ʈ ����� ���� �ϼ̽��ϴ�.");
					user.retention();
					
					break;

				case 4:
					System.out.println("----------------------------------");
					System.out.println("�����ݾ� ������ ���� �ϼ̽��ϴ�.");
					user.money_charging(scan);
					
					break;

				case 5:
					System.out.println("----------------------------------");
					System.out.println("������Ҹ� ���� �ϼ̽��ϴ�.");
					user.cancle(scan);
					
					break;

				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
		}
		

	}
	
	// ���� ȭ�� ���
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==================================");
		System.out.println(" [   ������ǰ ���� ���α׷�   ] ");
		System.out.println(" 1. ��ǰ ����");
		System.out.println(" 2. ���Ź�ǰ, ���űݾ� ���");
		System.out.println(" 3. �����ݾ�, ���ʽ�����Ʈ ���");
		System.out.println(" 4. �����ݾ� ����");
		System.out.println(" 5. ���� ���");
		System.out.println(" 0. ����");
		System.out.println("----------------------------------");
		System.out.print(" ���ϴ� ��ȣ�� �Է��� �ּ���. : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	// 1) ��ǰ���� �� ���
	static int pro_buy_print(Scanner scan) {
		int select = 0;
		System.out.println("1. ��ǻ��");
		System.out.println("2. TV");
		System.out.println("3. �����");
		System.out.println("4. ��Ź��");
		System.out.println("5. ������");
		System.out.println("0. ����ȭ��");
		System.out.println("----------------------------------");
		System.out.print(" ���ϴ� ��ȣ�� �Է��� �ּ���. : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	
}

// ������ Ŭ����
class User {
	final int BUY_LIMIT = 20;
	int money = 10000;
	int bonus_point;
	
	Product[] item = new Product[BUY_LIMIT];
	
	int pro_count = 0;
	int price_sum = 0;
	
	// ��ǰ ����
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�����ݾ��� �����մϴ�.");
			System.out.println("�ݾ��� ������ �ּ���.");
			return;
		}
		
		if(pro_count ==  BUY_LIMIT) {
			System.out.println("�����ѵ��� �����̽��ϴ�.");
			return;
		}
		
//		if(item[pro_count] == null) {
			money -= p.price;
			bonus_point += p.bonus_point;
			item[pro_count] = p;
			pro_count++;
			System.out.println(p.name + " 1�븦 ���� �ϼ̽��ϴ�.");
			
//		}
	}

	// �� ���� ��, ���� ǰ��, �� ���� �ݾ� ���
	void summary() {
		if(pro_count == 0) {
			System.out.println("���� ǰ���� �����ϴ�.");
			return;
		}
		
		System.out.println("�� ���� �� : " + pro_count);
		
		int com_count = 0;
		int tv_count = 0;
		int ref_count = 0;
		int wash_count = 0;
		int air_count = 0;
		
		System.out.print("���� ǰ�� : ");
		for(int i = 0; i < pro_count; i++) {
			System.out.print(item[i].name + ", ");
			
			if(item[i].name == "��ǻ��") {
				com_count++;
			}
			else if(item[i].name == "TV") {
				tv_count++;
			}
			else if(item[i].name == "�����") {
				ref_count++;
			}
			else if(item[i].name == "��Ź��") {
				wash_count++;
			}
			else if(item[i].name == "������") {
				air_count++;
			}
			
			price_sum += item[i].price;
		}
		System.out.println();
		System.out.print("���� ǰ�� : ");
		System.out.println("��ǻ�� : " + com_count + "�� / " + "TV : " + tv_count + "�� / "
							+ "����� : " + ref_count + "�� / " + "��Ź�� : " + wash_count + "�� / "
							+ "������ : " + air_count + "��");
		System.out.println("�� ���� �ݾ� : " + price_sum);
	}
	
	//	�����ݾ�, ���ʽ�����Ʈ ���
	void retention() {
		System.out.println("�����ݾ� : " + money);
		System.out.println("���ʽ�����Ʈ : " + bonus_point);
	}
	
	// �����ݾ� ����
	void money_charging(Scanner scan) {
		System.out.println("���� ���� �ݾ� : " + money);
		int charging = 0;
		System.out.print("�����Ͻ� �ݾ��� �Է��� �ּ���. : ");
		charging = scan.nextInt();
		money += charging;
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		System.out.println("���� ���� �ݾ� : " + money);
	}
	
	// ���� ���
	void cancle(Scanner scan) {
		if(pro_count == 0) {
			System.out.println("���� ǰ���� �����ϴ�.");
			return;
		}
		
		int select = 0;
		Product[] temp_item = new Product[BUY_LIMIT];
		
		for(int i = 0; i < pro_count; i++) {
			System.out.print((i+1) + ". " + item[i].name + ", ");
		}
		System.out.println();
		
		System.out.print("���� ����� ��ȣ�� �Է��� �ּ���.(����ȭ�� : 0) : ");
		select = scan.nextInt();
		scan.nextLine();
		
		if(select == 0) {
			System.out.println("����ȭ������ �̵��մϴ�.");
			return;
		}
		
		money += item[select-1].price;
		bonus_point -= item[select-1].bonus_point;		
		
		System.arraycopy(item, 0, temp_item, 0, select-1);
		System.arraycopy(item, select, temp_item, select-1, item.length-select);
		
		for(int i = 0; i < item.length; i++) {
			item[i] = null;
		}
		
		System.arraycopy(temp_item, 0, item, 0, temp_item.length);
		pro_count--;
		
		for(int i = 0; i < pro_count; i++) {
			System.out.print((i+1) + ". " + item[i].name + ", ");
		}
		System.out.println();
		
	}
}

// ��ǰ(����) Ŭ����
class Product {
	
	String name;
	int price;
	int bonus_point;
	
	Product() {
		
	}
	
	Product(String name, int price, int bonus_point) {
		this.name = name;
		this.price = price;
		this.bonus_point = bonus_point;
	}
}

// ��ǻ�� ��ǰ Ŭ����
class Com extends Product {
	static final int COM_PRICE = 1000;
	
	Com() {
		super("��ǻ��", COM_PRICE, (int)(COM_PRICE*0.1));
	}
	
}

// TV ��ǰ Ŭ����
class Tv extends Product {
	static final int TV_PRICE = 1100;
	
	Tv() {
		super("TV", TV_PRICE, (int)(TV_PRICE*0.1));
	}
}

// ����� ��ǰ Ŭ����
class Ref extends Product {
	static final int REF_PRICE = 1200;
	
	Ref() {
		super("�����", REF_PRICE, (int)(REF_PRICE*0.1));
	}
}

// ��Ź�� ��ǰ Ŭ����
class Wash extends Product {
	static final int WASH_PRICE = 600;
	
	Wash() {
		super("��Ź��", WASH_PRICE, (int)(WASH_PRICE*0.1));
	}
}

// ������ ��ǰ Ŭ����
class Air extends Product {
	static final int AIR_PRICE = 800;
	
	Air() {
		super("������", AIR_PRICE, (int)(AIR_PRICE*0.1));
	}
}