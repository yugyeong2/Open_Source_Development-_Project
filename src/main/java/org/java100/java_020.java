package org.java100;

import java.util.Scanner;

class java_020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int sum = x+y+z;
        float avg = (float)sum/3;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}
