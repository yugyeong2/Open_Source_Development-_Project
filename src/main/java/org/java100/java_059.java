package org.java100;

import java.util.Scanner;

class java_059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] lotto = new int[7];
        for(int i = 0; i < 7; i++) {
            lotto[i] = scan.nextInt();
        }

        int[] mine = new int[6];
        for(int i = 0; i < 6; i++) {
            mine[i] = scan.nextInt();
        }

        int winning = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lotto[i] == mine[j]) {
                    winning++;
                }
            }
        }

        switch(winning) {
            case 6:
                System.out.println("1등");
                break;
            case 5:
                for(int i = 0; i < 6; i++) {
                    if(lotto[6] == mine[i]) {
                        System.out.println("2등");
                        return;
                    }
                }
                System.out.println("3등");
                break;
            case 4:
                System.out.println("4등");
                break;
            case 3:
                System.out.println("5등");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("꽝!");
                break;
        }
    }
}

/*
    주희는 로또 매니아다.
        매주 로또 한장을 사고 토요일이면 대박을 기대하면서 당첨번호를 확인한다.
        몇 주 전 주희는 로또 결과가 4등이었는데 확인을 잘못해서 5등인줄 알고 그냥 바꾸기 귀찮아서 버렸었다.
        이러한 사태가 다시는 일어나지 않게 하기 위해 우리가 프로그램을 만들어 주자.

        (로또 순위 매기는 방법)
        | 등수 | 방법 |
        | --- | --- |
        | 1등 | 당첨번호 6개 일치 |
        | 2등 | 당첨번호 5개 일치 + 보너스번호 일치 |
        | 3등 | 5개 번호 일치 |
        | 4등 | 4개 번호 일치 |
        | 5등 | 3개 번호 일치 |
        | 꽝 | 2개 이하 일치 |

        예)
        13 23 24 35 40 45 7     ===> 로또 당첨번호 + 보너스 번호
        2  6  7 23  40 44      ====> 주희가 가진 로또 번호
        따라서 주희는 "꽝"
        힌트: 당첨번호가 5개 같은 경우, 보너스 번호를 주희 번호와 다시 비교해서 있으면, 2등, 없으면 3등임

        입력
        첫 줄에 로또 당첨번호 6개와 보너스 번호 1개가 주어진다.
        둘째 줄에 주희가 가지고 있는 로또 번호 6개가 주어진다.
        출력
        주희의 당첨 결과를 출력한다.
        출력방법)
        1등 = 1 출력, 2등 = 2 출력, 3등 = 3 출력, 4등 = 4 출력, 5등 = 5 출력, 꽝 = 0 출력

        입력 예시 (자유롭게 입력받으세요.)
        13 23 24 35 40 45 7
        2 6 7 23 40 44
        출력 예시
        0 꽝!
*/