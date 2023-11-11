package org.java100;

import java.util.Scanner;

class java_055 {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();

        switch(score/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}

/*
    재호는 이번 시험에 받은 성적이 궁금했다.
    점수가 입력되면 등급을 출력하시오.
    등급)
        90점 이상 : A
        80점 이상 : B
        70점 이상 : C
        60점 이상 : D
        60점 미만 : F

        입력
        점수가 정수로 입력된다. (입력되는 정수는 0~100이다)
        출력
        점수에 따라 등급을 출력한다.

        입력 예시
        80
        출력 예시
        B
*/