package com.company;

/**
 * Created by pt696 on 1/4/17.
 */
    public class MatrixMult {

        public static int[][] mult(int c[][],int d[][])
        {
            int sum = 0;
            int e[][] = new int[c.length][d[0].length];
            for (int y = 0; y < c.length; y++) {
                for (int x = 0; x < d[0].length; x++) {
                    for (int z = 0; z < c[0].length; z++) {
                        sum = sum + c[y][z] * d[z][x];
                    }
                    e[y][x] = sum;
                    sum = 0;
                }
            }
            return e;
        }

    }

