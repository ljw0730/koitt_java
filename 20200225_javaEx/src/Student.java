
public class Student {

	static int count = 1000; //1001, 1002, 1003...
	int hak_num;
	String name;
	int gread;
	
	{
		count++;
		hak_num = count;
	}
	
	Student() {
		
	}
	
	Student(String name, int grade) {
		this.name = name;
		this.gread = grade;
	}
}
