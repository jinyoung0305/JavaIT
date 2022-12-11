package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL3 {
	public static void main(String[] args) {
		InputStream is = null;		// 내 프로그램이 데이터를 가져올 때는 InputStream
		InputStreamReader isr = null;		// 문자열 형식이 안맞을 수 있어서 UTF-8로 변환
		BufferedReader br = null;			// 문자열로 바꾸기 위해 버퍼단위로 읽음
		URL url = null;							// HTTP 통신
		String str = null;
		String myWord = null;
		// 특정 페이지에서 원하는 문자열만 가져와 출력하기
		try {
			url = new URL("https://movie.daum.net/ranking/reservation");
			is = url.openStream();
			isr = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {	// br.readLine() : 한줄씩 읽기
				if(str.contains("data-tiara-layer=\"moviename\"")) {
					myWord = str.substring(str.indexOf("moviename")+11, str.indexOf("</a>"));	
					System.out.println(myWord);
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(myWord);
	}
}
