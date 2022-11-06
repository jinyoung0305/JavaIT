package day04;

public class For3 {
	public static void main(String[] args) {
		
		// 5번 안녕하기
		for(int hi=0; hi<5; hi++) {
			System.out.println("안녕");
		}
		
		// 1~10까지 합 구하기
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 10~1 거꾸로 출력하기
		for(int j=10; j>0; j--) {
			System.out.println(j);
		}
		
		// 0~20까지 2씩 증가 시키면서 출력하기
		for(int a=0; a<21; a+=2) {
			System.out.println(a);
		}
	}
}
