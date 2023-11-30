package org.java100;
import java.util.Scanner;

public class ex100_76 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>");
		int n = scan.nextInt();
		System.out.print("������ �Է��ϼ���>");
		int k = scan.nextInt();
		int num = (int)Math.pow(n, k);
		
		System.out.println(num);
	}
}
