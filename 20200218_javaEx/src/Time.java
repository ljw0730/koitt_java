
public class Time {
		
	// private : 같은 클래스 내에서 사용이 가능하고 다른 클래스에서 사용이 불가 하다.
	//           접근하기 위해서는 get, set함수를 이용하여 접근해야 한다.
	private int hour;
	
	int minute;
	double second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	
	
	
	// 오른쪽 마우스 클릭 - > source - > Generate Getters and Setters...
	// 를이용하면 쉽게 get, set함수를 만들 수 있다.
}
