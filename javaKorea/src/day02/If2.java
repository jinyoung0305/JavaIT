package day02;

public class If2 {
	public static void main(String[] args) {
		int age = 30;
		
		if(age < 10) {
			System.out.println("어린이");
		} // 조건검사
		else if(age < 20) {
			System.out.println("10대");
		} // 그 다음 검사
		else if(age < 30) {
			System.out.println("30대");
		}  else {
			System.out.println("그 외 40대 이상");
		} // 다틀리면
		
		// 버스카드기계
		// 나이 14살 미만이면 '어린이'
		// 14살 이상, 20살 미만이면 '청소년'
		// 20살 이상이면 성인
		int 나이 = 20;
		int 금액 = 0;
		if (나이 < 14) {
			System.out.println("어린이");
			금액 = 400;
		} else if (나이 < 20){
			System.out.println("청소년");
			금액 = 650;
		} else {
			System.out.println("성인");
			금액 = 1000;
		}
		System.out.println("금액은 "+금액+ "원입니다.");
		
	}
}
