package org.java100;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class java_051 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        String digit_1 = Integer.toString(n/10);
        String digit_2 = Integer.toString(n%10);
        String Switch = digit_2 + digit_1; // digit_1 + digit_2*10

        int compression = parseInt(Switch) * 2;
        System.out.println(compression);

        if(compression <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
    }
}

/*
    민호는 발명을 되게 좋아하고, 컴퓨터 프로그램도 되게 좋아한다.
    어느 날 민호는 컴퓨터를 사용하던 중 휴지통이 꽉 차서 불편을 느꼈다.
    그래서 휴지통이 n만큼 차면 알아서 쓰레기를 압축해주는 휴지통을 만들려고 한다.
    이 때 압축하는 알고리즘은 다음과 같다.
    10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.
    예) 70일 경우 14가 된다.( 70 -> 07 -> 14 )
    이 알고리즘은 때로는 부작용을 일으켜 휴지통의 내용이 더 많아 질지도 모른다.
    만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.

        입력
        휴지통의 자동 압축 기준인 수치 n이 입력된다. ( 1 <= n <= 99 )
        출력
        첫째 줄에 휴지통을 압축했을 때 양을 출력한다.
        둘째 줄에 그 양이 50이하이면 GOOD 을 출력하고, 50을 넘으면 OH MY GOD 을 출력한다.

        입력 예시
        90
        출력 예시
        18
        GOOD
*/