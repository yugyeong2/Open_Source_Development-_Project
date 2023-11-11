package org.java100;

import java.util.Scanner;

class java_048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String birth = scan.nextLine();
        int gender = scan.nextInt();

        if(gender == 1 || gender == 2) {
            System.out.println("19" + birth.substring(0,2)); //substring() : 시작지점 ~ (끝지점-1)까지 자른다
        } else if(gender == 3 || gender == 4) {
            System.out.println("20" + birth.substring(0,2));
        }
    }
}

/*
    주민등록번호는 생년월일과 성별정보, 지역정보로 이루어진다.
    여기서 생년월일과 성별정보만 입력으로 받겠다.
    성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.
    기준년도는 2018년도이다. 현재 나이를 출력하시오.
    예)
        790101
        1        =====> 성별정보가 1이므로, 1979년생, 34살이다.
        080521
        4        =====>  성별정보가 4이므로, 2008년생,  5살이다.

        입력
        생년월일(6자리)과 성별정보(1자리)가 차례대로 정수로 주어진다.
        출력
        2012년도에 현재 나이를 출력하시오.

        입력 예시
        790101
        1
        출력 예시
        34
*/