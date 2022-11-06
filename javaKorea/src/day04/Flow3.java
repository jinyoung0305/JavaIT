package day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		// 수도맞추기
		// 무한반복 -> 입력 
		// 맞추면 '정답' 띄어주고 종료 break
		// 틀리면 '틀렸습니다' 하고 다시 입력
		Scanner sc = new Scanner(System.in);
		String answer = null;
		while(true) {
			System.out.println("대한민국의 수도는? ");
			answer = sc.next();
			// 한국 || 대한민국
			// answer.equals("한국")
			if(answer.equals("서울") || answer.equals("seoul")) {				// String 문자열이 == 사용불가 -> .equals
				System.out.println("정답");
				break;
			}else {
				System.out.println("틀렸습니다");
			}
		}
	}
}
