package Student_package;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	
	ArrayList<Student> stu = new ArrayList<Student>();
	
	String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	String[] name_dummy = {"홍길동", "이순신", "이초홍", "박보검", "김홍도" };
	int[] kor_dummy = { 100, 80, 90, 60, 70 };
	int[] eng_dummy = { 100, 80, 90, 60, 70 };
	int[] math_dummy = { 100, 80, 90, 60, 70 };
	
	//==============================================================================================================//
	// 메인화면
	int main_print(Scanner scan) {
		int select = 0;
		System.out.println("========================");
		System.out.println("[학생성적처리 프로그램]");
		System.out.println(" 1. 학생성적입력");
		System.out.println(" 2. 학생성적출력");
		System.out.println(" 3. 학생정보검색");
		System.out.println(" 4. 등수확인");
		System.out.println(" 0. 종료");
		System.out.println("------------------------");
		System.out.print("원하는 번호를 입력해 주세요 : ");
		
		// int형이 입력되지 않았다는 뜻이죠!
		// int형이 입력되지 않으면
		// while 문 안에서 scan.next(); 이 코드를 이용해서 받았던 값을 날려버려요.
		// 그리고 다시 while 문의 처음으로 돌아가서 scan.hasNextInt()로 다시 입력받을 수 있도록 해줘요.
		// 만약 scan.hasNextInt()이 true라면 while 문을 벗어나서
		// scan.nextInt() 코드가 보인다면 그곳에 값을 넣어주게 돼요 ^^
		while(!scan.hasNextInt()) {
			scan.next();
			System.err.print("에러! 숫자가 아닙니다. 다시 입력해 주세요. : ");
		}
		
		select = scan.nextInt();
		scan.nextLine();
		
//		System.out.println("숫자만 입력이 가능합니다.");
		
		
		return select;
	}
	
	//==============================================================================================================//
	// 1. 학생성적 입력
	void input_student_grades(Scanner scan) {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		name = input_name(scan);
		if(name.equals("999")) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		kor = input_grades(scan, name, 1);
		eng = input_grades(scan, name, 2);
		math = input_grades(scan, name, 3);
		
		stu.add(new Student(name, kor, eng, math));
		
//		for(int i = 0; i < name_dummy.length; i++) {
//			stu.add(new Student(name_dummy[i], kor_dummy[i], eng_dummy[i], math_dummy[i]));
//		}
		
		ranking();
	}
	
	String input_name(Scanner scan) {
		String name = "";
		System.out.print("이름을 입력해 주세요. (이전화면 : 999) : ");
		name = scan.nextLine();
		return name;
	}
	
	int input_grades(Scanner scan, String name, int count) {
		int num = 0;
		String[] subject = { "국어", "영어", "수학" };
		while(true) {
			System.out.print(name + " 학생의 " + subject[count-1] + "성적을 입력해 주세요 : ");
			
			while(!scan.hasNextInt()) {
				scan.next();
				System.err.print("에러! 숫자가 아닙니다. 다시 입력해 주세요. : ");
			}
			num = scan.nextInt();
			scan.nextLine();
			
			if(!(num >= 0 && num <= 100)) {
				System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			return num;
		}
	}
	
	//==============================================================================================================//
	// 2. 학생성적출력
	void print_student_grades() {
		print_title();
		print_student();
	}
	
	// 타이틀 출력
	void print_title() {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	//학생 출력
	void print_student() {
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			System.out.println(ss);
		}
	}
	
	//==============================================================================================================//
	// 3. 학생정보검색
	void search(Scanner scan) {
		String name = "";
		
		System.out.print("검색 할 학생의 이름 전체 또는 일부를 입력해 주세요 (이전화면 : 999) : ");
		name = scan.nextLine();
		if(name.equals("999")) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		print_title();
		
		boolean check = false;
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			if(ss.name.contains(name)) {
				System.out.println(ss);
				check = true;
			}
		}
		
		if(check == false) {
			System.out.println("찾으시는 학생이 없습니다.");
		}
	}
	
	//==============================================================================================================//
	// 4. 등수확인
	
	void ranking() {
		for(int i = 0; i < stu.size(); i++) {
			int rank = 1;
			Student s1 = (Student)stu.get(i);
			for(int j = 0; j < stu.size(); j++) {
				Student s2 = (Student)stu.get(j);
				
				if(s1.total < s2.total) {
					rank++;
				}
			}
			
			s1.rank = rank;
			stu.set(i, s1);
		}
		
	}
	
}
