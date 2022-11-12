package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국'
		// 미국의 수도는 워싱턴 입니다.
		
		String nations[] = {"한국", "대한민국", "미국", "일본", "중국"};
		String cities[] = {"서울", "서울", "워싱턴", "도쿄", "베이징"};
		String in;		// 사용자로부터 입력받은 값을 저장할 변수
		int idx;		// 입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i=0; i<5; i++) {
				System.out.println("어느 나라의 수도가 궁금하신가요? ");
				nations[i] = sc.next();
				if(nations[i].equals("한국")) {
					System.out.println(cities[0]+"입니다");
					continue;
				}else if(nations[i].equals("대한민국")) {
					System.out.println(cities[1]+"입니다");
					continue;
				}
				else if(nations[i].equals("미국")) {
					System.out.println(cities[2]+"입니다");
					continue;
				}
				else if(nations[i].equals("일본")) {
					System.out.println(cities[3]+"입니다");
					continue;
				}
				else if(nations[i].equals("중국")) {
					System.out.println(cities[4]+"입니다");
					continue;
				}else {
					System.out.println("없는 나라입니다");
					continue;
				}
			}
		}
//		System.out.println("어느 나라의 수도가 궁금하신가요? ");
//		in = sc.next();
//		for(int i=0; i<5; i++) {
//			if(in.equals(nations[i])) {
//				System.out.println(cities[i]+"입니다");
//				break;
//			}else if(in.equals(nations[i])) {
//				System.out.println(cities[i]+"입니다");
//				break;
//			}else if(in.equals(nations[i])) {
//				System.out.println(cities[i]+"입니다");
//				break;
//			}else if(in.equals(nations[i])) {
//				System.out.println(cities[i]+"입니다");
//				break;
//			}else if(in.equals(nations[i])) {
//				System.out.println(cities[i]+"입니다");
//				break;
//			}else {
//				System.out.println("없는 나라입니다");
//			}
//		}
	}
}
