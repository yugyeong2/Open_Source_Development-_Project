package org.java100;

import java.util.Scanner;

class java_021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a * (int)Math.pow(2, b));
    }
}

/*
    정수 두 개(a, b)를 입력받아 (0 <= a, b <= 10)
    a에 2의 b승을 곱하는 프로그램을 작성
    k = a * 2^b(2의 b승); 과 같다.

        입력
        정수 두 개가 입력된다.
        (0 <= a , b <= 10)
        출력
        a에 2^b(2의 b승)를 곱하여 출력한다.

        입력 예시
        1
        3
        출력 예시
        8

        예를 들어 1, 3 이 입력되면, 1을 2^3(2의 3승은 8)배 하여 출력한다.
        Math.pow(a, b) 함수를 이용하면, a^b승의 결과값을 반환한다.
*/