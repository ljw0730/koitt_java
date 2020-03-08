import java.util.Scanner;

public class Student {
	
	int stu_ID;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	static String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	static Scanner scan = new Scanner(System.in);
	
	void input(Student stu, int stu_ID_count) {
		// 학번입력
		stu.stu_ID = stu_ID_count;
		
		// 이름입력
		System.out.print("이름을 입력하세요. : ");
		stu.name = scan.nextLine();
		
		// 국어점수 입력
		System.out.print(stu.name + " 학생의 국어점수를 입력하세요. : ");
		stu.kor = scan.nextInt();
		scan.nextLine();
		
		// 영어점수 입력
		System.out.print(stu.name + " 학생의 영어점수를 입력하세요. : ");
		stu.eng = scan.nextInt();
		scan.nextLine();
		
		// 국어점수 입력
		System.out.print(stu.name + " 학생의 수학점수를 입력하세요. : ");
		stu.math = scan.nextInt();
		scan.nextLine();
	}
	
	void sum(Student stu) {
		stu.total = stu.kor + stu.eng + stu.math;
	}
	
	void average(Student stu, int subject_count) {
		stu.avg = stu.total / subject_count;
	}
	
	static void modify(Student[] stu) {
		int count = 0;
		int select2 = 0;
		String name_select ="";
		String temp_str = "";
		int temp_int = 0;
				
		System.out.println("수정할 학생의 이름을 입력해 주세요. : ");
		name_select = scan.nextLine();
		
		for(int i = 0; i < stu.length; i++) {
			if(stu[i].name.equals(name_select)) {
				break;
			}
			else {
				count++;
			}
		}
		
		System.out.println("========================");
		System.out.println("1. 이름");
		System.out.println("2. 국어");
		System.out.println("3. 영어");
		System.out.println("4. 수학");
		System.out.println("========================");
		System.out.print("수정할 번호를 입력해 주세요. : ");
		select2 = scan.nextInt();
		scan.nextLine();
		
		switch(select2) {
			case 1:
				System.out.print("수정할 이름을 입력해 주세요. : ");
				temp_str = scan.nextLine();
				
				stu[count].name = temp_str;
				break;
				
			case 2:
				System.out.println("수정할 국어점수를 입력해 주세요. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].kor = temp_int;
				break;
				
			case 3:
				System.out.println("수정할 영어점수를 입력해 주세요. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].eng = temp_int;
				break;
				
			case 4:
				System.out.println("수정할 수학점수를 입력해 주세요. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].math = temp_int;
				break;
		}
		
	}
	
	
	
	
	
	static void output_title() {
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
	}
	
	void all_output(Student stu) {
		System.out.print(stu.stu_ID + "\t");
		System.out.print(stu.name + "\t");
		System.out.print(stu.kor + "\t");
		System.out.print(stu.eng + "\t");
		System.out.print(stu.math + "\t");
		System.out.print(stu.total + "\t");
		System.out.print(stu.avg + "\t");
		System.out.print(stu.rank + "\t");
		System.out.println();
	}
}
