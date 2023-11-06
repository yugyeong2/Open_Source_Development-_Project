package org.java100;

import java.util.Scanner;

class java_031 {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println('A');
        } else if (score >= 70 && score <= 89) {
            System.out.println('B');
        } else if (score >= 40 && score <= 69) {
            System.out.println('C');
        } else if (score >= 0 && score <= 39) {
            System.out.println('D');
        }
    }
}

/*
    점수(정수)를 입력받아 평가를 출력 (0 ~ 100)
        평가기준
        점수범위 : 평가
        90 ~ 100 : A
        70 ~ 89 : B
        40 ~ 69 : C
        0 ~ 39 : D 로 평가되어야 한다.

        입력
        정수 한 개가 입력된다.
        (0 ~ 100)
        출력
        평가 기준에 따라, 평가가 문자로 출력된다.

        입력 예시
        90
        출력 예시
        A

        여러 조건들을 순서대로 비교하면서 처리하기 위해서 조건문을 중첩할 수 있다.
        순서대로 검사하고 실행하기 위해 중첩 if문을 사용한다.
        조건들을 순서대로 검사할 때에는 중간에 범위가 빠지지 않았는지 꼼꼼하게 생각하고 조건들을 만드는 것이 중요하다. 이는 마치 수학에서의 부등식을 만드는 것과 유사하다.
*/