package org.java100;

import java.util.Scanner;

class java_047 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();

        if((year%4==0 && year%100!=0) || year%400==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

/*
    2월이 29일까지 있는 해를 윤년이라고 한다.
    어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.

    (윤년 판단 조건)
    1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
    2. 400의 배수이면 윤년.
    위 두 조건 중 하나라도 맞으면 윤년이다.

    예)
    2004 년 ====>  윤년(1번 조건)
    2000 년 ====> 윤년 (2번 조건)
    1900 년 ====> 윤년 아님
    1999 년 ====> 윤년 아님

        입력
        해(year)가 입력된다.
        출력
        윤년이면 "yes"를 출력, 윤년이 아니면 "no"를 출력하시오.

        입력 예시
        2012
        출력 예시
        yes
*/