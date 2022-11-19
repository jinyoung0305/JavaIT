package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.Print();
		
		TestClass2 tc2 = new TestClass2();
		tc2.Print();
		tc2.Print2(1);
	}
	
}

class TestClass {
	// private : 나 외에 다 사용 불가
	// protected : 상속받은 클래스까지는 허용
	// default(안적으면) : 같은 패키지면 허용
	// public : 같은 프로젝트 허용
	
	// 상속할거면 private -> protected
	protected int num;
	protected String str;
	private double dNum;
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}
}

// TestClass를 상속 받아서 수정&추가
class TestClass2 extends TestClass {
	// TestClass가 복붙되어있음
	private int num2;
	
	// 수정
	@Override
	public void Print() {
		System.out.println("클래스 바뀜~~~~~~~~~~~~~ ");
	}
	
	// 추가
	public int Print2(int num2) {
		System.out.println(num2);
		return num2;
	}
}