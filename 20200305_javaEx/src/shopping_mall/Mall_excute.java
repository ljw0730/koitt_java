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
	// 명령어 모음 class
	
	final String ADMIN = "관리자";
	
	// 회원 정보를 담을 ArrayList
	ArrayList<Member> mem = new ArrayList<Member>();
	
	// 구매품목을 담을 ArrayList
	ArrayList<Cart> cart = new ArrayList<Cart>();
	
	// 로그인한 ID, PW 담을 HashMap
	HashMap<String, String> login_map = new HashMap<String, String>();
	
	// 회원 정보 타이틀
	String[] title = { "ID", "패스워드", "이름", "생년월일", "전화번호", "보유금액", "보유포인트" };
	
	// 구매 목록 타이틀
	String[] purchase_title = { "구매번호", "ID", "제품명", "가격", "포인트", "구매일자" };
	
	//=======================================================================================================//
	// 1. 회원가입
	public void join_membership(Scanner scan) {
		Member m = new Member();
		
		if(mem.size()== 0) {
			// 더미데이터
			String[] id_str = { ADMIN, "qwerqwer", "asdfasdf", "zxcvzxcv", "uiopuiop", "hjklhjkl" };
			String[] pw_str = { (ADMIN+"@"), "qwerqwer@", "asdfasdf@", "zxcvzxcv@", "uiopuiop@", "hjklhjkl@" };
			String[] name_str = { ADMIN, "홍길동", "이순신", "이초홍", "박보검", "김홍도" };
			String[] birth_str = { ADMIN, "19880101", "20030324", "19830910", "19970416", "19940720" };
			String[] tell_str = { ADMIN, "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
			
			for(int i = 0; i < id_str.length; i++) {
				mem.add(new Member(id_str[i], pw_str[i], name_str[i], birth_str[i], tell_str[i]));
			}
		}
		
		
//		int back_check = id_input(m, scan);
//		if(back_check == 999) {
//			System.out.println("이전화면으로 이동합니다.");
//			return;
//		}
		
//		pw_input(m, scan);
		
//		m = name_input(m, scan);
//		m = birth_input(m, scan);
//		m = tell_input(m, scan);

//		m.join_time = now_time();
		
//		mem.add(m);
	}
	
	// ID 입력
	public int id_input(Member m, Scanner scan) {
		
//		String id = "";
		while(true) {
			System.out.print("ID를 입력해 주세요. (이전화면 : 999) : ");
			m.id = scan.nextLine();
			
			if(m.id.equals("999")) {
				m.id = null;
				return 999;
			}
			
			if(m.id.length() < m.MIN_ID_LEN) {
				System.out.println("ID는 " + m.MIN_ID_LEN + "자리 이상 입력하셔야 합니다.");
				System.out.println("다시 입력해 주세요.");
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
				System.out.println("중복된 ID가 있습니다. 다시 입력해 주세요.");
				m.id = null;
				continue;
			}
			overlap_check = false;
			
			System.out.println("ID가 정상적으로 입력되었습니다.");
			
			return 0;
		} // while
	} // id_input
	
	// 패스워드 입력
	public Member pw_input(Member m, Scanner scan) {
		
		while(true) {
			System.out.print("PW를 입력해 주세요 : ");
			m.pw = scan.nextLine();
			
			if(m.pw.length() < m.MIN_PW_LEN) {
				System.out.println("패스워드는 " + m.MIN_PW_LEN + "자리 이상 입력하셔야 합니다.");
				System.out.println("다시입력해 주세요.");
				m.pw = null;
				continue;
			}
			
			String temp_pw ="";
			System.out.print("패스워드를 한번 더 입력해 주세요. : ");
			temp_pw = scan.nextLine();
			
			if(!temp_pw.equals(m.pw)) {
				System.out.println("입력하신 두 패스워드가 일치하지 않습니다. 다시입력해 주세요.");
				m.pw = null;
				continue;
			}
			
			System.out.println("패스워드가 정상적으로 입력되었습니다.");
			
			return m;
		} //while
	} // pw_input
	
	// 이름 입력
	public Member name_input(Member m, Scanner scan) {
		System.out.print("이름을 입력해 주세요 : ");
		m.name = scan.nextLine();
		System.out.println("이름이 정상적으로 입력되었습니다.");
		return m;
	}
	
	// 생년월일 입력
	public Member birth_input(Member m, Scanner scan) {
		while(true) {
			System.out.print("생년월일을 입력해 주세요. (ex : 1988010) : ");
			m.birth = scan.nextLine();
			
			if(m.birth.length() != m.BIRTH_LEN) {
				System.out.println("총 8자리 이어야 합니다. 다시입력해주세요.");
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
				System.out.println("숫자만 입력하셔야 합니다. 다시 입력해 주세요.");
				m.birth = null;
				birth_check = false;
				continue;
			}
			System.out.println("생년월일이 정상적으로 입력되었습니다.");
			break;
		}
		return m;
	} // birth_input
	
	// 전화번호 입력
	public Member tell_input(Member m, Scanner scan) {
		while(true) {
			System.out.print("전화번호를 입력해 주세요.('-' 포함) : ");
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
				System.out.println("'-'가 2개가 아닙니다. 다시입력해 주세요.");
				m.tell = null;
				continue;
			}
			
			System.out.println("전화번호가 정상적으로 입력되었습니다.");
			break;
		}
		return m;
	} // tell_input
	
	// 현재시간 구하기
	public String now_time() {
		String now_time = "";
		Calendar now = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		now_time = format.format(now.getTime());
		return now_time;
	}
	
	//=======================================================================================================//
	// 2. 로그인
	public void login(Scanner scan) {
		
		String id = "";
		String pw = "";
		
		Loop_login:
		while(true) {
			if(!(login_map.isEmpty())) {
				System.out.println("이미 로그인 중입니다. 다른아이디로 로그인을 원할시 로그아웃을 해주세요.");
				break;
			}
			
			System.out.println("로그인을 할 ID와 PassWard를 입력해 주세요.(대소문자구분) (이전화면 : 999)");
			System.out.print("ID : ");
			id = scan.nextLine();
			
			if(id.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
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
						System.out.println("PassWord가 일치하지 않습니다. 다시 로그인해 주세요.");
						continue Loop_login;
					}
				}
			}
			
			if(id_check == false) {
				System.out.println("일치하는 ID가 없습니다.");
				System.out.println("다시 입력하시거나 회원가입을 해주세요.");
				continue ;
			}
			
			login_map.put(id, pw);
			System.out.println("로그인이 완료 되었습니다.");
			
			break;
			
		}
	}
			
	//=======================================================================================================//
	// 3. 로그아웃
	public void logout(Scanner scan) {
		if(login_map.isEmpty()) {
			System.out.println("로그인이 되어 있지 않습니다. 로그인을 먼저 해주세요.");
			return;
		}
		
		String yn = "";
		
		// Map의 key값 가져오기
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("현재 " + it.next() + " ID로 로그인 되어 있습니다.");
		}
		
		while(true) {
			System.out.print("로그아웃 하시겠습니까? (y, n) : ");
			yn = scan.nextLine();
			if(yn.equals("Y") || yn.equals("y")) {
				login_map.clear();
				System.out.println("로그아웃이 되었습니다");
				break;
			}
			else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("로그아웃을 취소하셨습니다. 이전화면으로 이동합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
		}
	}
	
