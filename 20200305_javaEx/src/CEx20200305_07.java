
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CEx20200305_07 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();

		Student stu1 = new Student(1, "홍길동", 300);
		Student stu2 = new Student(2, "이순신", 299);
		Student stu3 = new Student(3, "김유신", 280);
		Student stu4 = new Student(4, "유관순", 270);
		Student stu5 = new Student(5, "강감찬", 288);
  
		list2.add(stu3);
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu4);
		list2.add(stu5);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1)학번정렬 2)이름정렬 3)점수정렬");
			int num = scan.nextInt();
			if (num == 99) {
				break;
			}
			
			switch (num) {
				case 1:
					// 학번정렬
					Collections.sort(list2, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {
							if (s1.hak_num < s2.hak_num) {
								return -1;
							} else if (s1.hak_num > s2.hak_num) {
								return 1;
							}
							return 0;
						}
					});

					for (int i = 0; i < list2.size(); i++) {
						System.out.println(list2.get(i));
					}

					break;

				case 2:
					// 이름정렬
					Collections.sort(list2, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {
							return s1.name.compareTo(s2.name);
						}
					});

					for (int i = 0; i < list2.size(); i++) {
						System.out.println(list2.get(i));
					}

					break;

				case 3:
					// 합계정렬
					Collections.sort(list2,new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {
							if (s1.total < s2.total) {
								return -1;
							} else if (s1.total > s2.total) {
								return 1;
							}
							return 0;
						}
					});

					for (int i = 0; i < list2.size(); i++) {
						System.out.println(list2.get(i));
					}

					break;

			}// switch
		} // while

		Collections.sort(list2);
		//  Collections.reverse(list2);

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		System.out.println("--------------------");

	}

}