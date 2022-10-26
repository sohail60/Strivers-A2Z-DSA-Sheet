package com.company.Pattern_Problems;

public class Pattern8_14 {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = n-1; row >=1 ; row--) {
            for (int col = row; col >=1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                if ((row + col) % 2 == 0){
                    System.out.print("1 ");
                } else {
                System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }

            for (int space = n-row; space >=1 ; space--) {
                System.out.print("  ");
            }

            for (int space = n-row; space >=1 ; space--) {
                System.out.print("  ");
            }

            for (int col = row; col >=1; col--) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern13(int n){
        int count=1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print((char)(col+64));
            }
            System.out.println();
        }
    }
}
