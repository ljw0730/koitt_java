public class CEx20200211_10 {
	public static void main(String[] args) {
		
		// �ð�ǥ ���
		//  ��     ȭ     ��     ��     ��
		//1 ����   ����   ����   ����   ����
		//2 ����1  ����   ����   ����2  �����
		//3 ����   ����1  ����   ����   ü��
		//4 ����   �̼�   ü��   ����   ����
		
		String[][] subject = {
								{ "����", "����", "����", "����", "����" },
								{ "����1", "����", "����", "����2", "�����" },
								{ "����", "����1", "����", "����", "ü��" },
								{ "����", "�̼�", "ü��", "����", "����" }
							 };
				
		System.out.println("\t\t[   ��   ��   ǥ   ]");
		System.out.printf("\t��\tȭ\t��\t��\t��\n");
		
		for(int i = 0; i < subject.length; i++) {
			for(int j = 0; j < subject[0].length; j++) {
				if(j == 0) {
					System.out.printf("%d", (i+1));					
				}
				System.out.printf("\t%s", subject[i][j]);
			}
			System.out.println("");
		}
	}	//main
}	//class
