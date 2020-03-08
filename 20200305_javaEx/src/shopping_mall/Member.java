package shopping_mall;

public class Member {
	//회원가입
	
	final int MIN_ID_LEN = 3;
	final int MIN_PW_LEN = 8;
	final int BIRTH_LEN = 8;
	
	String id;
	String pw;
	String name;
	String birth;
	String tell;
	String join_time;
	int money = 10000;
	int point = 0;
	
	
	Member() {
		
	}
	
	Member(String id, String pw, String name, String birth, String tell) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.tell = tell;
	}
	
}
