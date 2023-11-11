package org.java100;

import java.util.Scanner;

class java_056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] Yut = new int[4];
        int sum = 0;

        for(int i = 0; i < 4; i++) {
            Yut[i] = scan.nextInt();
            sum += Yut[i];
        }

        switch(sum) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
        }
    }
}

/*
    입력으로 윷의 4가지 상태가 들어온다.
    윷의 상태는 0이면 뒤집어지지 않은 상태, 1이면 뒤집어진 상태를 말한다.

    도 : 1개가 뒤집어진 상태
    개 : 2개가 뒤집어진 상태
    걸 : 3개가 뒤집어진 상태
    윷 : 4개가 뒤집어진 상태
    모 : 하나도 뒤집어지지 않은 상태
    윷 각각의 상태를 보고 도, 개, 걸, 윷, 모를 출력하시오.

        입력
        윷의 각각 상태가 입력으로 주어진다.
        (0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)
        출력
        도, 개, 걸, 윷, 모 중 하나를 출력한다.

        입력 예시
        0
        0
        1
        0
        출력 예시
        도
*/