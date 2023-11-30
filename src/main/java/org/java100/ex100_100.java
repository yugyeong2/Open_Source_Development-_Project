package org.java100;
import java.util.Random;
import java.util.Scanner;

public class ex100_100 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
			
		int answer = rand.nextInt(100)+1;
			
		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���.");
			int userAnswer = scan.nextInt();
			if(userAnswer < answer) {
				System.out.println("��ȣ�� ���亸�� �۽��ϴ�.");
			}else if(userAnswer > answer) {
				System.out.println("��ȣ�� ���亸�� Ů�ϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
				break;
			}
		}

	}

}