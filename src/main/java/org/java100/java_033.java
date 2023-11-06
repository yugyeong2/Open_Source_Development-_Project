package org.java100;

import java.util.Scanner;

class java_033 {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
        }
    }
}

/*
    월을 나타내는 정수 한개(1~12)가 입력될 때 계절 출력
        월 : 계절
        12, 1, 2 : winter
        3, 4, 5 : spring
        6, 7, 8 : summer
        9, 10, 11 : fall

        입력
        월을 의미하는 한 개의 정수가 입력된다.
        (1 ~ 12)
        출력
        계절을 출력한다.

        입력 예시
        12
        출력 예시
        winter

        swtich( ).. case ... break; 제어문에서 break;를 제거하면
        멈추지 않고 다음 명령이 실행되는 특성을 이용할 수 있다.
*/
