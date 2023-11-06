package org.java100;

import java.util.Scanner;

class java_039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // int min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        int min = Math.min( (Math.min(a, b) ), c);

        System.out.println(min);
    }
}

/*
    세 정수가 주어지면 그 중 가장 작은 수를 출력

        입력
        세 정수가 주어진다.
        출력
        가장 작은 값을 출력한다.

        입력 예시
        3
        5
        2
        출력 예시
        2
*/