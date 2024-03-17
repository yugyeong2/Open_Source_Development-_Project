package org.java100;
import java.util.Scanner;

public class java_077 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("지수를 입력하세요>");
		int n = scan.nextInt();
		System.out.print("기수를 입력하세요>");
		int k = scan.nextInt();
		int num = (int)Math.pow(n, k);
		
		System.out.println(num);
	}
}
