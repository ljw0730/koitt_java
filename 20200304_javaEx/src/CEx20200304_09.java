
public class CEx20200304_09 extends Object {

	public static void main(String[] args) {
		//String �޼��� - split
		
		// �ֹι�ȣ�� �Է¹޾� '-'�� �������� �и�
		// ��ȭ��ȣ�� �Է¹޾� '-'�� �������� �и�
		
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


