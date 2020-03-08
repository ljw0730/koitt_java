package shopping_mall;

public class Tv extends Product {
	String screen;
	int inch;
	boolean hdr;
	
	Tv() { };
	Tv(String screen, int inch, boolean hdr) {
		this.screen = screen;
		this.inch = inch;
		this.hdr = hdr;
	}
}

class LcdTv extends Tv {
	
	final int LCDTV_PRICE = 1000;
	
	LcdTv() {
		super("LCD", 55, false);
		price = LCDTV_PRICE;
		point = (int)(LCDTV_PRICE*0.1);
		name = "LCDTV";
		color = "Black";
	}
}

//Product
//int price;
//int point;
//String name;
//String color;

//1. ȸ������
//- ���̵� �ߺ�üũ
//- ���̵� ���� 3�ڸ� �̻�
//- ��ü�� ArrayList ����
//- ���̵�, �н�����, �̸�, ��ȭ, �����ݾ�, ��������Ʈ
//
//2. �α���
//- ���̵�/�н����� Ȯ��
//- ��ü�����ؼ� Map ����
//
//3. �α׾ƿ�
//- ID�� ��� ������ �α׾ƿ�.
//- ��ü����
//
//4. ��ǰ����
//-> ID�� �ѹ��� �����
//-> Map�� ID�� ������ �������, �ƴϸ� �α����Ͻÿ�.
//1) LCDTV, 2)LEDTV, 3)OLEDTV
//4) �Ϲݳ����, 5) �繮�������
//6) �뵹�� ��Ź��, 7) �巳��Ź�� 8) �巳������Ź��
// - Product ��� price, bonusPoint, name, color
//  TV : screen, inch / hdr���(OLED���� ����)
//  ����� : liter, door / d_cooling(�繮������ ����)
//  ��Ź�� : size, shape / Sterilization (�巳������Ź�⿡�� ����)
//
//5. ��ǰ���� ��Ϻ���
//- ��ǰ������ ����Ʈ �����ֱ�
//
//8. ȸ�������˻�
//- ȸ�� �˻� ��� : 
//  (ȫ���� �˻��ϸ� ȫ�浿, ȫ���, �蹫ȫ �� �� ���)
//
//9. ȸ����������
//	1) ���� ������� ����
//	1) �̸� �������� ����
//- ȸ����ü ������