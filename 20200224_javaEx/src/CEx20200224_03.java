
public class CEx20200224_03 {

	public static void main(String[] args) {
		// Student class와 연결되어 있음
		
		// 두명의 학생 - 홍길동 100, 100, 90 / 이순신 80, 90, 70
		// 합계 평균 구하기.
		
		Student stu1 = new Student("홍길동", 100, 100, 100);
		Student stu2 = new Student("이순신", 80, 90, 70);
		
		stu1.total();
		stu1.average();
		
		stu2.total();
		stu2.average();
		
		print(stu1);
		print(stu2);
				
	}
	
	static void print(Student stu) {
		System.out.print(stu.name + "\t");
		System.out.print(stu.kor + "\t");
		System.out.print(stu.eng + "\t");
		System.out.print(stu.math + "\t");
		System.out.print(stu.total + "\t");
		System.out.print(stu.avg + "\t");
		System.out.println();
	}
	
}
