package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i + "번");
			i++;
		}
		
		int hi = 0;
		while(hi < 5) {
			System.out.println("안녕");
			hi++;
		}
		
		int a = 1;
		int sum = 0;
		while(a < 11) {
			sum += a;
			a++;
		}
		System.out.println(sum);
	}
}
