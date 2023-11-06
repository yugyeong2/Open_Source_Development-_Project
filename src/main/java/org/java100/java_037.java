package org.java100;

import java.util.Scanner;

class java_037 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    길이 n이 입력되면 길이가 n인 사각형을 출력하시오.
    단, 사각형은 * 모양으로 채운다.

        입력
        사각형의 길이 n이 입력된다.
        출력
        가로 세로 길이 n인 사각형을 출력한다.

        입력 예시
        4
        출력 예시
        ****
        ****
        ****
        ****
*/