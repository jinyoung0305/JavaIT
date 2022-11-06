package day04;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 너무 지저분하니까 정리해서 쓰자
		
		// while 버전
		int hi = 0;
		while(hi < 5) {
			System.out.println("while 안녕");
			hi++;
		}
		
		// for 버전
		for(int i=0; i<5; i++) {
			System.out.println("for 안녕");
		}
		
		/*
		 	for(초기값; 조건식; 증감량) {
		 		반복하고자 하는 코드들;
		 	}
		 */
		
		int a = 1, sum = 0;
		while(a < 11) {
			sum += a;
			a++;
		}
		System.out.println(sum);
		
		int 총합 = 0;
		for(int j=1; j<11; j++) {
			총합 += j;
		}
		System.out.println(총합);
		// 1. 초기값을 생성
		// 2. 조건식 검사
		// 3. {} 실행
		// 4. 증감식
		// 5. 조건식 검사
		// 6. {} 실행
		// ....
	}
}
