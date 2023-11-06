package org.java100;

import java.util.Scanner;

class java_011 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        System.out.println(b + " " + a);
    }
}

/*
    두 개의 문자를 입력받은 후 순서를 바꿔 출력

        입력
        두 개의 문자가 차례대로 입력된다.
        출력
        입력한 두 문자의 순서를 바꿔 출력한다.

        입력 예시
        A
        b
        출력 예시
        b A

        Scanner클래스를 이용하여 2개의 문자값을 입력받고,
        출력되는 순서를 바꿈으로써 해결할 수 있다.
*/