package default_package;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CEx20200306_05 {

	public static void main(String[] args) {
		// set 하나 만들어서 -> 4, 6, 5, 7, 3, 2, 10 을 저장해서 출력해보세요.
		
		// map을 만들어서 -> 1,개 2,소 3,말 4,범 5,돈
		// 로그인 형태를 만들어 보세요.
		
		// map을 모두 출력해보세요.
		
		
		//1. set //////////////////////////////////////////////
		HashSet set1 = new HashSet();
		set1.add(4);		set1.add(6);
		set1.add(5);		set1.add(7);
		set1.add(3);		set1.add(2);
		set1.add(10);		set1.add(36);

		Iterator it = set1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		System.out.println("================================");
	
		//2-1. map 로그인 //////////////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put(1, "개");
		map.put(2, "소");
		map.put(3, "말");
		map.put(4, "범");
		map.put(5, "돈");
		
		while(true) {
			System.out.println("ID와 PassWord(PW)를 입력해주세요.(대소문자구분)");
			System.out.print("ID : ");
			int id = scan.nextInt();
			scan.nextLine();
			if(!(map.containsKey(id))) {
				System.out.println("존재하지 않는 ID 입니다. 다시 입력해주세요.");
				continue;
			}
			else {
				System.out.print("PW : ");
				String pw = scan.nextLine();
				if(!(map.get(id).equals(pw))) {
					System.out.println("PassWord가 일치하지 않습니다. 다시입력해주세요.");
					continue;
				}
			}
			
			System.out.println("정상적으로 로그인 하셨습니다.");
			break;
		}
		
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	
	}

}
