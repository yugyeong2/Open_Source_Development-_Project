package org.java100;

import java.util.Scanner;

class java_022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a > b ? 1 : 0);
    }
}

/*
    두 정수(a, b)를 입력받아
    a가 b보다 크면 1, a가 b와 같거나 b가 a보다 크다면 0을 출력하는 프로그램을 작성
    if문을 사용한다.

        입력
        두 정수 a, b가 입력된다.
        (-2147483648 ~ 2147483647)
        출력
        a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.

        입력 예시
        9
        1
        출력 예시
        1

        어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational operator)를 사용할 수 있다.
        관계연산자는 주어진 2개의 값을 비교하고,
        그 결과가 참인 경우, 참(true)을 나타내는 정수값 1로 계산되고
        거짓인 경우, 거짓(false)를 나타내는 정수값 0으로 계산된다.
        비교/관계연산자도 일반적인 사칙연산자처럼
        주어진 두 수를 이용해 계산을 수행하고 그 결과를 1(참), 또는 0(거짓)으로 계산해 주는 연산자이다.
        비교/관계연산자는 >, <, >=, <=, ==(같다), !=(다르다) 의 6가지가 있다
*/