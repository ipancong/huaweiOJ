package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/8/1.
 */
public class 迷宫问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] dom = new int[x][y];
        int i=0, j=0;
        for(i = 0; i < x; i++){
            for(j = 0; j < x; j++){
                dom[i][j] = scanner.nextInt();
            }
        }


        StringBuffer sb = new StringBuffer();
        sb.append("(0,0)\n");
        for(i = 0; i < x; i++){
            for(j = 0; j < x; j++){

            }
        }



    }
}
