package day12;

public class Thread1 {
	public static void main(String[] args) {
		/* 면접에서 주로 물어보는 질문
		 1. 배열 사용법 - 방 5개를 만들면 4번방까지만 있다
		 2. 오버로딩과 오버라이딩의 차이
		 3. 컬렉션 List, Set, Map의 차이
		 4. 프로세스와 쓰레드의 차이
		 */
		
		// 프로그램 : 운영체제에 설치된 처리방법과 순서가 기술된 명령문의 집합체(ex 파일)
		// 프로세스 : 실행중인 프로그램(프로그램이 프로세스에 등록됨)
		// 쓰레드 : 프로세스 내에서 실제로 작업을 수행하는 주체
		
		// main() : 주쓰레드
		// 쓰레드를 추가하고 다루는 방법
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);			// 1000ms 동안 쓰레드 중지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}

class MyThread1 {
	// 뭘 만들던 main만 실행됨
	String str;
	int num;
	double dNum;
	public void go() {
		
	}
	public int numnum(int num) {
		this.num = num;
		System.out.println(num);
		return num;
	}
}