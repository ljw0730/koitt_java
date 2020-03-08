
public class CEx20200130_8 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		//char c2 = c1 + 1;	//에러
		//=>
		char c2 = (char)(c1 + 1);	//가능
		System.out.println(c2);
		c2 = ++c1;	//가능
		System.out.println(c2);
		
		int i = 'B' - 'A';
		System.out.println(i);
		
		int i2 = '2' - '0';
		System.out.println(i2);
		
		char a3 = '2';
		char b3 = '0';
		System.out.println("문자 2 더하기 문자 0 = "+a3+b3);
		//결과 20 은 문자2문자0 이다.
		char c3 = '7';
		System.out.println("문자 2 더하기 문자 0 더하기 문자7 = "+a3+b3+c3);
		int d3 = c3-b3;
		System.out.println("정수형 d 출력 : "+d3);
		// 문자형 숫자(char)를 정수형 숫자(int)로 만들고 싶다면
		// -'0'(빼기 문자형 숫자0) 을 한다.
		
	}
}
