package org.java100;
import java.util.Scanner;

public class java_097 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요:");
		int studentCount = scan.nextInt();
		int placeCount = scan.nextInt();
		int[] heigth = new int[100];
		for(int i=0; i<studentCount; i++) {
			heigth[i] = scan.nextInt();
		}
		// 오름차순 정렬
		for(int i=0; i<studentCount; i++) {
			for(int j=i+1; j<studentCount; j++) {
				if(heigth[i]>heigth[j]) {
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

/*
	n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.
	
	입력
	1. 첫 번째 줄에 학생 수(N)와 한줄에 앉을 수 있는 자리수(C)가 자연수로 주어진다. 단, (1≤N≤99), (1≤C≤10)
	2. 둘째 줄에는 N명의 학생 키들이 차례로 구분되어 입력된다.
	출력
	학생들의 자리 배치 결과를 공백으로 분리하여 출력한다.
*/
