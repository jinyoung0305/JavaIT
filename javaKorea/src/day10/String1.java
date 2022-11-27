package day10;

public class String1 {
	public static void main(String[] args) {
		MyString1 ms1 = new MyString1();
		ms1.go();
	}
}

class MyString1 {
	public void go() {
		// String : 클래스, 기본자료형이 아님
		String str1 = "string";		// 편하게 쓰라고 간략화해줌
		String str2 = new String("string");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);		// 서로 다른 객체이기 때문에 false
		System.out.println(str1.equals(str2));	// .equals를 통해서 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2));	// 대소문자 무시하교 비교
	}
}
