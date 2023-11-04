package org.java100;

import java.util.Scanner;

class java_021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a * (int)Math.pow(2, b));
    }
}
