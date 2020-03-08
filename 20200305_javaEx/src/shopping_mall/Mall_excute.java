package shopping_mall;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Mall_excute {
	// ���ɾ� ���� class
	
	final String ADMIN = "������";
	
	// ȸ�� ������ ���� ArrayList
	ArrayList<Member> mem = new ArrayList<Member>();
	
	// ����ǰ���� ���� ArrayList
	ArrayList<Cart> cart = new ArrayList<Cart>();
	
	// �α����� ID, PW ���� HashMap
	HashMap<String, String> login_map = new HashMap<String, String>();
	
	// ȸ�� ���� Ÿ��Ʋ
	String[] title = { "ID", "�н�����", "�̸�", "�������", "��ȭ��ȣ", "�����ݾ�", "��������Ʈ" };
	
	// ���� ��� Ÿ��Ʋ
	String[] purchase_title = { "���Ź�ȣ", "ID", "��ǰ��", "����", "����Ʈ", "��������" };
	
	//=======================================================================================================//
	// 1. ȸ������
	public void join_membership(Scanner scan) {
		Member m = new Member();
		
		if(mem.size()== 0) {
			// ���̵�����
			String[] id_str = { ADMIN, "qwerqwer", "asdfasdf", "zxcvzxcv", "uiopuiop", "hjklhjkl" };
			String[] pw_str = { (ADMIN+"@"), "qwerqwer@", "asdfasdf@", "zxcvzxcv@", "uiopuiop@", "hjklhjkl@" };
			String[] name_str = { ADMIN, "ȫ�浿", "�̼���", "����ȫ", "�ں���", "��ȫ��" };
			String[] birth_str = { ADMIN, "19880101", "20030324", "19830910", "19970416", "19940720" };
			String[] tell_str = { ADMIN, "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
			
			for(int i = 0; i < id_str.length; i++) {
				mem.add(new Member(id_str[i], pw_str[i], name_str[i], birth_str[i], tell_str[i]));
			}
		}
		
		
//		int back_check = id_input(m, scan);
//		if(back_check == 999) {
//			System.out.println("����ȭ������ �̵��մϴ�.");
//			return;
//		}
		
//		pw_input(m, scan);
		
//		m = name_input(m, scan);
//		m = birth_input(m, scan);
//		m = tell_input(m, scan);

//		m.join_time = now_time();
		
//		mem.add(m);
	}
	
	// ID �Է�
	public int id_input(Member m, Scanner scan) {
		
//		String id = "";
		while(true) {
			System.out.print("ID�� �Է��� �ּ���. (����ȭ�� : 999) : ");
			m.id = scan.nextLine();
			
			if(m.id.equals("999")) {
				m.id = null;
				return 999;
			}
			
			if(m.id.length() < m.MIN_ID_LEN) {
				System.out.println("ID�� " + m.MIN_ID_LEN + "�ڸ� �̻� �Է��ϼž� �մϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���.");
				m.id = null;
				continue;
			}
			
			boolean overlap_check = false;
			for(int i = 0; i < mem.size(); i++) {
				Member mm = (Member)mem.get(i);
				if(m.id.equals(mm.id)) {
					overlap_check = true;
				}
			}
			if(overlap_check == true) {
				System.out.println("�ߺ��� ID�� �ֽ��ϴ�. �ٽ� �Է��� �ּ���.");
				m.id = null;
				continue;
			}
			overlap_check = false;
			
			System.out.println("ID�� ���������� �ԷµǾ����ϴ�.");
			
			return 0;
		} // while
	} // id_input
	
	// �н����� �Է�
	public Member pw_input(Member m, Scanner scan) {
		
		while(true) {
			System.out.print("PW�� �Է��� �ּ��� : ");
			m.pw = scan.nextLine();
			
			if(m.pw.length() < m.MIN_PW_LEN) {
				System.out.println("�н������ " + m.MIN_PW_LEN + "�ڸ� �̻� �Է��ϼž� �մϴ�.");
				System.out.println("�ٽ��Է��� �ּ���.");
				m.pw = null;
				continue;
			}
			
			String temp_pw ="";
			System.out.print("�н����带 �ѹ� �� �Է��� �ּ���. : ");
			temp_pw = scan.nextLine();
			
			if(!temp_pw.equals(m.pw)) {
				System.out.println("�Է��Ͻ� �� �н����尡 ��ġ���� �ʽ��ϴ�. �ٽ��Է��� �ּ���.");
				m.pw = null;
				continue;
			}
			
			System.out.println("�н����尡 ���������� �ԷµǾ����ϴ�.");
			
			return m;
		} //while
	} // pw_input
	
	// �̸� �Է�
	public Member name_input(Member m, Scanner scan) {
		System.out.print("�̸��� �Է��� �ּ��� : ");
		m.name = scan.nextLine();
		System.out.println("�̸��� ���������� �ԷµǾ����ϴ�.");
		return m;
	}
	
	// ������� �Է�
	public Member birth_input(Member m, Scanner scan) {
		while(true) {
			System.out.print("��������� �Է��� �ּ���. (ex : 1988010) : ");
			m.birth = scan.nextLine();
			
			if(m.birth.length() != m.BIRTH_LEN) {
				System.out.println("�� 8�ڸ� �̾�� �մϴ�. �ٽ��Է����ּ���.");
				m.birth = null;
				continue;
			}
			
			char ch = ' ';
			boolean birth_check = false;
			for(int i = 0; i < m.birth.length(); i++) {
				ch = m.birth.charAt(i);
				if(!(ch >= '0' && ch <= '9')) {
					birth_check = true;
				}
			}
			if(birth_check == true) {
				System.out.println("���ڸ� �Է��ϼž� �մϴ�. �ٽ� �Է��� �ּ���.");
				m.birth = null;
				birth_check = false;
				continue;
			}
			System.out.println("��������� ���������� �ԷµǾ����ϴ�.");
			break;
		}
		return m;
	} // birth_input
	
	// ��ȭ��ȣ �Է�
	public Member tell_input(Member m, Scanner scan) {
		while(true) {
			System.out.print("��ȭ��ȣ�� �Է��� �ּ���.('-' ����) : ");
			m.tell = scan.nextLine();
			
			char ch = ' ';
			int check_count = 0;
			for(int i = 0; i < m.tell.length(); i++) {
				ch = m.tell.charAt(i);
				if(ch == '-') {
					check_count++;
				}
			}
			
			if(check_count != 2) {
				System.out.println("'-'�� 2���� �ƴմϴ�. �ٽ��Է��� �ּ���.");
				m.tell = null;
				continue;
			}
			
			System.out.println("��ȭ��ȣ�� ���������� �ԷµǾ����ϴ�.");
			break;
		}
		return m;
	} // tell_input
	
	// ����ð� ���ϱ�
	public String now_time() {
		String now_time = "";
		Calendar now = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		now_time = format.format(now.getTime());
		return now_time;
	}
	
	//=======================================================================================================//
	// 2. �α���
	public void login(Scanner scan) {
		
		String id = "";
		String pw = "";
		
		Loop_login:
		while(true) {
			if(!(login_map.isEmpty())) {
				System.out.println("�̹� �α��� ���Դϴ�. �ٸ����̵�� �α����� ���ҽ� �α׾ƿ��� ���ּ���.");
				break;
			}
			
			System.out.println("�α����� �� ID�� PassWard�� �Է��� �ּ���.(��ҹ��ڱ���) (����ȭ�� : 999)");
			System.out.print("ID : ");
			id = scan.nextLine();
			
			if(id.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;
			}
			
			
			boolean id_check = false;
			boolean pw_check = false;
			for(int i = 0; i < mem.size(); i++) {
				Member mm = new Member();
				mm = (Member)mem.get(i);
				if(id.equals(mm.id)) {
					id_check = true;
					
					System.out.print("PW : ");
					pw = scan.nextLine();
					if(pw.equals(mm.pw)) {
						pw_check = true;
					}
					else {
						System.out.println("PassWord�� ��ġ���� �ʽ��ϴ�. �ٽ� �α����� �ּ���.");
						continue Loop_login;
					}
				}
			}
			
			if(id_check == false) {
				System.out.println("��ġ�ϴ� ID�� �����ϴ�.");
				System.out.println("�ٽ� �Է��Ͻðų� ȸ�������� ���ּ���.");
				continue ;
			}
			
			login_map.put(id, pw);
			System.out.println("�α����� �Ϸ� �Ǿ����ϴ�.");
			
			break;
			
		}
	}
			
	//=======================================================================================================//
	// 3. �α׾ƿ�
	public void logout(Scanner scan) {
		if(login_map.isEmpty()) {
			System.out.println("�α����� �Ǿ� ���� �ʽ��ϴ�. �α����� ���� ���ּ���.");
			return;
		}
		
		String yn = "";
		
		// Map�� key�� ��������
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("���� " + it.next() + " ID�� �α��� �Ǿ� �ֽ��ϴ�.");
		}
		
		while(true) {
			System.out.print("�α׾ƿ� �Ͻðڽ��ϱ�? (y, n) : ");
			yn = scan.nextLine();
			if(yn.equals("Y") || yn.equals("y")) {
				login_map.clear();
				System.out.println("�α׾ƿ��� �Ǿ����ϴ�");
				break;
			}
			else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("�α׾ƿ��� ����ϼ̽��ϴ�. ����ȭ������ �̵��մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
		}
	}
	
//	public void logout(Scanner scan) {
//		loop_logout: 
//		while(true) {
//			String id = "";
//			System.out.print("�α׾ƿ��� ID�� �Է����ּ���. (����ȭ�� : 999) : ");
//			id = scan.nextLine();
//			
//			if(id.equals("999")) {
//				System.out.println("����ȭ������ �̵��մϴ�.");
//				break;
//			}
//			
//			boolean id_check = false;
//			for(int i = 0; i < mem.size(); i++) {
//				Member mm = new Member();
//				mm = (Member)mem.get(i);
//				if(id.equals(mm.id)) {
//					id_check = true;
//				}
//			}
//			if(id_check == false) {
//				System.out.println("�������� �ʴ� ID �Դϴ�. �ٽ� �Է��� �ּ���.");
//				continue;
//			}
//			
//			String yn = "";
//			if(login_map.containsKey(id)) {
//				while(true) {
//					System.out.print("�α׾ƿ� �Ͻðڽ��ϱ�? (y, n) : ");
//					yn = scan.nextLine();
//					if(yn.equals("Y") || yn.equals("y")) {
//						login_map.remove(id);
//						System.out.println("�α׾ƿ��� �Ǿ����ϴ�");
//						break;
//					}
//					else if(yn.equals("N") || yn.equals("n")) {
//						System.out.println("�α׾ƿ��� ����ϼ̽��ϴ�. ����ȭ������ �̵��մϴ�.");
//						break loop_logout;
//					}
//					else {
//						System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
//						continue;
//					}
//				}
//			}
//			else {
//				System.out.println("���� �α��� �Ǿ����� �ʽ��ϴ�. ����ȭ������ �̵��մϴ�.");
//				break;
//			}
//		}
//		
//	}
	
	//=======================================================================================================//
	// 4. ��ǰ����
	public void product_buy(Scanner scan) {
		
		if(login_map.isEmpty()) {
			System.out.println("�α��� �Ŀ� �̿��Ͻ� �� �ֽ��ϴ�. �α��� ���ּ���.");
			return;
		}
		
		int select = 0;
		select = product_print(scan);
		Product p = null;
		switch (select) {
			case 1:
				p = new LcdTv();
				tv_content_print(p);
				buy(p, scan);
				
				break;
				
			case 4:
				p = new BasicRef();
				ref_content_print(p);
				buy(p, scan);
				
				break;
				
			case 6:
				p = new BasicWashing();
				washing_content_print(p);
				buy(p, scan);
				
				break;

		}
		
	}
	
	//=======================================================================================================//
	// ��ǰ��� 
	public int product_print(Scanner scan) {
		int select = 0;
		System.out.println("1) LCDTV, 2) LEDTV, 3) OLEDTV");
		System.out.println("4) �Ϲݳ����, 5) �繮�������");
		System.out.println("6) �뵹�̼�Ź��, 7) �巳��Ź��, 8) �巳������Ź��");
		System.out.println("---------------------------------------------------");
		System.out.print("���Ÿ� ���ϴ� ��ȣ�� �Է��� �ּ���. : ");
		select = scan.nextInt();
		scan.nextLine();

		return select;
	}
	
	// ��ǰ�������
	public void product_content_print(Product p) {
		System.out.println("��ǰ�� : " + p.name);
		System.out.println("���� : " + p.price);
		System.out.println("����Ʈ : " + p.point);
		System.out.println("���� : " + p.color);
	}
	
	// TV�󼼳��� ���
	public void tv_content_print(Product p) {
		product_content_print(p);
		Tv t = (Tv)p;
		System.out.println("��ũ�� : " + t.screen);
		System.out.println("ũ�� : " + t.inch);
		String hdr = "";
		if(t.hdr == true) {
			hdr = "��� ����";
		}
		else {
			hdr = "��� ����";
		}
		System.out.println("HDR : " + hdr);
	}
	
	// ����� �󼼳��� ���
	public void ref_content_print(Product p) {
		product_content_print(p);
		Ref r = (Ref)p;
		System.out.println("�뷮(L) : " + r.liter);
		System.out.println("���� : " + r.door);
		String d_cooling = "";
		if(r.d_cooling == true) {
			d_cooling = "��� ����";
		}
		else {
			d_cooling = "��� ����";
		}
		System.out.println("������ : " + d_cooling);
	}
	
	// ��Ź�� �󼼳��� ���
	public void washing_content_print(Product p) {
		product_content_print(p);
		Washing w = (Washing)p;
		System.out.println("�뷮(kg) : " + w.size);
		String shape = "";
		if(w.shape == 1) {
			shape = "�Ϲ���";
		} else if(w.shape == 2) {
			shape = "�巳��";
		} else if(w.shape == 3) {
			shape = "�巳������";
		}
		System.out.println("��� : " + shape);
		String sterialiazation = "";
		if(w.Sterilization == true) {
			sterialiazation = "��� ����";
		}
		else {
			sterialiazation = "��� ����";
		}
		System.out.println("��� : " + sterialiazation);
	}
	
	//=======================================================================================================//
	// 4. ��ǰ����
	public void buy(Product p, Scanner scan) {
		System.out.print("���� �Ͻðڽ��ϱ�?(y, n) : ");
		String yn = "";
		while(true) {
			yn = scan.nextLine();
			if(yn.equals("Y") || yn.equals("y")) {
				// ���Ž���
				Cart c = new Cart();
				
				// Map�� key�� ��������
				Iterator it = login_map.keySet().iterator();
				while(it.hasNext()) {
					c.id = (String)it.next();
				}
				c.product_name = p.name;
				c.price = p.price;
				c.point = p.point;
				c.buy_time = now_time();
				
				for(int i = 0; i < mem.size(); i++) {
					Member mm = (Member)mem.get(i);
					if(mm.id.equals(c.id)) {
						if(mm.money < c.price) {
							System.out.println("���� �ܾ� : " + mm.money + " / ��ǰ���� : " + c.price);
							System.out.println("�ܾ��� �����մϴ�. ������ �ּ���.");
							return;
						}
					}
				}
				
				cart.add(c);
				
				//Ȯ�ο� print
//				for(int i = 0; i < cart.size(); i++) {
//					Cart cc = (Cart)cart.get(i);
//					System.out.println("id : " + cc.id);
//					System.out.println("product_name : " + cc.product_name);
//					System.out.println("price : " + cc.price);
//					System.out.println("point : " + cc.point);
//					System.out.println("now : " + cc.buy_time);
//				} 
				
				for(int i = 0; i < mem.size(); i++) {
					Member mm = (Member)mem.get(i);
					if(mm.id.equals(c.id)) {
						mm.money -= c.price;
						mm.point += c.point;
						mem.set(i, mm);
						System.out.println("�ܾ� : " + mm.money + " / ����Ʈ : " + mm.point);
						
						break;
					}
				}
				
				//Ȯ�ο� print
//				for(int i = 0; i < mem.size(); i++) {
//					Member mm = (Member)mem.get(i);
//					if(mm.id.equals(c.id)) {
//						System.out.println(mm.id);
//						System.out.println(mm.pw);
//						System.out.println(mm.name);
//						System.out.println(mm.birth);
//						System.out.println(mm.tell);
//						System.out.println("money : " + mm.money);
//						System.out.println("point : " + mm.point);
//					}
//				}
				
				break;
			}
			else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("�����ϱ⸦ ����ϼ̽��ϴ�. ����ȭ������ �̵��մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
		}
	}
	
	//=======================================================================================================//
	// 5. ���Ÿ�����
	public void purchase_list_print() {
		if(login_map.isEmpty()) {
			System.out.println("�α����� ���� ���ּ���.");
			return;
		}
		
		String id = "";
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			id = (String)it.next();
		}
		
		purchase_title_print();
		
		if(id.equals(ADMIN)) {
			for(int i = 0; i < cart.size(); i++) {
				Cart cc = (Cart)cart.get(i);
				purchase_list_print_sub(cc);
			}
			return;
		}
		
		boolean cart_check = false;
		for(int i = 0; i < cart.size(); i++) {
			Cart cc = (Cart)cart.get(i);
			if(cc.id.equals(id)) {
				purchase_list_print_sub(cc);
				cart_check = true;
			}
		}
		if(cart_check == false) {
			System.out.println("���ų����� �����ϴ�.");
			return;
		}
		
	}
	
	public void purchase_title_print() {
		for(int i = 0; i < purchase_title.length; i++) {
			System.out.print(purchase_title[i] + "\t");
		}
		System.out.println();
	}
	
	public void purchase_list_print_sub(Cart cc) {
		System.out.print(cc.buy_number + "\t");
		System.out.print(cc.id + "\t");
		System.out.print(cc.product_name + "\t");
		System.out.print(cc.price + "\t");
		System.out.print(cc.point + "\t");
		System.out.print(cc.buy_time + "\t");
		System.out.println();
	}
	
	//=======================================================================================================//
	// 8. ȸ�������˻�
	public void member_search(Scanner scan) {
		
		String id = "";
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			id = (String)it.next();
		}
		
		if(!(id.equals(ADMIN))) {
			System.out.println("�����ڸ� �̿��� �� �ֽ��ϴ�.");
			return;
		}
		
		String scan_name = "";
		while(true) {
			System.out.print("�˻� �� �̸��Ǵ� �Ϻθ� �Է��� �ּ��� (����ȭ�� : 999): ");
			scan_name = scan.nextLine();
			if(scan_name.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;
			}
			
			title_print();
			boolean contain_check = false;
			for(int i = 0; i < mem.size(); i++) {
				Member mm = new Member();
				mm = (Member)mem.get(i);
				if(mm.name.contains(scan_name)) {
					member_print_sub(mm);
					contain_check = true;
				}
			}
			
			if(contain_check == false) {
				System.out.println("�˻� ����� ��ġ�ϴ� ȸ�� ������ �����ϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���.");
				continue;
			}
			break;
		}
	}
	
	//=======================================================================================================//
	// 9. ȸ������ ����	
	// ȸ������ �����Ͽ� ���
	public void member_print(Scanner scan) {
		if(login_map.isEmpty()) {
			System.out.println("�α����� ���� ���ּ���.");
			return;
		}

		String id = "";
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			id = (String)it.next();
		}

		if(!(id.equals(ADMIN))) {
			title_print();
			for(int i = 0; i < mem.size(); i++) {
				Member mm = (Member)mem.get(i);
				if(mm.id.equals(id)) {
					member_print_sub(mm);
					break;
				}
			}
			return;
		}

		int select = 0;
		System.out.println("1) ID�� ���, 2) �̸��� ���, 3) ���ϼ� ���, 999) ����ȭ��");
		System.out.print("���ϴ� ��ȣ�� �Է��� �ּ���. : ");
		select = scan.nextInt();
		
		switch (select) {
			case 1:
				title_print();
				Collections.sort(mem, new Comparator<Member>() {

					@Override
					public int compare(Member m1, Member m2) {
						return m1.id.compareTo(m2.id);
					}
					
				});
				
				for(int i = 0; i < mem.size(); i++) {
					Member mm = (Member)mem.get(i);
					member_print_sub(mm);
				}
				break;
				
			case 2:
				title_print();
				
				Collections.sort(mem, new Comparator<Member>() {

					@Override
					public int compare(Member m1, Member m2) {
						return m1.name.compareTo(m2.name);
					}
				});
				
				for(int i = 0; i < mem.size(); i++) {
					Member mm = (Member)mem.get(i);
					member_print_sub(mm);
				}
				
				break;
				
			case 3:
				title_print();
				
				Collections.sort(mem, new Comparator<Member>() {

					@Override
					public int compare(Member m1, Member m2) {
						return m1.birth.compareTo(m2.birth);
//						if(m1.birth < m2.birth) {
//							return -1;
//						} 
//						else if (m1.birth == m2.birth) {
//							return 0;
//						} 
//						else {
//							return 1;
//						}
						
					}
				});
				
				for(int i = 0; i < mem.size(); i++) {
					Member mm = (Member)mem.get(i);
					member_print_sub(mm);
				}
				
			case 999:
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;

		}
		
	}
	
	// Ÿ��Ʋ ���
	public void title_print() {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	// Member ��ü �ϳ��� ���� ������� ���� ���
	public void member_print_sub(Member mm) {
		System.out.print(mm.id + "\t");
		
		if(mm.pw != null) {
			System.out.print("********" + "\t");
		}
//		System.out.print(mm.pw + "\t");
		System.out.print(mm.name + "\t");
		System.out.print(mm.birth + "\t");
		System.out.print(mm.tell + "\t");
		System.out.print(mm.money + "\t");
		System.out.print(mm.point + "\t");
		System.out.println();
	}
	

	
	
	
	
	
	
	
	
	
} //class