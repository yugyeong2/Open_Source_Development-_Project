package org.java100;
import java.util.Scanner;

public class java_087 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("n:");
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1) // 첫 줄, 마지막 줄
					System.out.print("*");
				else {
					if(j==0 || j==n-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}

/*
	사각형 출력
	*****
	*   *
	*   *
	*   *
	*****
*/
