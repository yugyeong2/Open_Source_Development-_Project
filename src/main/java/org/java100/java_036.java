package org.java100;

import java.util.Scanner;

class java_036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

/*
    1부터 n까지, 1부터 m 까지 숫자가 적힌 색이 서로 다른 주사위 2개를 던졌을 때, 나올 수 있는 모든 경우를 출력

        입력
        서로 다른 주사위의 면의 개수 n, m이 입력된다.
        (단, n, m은 10이하의 자연수)
        출력
        나올 수 있는 주사위의 숫자가 한 세트씩 줄을 바꿔 모두 출력된다.
        첫 수는 n, 두번째 수는 m으로 고정해 출력하도록 한다.

        입력 예시
        2
        3
        출력 예시
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3

        중첩의 원리
        반복 실행구조도 조건 실행구조와 마찬가지로 중첩의 원리가 적용된다.
        반복 실행구조를 중첩하면 원하는 반복구조를 다양하게 만들어낼 수 있다.
        바깥쪽의 i가 1부터 n까지 로 바뀌는 각각의 동안에 안쪽의 j가 1부터 m까지 변하며 출력된다.
*/