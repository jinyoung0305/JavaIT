package day04;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String[4];
		int no[] = {1,2,3,4};
		
		name[0] = "짱구";
		name[1] = "철수";
		name[2] = "맹구";
		name[3] = "훈이";
		
		System.out.println("==출석부==");
		for(int i=0; i<name.length; i++) {
			System.out.println(no[i]+"번 - "+ name[i]);
		}
	}
}
