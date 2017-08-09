package com.pancong.train;

import java.util.Arrays;

/**
 * Created by Pan on 2017/8/6.
 */
public class 最大子数组 {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,8,-4,7,-1,-5};
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int start = 0;
        int end = 0;
        int i = 0;
        int max = 0;
        for(i = 1 ; i < arr.length; i++){
            if(dp[i-1]<0){
                dp[i] = arr[i];
                start = i;
            }else
                dp[i] = dp[i-1]+arr[i];
            if(dp[i] > max){
                max = dp[i];
                end = i;
            }

        }
        System.out.println(Arrays.toString(dp));
        System.out.println(max+" start:"+start+","+end);
    }
}
