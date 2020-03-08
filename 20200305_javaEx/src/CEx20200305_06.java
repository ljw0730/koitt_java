
import java.util.ArrayList;
import java.util.Collections;

public class CEx20200305_06 {

	public static void main(String[] args) {
		//ArrayList add, remove
		
		ArrayList list = new ArrayList();
		
//		Student stu1 = new Student(1, "홍길동", 300);
//		Student stu2 = new Student(2, "이순신", 289);
//		Student stu3 = new Student(3, "김유신", 270);
//		Student stu4 = new Student(4, "박보검", 250);
//		Student stu5 = new Student(5, "장보고", 270);
				
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		// 오토박싱 - 기본형을 List에 집어 넣으면
		// 자동으로 객체로 변환해서 집어 넣는다.
		list.add(3);
	
		// 특정 위치에 값 넣기
		list.add(3, new Integer(7));
		// 0, 1, 2, 3 -> 즉 4번째 자리에 7을 넣음
		
		list.add(5, new Integer(8));
		// 0, 1, 2, 3, 4, 5 -> 즉 6번째 자리에 8을 넣음
		
		// 특정 위치 값 지우기
//		list.remove(1);
		// 0, 1 -> 즉 2번째 자리의 값4가 지워짐
		
		// 전체를 지우기 위해 for문으로 지우게 되면
		// 1번째 지우고 전부 땡겨오고
		// 땡겨온 상태로 2번째를 지우고 또 땡겨오고
		// 땡겨온 상태로 3번째를 지우고 또 땡겨오고
		// 이렇게 지우기 때문에 다 지워지지 않는다.
//		for(int i = 0; i < list.size(); i++) {
//			list.remove(i);
//			System.out.println(list);
//		}
		
		// 이를 방지하기 위해 뒤쪽에서 지운다.
//		for(int i = list.size()-1; i>=0; i--) {
//			list.remove(i);
//			System.out.println(list);
//		}
		
		// 또는 clear() 메서드를 사용한다.
		list.clear();
		
		System.out.println(list);
		
	}

}
