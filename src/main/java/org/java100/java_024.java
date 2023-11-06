package org.java100;

import java.util.Scanner;

class java_024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b) {
            System.out.println(1);
        }  else {
            System.out.println(0);
        }
    }
}

/*
    두 정수(a, b)를 입력받아,
    b가 a보다 크거나 같으면 1, b가 a보다 작으면 0을 출력하는 프로그램을 작성해보자.

        입력
        두 정수 a, b가 입력된다.
        (-2147483648 ~ 2147483647)
        출력
        b가 a보다 크거나 같은 경우 1, 그렇지 않은 경우 0을 출력한다.

        입력 예시
        0
        - 1
        출력 예시
        0

        어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational operator)를 사용할 수 있다.
        관계연산자는 주어진 2개의 값을 비교하고,
        그 결과가 참인 경우, 참(true)을 나타내는 정수값 1로 계산되고
        거짓인 경우, 거짓(false)를 나타내는 정수값 0으로 계산된다.
        비교/관계연산자도 일반적인 사칙연산자처럼
        주어진 두 수를 이용해 계산을 수행하고 그 결과를 1(참), 또는 0(거짓)으로 계산해 주는 연산자이다.
        비교/관계연산자는 >, <, >=, <=, ==(같다), !=(다르다) 의 6가지가 있다.
        >=, <= 연산자는 같음(==)을 포함한다. 따라서 작거나/크거나 "또는" 같다 의 의미를 가진다.
*/