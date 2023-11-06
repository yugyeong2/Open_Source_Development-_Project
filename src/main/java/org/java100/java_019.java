package org.java100;

import java.util.Scanner;

class java_019 {
    public static void main(String[] args) {
        System.out.printf("%c", new Scanner(System.in).nextInt());
    }
}

/*
    10진 정수 한 개를 입력받아 아스키문자로 출력하는 프로그램을 작성해보자.
    (단, 0 ~ 255 범위의 정수만 입력된다.)

        입력
        10진수 1개
        (0 ~ 255 범위)
        출력
        입력된 10진수에 해당되는 아스키 문자 1개

        입력 예시
        65
        출력 예시
        A
*/