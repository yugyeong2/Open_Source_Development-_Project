package org.java100;

import java.util.Scanner;

class java_034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        while(true) {
            n = scan.nextInt();
            System.out.println(n);

            if(n == 0) {
                break;
            }
        }
    }
}

/*
    정수가 Scanner를 통해 순서대로 입력된다.
    (-2147483648 ~ 2147483647, 단 개수는 알 수 없다.)
    0이 아니면 입력된 정수를 출력, 0이 입력되면 출력을 중단

        입력
        정수가 Scanner를 통해 순서대로 입력된다.
        (-2147483648 ~ 2147483647, 단 개수는 알 수 없다.)
        출력
        입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 0을 출력하고 종료한다.

        입력 예시
        7
        4
        2
        3
        0
        출력 예시
        7
        4
        2
        3
        0

        무한 반복문을 만드는 문제입니다.
        무한반복문을 만드는 방법은 2가지입니다.
        while( true ) {
        }
        for(  ;  ; )  {
        }
        그리고 반복문 안에서
        continue 제어문은  반복루틴의 처음으로 바로 올라가는 것이고(continue 아래의 문장은 수행하지 않음),
        break 제어문은 반복문을 탈출하는 문장입니다.
*/