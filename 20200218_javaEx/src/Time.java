
public class Time {
		
	// private : ���� Ŭ���� ������ ����� �����ϰ� �ٸ� Ŭ�������� ����� �Ұ� �ϴ�.
	//           �����ϱ� ���ؼ��� get, set�Լ��� �̿��Ͽ� �����ؾ� �Ѵ�.
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
	
	
	
	// ������ ���콺 Ŭ�� - > source - > Generate Getters and Setters...
	// ���̿��ϸ� ���� get, set�Լ��� ���� �� �ִ�.
}
