package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl mi2 = new Map2Impl();
		mi2.go();
		mi2.tester();
	}
}

class Map2Impl {
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 단어 5개 영한사전
		hm.put("apple", "사과");
		hm.put("peach", "복숭아");
		hm.put("orange", "오렌지");
		hm.put("watermelon", "수박");
		hm.put("strawberry", "딸기");
		
	}
	public void tester() {
		Scanner sc = new Scanner(System.in);
		String word_eng = null, word_kor = null;
		System.out.println("검색할 단어를 입력하세요 : ");
		word_eng = sc.nextLine();
		word_kor = hm.get(word_eng);
		if(word_kor == null||word_kor.equals("")) {
			System.out.println("없는 단어입니다.");
		}else {
			System.out.println("뜻 : "+word_kor);			
		}
		
//		Set<String> set = hm.keySet();
//		Iterator<String> it = set.iterator();
//		while(true) {
//			String select = it.next();
//			if(select.equals(word_eng)) {
//				word_kor = select;
//				System.out.println("뜻 : "+word_kor);
//				break;
//			}
//		}
		sc.close();
	}
}