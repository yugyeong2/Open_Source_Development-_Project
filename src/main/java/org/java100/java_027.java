package org.java100;

import java.util.Scanner;

class java_027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d", a > b ? a : b);
    }
}

/*
    입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성
    (단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.)

        입력
        두 정수가 입력된다.
        (-2147483648 ~ 2147483647)
        출력
        큰 값이 10진수로 출력된다.

        입력 예시
        123
        456
        출력 예시
        456

        3개의 요소로 이루어지는 3항(ternary) 연산자는
        "조건식 ? 참일때값:거짓일때값"의 구조를 가지는 연산자(?) 이다.
        마찬가지로 ? 연산의 결과는 값으로 계산된다.
        예를 들어
        123>456 ? 0:1
        의 계산식은 123>456 의 비교연산 결과가 거짓이므로 1로 계산된다.

        예시
        printf("%d", a>b ? a:b); //두 값중 큰 값으로 계산되어 출력된다.
        설명하자면 a>b 가
        참(1)이라면 (a>b ? a:b)의 결과는 a로 계산되고
        거짓(0)이라면 (a>b ? a:b)의 결과는 b로 계산된다.
*/