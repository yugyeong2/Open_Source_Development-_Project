package org.java100;
import java.util.Scanner;

public class java_079 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요:");
		String str = scan.nextLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if( c >= 'a' && c <= 'z') { // 소문자
				System.out.print( (char)(c - 32) );
			}else if( c >= 'A' && c <= 'Z') {// 대문자
				System.out.print( (char)(c + 32) );
			}else { // 숫자/특수문자
				System.out.print(c);
			}
			
		}
	}

}

/*
	주어지는 영어 문장을 대문자를 소문자로, 소문자를 대문자로 변경한다.
 
	입력 예시 
	CodeChallenge2014withMSP
	출력 예시
	cODEcHALLENGE2014WITHmsp
*/
