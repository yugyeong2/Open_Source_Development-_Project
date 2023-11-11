package org.java100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class java_043 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int leng = ( Integer.toString(n) ).length(); // 정수->문자열 후 길이

        String[] number = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] unit = {"억", "천만", "백만", "십만", "만", "천", "백", "십", ""};

        ArrayList<Integer> digit = new ArrayList<>(); // 배열 동적 할당

        while(n > 0) {
            digit.add(n % 10); // 낮은 자리 수부터 입력
            n /= 10;
        }
        Collections.reverse(digit); // List를 거꾸로 변환

        for(int i = 0; i < leng; i++) {
            if(digit.get(i) != 0) {
                System.out.print( number[ digit.get(i) ] );
                System.out.print( unit[ unit.length-leng+i ] );
            }
        }
    }
}

/*
    엑셀에서 숫자를 입력하면 그 숫자에 맞는 한글로 변환해주는 NUMBERSTRING 함수가 있다.
    12345를 입력하면, 그 숫자를 한글로 보여준다.
    이 함수를 java언어로 직접 만들어보자.

        입력
        양의 정수 n이 입력된다. ( 0 <= n <= 99999) 만의 자릿수까지만 입력됨.
        출력
        정수 n을 한글로 출력한다.

        입력 예시
        12345
        출력 예시
        일만이천삼백사십오


        엑셀 수업하다가 만든 문제입니다.(처음 설계가 잘못되면 복잡하게 코드가 전개될 가능성이 높습니다.)
        정답은 엑셀의 NUMBERSTRING 함수에 근거합니다.
        몇 가지 예를 더 들어보여드립니다.
        500300  ==> 오십만삼백
        1  ==> 일
        15 ==> 일십오
*/