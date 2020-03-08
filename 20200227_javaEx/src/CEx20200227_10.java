import java.util.Scanner;

public class CEx20200227_10 {

	public static void main(String[] args) {
		// SamsungTv, Ref(�����), Condi(������), Product class�� ����Ǿ� ����.
		
		SamsungTv[] sam = new SamsungTv[10];
		Ref[] ref = new Ref[10];
		Condi[] con = new Condi[10];
		User user = new User();
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 : while(true) {
			System.out.println("--------------------------------");
			System.out.println("1) �ＺTV ����");
			System.out.println("2) ����� ����");
			System.out.println("3) ������ ����");
			System.out.println("4) ���� ������ �ִ� �ݾ� Ȯ��");
			System.out.println("0) ����");
			System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
			int num = scan.nextInt();
			
			switch (num) {
				case 1:
					user.buy(new SamsungTv());
					// sam[tv_count] = new SamsungTv();
					break;

				case 2 : 
					user.buy(new Ref());
					break;
					
				case 3: 
					user.buy(new Condi());
					break;
					
				case 4:
					user.money_now();
					break;
					
				case 0 : 
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
		}
	}
}

class User {
	int money = 10000;
	String name = "ȫ�浿";
	int tv_count = 0;
	int ref_count = 0;
	int con_count = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�. ���Ÿ� ����մϴ�.");
			return;
		}
		
		System.out.println(p.name + " �Ѵ븦 �����߽��ϴ�.");
		money -= p.price;
		
		if(p instanceof SamsungTv) {
			tv_count++;
		}
		else if(p instanceof Ref) {
			ref_count++;
		}
		else if(p instanceof Condi) {
			con_count++;
		}
		System.out.print("���� ��Ȳ - ");
		System.out.print("�ＺTV : " + tv_count + "�� ");
		System.out.print(" / ����� : " + ref_count + "�� ");
		System.out.print(" / ������ : " + con_count + "��");
		System.out.println();
	}
	
	void money_now() {
		System.out.println("���� ������ ������ �ִ� �ݾ� : " + money);
	}
}