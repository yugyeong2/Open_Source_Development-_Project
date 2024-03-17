package org.java100;

import java.util.Scanner;

public class java_086 {
	public static void main(String[] args) {
		int n = 5;
		int midIndex = (n/2)+1;
		for(int i=1; i<=midIndex; i++) {
			for(int k=i; k<midIndex; k++) {
				System.out.print(" ");
			}
			for(int j=2; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
	어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
	여기서 입력되는 n은 반드시 홀수이다.
	
	입력 예시 
	5
	출력 예시
	  *
	 ***
	*****
	
	n=5일때, 줄수가 3, 별위치 3
	즉 n/2+1
*/
