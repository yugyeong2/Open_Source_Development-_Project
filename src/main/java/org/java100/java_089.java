package org.java100;

public class java_089 {
	public static void main(String[] args) {

		int sum = 12;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == sum) {
					System.out.println(i+","+j);
				}
			}
		}
		
	}

}

/*
	두 주사위의 합
	주사위를 두개 굴려서 합이 나오는 경우
	5
	1, 4
	2, 3
	3, 2
	4, 1
*/
