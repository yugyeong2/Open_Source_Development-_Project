package org.java100;
import java.util.Scanner;

public class ex100_97 {
	public static void main(String[] args) {
		// Ű ���� ������� �ڸ���ġ �ϱ�
		//�л��� Ű������� �ڸ��� ��ġ�ϴ� 
		//���α׷��� �ۼ��Ͻÿ�
		//160, 165, 164, 165, 150, 165, 168, 145, 170
		//�Է� ���� 
		//9 <- �Է��л���(1~99)
		//6 <- �ڸ���(1~10)
		//160 
		//165 
		//164 
		//145 150 160 164 165 165 
  		//165 168 170 �������� ����!
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��ϼ���:");
		int studentCount = scan.nextInt();
		int placeCount = scan.nextInt();
		int[] heigth = new int[100];
		for(int i=0; i<studentCount; i++) {
			heigth[i] = scan.nextInt();
		}
		//�������� ����
		for(int i=0; i<studentCount; i++) {
			for(int j=i+1; j<studentCount; j++) {
				if(heigth[i]>heigth[j]) { //ġȯ
					int temp = heigth[i];
					heigth[i] = heigth[j];
					heigth[j] = temp;
				}
			}
		}
		
		for(int i=0; i<studentCount; i++) {
			System.out.print(heigth[i]+",");
			
			if(i!= 0 && (i+1)%placeCount == 0)
				System.out.println();
		}
		
	}

}