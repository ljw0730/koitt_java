
public class CEx20200227_03 {

	public static void main(String[] args) {
		// Tv, CaptionTv class�� ����Ǿ� ����
		// ������
		
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();
				
		t.power();
		t.channel = 7;
		t.channelUp();		//8
		t.channelUp();		//9
		t.channelDown();	//8
		System.out.println("Tv ��ü ä�� : " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();	//10
		c.channelDown();	//9
		c.caption();
		c.text = "�ܿ�ձ�2 ��ȭ�ڸ��� �߰� �Ǿ����ϴ�.";
		c.caption();
		System.out.println("CaptionTv ��ü ä�� : " + c.channel);
		
		// ������
		Tv t2 = new CaptionTv();	// ����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� ���� ���� ������
		//CaptionTv c2 = new Tv();	//���� - �ڼ�Ÿ���� ���������� ����Ÿ���� ��ü�� ���� ���� ����.
		
		t2.power();
		t2.channel = 7;
		// t2.text // ���� - Tv�� text�� ���� ������ ������ ������ �Ұ��� �ϴ�.
		// Tv Ŭ������ ������ �޼ҵ�� ����� ����������
		// CaptionTv�� ������ �޼ҵ�� ��� �� �� ����.
		
		CaptionTv c2 = new CaptionTv();
		t2 = c2;
		//c2 = t2; ����
		c2 = (CaptionTv)t2; //����Ϸ��� ����ȯ�� ���ָ�ȴ�.
							//����� ���� �ڽ�Ÿ������ ���� ������ ����ȯ�� ���־�� �Ѵ�.
		
	}

}
