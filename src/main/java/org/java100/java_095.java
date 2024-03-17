package org.java100;

public class java_095 {
	public static void main(String[] args) {
		int[] counts = new int[26]; // 알파벳 개수는 26개

		String str = "oh! my god!"; // 입력 예
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z' )
			{
				int index = c - 97; // a -> 0
				System.out.println("i"+index);
				counts[index]++;
			}
		}
		for(int i=0; i<counts.length; i++) {
			System.out.println((char)('a'+i)+
					":"+ counts[i]);
		}
		
		
	}

}

/*
	어떤 영어 문장이 주어지면 각 알파벳이 몇 번 나왔는지 출력하시오.
	
	입력
	영어 한 문장이 입력된다. (90글자 이내) 
	이 문장은 영어 소문자와 공백, 특수문자로 이루어져있다.
	출력
	각 알파벳의 개수만 출력한다. 그외 특수문자나 공백의 개수는 출력하지 않는다.
*/
