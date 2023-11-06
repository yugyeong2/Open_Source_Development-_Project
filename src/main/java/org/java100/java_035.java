package org.java100;

import java.util.Scanner;

class java_035 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

/*
    정수 한 개를 입력받아 1 부터 그 수까지 짝수의 합

        입력
        정수 한 개가 입력된다.(정수의 범위는 1부터 100까지로 한다)
        출력
        1부터 입력된 수까지 짝수의 합을 출력한다.

        입력 예시
        5
        출력 예시
        6

        어떤 형태의 반복문을 사용하던지 가능하다.
        for(...; ...; ...) {...},
        while( ) {...},
        do {...} while( );
        등의 반복문은 형태만 다르고, 똑같은 성능을 발휘한다. 필요에 따라 편리한 것으로 골라 사용하면 된다.
*/