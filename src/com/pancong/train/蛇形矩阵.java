package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/31.
 */
public class 蛇形矩阵 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[][] res = new int[m][m];
        int x = 1;
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < m - i ; j++){
                res[i][j] = 1 + i;
            }
        }

        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < m - i ; j++){
               System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
