package org.java100;

import java.util.Scanner;

class java_067 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for(int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}

/*
    정수 한 개가 입력되었을 때 카운트다운을 출력해보자. (1 ~ 100)

        입력
        정수 한 개가 입력된다.
        (1 ~ 100)
        출력
        1만큼 씩 줄여 한 줄에 하나씩 1이 될 때까지 출력한다.

        입력 예시
        5
        출력 예시
        5
        4
        3
        2
        1

        while(조건)
        {
            ...;
        }
        구조를 사용하자.

        예시
        int n;
        n = scan.nextInt();
        while(n!=0)
        {
            printf("%d", n);
            n--;
        }
*/