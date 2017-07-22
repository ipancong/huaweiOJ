package com.pancong.train;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Pan on 2017/7/22.
 * 题目描述

 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 详细描述：
 函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String
 输入描述

 输入一个long型整数
 输出描述

 按照从小到大的顺序输出它的所有质数的因子，以空格隔开
 输入例子

 180
 输出例子

 2 2 3 3 5
 */
public class ZhiShu {
    public static void main(String[] args) {
        long ulData = 0;
        Scanner scanner = new Scanner(System.in);
        ulData = Long.valueOf(scanner.nextLine());
        System.out.println(getResult(ulData));
    }

    public static String getResult(long ulDataInput){
        StringBuffer res = new StringBuffer();
        while(ulDataInput!=1){
            for(int i = 2; i <= ulDataInput; i++ ){
                if( ulDataInput % i == 0){
                    ulDataInput /= i;
                    res.append(i+" ");
                    break;
                }
            }
        }

        return res.toString();
    }
}
