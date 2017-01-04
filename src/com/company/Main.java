package com.company;

public class Main {

    public static void main(String[] args) {
        int a[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int b[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
        int f[][] = MatrixMult.mult(a, b);
        for (int y = 0; y < f.length; y++) {
            for (int x = 0; x < f[0].length; x++) {
                System.out.print(f[y][x] + " ");
            }
            System.out.println("");
        }
    }
}


