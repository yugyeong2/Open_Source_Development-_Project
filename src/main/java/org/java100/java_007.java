package org.java100;

import java.util.Scanner;

class java_007 {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextInt());
    }
}

/*
    키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성

        입력
        정수값 한 개가 입력된다.
        출력
        입력된 정수를 그대로 출력한다.

        입력 예시
        15
        출력 예시
        15

        Scanner 클래스를 사용한다. nextInt() 메소드 사용.
        import java.util.Scanner;
        Scanner scan = new Scanner(System.in);
        int i = scan. nextInt();
*/