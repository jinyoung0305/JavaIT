package day07;

public class Extends4 {
	public static void main(String[] args) {
		Human human = new Human("홍길동",29);
		System.out.println("이름은 "+human.getName()+"이고 나이는 "+human.getAge()+"살 입니다");
		Member member = new Member("장금이",30,10000);
		member.info();

	}
}

// 사람 Human
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터,세터
class Human {
	private String name;
	private int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
// 회원 Member
// 회원번호
// 생성자를 통해서 정보를 입력
// 게터, 세터
// 회원소개
class Member extends Human{
	private int mNum;
	
	Member(String name, int age, int mNum) {
		super(name, age);		// 부모의 생성자를 사용
		this.mNum = mNum;
	}

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public void info() {
		System.out.println("이름은 "+this.getName()+"이고 나이는 "+this.getAge()+"살 이고"+" 회원번호는 "+mNum);
	}
}