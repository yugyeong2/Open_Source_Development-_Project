package org.java100;

import java.util.Scanner;

class java_015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();

        System.out.printf("%d.%02d.%02d", year, month, date);
    }
}
