import java.util.Scanner;

public class CEx20200217_07 {
	public static void main(String[] args) {
		// Student Class와 연결되어 있음		
		
		// 5명의 학생의 이름, 국어, 영어, 수학 점수를 입력받으세요.
		// 합계 평균내기
		
		// 학생객체 선언
		Student[] stu = new Student[5];
				
				
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균" };
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student();

			// 이름 입력
			System.out.print((i+1) + "번째 학생의 이름을 입력해 주세요. : ");
			stu[i].name = scan.nextLine();
			
			// 점수 입력
			System.out.print(stu[i].name + " 학생의 국어점수를 입력해 주세요 : ");
			stu[i].kor = scan.nextInt();
			System.out.print(stu[i].name + " 학생의 영어점수를 입력해 주세요 : ");
			stu[i].eng = scan.nextInt();
			System.out.print(stu[i].name + " 학생의 수학점수를 입력해 주세요 : ");
			stu[i].math = scan.nextInt();
			scan.nextLine();
			
			// 합계계산
			stu[i].total();
			
			// 평균계산
			stu[i].average();
		}			
		
		
		// 타이틀 출력
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		// 이름, 점수, 합계, 평균 출력
		for(int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor + "\t");
			System.out.print(stu[i].eng + "\t");
			System.out.print(stu[i].math + "\t");
			System.out.print(stu[i].total + "\t");
			System.out.print(stu[i].avg + "\t");
			System.out.println();
		}
		
		scan.close();		
	}
}


