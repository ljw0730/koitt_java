import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_02 {

	public static void main(String[] args) {
		// Student class 와 연결되어 있음
		// Vector<Student> list = new Vector<Student>();
		
		Scanner scan = new Scanner(System.in);
		
		Vector<Student> list = new Vector<Student>();
		ArrayList<Student> list2 = new ArrayList<Student>();
		// Vector 와 ArrayList는 동일하다.
		// 차이가 있다면 Vector는 구버전, ArrayList는 신버전이며,
		// Vector는 멀티스레드를 지원하는 반면 ArrayList는 싱글스레드를 지원한다.
		
		String[] name1 = {"홍길동", "이순신", "김유신"};
		int[] kor1 = {100, 90, 95};
		int[] eng1 = {80, 70, 89};

		// 벡터에 Student 객체값 삽입
		// 벡터에 값이 들어가면 자동으로 Object로 형변환되어 값이 들어간다.
//		Student s1 = new Student(name1[0], kor1[0], eng1[0]);
//		list.add(s1); 
		list.add(new Student(name1[0], kor1[0], eng1[0]));
		list.add(new Student(name1[1], kor1[1], eng1[1]));
		list.add(new Student(name1[2], kor1[2], eng1[2]));
		
		if(list.isEmpty()) {	//Vector가 비어 있으면... 즉, 입력된 값이 없다면
			System.out.println("학생입력이 없습니다.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				System.out.print((i+1) + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.total + "\t");
				System.out.print(s.avg + "\t");
				System.out.println();
			}
		}
		
//		String name2 = "";
//		int kor2 = 0;
//		int eng2 = 0;
//		
//		while(true) {
//			System.out.print("이름을 입력해 주세요. : ");
//			name2 = scan.nextLine();
//			System.out.print("국어점수를 입력해 주세요. : ");
//			kor2 = scan.nextInt();
//			System.out.print("영어점수를 입력해 주세요 : ");
//			eng2 = scan.nextInt();
//			scan.nextLine();
//			
//			list.add(new Student(name2, kor2, eng2));
//			System.out.println("1명 성적이 추가 되었습니다.");
//		}
		
	}

}
