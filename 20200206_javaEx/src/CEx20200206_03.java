import java.util.Scanner;

public class CEx20200206_03 {
	public static void main(String[] args) {
		// 1. ���θ� ȭ�� ����
		// 2. ��ȣ �Է�
		// 3. ��ǰ�� ����
		//	  - ���� ��� ����
		//		1. ���� ���� / 2. ī�����
		//		 ī�� ���� �����ϼ̽��ϴ�.
		//		 ī�� ���� �Ͻðڽ��ϱ�?
		//		 yes
		//		 ����ó���� 
		//       -> (int)(Math.random*2)
		//			0�̸� -> ���� ����
		//			1�̸� -> ������ ����
		//    �ܰ� ��ǰ�ݾװ� ��
		//    �ܰ��� ��ǰ �ݾ� ������.
		// 4. ���Ÿ�� ����
		// 5. �ܰ�, ���űݾ� ���
		
		int select = 0;		// ��ü�޴� ����
		int pay_select = 0;	// ������� ����
		int pay_yes_no = 0;	// ī�� ���� �Ұ����� yes, no
		
		int my_bank = 5000000;	// �ʱ�ݾ�
		int charge = 0;			// �����ݾ�
		int point = 0;			// ���� ����Ʈ
		int using_money = 0;	// ����� �ݾ�
				
		int product1_won = 1300000;	// ��ǻ�� ����
		int product2_won = 990000;	// TV ����
		int product3_won = 880000;	// ����Ʈ�� ����
		
		String product1 = "��ǻ��";
		String product2 = "TV";
		String product3 = "����Ʈ��";
		
		int product1_count = 0;			// 1�� ��ǰ�� � �����
		int product2_count = 0;			// 2�� ��ǰ�� � �����
		int product3_count = 0;			// 3�� ��ǰ�� � �����
		String product_count_str = "";	// �� XXX�� ����ϴ�. �۱͸� ���� ����
			
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {	// ��ü while
			System.out.println(" ============================= ");
			System.out.println(" [ ��XƮ ���θ� ] ");
			System.out.printf(" 1) %s (%d��)\n", product1, product1_won);
			System.out.printf(" 2) %s (%d��)\n", product2, product2_won);
			System.out.printf(" 3) %s (%d��)\n", product3, product3_won);
			System.out.println(" 4) ����");
			System.out.println(" 5) ���ݾ� / �ܾ� / ����Ʈ Ȯ��");
			System.out.println(" 7) ����Ʈ ��ȯ");
			System.out.println(" 0) ����");

			select = scan.nextInt();
			if(select == 0) {
				break;
			}
			
			switch (select) {
				case 1:

					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- ���� ��� ���� ---");
						System.out.println("1)���ݰ��� 2)ī����� 3)�����ܰ�");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("���ݰ����� �����ϼ̽��ϴ�.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("ī������� �����ϼ̽��ϴ�.");
							System.out.println("ī����� �Ͻðڽ��ϱ�?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//ī�� ���� ��
								System.out.println("���� ó�� ��!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("������ ���������� ó�� ����ϴ�.");
									break;
								}
								else if(ran == 1) {
									System.out.println("���� ó���� ������ �߻��߽��ϴ�.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// ����ó�� while
					
					if(my_bank < product1_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product1 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product1 + "�� 1�� ������ " + product1_won + "�� �Դϴ�.");
					
					if (pay_select == 2) {
						my_bank -= product1_won;
					}
					product1_count++;
					point += (product1_won * 0.02);
					using_money += product1_won;
					break;
	
				case 2:
					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- ���� ��� ���� ---");
						System.out.println("1)���ݰ��� 2)ī����� 3)�����ܰ�");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("���ݰ����� �����ϼ̽��ϴ�.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("ī������� �����ϼ̽��ϴ�.");
							System.out.println("ī����� �Ͻðڽ��ϱ�?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//ī�� ���� ��
								System.out.println("���� ó�� ��!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("������ ���������� ó�� ����ϴ�.");
									break;
								}
								else if(ran == 1) {
									System.out.println("���� ó���� ������ �߻��߽��ϴ�.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// ����ó�� while
					
					if(my_bank < product2_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product2 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product2 + "�� 1�� ������ " + product2_won + "�� �Դϴ�.");
					if (pay_select == 2) {
						my_bank -= product2_won;
					}
					product2_count++;
					point += (product2_won * 0.02);
					using_money += product2_won;
					break;
					
				case 3:
					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- ���� ��� ���� ---");
						System.out.println("1)���ݰ��� 2)ī����� 3)�����ܰ�");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("���ݰ����� �����ϼ̽��ϴ�.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("ī������� �����ϼ̽��ϴ�.");
							System.out.println("ī����� �Ͻðڽ��ϱ�?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//ī�� ���� ��
								System.out.println("���� ó�� ��!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("������ ���������� ó�� ����ϴ�.");
									break;
								}
								else if(ran == 1) {
									System.out.println("���� ó���� ������ �߻��߽��ϴ�.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// ����ó�� while
					
					if(my_bank < product3_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product3 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product3 + "�� 1�� ������ " + product3_won + "�� �Դϴ�.");
					if (pay_select == 2) {
						my_bank -= product3_won;
					}
					product3_count++;
					point += (product3_won * 0.02);
					using_money += product3_won;
					break;
					
				case 4:
					System.out.println("���� �ݾ��� ���� �Ͻðڽ��ϱ�?");
					charge = scan.nextInt();
					if(charge == 0) {
						continue Loop1;
					}
					
					my_bank += charge;
					System.out.println(charge + "���� �����ϼ̽��ϴ�.");
					break;
				case 5:
//					System.out.printf("���� �ܾ� : %d��\n", my_bank);
					System.out.printf("������� ����� �ݾ� : %d��\n", using_money);
//					System.out.printf("���� ����Ʈ : %dP\n", point);
					break;
				case 7:
					while (true) {
						System.out.printf("���� ����Ʈ : %dP\n", point);
						System.out.printf("����Ʈ ��ȯ �ݾ��� �Է��� �ּ���. : ");
						int point_money = scan.nextInt();	// ����Ʈ�� �� �ٲ��� ����
						if(point_money <= point) {
							my_bank += point_money;	//����Ʈ ��ȯ
							point -= point_money;	//����Ʈ ����
							System.out.printf("%d���� �����Ǿ����ϴ�.\n", point_money);
						}
						else {
							System.out.println("����Ʈ ��ȯ�ݾ��� �ʹ� �����ϴ�. �ٽ� Ȯ���� �ּ���.");
							continue;
						}
						
						break;
					} // case 7	
			} // �޴����� select
			
			if(select >=1 && select <= 3) {
				product_count_str = "�� ";
				if(product1_count > 0) {
					product_count_str = product_count_str + product1 + product1_count + "�� ";
				}
				if(product2_count > 0) {
					product_count_str = product_count_str + product2 + product2_count + "�� ";
				}
				if(product3_count > 0) {
					product_count_str = product_count_str + product3 + product3_count + "�� ";
				}
				System.out.println(product_count_str + "�� �����ϼ̽��ϴ�.");
			} // �� ���� �� if
			
			
			System.out.println(" ============================= ");
			System.out.println("���� �ܾ��� " + my_bank + "�� �Դϴ�.");
			System.out.println("���� ����Ʈ " + point + "P �Դϴ�.");
			
		}	// ��ü while
		
		
		System.out.println(" ============================= ");
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}	//main

}	// class
