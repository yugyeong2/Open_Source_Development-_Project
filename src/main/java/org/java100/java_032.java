package org.java100;

import java.util.Scanner;

class java_032 {
    public static void main(String[] args) {
        char grade = new Scanner(System.in).next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}

/*
    평가(A, B, C, D, ...)를 문자로 입력 받아 내용을 다르게 출력
    switch case문을 사용하여 구현해보자
        평가내용
        D : slowly~
        C : run!
        B : good!!
        A : best!!!
        나머지문자들 : what?

        입력
        영문자 한 개가 입력된다.
        (A, B, C, D 등의 문자가 입력된다.)
        출력
        평가내용에 따라 다른 내용이 출력된다.

        입력 예시
        A
        출력 예시
        best!!!

        switch( ) ... case... break; 제어문을 사용할 수 있다.
        break; 를 사용하지 않으면 이후의 명령들도 계속 실행된다.
        default: 는 제시된 case 가 아닌 모든 경우에 실행된다.
        switch( ) 에 주어지는 값은 "정수"(int)값만 가능하다. 문자(char)도 정수값이기 때문에 된다.
        char ch = scan.next().charAt(0); 형태로 불러오면 된다.
*/