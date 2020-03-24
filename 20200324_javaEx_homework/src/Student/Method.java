package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
	ArrayList<Student> stu = new ArrayList<Student>();
	String title[] = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	Scanner scan = new Scanner(System.in);	
	public int main_print() {
		int select = 0;
		System.out.println("==============================");
		System.out.println("[학생 성적 처리 프로그램]");
		System.out.println(" 1. 학생성적입력");
		System.out.println(" 2. 학생출력입력");
		System.out.println(" 3. 학생정보검색");
		System.out.println(" 0. 종료");
		System.out.println("------------------------------");
		System.out.print("원하는 번호를 입력해 주세요 : ");
		
		if(!scan.hasNextInt()) {
			scan.next();
			return 999;
		}
		else {
			select = scan.nextInt();
			scan.nextLine();
			return select;
		}
		
	}
	
	// 1. 학생 성적 입력 --------------------------------------------------------------------------------//
	// 학생 성적 입력
	public void input_stu() {
		
		input_dumy();
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("학생의 이름을 입력해 주세요(이전화면 : 0) : ");
		name = scan.nextLine();
		if(name.equals("0")) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		kor = input_score(name, 2);
		eng = input_score(name, 3);
		math = input_score(name, 4);
		
		Student ss = new Student(name, kor, eng, math);

		stu.add(ss);
		ranking();
		
		title_print();
		System.out.println(ss);
		
		
	}
	
	// 더미데이터 넣기
	public void input_dumy() {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		//더비 데이터
		String nameArr[] = {"홍길동", "이순신", "이초홍", "김홍수", "박보검" };
		int korArr[] = {100, 80, 70, 90, 60};
		int engArr[] = {100, 80, 70, 90, 60};
		int mathArr[] = {100, 80, 70, 90, 60};
		
		for(int i = 0; i < nameArr.length; i++) {
			name = nameArr[i];
			kor = korArr[i];
			eng = engArr[i];
			math = mathArr[i];
			
			Student ss = new Student(name, kor, eng, math);
			stu.add(ss);
		}
	}
	
	// 점수 입력(국어, 영어, 수학)
	public int input_score(String name, int subject_num) {
		int score = 0;
		while(true) {
			score = 0;
			System.out.print(name + " 학생의 " + title[subject_num] + "성적을 입력해 주세요 : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			else {
				score = scan.nextInt();
				scan.nextLine();
				if(score < 0 || score > 100) {
					System.out.println("잘못된 점수를 입력하셨습니다.");
					continue;
				}
				break;
			}
		}
		return score; 
	}
	
	// 등수 처리
	public void ranking() {
		int count = 1;
		for(int i = 0; i < stu.size(); i++) {
			count = 1;
			Student ss1 = (Student)stu.get(i);
			for(int j = 0; j < stu.size(); j++) {
				Student ss2 = (Student)stu.get(j);
				if(ss1.total < ss2.total) {
					count ++;
				}
			}
			ss1.rank = count;
		}
		
	}
	
	// 2. 학생 성적 출력 --------------------------------------------------------------------------------//
	// 학생 성적 출력
	public void print_stu() {
		title_print();
		
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			System.out.println(ss);
		}
	}
	//타이틀 출력
	public void title_print() {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	// 3. 학생 정보 검색 --------------------------------------------------------------------------------//
	public void search_stu() {
		String search;
		System.out.print("검색하실 학생의 이름 전체나 일부를 입력해 주세요(이전화면 : 0) : ");
		search = scan.nextLine();
		if(search.equals("0")) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		title_print();
		boolean searched = false;
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			if(ss.name.contains(search)) {
				System.out.println(ss);
				searched = true;
			}
		}
		if(searched == false) {
			System.out.println("검색된 정보가 없습니다.");
		}
		
	}
	
	
	
}
