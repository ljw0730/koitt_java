
public class CEx20200211_02 {

	public static void main(String[] args) {
		
		// 1. ��������
		// boolean char byte short int long float double
		// char '1' - '0'	// 7 -> 7 + "" = "7" -> Integer.parseInt("7")
		// ���ǹ� - if, switch - ���� : ����, ����
		// �ݺ��� - for:������, while:���ѹݺ�

		//�迭 Ȱ��
		int[] ball = new int[45];
		
		int temp = 0;
		int random_int = 0;
		
		//�ݺ���
		for(int i = 0; i < 45; i++) {
			ball[i] = i+1;
		}
		
		//����
		for(int i = 0; i < 200; i++) {
			random_int = (int)(Math.random()*45);			
			
			temp = ball[0];
			ball[0] = ball[random_int];
			ball[random_int] = temp;
			
		}
		
		//�ζǹ�ȣ 6��
		System.out.print("�ζǹ�ȣ 6�� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
	}

}
