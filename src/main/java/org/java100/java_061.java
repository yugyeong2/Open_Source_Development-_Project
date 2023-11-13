package org.java100;

import java.util.Scanner;

class java_061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        // next()로 문자열을 입력받아 charAt(0)으로 첫 번째 문자를 꺼내온다.
        char op = scan.next().charAt(0);
        int b = scan.nextInt();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.printf("%.2f", (float)a / b);
                break;
        }
    }
}

/*
    영민이는 프로그램을 이용하여 계산기를 만들려고 한다.
    하지만 영민이는 프로그램을 얼마 배우지 않아 어려워하고있다.
    우리가 영민이를 위해 계산기 프로그램을 만들어주자.

        입력
        연산식이 한줄로 입력된다.
        연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.
        출력
        계산 결과를 정수로 출력한다.
        나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
        (0으로 나누는 경우는 입력되지 않는다.)

        입력 예시
        10  (정수로 입력받음)
        +   (문자로 입력받음)
        10  (정수로 입력받음)
        출력 예시
        20

        switch ~ case 명령을 이용하면 쉽게 풀 수 있습니다.
*/