//	public void logout(Scanner scan) {
//		loop_logout: 
//		while(true) {
//			String id = "";
//			System.out.print("로그아웃할 ID를 입력해주세요. (이전화면 : 999) : ");
//			id = scan.nextLine();
//			
//			if(id.equals("999")) {
//				System.out.println("이전화면으로 이동합니다.");
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
//				System.out.println("존재하지 않는 ID 입니다. 다시 입력해 주세요.");
//				continue;
//			}
//			
//			String yn = "";
//			if(login_map.containsKey(id)) {
//				while(true) {
//					System.out.print("로그아웃 하시겠습니까? (y, n) : ");
//					yn = scan.nextLine();
//					if(yn.equals("Y") || yn.equals("y")) {
//						login_map.remove(id);
//						System.out.println("로그아웃이 되었습니다");
//						break;
//					}
//					else if(yn.equals("N") || yn.equals("n")) {
//						System.out.println("로그아웃을 취소하셨습니다. 이전화면으로 이동합니다.");
//						break loop_logout;
//					}
//					else {
//						System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
//						continue;
//					}
//				}
//			}
//			else {
//				System.out.println("현재 로그인 되어있지 않습니다. 이전화면으로 이동합니다.");
//				break;
//			}
//		}
//		
//	}
	
	//=======================================================================================================//
	// 4. 물품구매
	public void product_buy(Scanner scan) {
		
		if(login_map.isEmpty()) {
			System.out.println("로그인 후에 이용하실 수 있습니다. 로그인 해주세요.");
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
	// 물품출력 
	public int product_print(Scanner scan) {
		int select = 0;
		System.out.println("1) LCDTV, 2) LEDTV, 3) OLEDTV");
		System.out.println("4) 일반냉장고, 5) 양문형냉장고");
		System.out.println("6) 통돌이세탁기, 7) 드럼세탁기, 8) 드럼건조세탁기");
		System.out.println("---------------------------------------------------");
		System.out.print("구매를 원하는 번호를 입력해 주세요. : ");
		select = scan.nextInt();
		scan.nextLine();

		return select;
	}
	
	// 상품내용출력
	public void product_content_print(Product p) {
		System.out.println("제품명 : " + p.name);
		System.out.println("가격 : " + p.price);
		System.out.println("포인트 : " + p.point);
		System.out.println("색상 : " + p.color);
	}
	
	// TV상세내용 출력
	public void tv_content_print(Product p) {
		product_content_print(p);
		Tv t = (Tv)p;
		System.out.println("스크린 : " + t.screen);
		System.out.println("크기 : " + t.inch);
		String hdr = "";
		if(t.hdr == true) {
			hdr = "기능 있음";
		}
		else {
			hdr = "기능 없음";
		}
		System.out.println("HDR : " + hdr);
	}
	
	// 냉장고 상세내용 출력
	public void ref_content_print(Product p) {
		product_content_print(p);
		Ref r = (Ref)p;
		System.out.println("용량(L) : " + r.liter);
		System.out.println("문수 : " + r.door);
		String d_cooling = "";
		if(r.d_cooling == true) {
			d_cooling = "기능 있음";
		}
		else {
			d_cooling = "기능 없음";
		}
		System.out.println("더블쿨링 : " + d_cooling);
	}
	
	// 세탁기 상세내용 출력
	public void washing_content_print(Product p) {
		product_content_print(p);
		Washing w = (Washing)p;
		System.out.println("용량(kg) : " + w.size);
		String shape = "";
		if(w.shape == 1) {
			shape = "일반형";
		} else if(w.shape == 2) {
			shape = "드럼형";
		} else if(w.shape == 3) {
			shape = "드럼건조형";
		}
		System.out.println("모양 : " + shape);
		String sterialiazation = "";
		if(w.Sterilization == true) {
			sterialiazation = "기능 있음";
		}
		else {
			sterialiazation = "기능 없음";
		}
		System.out.println("멸균 : " + sterialiazation);
	}
	
	//=======================================================================================================//
	// 4. 상품구매
	public void buy(Product p, Scanner scan) {
		System.out.print("구매 하시겠습니까?(y, n) : ");
		String yn = "";
		while(true) {
			yn = scan.nextLine();
			if(yn.equals("Y") || yn.equals("y")) {
				// 구매시작
				Cart c = new Cart();
				
				// Map의 key값 가져오기
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
							System.out.println("현재 잔액 : " + mm.money + " / 제품가격 : " + c.price);
							System.out.println("잔액이 부족합니다. 충전해 주세요.");
							return;
						}
					}
				}
				
				cart.add(c);
				
				//확인용 print
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
						System.out.println("잔액 : " + mm.money + " / 포인트 : " + mm.point);
						
						break;
					}
				}
				
				//확인용 print
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
				System.out.println("구매하기를 취소하셨습니다. 이전화면으로 이동합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
		}
	}
	
	//=======================================================================================================//
	// 5. 구매목록출력
	public void purchase_list_print() {
		if(login_map.isEmpty()) {
			System.out.println("로그인을 먼저 해주세요.");
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
			System.out.println("구매내역이 없습니다.");
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
	// 8. 회원정보검색
	public void member_search(Scanner scan) {
		
		String id = "";
		Iterator it = login_map.keySet().iterator();
		while(it.hasNext()) {
			id = (String)it.next();
		}
		
		if(!(id.equals(ADMIN))) {
			System.out.println("관리자만 이용할 수 있습니다.");
			return;
		}
		
		String scan_name = "";
		while(true) {
			System.out.print("검색 할 이름또는 일부를 입력해 주세요 (이전화면 : 999): ");
			scan_name = scan.nextLine();
			if(scan_name.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
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
				System.out.println("검색 내용과 일치하는 회원 정보가 없습니다.");
				System.out.println("다시 입력해 주세요.");
				continue;
			}
			break;
		}
	}
	
	//=======================================================================================================//
	// 9. 회원정보 보기	
	// 회원정보 정렬하여 출력
	public void member_print(Scanner scan) {
		if(login_map.isEmpty()) {
			System.out.println("로그인을 먼저 해주세요.");
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
		System.out.println("1) ID순 출력, 2) 이름순 출력, 3) 생일순 출력, 999) 이전화면");
		System.out.print("원하는 번호를 입력해 주세요. : ");
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
				System.out.println("이전화면으로 이동합니다.");
				break;

		}
		
	}
	
	// 타이틀 출력
	public void title_print() {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	// Member 객체 하나에 대해 멤버변수 값들 출력
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
