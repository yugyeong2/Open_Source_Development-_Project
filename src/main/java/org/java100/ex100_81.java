package org.java100;
import java.util.Scanner;

public class ex100_81 {

	public static void main(String[] args) {
		// �ִ밪�� �ּҰ� 
		// 5�� ������ �Ѱ��� �Է��Ͽ� �������.
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<5; i++) {
			nums[i] = scan.nextInt();
		}
		
		//�ִ밪
		int max = 0; // �ּҰ����� ����
		for(int i=0; i<5; i++) {
			if(max < nums[i] )
				max = nums[i];
		}
		//�ּҰ�
		int min = Integer.MAX_VALUE;
		for(int i=0; i<5; i++) {
			if(min > nums[i])
				min = nums[i];
		}
		System.out.println("�ִ밪"+max);
		System.out.println("�ּҰ�"+min);
	}

}
