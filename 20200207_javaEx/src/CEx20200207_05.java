import java.util.Scanner;

public class CEx20200207_05 {
	public static void main(String[] args) {
		//가위 바위 보 게임
		
		
		String id = "aaa";
		String pw = "123";		
		
		int login_count = 0;
		
		int user = 0;
		int com = 0;
		
		int game_count = 0;
		int gaming_count = 0;
		int win_count = 0;
		int defeat_count = 0;
		String win_defeat = "";
		
		Scanner scan = new Scanner(System.in);
		
		Loop2:
		while(true) {
			if(login_count == 3) {
				System.out.println("아이디를 3번 틀리셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.println("로그인 해주세요.");
			System.out.printf("아이디 : ");
			String id_check = scan.next();
			if(!(id.equals(id_check))) {
				System.out.println("아이디가 일치하지 않습니다.");
				login_count++;
				continue;
			}
			
			login_count = 0;
			
			while(true) {
				if(login_count == 3) {
					System.out.println("비밀번호를 3번 틀리셨습니다.");
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				System.out.printf("패스워드 : ");
				String pw_check = scan.next();
				if(!(pw.equals(pw_check))) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					login_count++;
				}
				else {
					break Loop2;
				}
			}
			
		}
		
		
		Loop1:
		while (true) {	//전체 반복 while
			System.out.println("============================");
			System.out.println(" [ 가위 바위 보    게임 ]");
			
			System.out.println("몇판 하실건가요?? (종료 : 0) : ");
			game_count = scan.nextInt();
			if(game_count == 0) {
				break;
			}
			System.out.println(game_count + "번의 가위바위보 게임을 진행합니다.");
			
			while(game_count > gaming_count) {
				System.out.println("============================");
				System.out.println("가위바위보를 시작 합니다.");
				System.out.println((gaming_count+1) + "번째 판");
				System.out.print("가위(1) 바위(2) 보(3) // 종료(0) : ");
				user = scan.nextInt();
				
				if(user == 0) {
					break Loop1;
				}
				else if(user < 1 || user > 3) {
					System.out.println("잘못된 값을 입력하셨습니다. 다시 입력하세요.");
					continue;
				}
				
				com = (int)(Math.random() * 3) + 1;
				
				switch(user) {
					case 1:
						switch(com) {
							case 1:
								System.out.println("user : 가위 / com : 가위");
								System.out.println("비겼습니다. 다시 가위바위보를 합니다.");
								continue;
								
							case 2:
								System.out.println("user : 가위 / com : 바위");
								System.out.println("졌습니다. ㅠㅠ");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
							case 3:
								System.out.println("user : 가위 / com : 보");
								System.out.println("이겼습니다. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
						}
						break;
						
					case 2:
						switch(com) {
							case 1:
								System.out.println("user : 바위 / com : 가위");
								System.out.println("이겼습니다. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
								
							case 2:
								System.out.println("user : 바위 / com : 바위");
								System.out.println("비겼습니다. 다시 가위바위보를 합니다.");
								continue;
								
							case 3:	
								System.out.println("user : 바위 / com : 보");
								System.out.println("졌습니다. ㅠㅠ");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
						}
						break;
						
					case 3:
						switch(com) {
							case 1:
								System.out.println("user : 보 / com : 가위");
								System.out.println("졌습니다. ㅠㅠ");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
							case 2:
								System.out.println("user : 보 / com : 바위");
								System.out.println("이겼습니다. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
								
							case 3:
								System.out.println("user : 보 / com : 보");
								System.out.println("비겼습니다. 다시 가위바위보를 합니다.");
								continue;
						}	
						break;
				}
				
				
			}
		
			System.out.println("============================");
			for(int i = 0; i < game_count; i ++) {
				if(win_defeat.charAt(i) == '1') {
					System.out.println((i+1)  + " 번째 판 : 승리");
				}
				else if(win_defeat.charAt(i) == '2') {
					System.out.println((i+1) + " 번째 판 : 패배");
				}
			}
			
			System.out.println("전적 - 승리: " + win_count + "회 패배: " + defeat_count + "회");
			int winning_rate = (win_count * 100) / game_count;
			System.out.println("승률은 " + winning_rate + "% 입니다.");
			
			//변수 초기화
			game_count = 0;
			gaming_count = 0;	
			win_count = 0;		
			defeat_count = 0;	
			win_defeat = "";
					
			
		} //전체 반복 while
 		
		
		System.out.println("게임을 종료합니다.");
		
		scan.close();
		
		
	} // main
} //class
