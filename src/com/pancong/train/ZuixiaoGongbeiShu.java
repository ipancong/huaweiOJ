package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.
 */
public class ZuixiaoGongbeiShu {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        int i;
        for(i=x+y; i <= x*y; i++){
            if(i % x==0 && i % y ==0){
                System.out.println(i);
                break;
            }
        }
    }
}
