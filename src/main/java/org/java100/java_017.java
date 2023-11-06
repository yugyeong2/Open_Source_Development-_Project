package org.java100;

import java.util.Scanner;

class java_017 {
    public static void main(String[] args) {
        System.out.printf(String.format("%x", new Scanner(System.in).nextInt()));
    }
}

/*
    10진수를 입력받아 16진수(hexadecimal)로 출력하는 프로그램을 작성

        입력
        10진수 1개가 입력된다.
        출력
        입력 받은 10진수를 16진수로 바꾸어 출력한다.

        입력 예시
        255
        출력 예시
        ff

        System.out.printf(“%x”, i)로 출력하면 16진수(hexadecimal) 형태로 소문자로 출력된다.
        또는 Integer.toHexString(i)를 사용하여 Integer정수를 16진수 문자열로 변환할 수 있다.
        10진법은 한 자리에 10개(0 1 2 3 4 5 6 7 8 9) 문자 중 한 개를 사용한다.
        16진법은 한 자리에 16개(0 1 2 3 4 5 6 7 8 9 a b c d e f) 문자 중 한 개를 사용한다.
        16진법의 a는 10진법의 10, b는 11, c는 12 ... 와 같다.
*/