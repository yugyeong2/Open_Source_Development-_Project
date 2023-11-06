package org.java100;

import java.util.Scanner;

class java_020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int sum = x+y+z;
        float avg = (float)sum/3;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}

/*
    정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
    (단, -2147483648 ~ 2147483647)

        입력
        정수 세 개가 입력된다.
        (단, -2147483648 ~ 2147483647)
        출력
        입력 받은 정수 세 개의 합과 평균을 줄을 바꿔 출력한다.
        평균은 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력한다.

        입력 예시
        1
        2
        3
        출력 예시
        6
        2.0
*/