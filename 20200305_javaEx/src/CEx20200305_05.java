import java.util.ArrayList;
import java.util.Collections;

public class CEx20200305_05 {

	public static void main(String[] args) {
		//ArrayList 정렬하기
		
		// 기본형 정렬하기
		ArrayList list = new ArrayList();
		
		Student stu1 = new Student(1, "홍길동", 300);
		Student stu2 = new Student(2, "이순신", 289);
		Student stu3 = new Student(3, "김유신", 270);
		Student stu4 = new Student(4, "박보검", 250);
		Student stu5 = new Student(5, "장보고", 270);
				
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		// 오토박싱 - 기본형을 List에 집어 넣으면
		// 자동으로 객체로 변환해서 집어 넣는다.
		list.add(3);
		
		// 리스트 오름차순 정렬
		Collections.sort(list);
		// toString이 오버라이딩 되어 있다.
		System.out.println(list);
		
		// 리스트 내림차순 정렬
		Collections.reverse(list);
		System.out.println(list);

		System.out.println("===============================================");
		
		// 객체 정렬하기
		ArrayList list2 = new ArrayList();
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);
		
		// 객체의 경우에는 객체클래스에 오버라딩을 해주어야 한다.
		// implements Comparable<Student>
		// public int Comparable () { }
		Collections.sort(list2);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("------------------------------------------------");
		
		Collections.reverse(list2);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
