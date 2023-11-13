package org.java100;

import java.util.Scanner;

class java_068 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}

/*
    정수 한 개를 입력받아 0부터 그 수까지 순서대로 출력해보자. (0 ~ 100)

        입력
        정수 한 개가 입력된다.
        (0 ~ 100)
        출력
        0부터 그 수까지 줄을 바꿔 한 줄씩 출력한다.

        입력 예시
        4
        출력 예시
        0
        1
        2
        3
        4

        for(반복전 실행/준비내용; 조건검사내용; 한번 실행 후 처리)
        {  // 코드 블럭
            ...
        }
        반복 구조를 사용하자.
*/