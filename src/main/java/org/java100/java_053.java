package org.java100;

import java.util.ArrayList;
import java.util.Scanner;

class java_053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();

        ArrayList<Double> calc = new ArrayList<>(); // 배열 동적 할당

        calc.add(a+b);
        calc.add(a-b);
        calc.add(b-a);
        calc.add(a*b);
        calc.add(a/b);
        calc.add(b/a);

        int max = 0;
        int i = 1;
        while(i < calc.size()) {
            if(calc.get(max) < calc.get(i)) {
                max = i;
            }
            i++;
        }
        System.out.printf("%f", calc.get(max)); // java에서 %lf 존재x
    }
}

/*
    두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
    예를 들어 1과 2가 입력되면,

        1 + 2 = 3   , 2 + 1 = 3
        1 - 2 = -1,   2 - 1 = 1
        1 * 2 = 2,    2 * 1 = 2
        1 / 2 = 0.5,   2 / 1 = 2
        1 * 2=1 ,   2 * 1 = 2

        따라서 최댓값은 3이다.

        입력
        실수 a, b가 입력된다. ( a와 b의 계산결과는 모두 int범위 이내이고, 계산이 불가능한 경우는 입력되지 않는다.)
        출력
        최댓값을 실수로 출력한다.(%f)

        입력 예시
        1
        2
        출력 예시
        3.000000
*/