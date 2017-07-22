package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/21.
 * 题目描述

 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 输入描述

 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 输出描述

 输出输入字符串中含有该字符的个数。
 输入例子

 ABCDEF
 A
 输出例子

 1
 */
public class StringLength {
    public static void main(String args[]){
        String line = "";
        String key = "";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();
        key = scanner.next();
        char[] lineArr = line.toCharArray();
        for(int i = 0; i < lineArr.length; i++){
            if(lineArr[i] == key.charAt(0))
                count ++;
        }
        System.out.println(count);
    }
}
