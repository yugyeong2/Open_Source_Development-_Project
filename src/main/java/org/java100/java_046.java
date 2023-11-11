package org.java100;

import java.util.Scanner;

class java_046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int car = 170;
        int[] tunnel = new int[3];
        for(int i = 0; i < 3; i++) {
            tunnel[i] = scan.nextInt();

            if(tunnel[i] <= car) {
                System.out.println("CRASH");
            } else {
                System.out.println("PASS");
            }
        }

    }
}

/*
    어떤 차의 높이가 170cm 이다.
    이 차는 3개의 터널을 차례대로 지나게 될 것이다.
    터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 날 것이다.
    터널의 높이가 차례대로 3개 주어지면 터널을 무사히 잘 통과하면 PASS 를 출력하고,
    사고가 난다면 CRASH 를 출력하시오.

        입력
        터널의 높이가 차례대로 3개 주어진다. (정수) Scanner로 입력하시오.
        출력
        터널의 높이가 170보다 같거나 작으면 "CRASH"를 출력, 그 보다 크면 "PASS"를 출력하시오.

        입력 예시
        180
        175
        160
        출력 예시
        PASS
        PASS
        CRASH
*/