package org.java100;

import java.util.Scanner;

class java_027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d", a > b ? a : b);
    }
}
