package day06;

public class Class8 {
	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동", 22, "남성", 179.8);
		Person 이순신 = new Person("이순신", 23, "남성", 188.8);
		// 해당 클래스 사용을 위해서 먼저 해줘야하는 작업을 문법으로 만듦(생성자)
		
		홍길동.getInfo();
		홍길동.hello();
		이순신.getInfo();
		이순신.hello();
	}
}

class Person {
	String name;
	int age;
	String gender;
	double height;
	
	// 생성자의 이름은 클래스의 이름과 같다, 자료형이 없음
	Person(String name, int age, String gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	// getInfo() 정보보기 (정보 출력)
	public void getInfo() {
		System.out.println("이름 : "+name+", 나이 : "+age+ ", 성별 : "+gender+ ", 키 : "+height);
	}
	// 인사하기("변수"이 인사합니다)
	public void hello() {
		System.out.println(name+ "이(가) 인사합니다");
	}
}
