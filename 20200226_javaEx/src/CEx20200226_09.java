import java.util.Scanner;

class CEx20200226_09 {
	public static void main(String[] args) {
		
		//시간을 입력을 받아서 출력을 해보세요.
		// 잘못돈 시를 입력했을때 다시 입력 받아서 출력하도록 구현해 보세요.
		
		Scanner scan = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		Time1 t = new Time1();
		
		while(true) {
			System.out.print("시간을 입력해 주세요. : ");
			hour = scan.nextInt();
			scan.nextLine();
			if(t.setHour(hour) == false) {
				continue;
			}
			System.out.println("시간이 입력되었습니다.");
			break;
		}
		
		while(true) {
			System.out.print("분을 입력해 주세요. : ");
			minute = scan.nextInt();
			scan.nextLine();
			if(t.setMinute(minute) == false) {
				continue;
			}
			System.out.println("분이 입력되었습니다.");
			break;
		}
		
		while(true) {
			System.out.print("초를 입력해 주세요. : ");
			second = scan.nextInt();
			scan.nextLine();
			if(t.setSecond(second) == false) {
				continue;
			}
			System.out.println("초가 입력되었습니다.");
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
			System.out.println("잘못된 시간이 들어 왔습니다.");
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
			System.out.println("잘못된 분이 들어 왔습니다.");
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
			System.out.println("잘못된 초가 들어 왔습니다.");
			return false;
		}
		this.second = second;
		return true;
	}
	
	public String toString( ) {
		return this.hour + "시 " + this.minute + "분 " + this.second + "초";
	}
}