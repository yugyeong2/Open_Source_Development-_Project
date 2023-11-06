package org.java100;

import java.util.Scanner;

class java_013 {
    public static void main(String[] args) {
        float f = new Scanner(System.in).nextFloat();
        System.out.printf("%.2f", f);
    }
}

/*
    실수(float) 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력

        입력
        실수 한 개가 입력된다.
        출력
        입력한 실수를 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력한다.

        입력 예시
        1.59254
        출력 예시
        1.59

        float num = scan.nextFloat(); 를 통해 실수값을 입력받을 수 있다.
        float으로 변수를 선언한 경우 %.2f로 출력하면,
        소수점 3째 자리에서 반올림 하여 2째 자리까지 출력할 수 있다.
        printf(“%.2f”,f);
        또는 0.005f를 더하여, 100을 곱한 후 (int)로 타입 변경후, 100으로 나누어도 된다.
*/