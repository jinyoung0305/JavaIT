package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 글자, 숫자, 소수점있는숫자
		// String : 글자(문자열)
		// int : 숫자(정수)
		// double : 소수점있는 숫자(실수)
		
		// 자료형 변수명;
		int 숫자1 = 3;
		int 숫자2 = 2;
		
		// 프로그랭밍에서는 연산이 가능 (+,-,*, ,/,...)
		// 연산을 시켜주는 기호들을 '연산자'라고 부름
		System.out.println(1+1);  // 더하기
		System.out.println(3-4);  // 빼기
		System.out.println(3*3);  // 곱하기
		System.out.println(10/2); // 나누기
		
		// 연산은 변수끼리도 가능 (저장되어있는 값을 연산함)
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		
		// 글자는 더하기만
		String 글자1 = "안녕";
		String 글자2 = "하세요";
		System.out.println(글자1+글자2);
		
		// 숫자는 더하기, 빼기, 곱하기, 나누기 등등 여러가지 가능
		String str = "Hello" + " World!";
		System.out.println(str);
		int num = 1+1;
		System.out.println(num);
		int num1 = 2-1;
		System.out.println(num1);
		int num2 = 3*3;
		System.out.println(num2);
		int num3 = 9/3;
		System.out.println(num3);
		int num4 = 10%3;
		System.out.println(num4);
		
		// 우선순위높음 : *, /
		// 우선순위낮음 : +, -
		int 국어 = 55, 영어 = 41, 수학 = 68;
		int 합계 = 국어+영어+수학;
		double 평균 = (double)합계/3;  //정수÷정수=정수, 정수÷실수=실수
		
		System.out.println("총점 = "+합계);
		System.out.println("평균 = "+평균);
		// 정수 : 소수점이 없는 숫자(자료형)
		
		// 자료형 변환 : 앞에다가 (자료형) 으로 만듬
	}
}
