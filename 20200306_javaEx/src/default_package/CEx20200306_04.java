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
		
		// Ű���� �ߺ����� �Է��� ����������
		// ���� �ִ� ���� Ű���� ���� key-value ���� �����Ѵ�.
		map.put("aaa", "axxxx");
		
		// Iterator�� Collections ���� ��ӵȰ��̴�.
		// map�� Collections�� ��ӹ��� ���ߴ�.
		// �׷��Ƿ� Iterator�� ����Ϸ��� HashMap�� set���� �ٲ� �־�� �Ѵ�.
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
