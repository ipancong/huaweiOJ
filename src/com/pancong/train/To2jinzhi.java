package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class To2jinzhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = 0;
        val = scanner.nextInt();
        int count = 0;
        while(val>0){

            if(val%2 == 1){
                count++;
            }

            val/=2;
        }

        System.out.println(count);
    }
}
