package org.java100;

import java.util.Scanner;

class java_010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(x + " " + y);
    }
}

/*
    정수(integer) 두 개를 입력받아 그대로 출력

        입력
        두 개의 정수가 차례대로 입력된다.
        출력
        입력받은 두 정수를 공백으로 구분하여 그대로 출력한다.

        입력 예시
        1
        2
        출력 예시
        1 2

        Scanner 클래스를 사용한다. nextInt() 메소드 사용.
*/