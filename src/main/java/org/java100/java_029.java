package org.java100;

import java.util.Scanner;

class java_029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
