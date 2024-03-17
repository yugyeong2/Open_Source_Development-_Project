package org.java100;
import java.util.Scanner;

public class java_081 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<5; i++) {
			nums[i] = scan.nextInt();
		}
		
		// 최대값
		int max = 0;
		for(int i=0; i<5; i++) {
			if(max < nums[i] )
				max = nums[i];
		}
		// 최소값
		int min = Integer.MAX_VALUE;
		for(int i=0; i<5; i++) {
			if(min > nums[i])
				min = nums[i];
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
	}

}

/*
	최대값과 최소값 
	5개 정수를 한개씩 입력하여 출력한다.
*/
