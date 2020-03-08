package default_package;

import java.util.HashSet;
import java.util.Iterator;

public class CEx20200306_02 {

	public static void main(String[] args) {
		// HashSet, iterator
		
		HashSet set1 = new HashSet();
//		set1.add("1");
//		set1.add("5");
//		set1.add("3");
//		set1.add("4");
//		set1.add("8");
//		set1.add("6");
		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(1));
		set1.add(new Integer(4));
		set1.add(new Integer(1));
		set1.add(new Integer(5));
		// 같은 타입에 대하여 중복이 안되므로 1은 출력을 1번 밖에 안한다.
		// 그냥 숫자를 넣는 "1"이랑 new Integet(1)은 다른 타입이다.
		
		Iterator it = set1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			// Set은 순서가 필요 없기 때문에 값들이 섞여서 나온다.
				
			// 지우기
//			it.remove();
		}
			
		// Iterator는 1회용이므로 사용하려면 다시 선언을 해주어야 한다.
		Iterator it2 = set1.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	
		
	}

}
