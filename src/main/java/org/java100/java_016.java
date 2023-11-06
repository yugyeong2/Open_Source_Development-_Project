package org.java100;

import java.util.Scanner;

class java_016 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        System.out.printf("%o", x);
    }
}

/*
    10진수를 입력받아 8진수로 출력하는 프로그램을 작성

        입력
        10진수가 1개 입력된다.
        (단, 입력되는 정수는 int 범위이다.)
        출력
        입력 받은 10진수를 8진수로 바뀌어 출력한다.

        입력 예시
        10
        출력 예시
        12

        %o 를 사용하여 출력하면 8진수(octal)로 출력할 수 있다.
        또는 Integer.toOctalString(i);를 사용해도 된다.
*/