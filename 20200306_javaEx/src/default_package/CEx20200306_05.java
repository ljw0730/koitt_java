package default_package;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CEx20200306_05 {

	public static void main(String[] args) {
		// set �ϳ� ���� -> 4, 6, 5, 7, 3, 2, 10 �� �����ؼ� ����غ�����.
		
		// map�� ���� -> 1,�� 2,�� 3,�� 4,�� 5,��
		// �α��� ���¸� ����� ������.
		
		// map�� ��� ����غ�����.
		
		
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
	
		//2-1. map �α��� //////////////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put(1, "��");
		map.put(2, "��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "��");
		
		while(true) {
			System.out.println("ID�� PassWord(PW)�� �Է����ּ���.(��ҹ��ڱ���)");
			System.out.print("ID : ");
			int id = scan.nextInt();
			scan.nextLine();
			if(!(map.containsKey(id))) {
				System.out.println("�������� �ʴ� ID �Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			else {
				System.out.print("PW : ");
				String pw = scan.nextLine();
				if(!(map.get(id).equals(pw))) {
					System.out.println("PassWord�� ��ġ���� �ʽ��ϴ�. �ٽ��Է����ּ���.");
					continue;
				}
			}
			
			System.out.println("���������� �α��� �ϼ̽��ϴ�.");
			break;
		}
		
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	
	}

}
