package org.java100;
import java.util.Scanner;

public class java_098 {
	public static void main(String[] args) {
	
		int[][] board = new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				board[i][j] = 0; // 초기화
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("n:");
		int n = scan.nextInt();
		
		// 바둑판의 x, y 좌표는 1~10까지이다.
		int[][] xy = new int[10][2];
		for(int i=0; i<n; i++) {
			System.out.print("X:");
			xy[i][0] = scan.nextInt();
			System.out.print("Y:");
			xy[i][1] = scan.nextInt();
		}
		for(int i=0; i<n; i++) {
			int x = xy[i][0] - 1; // 사용자 1 -> 첫 번째
			int y = xy[i][1] - 1; // 데이터 0 -> 첫 번째
			board[x][y] = 1;
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

/*
	바둑판(10 * 10)에 n개의 흰돌을 놓는다고 할 때, n개의 흰돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
	
	입력
	바둑판에 올려 놓을 흰돌의 개수(n) 가 첫 줄에 입력된다.
	둘째 줄 부터 n+1 번째 줄까지 힌돌을 놓을 좌표(x, y)가 n줄 입력된다.
	(단, n은 10이하의 자연수이고 바둑 판의 x, y 좌표는 1 ~9 까지이며, 같은 좌표는 입력되지 않는다.)
	
	출력
	흰돌이 올려진 바둑판의 상황을 출력한다.
	(흰돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.)
*/
