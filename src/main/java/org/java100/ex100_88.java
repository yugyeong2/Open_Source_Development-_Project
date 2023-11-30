package org.java100;
import java.util.Scanner;

public class ex100_88 {

	public static void main(String[] args) {
		// ������ ��
		//Sum = 1+2+3+4+5
		//Sum = 1 + (1+2) + (1+2+3) ... (1+...+n)
		Scanner scan = new Scanner(System.in);
		System.out.println("n����:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum = sum + j;
			}
		}
		System.out.println("��������:"+sum);
		//Sum = 1 + (1+2) + (1+2+3) ... (1+...+n)
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=n; i++) {
			sum1 = sum1 + i;
			sum2 = sum2 + sum1;
		}
		System.out.println("��������:"+sum2);
	}

}
