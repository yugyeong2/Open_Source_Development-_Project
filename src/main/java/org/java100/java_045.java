package org.java100;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class java_045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double discriminant = b*b - 4*a*c; // 판별식
        double result1 = ( -b + sqrt(discriminant) ) / 2*a;
        double result2 = ( -b - sqrt(discriminant) ) / 2*a;

        if(discriminant == 0) { // 중근
            System.out.printf("방정식의 해는 %.2f", result1);
        } else if (discriminant < 0) { // 허근
            System.out.println("실근이 없습니다.");
        }  else { // 실근
            System.out.printf("방정식의 해는 %.2f\n방정식의 해는 %.2f", result1, result2);
        }
    }
}

/*
    2차 방정식 *ax2 + bx + c = 0* 의 해를 구하시오.
    근의 공식을 이용하시오.

        입력
        정수 a,b,c가 차례로 입력됩니다. ( -10 <= a,b,c <= 10 , a 는 0이 아님)
        여기서 a는 x²의 계수, b는 x의 계수, c는 상수항입니다.
        출력
        ax²+bx+c의 방정식의 해를 구하세요.
        1. 해가 중근일 경우 하나만 출력합니다.
        2. 해가 두개의 실근일 경우  두 행에 걸쳐 출력합니다. (**분자의 +연산의 결과를 먼저 출력합니다.**)
        3. 해가 두개의 허근일 경우 “실근이 없습니다.” 출력합니다.
        4. 출력은 소수점 아래 두자리로 합니다. (0도 0.00으로 출력) : %.2f

        입력 예시
        1
        7
        3
        출력 예시
        방정식의 해는 -0.46
        방정식의 해는 -6.54

        2차방정식 근의 판별식 D = b * b - 4 * a * c 이다.
        D값이 0보다 작으면, 값이 존재하지 않는 허수이다. "실근이 없습니다"이라고 출력하자.
        D값이 0과 같으면, 방정식의 해는 -b / (2 * a ) 값이다.
        D값이 0보다 크면, 방정식의 해가 2개이다.
        첫번째 해는 ((-b) + Math.sqrt(D) ) / (2 * a);
        두번째 해는 ((-b) - Math.sqrt(D) ) / (2 * a);  이다.
*/