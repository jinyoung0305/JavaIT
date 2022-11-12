package day05;

public class Class6 {
	public static void main(String[] args) {
		Person hong = new Person();
		Person lee = new Person();
		
		hong.setInfo("홍길동", 20, "남자", 180.0);
		lee.setInfo("이순신", 40, "남자", 185.5);
		
		hong.getInfo();
		hong.hello();
		lee.getInfo();
		lee.hello();
	}
}

class Person {
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	double height;
	
	// getInfo() 정보보기 (정보 출력)
	public void getInfo() {
		System.out.println("이름 : "+name+", 나이 : "+age+ ", 성별 : "+gender+ ", 키 : "+height);
	}
	// 인사하기("변수"이 인사합니다)
	public void hello() {
		System.out.println(name+ "이(가) 인사합니다");
	}
	
	public void setInfo(String name, int age, String gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
}