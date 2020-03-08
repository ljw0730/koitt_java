
public class CEx20200304_09 extends Object {

	public static void main(String[] args) {
		//String 메서드 - split
		
		// 주민번호를 입력받아 '-'을 기준으로 분리
		// 전화번호를 입력받아 '-'을 기준으로 분리
		
		String id = "880101-1100111";
		String tell = "010-1234-5678";
		
		String[] id_split = id.split("-");
		for(int i = 0; i < id_split.length; i++) {
			System.out.println("id_split[" + i + "] = " +id_split[i]);
		}
		
		String[] tell_split = tell.split("-");
		for(int i = 0; i < tell_split.length; i++) {
			System.out.println("tell_split[" + i + "] = " +tell_split[i]);
		}
		
	}
	
}


