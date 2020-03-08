package default_package;

import java.util.HashMap;
import java.util.Scanner;

public class CEx20200306_03 {

	public static void main(String[] args) {
		//Map을 이용한 로그인
		
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("aaa", "1234");
		map.put("koitt", "k0001");
		map.put("bbb", "1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id와 password를 입력하세요.(대소문자구별)");
			System.out.print("id : ");
			String id = scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("존재하지 않는 id입니다. 다시 입력하세요.");
				continue;
			}
			
			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			if(!(map.get(id).equals(pw))) {
				System.out.println("password가 일치하지 않습니다. 다시 입력하세요.");
				continue;
			}
			
			System.out.println("정상적으로 로그인 하셨습니다.");
			break;
			
		} // while
		
		System.out.println("프로그램을 종료합니다.");
	} // main

} // class
