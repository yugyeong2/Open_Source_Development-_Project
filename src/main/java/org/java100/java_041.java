package org.java100;

import java.util.Scanner;

class java_041 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if((n>=30 && n<=40) || (n>=60 && n<=70)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}

/*
    슬기는 지난 번 공던지기에서 져서 아이스크림을 사게되었다.
    얼마 뒤 열받은 슬기는 체육 선생님에게 다시 한번 공던지기를 하여 아이스크림 내기를 하자고 제안하였다.
    그런데 이번에는 불리한 슬기가 다음 룰을 제안하였다.
    1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
    2. 그 외의 구간에 떨어지면 체육선생님이 이김.
    슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.

        입력
        공의 위치 n이 정수로 입력됨.(이번에는 **정수**로 입력됨)
        출력
        공이 떨어지는 위치 n이 30≤n≤40 30≤n≤40 이거나 60≤n≤70 60≤n≤70 이면, win을 출력, 그외에는 lose를 출력한다.

        입력 예시
        50
        출력 예시
        lose
*/