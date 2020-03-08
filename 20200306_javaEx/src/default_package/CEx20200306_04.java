package default_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CEx20200306_04 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		HashSet set1 = new HashSet();
		
		
		map.put("myID", "1234");
		map.put("dream", "d1111");
		map.put("aaa", "aoooo");
		map.put("bbb", "d1111");
		
		// 키값이 중복으로 입력이 가능하지만
		// 전에 있던 같은 키값을 가진 key-value 값을 무시한다.
		map.put("aaa", "axxxx");
		
		// Iterator는 Collections 에서 상속된것이다.
		// map은 Collections를 상속받지 못했다.
		// 그러므로 Iterator를 사용하려면 HashMap을 set으로 바꿔 주어야 한다.
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
