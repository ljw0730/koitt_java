import java.util.Scanner;

class CEx20200226_09 {
	public static void main(String[] args) {
		
		//�ð��� �Է��� �޾Ƽ� ����� �غ�����.
		// �߸��� �ø� �Է������� �ٽ� �Է� �޾Ƽ� ����ϵ��� ������ ������.
		
		Scanner scan = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		Time1 t = new Time1();
		
		while(true) {
			System.out.print("�ð��� �Է��� �ּ���. : ");
			hour = scan.nextInt();
			scan.nextLine();
			if(t.setHour(hour) == false) {
				continue;
			}
			System.out.println("�ð��� �ԷµǾ����ϴ�.");
			break;
		}
		
		while(true) {
			System.out.print("���� �Է��� �ּ���. : ");
			minute = scan.nextInt();
			scan.nextLine();
			if(t.setMinute(minute) == false) {
				continue;
			}
			System.out.println("���� �ԷµǾ����ϴ�.");
			break;
		}
		
		while(true) {
			System.out.print("�ʸ� �Է��� �ּ���. : ");
			second = scan.nextInt();
			scan.nextLine();
			if(t.setSecond(second) == false) {
				continue;
			}
			System.out.println("�ʰ� �ԷµǾ����ϴ�.");
			break;
		}
		
		System.out.println(t);
	}
}

class Time1 {
	private int hour;
	private int minute;
	private int second;
	
	Time1() {
		this(1,1,1);
	}
	
	Time1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public boolean setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("�߸��� �ð��� ��� �Խ��ϴ�.");
			return false;
		}
		this.hour = hour;
		return true;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public boolean setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("�߸��� ���� ��� �Խ��ϴ�.");
			return false;
		}
		this.minute = minute;
		return true;
	}
	
	public int getSecond() {
		return second;
	}
	
	public boolean setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("�߸��� �ʰ� ��� �Խ��ϴ�.");
			return false;
		}
		this.second = second;
		return true;
	}
	
	public String toString( ) {
		return this.hour + "�� " + this.minute + "�� " + this.second + "��";
	}
}