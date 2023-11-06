package org.java100;

import java.util.Scanner;

class java_029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

/*
    세 정수 a, b, c가 입력되었을 때,
    짝 even(짝)/odd(홀)을 출력해보자.

        입력
        세 정수 a, b, c 가 입력된다.
        (0 ~ 2147483647)
        출력
        순서대로 even(짝)/odd(홀)을 출력한다.

        입력 예시
        1
        2
        8
        출력 예시
        odd
        even
        even

        if(조건)
        { //코드블럭1 시작
        ... 실행...;
        ...
        }
        else
        { //코드블럭2 시작
        ... 다른실행...;
        ...
        }
        의 조건/선택 실행구조는 주어진 "조건"을 검사해 참인 경우에는 코드블럭1을 실행하고, 거짓인 경우에는 코드블럭2를 실행한다.
*/