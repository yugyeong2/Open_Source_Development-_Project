package org.java100;

import java.util.Scanner;

class java_054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a % b == 0) { // a가 b의 배수
            System.out.println(b + "*" + (a/b) + "=" + a);
        } else if(b % a == 0) { // b가 a의 배수
            System.out.println(a + "*" + (b/a) + "=" + b);
        } else {
            System.out.println("none");
        }
    }
}

/*
    두 자연수 a, b가 주어진다.
    b가 a의 배수이면 "a*x=b"를 출력하고,
    a가 b의 배수이면 "b*x=a"를 출력하고,
    배수관계가 아니면 "none"을 출력하시오.
    예)
        5 10    ====> 5*2=10
        14 2   ======> 2*7=14
        3 7 =====> none

        입력
        자연수 두 개가 입력된다.
        출력
        위의 문제 설명을 보고 배수 관계를 출력한다.

        입력 예시
        4
        12
        출력 예시
        4*3=12
*/