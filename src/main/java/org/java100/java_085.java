package org.java100;
import java.util.Scanner;

public class java_085 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("n?:");
		int n = scan.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<n-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
	길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
	
	입력 예시 
	5
	출력 예시
	*****
	****
	 ***
	  **
	   *
*/
