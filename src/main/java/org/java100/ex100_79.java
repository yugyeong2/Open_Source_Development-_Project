package org.java100;
import java.util.Scanner;

public class ex100_79 {

	public static void main(String[] args) {
		// ���ĺ� ��ҹ��� ��ȯ
		//CodeChallenge2014withMSP
		//cODEcHALLENGE2014WITHmsp
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��ϼ���:");
		String str = scan.nextLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if( c >= 'a' && c <= 'z') { //���ҹ���
				System.out.print( (char)(c - 32) );
			}else if( c >= 'A' && c <= 'Z') {//���빮��
				System.out.print( (char)(c + 32) );
			}else { //���ڳ� Ư��������.
				System.out.print(c);
			}
			
		}
	}

}
