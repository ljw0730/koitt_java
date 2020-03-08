
public class CEx20200226_03 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method();

	} //main

} //CEx20200226_03 class

class Parent3 extends Object{ //extends를 안하고 선언하면 자동으로 Object를 extends 해준다.
	int x = 20;
	
	Parent3() {		//선언안해주면 컴파일 시 자동으로 생성
		super();	//선언안해주면 컴파일 시 자동으로 생성
	}
}

class Child3 extends Parent3 {

	Child3() {		//선언안해주면 컴파일 시 자동으로 생성
		super();	//선언안해주면 컴파일 시 자동으로 생성
	}
	
	void method() {
		System.out.println("local x : " + x);
		System.out.println("인스턴스 x : " + this.x);
		System.out.println("조상 x : " + super.x);
	}
}
