package default_package;

import java.util.HashMap;
import java.util.Scanner;

public class CEx20200306_03 {

	public static void main(String[] args) {
		//Map�� �̿��� �α���
		
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("aaa", "1234");
		map.put("koitt", "k0001");
		map.put("bbb", "1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.(��ҹ��ڱ���)");
			System.out.print("id : ");
			String id = scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("�������� �ʴ� id�Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			if(!(map.get(id).equals(pw))) {
				System.out.println("password�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.println("���������� �α��� �ϼ̽��ϴ�.");
			break;
			
		} // while
		
		System.out.println("���α׷��� �����մϴ�.");
	} // main

} // class
