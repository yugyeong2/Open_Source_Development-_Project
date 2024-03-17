package org.java100;
import java.util.Scanner;

public class java_096 {
	public static void main(String[] args) {

		String[][] students = new String[50][2];
		//{ {"이름","성적"},
		//  {"이름","성적"},
		//}
		Scanner scan = new Scanner(System.in);
		int n = 5;
		for(int i=0; i<5; i++) {
			students[i][1] = scan.next();
			students[i][0] = scan.next();
		}
		// 내림차순 정렬
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				int score1 = Integer.parseInt(students[i][1]);
				int score2 = Integer.parseInt(students[j][1]);
				if(score2>score1) {
					String temp1 = students[i][0];
					String temp2 = students[i][1];
					students[i][0] = students[j][0]; // 이름
					students[i][1] = students[j][1]; // 성적
					students[j][0] = temp1;
					students[j][1] = temp2;
				}
			}
		}
		System.out.println("세 번째 학생은");
		System.out.println(students[2][0]);
		System.out.println(students[2][1]);
	}

}

/*
	n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.
	
	입력
	첫째 줄에 n이 입력된다. ( 3 <= n <= 50 )
	둘째 줄 부터 n+1행까지 친구의 이름과 점수가 차례대로 입력된다. 이름은 영문으로 이루어져 있다.
	출력
	세 번째로 높은 학생의 이름을 출력한다.
*/
