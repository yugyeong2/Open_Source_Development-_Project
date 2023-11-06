package org.java100;

import java.util.Scanner;

class java_026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(!scan.nextBoolean());
    }
}

/*
    true(참) 또는 false(거짓) 이 입력되었을 때
    반대로 출력하는 프로그램을 작성해보자.
    scan.nextBoolean() 사용

        입력
        Boolean 값 1개가 입력된다.
        출력
        입력된 값이 true이면 false, false이면 true을 출력한다.

        입력 예시
        true
        출력 예시
        false

        참 또는 거짓의 논리값을 역(반대)로 바꾸기 위해서는 논리연산자 ! 를 사용할 수 있다. 이러한 논리 연산을 NOT 연산이라고도 부른다.
*/