package org.java100;

import java.util.Scanner;

class java_049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();

        if(hour > 1) {
            if(minute > 30) {
                minute -= 30;
            } else {
                hour--;
                minute = 60 + minute - 30;
            }
        } else {
            if (minute > 30) {
                hour = 24 + hour - 1;
                minute -= 30;
            } else {
                hour = 24 + hour - 1;
                minute = 60 + minute - 30;
            }
        }
        System.out.println(hour + " " + minute);
    }
}

/*
    수호는 30분 전으로 돌아가고 싶은 1人 이다.
    차례대로 시간과 분이 주어진다.
    그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
    예)
        12 35  =====> 12 5
        12 0 ======> 11 30
        11 5 ======> 10 35

        입력
        시와 분이 입력된다.
        (시의 범위 : 0~ 23)
        (분의 범위 : 0~ 59)

        출력
        입력된 시간의 30분 전의 시간을 출력하시오.
        입력 예시
        12
        35
        출력 예시
        12 5
*/