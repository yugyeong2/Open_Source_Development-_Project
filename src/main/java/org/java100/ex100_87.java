package org.java100;
import java.util.Scanner;

public class ex100_87 {

	public static void main(String[] args) {
		//�簢�� ���
		//*****
		//*   *
		//*   *
		//*   *
		//*****
		Scanner scan = new Scanner(System.in);
		System.out.println("n��:");
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1)//ù��,��������
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