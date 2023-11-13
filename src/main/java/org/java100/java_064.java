package org.java100;

import java.util.Scanner;

class java_064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a % b);
    }
}

/*
    정수 계산에서 나머지를 구하시오.
    예를 들어 7 / 5 의 나머지는 2입니다.

        입력
        두 정수 a, b를 입력받는다.
        a는 피제수, b는 제수를 나타낸다.
        예) 7 5 가 입력되었다면  ====>   7  /  5 를 뜻함
        출력
        나머지를 출력한다.

        입력 예시
        7
        5
        출력 예시
        2

        나머지 연산자는 %입니다.
        프로그래밍에서 매우 중요한 연산자이므로 숙지합시다.
*/