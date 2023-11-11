package org.java100;

import java.util.Scanner;

class java_060 {
    public static void main(String[] args) {
        int car = 170;

        Scanner scan = new Scanner(System.in);
        int[] ternel = new int[3];
        for(int i = 0; i < 3; i++) {
            ternel[i] = scan.nextInt();

            if(car > ternel[i]) {
                System.out.println("CRASH " + ternel[i]);
                break;
            }
        }
    }
}

/*
    어떤 차의 높이가 170cm 이다.
    이 차는 3개의 터널 a, b, c를 차례대로 지나게 될 것이다.
    각 터널의 높이가 차의 높이(170)보다 같거나 낮으면 차는 터널과 충돌하여 사고가 날 것이다.
    각 터널 a, b, c의 높이가 차례대로 3개 입력되면,
    터널을 무사히 잘 통과하면 PASS 를 출력하고, 사고가 난다면 CRASH 와 처음 충돌하는 터널의 높이를 출력하시오.\

        입력
        터널 a,b,c의 높이가 차례대로 3개 입력된다. (정수)
        출력
        높이가 170인 차가 잘 통과할 수 있으면 PASS를 출력, 170보다 같거나 작으면 CRASH 처음 충돌한 터널 높이를 출력하시오. 도움말을 참고하세요.

        입력 예시
        171
        168
        165
        출력 예시
        CRASH 168

        터널을 a, b, c 순서대로 통과한다.
        a 터널은 171이므로 무사 통과, b터널은 168이므로 충돌하게 된다. c터널도 170보다 작지만 b 터널에서 처음 충돌하므로 CRASH 168을 출력한다.
*/