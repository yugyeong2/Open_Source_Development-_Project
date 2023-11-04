package org.java100;

import java.util.Scanner;

class java_028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a % 2 == 0) {
            System.out.println(a);
        }
        if(b % 2 == 0) {
            System.out.println(b);
        }
        if(c % 2 == 0) {
            System.out.println(c);
        }
    }
}
