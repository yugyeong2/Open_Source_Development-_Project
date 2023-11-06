package org.java100;

import java.util.Scanner;

class java_038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();

        System.out.printf("%.1f", a*b/2.0);
    }
}

/*
    삼각형의 넓이를 구하는 프로그램을 작성
    삼각형의 넓이 = 밑변 * 높이 / 2

        입력
        밑변(a)과 높이(b)가 정수로 입력된다.
        출력
        삼각형의 넓이를 소수 첫째자리까지 출력한다.

        입력 예시
        5
        2
        출력 예시
        5.0

        정수 끼리의 연산 결과 = 정수
        실수 끼리의 연산 결과 = 실수
        정수와 실수의 연산 결과 = 실수
*/