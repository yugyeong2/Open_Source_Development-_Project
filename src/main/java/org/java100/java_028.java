package org.java100;

import java.util.Scanner;

class java_028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a % 2 == 0) {
            System.out.println(a);
        }
        if(b % 2 == 0) {
            System.out.println(b);
        }
        if(c % 2 == 0) {
            System.out.println(c);
        }
    }
}

/*
    세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.

        입력
        세 정수 a, b, c 가 입력된다.
        (0 ~ 2147483647 범위의 정수들이 입력되며, 적어도 1개는 짝수이다.)
        출력
        짝수만 순서대로 출력한다.

        입력 예시
        1
        2
        4
        출력 예시
        2
        4

        if(조건)
        { //조건이 참일 때에만 실행되는 구역(코드블럭의 시작)
        실행1;
        실행2;
        ...
        } //코드블럭의 끝
        의 조건/선택 실행구조는 주어진 "조건"을 검사해 참인 경우에만,
        코드블럭에 작성된 내용을 순서대로 실행해준다.
*/