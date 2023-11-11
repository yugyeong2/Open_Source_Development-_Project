package org.java100;

import java.util.Scanner;

class java_052 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if(n == 1) {
            System.out.println(n + "st");
        } else if(n == 2) {
            System.out.println(n + "nd");
        } else if(n == 3) {
            System.out.println(n + "rd");
        } else {
            System.out.println(n + "th");
        }
    }
}

/*
    영어에서 서수를 나타낼 때 다음과 같이 나타낸다.

    1st  2nd  3rd  4th  5th  6th  ...
    11th 12th 13th 14th 15th...
    21st 22nd 23rd 24th 25th ...
    31st 32nd 33rd 34th 35th...
    41st 42nd 43rd 44th 45th...
    ...
    91st 92nd 93rd 94th 95th ... 99th

    1부터 99까지의 숫자가 입력되면 영어 서수 표현으로 출력하시오.

        입력
        1~99 중 자연수가 하나 입력된다.
        출력
        영어 서수로 출력한다. 위의 문제 참고.

        입력 예시
        2
        출력 예시
        2nd
*/