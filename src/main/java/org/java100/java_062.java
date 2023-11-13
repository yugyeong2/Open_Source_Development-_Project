package org.java100;

import java.util.Scanner;

class java_062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Grade = scan.nextInt();
        int Class = scan.nextInt();
        int Number = scan.nextInt();

        System.out.print(Grade);
        System.out.printf("%02d", Class);
        System.out.printf("%03d", Number);
    }
}

/*
    학번을 입력 받아 다음 형식으로 출력하시오.
    학번은 학년, 반, 번호로 입력된다.
    이번에는 학년은 한자리, 반은 두자리, 번호는 세자리로 출력한다.
    예)
        2 1 20  ===> 201020  으로 출력
        2 2 7 ==> 202007 으로 출력
        2 3 100 ==>  203100 으로 출력
        2 10 111 ==> 210111 로 출력

        입력
        학년, 반, 번호가 차례대로 입력된다.(정수)
        입력범위 : 학년: 3이하, 반: 20반이하, 번호, 999번 이하
        출력
        위의 예를 보고 학번이 총6자리가 되게 출력하시오. 빈 부분은 0으로 채운다.

        입력 예시
        2
        7
        15
        출력 예시
        207015
*/