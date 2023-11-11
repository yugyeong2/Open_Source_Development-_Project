package org.java100;

import java.util.Scanner;

class java_044 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if(n==1 || n==3 || n==5 || n==7) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy");
        }
    }
}

/*
    주원이는 월, 수, 금, 일 아르바이트를 간다.
    다음은 요일의 순서이다.
    월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
    요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.

        입력
        입력으로 요일의 번호가 하나 주어진다.(정수)
        출력
        아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.

        입력 예시
        1
        출력 예시
        oh my god
*/