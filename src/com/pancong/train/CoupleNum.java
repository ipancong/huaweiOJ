package com.pancong.train;

import java.util.Scanner;

/**
 * 素数伴侣
 * Created by Pan on 2017/7/29.
 */
public class CoupleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] nums = new int[n];
            boolean[][] flag = new boolean[n][n];
            int i,j;
            for(i = 0; i < n; i++)
                nums[i] = scanner.nextInt();
            for(i = 0; i < n; i++){
                for(j =0 ; j < n; j++){
                    if( i == j)
                        flag[i][j] = false;
                    else
                        flag[i][j] = isSushu(nums[i]+nums[j]);
                }
            }
            int[] pair = new int[n/2];

            for(i = 0 ; i < n/2 ; i++){
                for(j = 0; j < n; j++ ){
                    if(i!=j)
                        System.out.println(i+","+j);
                }
            }
    }

    //查找个数
    public static int find(boolean[][] flag,int n){
        int count = 0;
        int i,j;
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(flag[i][j] == true)
                    count++;
            }
        }
        return count/2;
    }
    public static boolean isSushu(int val){
        boolean result = true;
        for(int i=2 ; i < Math.sqrt(val); i++){
            if(val % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
