package org.java100;

import java.util.Scanner;

class java_042 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if((n>=50 && n<=70) || (n%6==0)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}

/*
    슬기는 지난 번에도 공던지기에 져서 아이스크림을 사게되었다.
    슬기는 이미 돈이 다 떨어져서 현량이에게 돈을 빌린 상태이다.
    이번에는 슬기가 또 다른 조건을 내걸고 체육 선생님에게 도전하게 되었다.
    1. 공의 위치가 50m~70m이면 슬기가 이김.
    또는
    2. 공의 위치가 6의 배수이면 슬기가 이김.
    슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.

        입력
        슬기가 던진 공의 위치가 입력된다.(정수)
        출력
        승리 조건을 잘 보고 슬기가 이기는 조건이면 win, 그외에는 lose를 출력하시오.

        입력 예시
        30
        출력 예시
        win
*/