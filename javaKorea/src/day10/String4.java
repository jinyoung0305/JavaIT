package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 mr4 = new MyString4();
		mr4.go();
	}
}

class MyString4 {
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println(won());
	}
	
	public String won() {
		// 정수를 입력받아서 천원단위로 ,를 찍어 출력
		// 5000000 ==> 5,000,000
		System.out.println("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result = "";
		String str1;
		
		str1 = Integer.toString(num);		// 10,000		9,999 99,999 99,9999 9,999,999 999,999,999 
//		int result_len = str1.length();
//		String parse1, parse2, parse3, parse4;
				
		if(num < 1000) {
			result = str1;
		}else if (num < 10000) {
			result = str1.substring(0,1)+","+str1.substring(1,4);
		}else if (num < 100000) {
			result = str1.substring(0,2)+","+str1.substring(2,5);
		}else if (num < 1000000) {
			result = str1.substring(0,3)+","+str1.substring(3,6);
		}else if (num < 10000000) {
			result = str1.substring(0,1)+","+str1.substring(1,4)+","+str1.substring(4,7);
		}else if (num < 100000000) {
			result = str1.substring(0,2)+","+str1.substring(2,5)+","+str1.substring(5,8);
		}else if (num < 100000000) {
			result = str1.substring(0,1)+","+str1.substring(1,4)+","+str1.substring(4,7);
		}else if (num < 1000000000) {
			result = str1.substring(0,3)+","+str1.substring(3,6)+","+str1.substring(6,9);
		}else {
			result = str1.substring(0,1)+","+str1.substring(1,4)+","+str1.substring(4,7)+","+str1.substring(7,10);
		}
		
//		switch(result_len) {
//		case 4:
//			parse1 = str1.substring(1, 4);
//			parse2 = str1.substring(0, 1);
//			result = parse2+","+parse1;
//			break;
//		
//		case 5:
//			parse1 = str1.substring(2, 5);
//			parse2 = str1.substring(0, 2);
//			result = parse2+","+parse1;
//			break;
//		
//		case 6:
//			parse1 = str1.substring(3, 6);
//			parse2 = str1.substring(0, 3);
//			result = parse2+","+parse1;
//			break;
//		
//		case 7:
//			parse1 = str1.substring(4, 7);
//			parse2 = str1.substring(1, 4);
//			parse3 = str1.substring(0, 1);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		
//		case 8:
//			parse1 = str1.substring(5, 8);
//			parse2 = str1.substring(2, 5);
//			parse3 = str1.substring(0, 2);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		
//		case 9:
//			parse1 = str1.substring(6, 9);
//			parse2 = str1.substring(3, 6);
//			parse3 = str1.substring(0, 3);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		
//		case 10:
//			parse1 = str1.substring(7, 10);
//			parse2 = str1.substring(4, 7);
//			parse3 = str1.substring(1, 4);
//			parse4 = str1.substring(0, 1);
//			result = parse4+","+parse3+","+parse2+","+parse1;
//			break;			
//		}
		return result;
	}
}
