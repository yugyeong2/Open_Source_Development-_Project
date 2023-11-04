package org.java100;

import java.util.Scanner;

class java_030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if(x > 0) {
            System.out.println("plus");
        } else if(x < 0) {
            System.out.println("minus");
        }

        if(x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
