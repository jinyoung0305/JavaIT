package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 국어,영어,수학
		// 각각 40점 이상이고
		// 총합이 150 이상이면
		// '합격' 그외에는 '불합격'
		int kor, eng, math, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		
		System.out.println("총합은 "+sum);
		
//		if (kor >= 40 && eng >= 40 && math >= 40 && sum >= 150 ) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		if(sum >= 150) {
			if(kor >= 40 && eng >= 40 && math >= 40) {
				System.out.println("합격");
			}else { 
				System.out.println("과락");
			}
		}else {
			System.out.println("불합격");
		}
	}
}
