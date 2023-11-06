package org.java100;

import java.util.Scanner;

class java_015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();

        System.out.printf("%d.%02d.%02d", year, month, date);
    }
}

/*
    년, 월, 일을 입력받아 형식에 맞게 출력하는 프로그램을 작성

        입력
        년, 월, 일이 구분되어 입력된다.
        출력
        입력받은 년, 월, 일을 출력한다. 단, 자릿수는 yyyy.mm.dd형태로 출력한다.
        (입출력 예시 참고, printf에서 “%02d”를 사용하면 2칸을 사용해 출력하는데, 1자리 수인 경우 앞에 0이 붙어 출력된다.)
        String result = String.format(“%02d”, i); 형태를 사용해도 된다.

        입력 예시
        2012
        1
        3
        출력 예시
        2012.01.03
*/