package org.java100;

import java.util.Scanner;

class java_030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if(x > 0) {
            System.out.println("plus");
        } else if(x < 0) {
            System.out.println("minus");
        }

        if(x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

/*
    정수 한 개가 입력되었을 때,
    minus(음)/plus(양)
    even(짝)/odd(홀)을 출력해보자.

        입력
        정수 한 개가 입력된다.
        (-2147483648 ~ 2147483647, 단 0은 입력되지 않는다.)
        출력
        입력된 정수에 대해
        첫 줄에 minus(음) 나 plus(양) 를 출력하고,
        두번째 줄에 odd(홀) 나 even(짝) 을 출력한다.

        입력 예시
        - 2147483648
        출력 예시
        minus
        even
*/