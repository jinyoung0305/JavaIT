package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5 {
	public static void main(String[] args) {
		ListClass5 lc5 = new ListClass5();
		lc5.go();
	}
}

class ListClass5 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.추가 2.수정 3.제거 4.보기 0.종료");
			String str = sc.next();
			String str2;
				
			if(str.equals("1")) {
				System.out.print("추가할 항목 입력 : ");	
				str2 = sc.next();
				arr1.add(str2);
			}else if(str.equals("2")) {
				System.out.print("수정할 항목 입력 : ");
				str = sc.next();
				System.out.print("수정될 항목 입력 : ");
				str2 = sc.next();
				arr1.set(arr1.indexOf(str),str2);
			}else if(str.equals("3")) {
				System.out.print("삭제할 항목 입력 : ");
				str2 = sc.next();
				arr1.remove(str2);
			}else if(str.equals("4")) {
				for(int i=0; i<arr1.size(); i++) {
					System.out.print(arr1.get(i)+" ");				
				}
				System.out.println();
			}else if(str.equals("0")){
				System.out.println("프로그램 종료");
				break;
			}			
		}
	}
}
