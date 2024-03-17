package org.java100;

public class java_094 {
	public static void main(String[] args) {
		String str = "((())()(()))";
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c=='(')
				count1++;
			if(c==')')
				count2++;
		}
		System.out.println(count1 + " " + count2);
	}

}
