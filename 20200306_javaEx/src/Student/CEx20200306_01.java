package Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CEx20200306_01 {

	public static void main(String[] args) {
		//Student class 와 연결되어 있음
		
		Scanner scan = new Scanner(System.in);
		
		int[] hak_num = { 1001, 1002, 1003 };
		String[] name = { "홍길동", "이순신", "김유신" };
		int[] total = { 299, 288, 300 };
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i = 0; i < hak_num.length; i++) {
			list.add(new Student(hak_num[i], name[i], total[i]));
//			System.out.println(list.get(i));
		}
		
		Loop1: while(true) {
			System.out.println("1) 학번정렬, 2) 이름정렬, 3) 점수정렬, 0) 종료");
			int num = scan.nextInt();
			
			switch (num) {
				case 1:
					Collections.sort(list, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {
							if(s1.hak_num < s2.hak_num) {
								return -1;
							}
							else if (s1.hak_num > s2.hak_num) {
								return 1;
							}
							else {
								return 0;
							}
						}
					});
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					
					break;
					
				case 2:
					Collections.sort(list, new Comparator<Student>(){

						@Override
						public int compare(Student s1, Student s2) {
							return s1.name.compareTo(s2.name);
						}
					});
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					
					break;
					
				case 3:
					Collections.sort(list, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {
							if(s1.total < s2.total) {
								return -1;
							}
							else if(s1.total > s2.total) {
								return 1;
							}
							else {
								return 0;
							}
						}
					});
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
					
			}
		}
		
		

	}

}
