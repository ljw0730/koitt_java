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
		// ���� Ÿ�Կ� ���Ͽ� �ߺ��� �ȵǹǷ� 1�� ����� 1�� �ۿ� ���Ѵ�.
		// �׳� ���ڸ� �ִ� "1"�̶� new Integet(1)�� �ٸ� Ÿ���̴�.
		
		Iterator it = set1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			// Set�� ������ �ʿ� ���� ������ ������ ������ ���´�.
				
			// �����
//			it.remove();
		}
			
		// Iterator�� 1ȸ���̹Ƿ� ����Ϸ��� �ٽ� ������ ���־�� �Ѵ�.
		Iterator it2 = set1.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	
		
	}

}
