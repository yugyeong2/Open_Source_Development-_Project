package org.java100;

import java.util.Scanner;

class java_057 {
    enum Menu{
    CHEESE_BURGER(400),
    VEGETABLE_BURGER(340),
    MILK(170),
    EGG_ROLL(100),
    SALAD(70);

    private final int cost;
    Menu(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] menu = new int[2];
        int sum = 0;

        for(int i = 0; i < 2; i++) {
            menu[i] = scan.nextInt();

            switch (menu[i]) {
                case 1: //Menu.VEGETABLE_BURGER.ordinal()+1
                    sum += Menu.CHEESE_BURGER.getCost();
                    break;
                case 2:
                    sum += Menu.VEGETABLE_BURGER.getCost();
                    break;
                case 3:
                    sum += Menu.MILK.getCost();
                    break;
                case 4:
                    sum += Menu.EGG_ROLL.getCost();
                    break;
                case 5:
                    sum += Menu.SALAD.getCost();
            }

            if(sum > 500) {
                System.out.println("angry");
            } else {
                System.out.println("no angry");
            }
        }
    }
}

/*
    보림이는 엄마와 함께 놋데리아에 갔다.
    보림이는 먹고 싶은게 많았으나 엄마가 살찐다고 2가지만 골라서 먹으라고 했다.
    그리고 2메뉴의 칼로리 합이 500보다 크면 엄마가 화를 내고, 500이하면 화를 내지 않으신다.
    보림이가 선택할 수 있는 메뉴는 다음과 같다.

    1. 치즈버거 : 400 칼로리
    2. 야채버거 : 340 칼로리
    3. 우유 : 170 칼로리
    4. 계란말이 : 100 칼로리
    5. 샐러드 : 70 칼로리

    이 메뉴들 중 2가지 메뉴를 선택했을 때 칼로리 합을 계산하고, 그 칼로리 합이 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.

        입력
        메뉴의 번호가 차례대로 두개 주어진다. (정수)
        출력
        그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.

        입력 예시
        1
        2
        출력 예시
        angry

        치즈버거(400칼로리) + 야채버거(340칼로리) 의 합은 740이므로 엄마가 화를 낸다.
*/