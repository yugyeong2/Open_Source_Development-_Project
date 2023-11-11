package org.java100;

import java.util.Scanner;

class java_050 {
    public static void main(String[] args) {
        int BMI = new Scanner(System.in).nextInt();

        if(BMI < 18.5) {
            System.out.println("저체중");
        } else if(BMI >= 18.5 && BMI <= 23) {
            System.out.println("정상체중");
        } else {
            System.out.println("과체중");
        }
    }
}

/*
    비만을 판단하기 위해서 BMI 수치가 필요하다.
    BMI 수치가 입력되면 비만을 판단하시오.
        - BMI에 따른 비만 판정
        | BMI 수치 | 비만 판정 |
        | --- | --- |
        | 18.5 미만 | 저체중 |
        | 18.5이상~23이하 | 정상체중 |
        | 23 초과 | 과체중 |
    BMI지수= 몸무게(kg) ÷ (신장(m) /100× 신장(m)/100)

        입력
        BMI수치가 정수로 입력된다.
        출력
        BMI수치에 따라 비만인지 판정하시오.

        입력 예시
        25
        출력 예시
        과체중
*/