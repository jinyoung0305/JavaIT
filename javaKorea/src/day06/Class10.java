package day06;

// public class : 파일당 1개
public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		mc.HelloWorld();
		mc.Message("letter");
		mc.Message2("let","ter");
		System.out.println(mc.sum(2,-3));
	}
}

class MyClass10 {
	// #1 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드

	
	// #3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return
	// return한 값은  main 메서드에서 출력
	String str1;
	String str2;
	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	// 절대값으로 만들고 더한다음 return
	int a;
	int b;
	
	void HelloWorld() {
		System.out.println("Hello World");
	}
	
	void Message(String letter) {
		System.out.println(letter);
	}
	
	String Message2(String str1, String str2) {
		System.out.println(str1+str2);
		return str1+str2;
	}
	
	int sum(int a, int b) {
		if(a<0) {
			a = a * -1;
		}
		if (b<0) {
			b = b * -1;
		}
		
		return a+b;
	}
}
