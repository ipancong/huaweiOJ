package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 * 题目描述
 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 输入描述:
 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 输出描述:
 输出输入字符串中含有该字符的个数。
 示例1
 输入

 ABCDEF
 A
 输出

 1
 */
public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        String key = "";
        line = scanner.nextLine();
        key = scanner.nextLine();
        char[] lineArr = line.toCharArray();
        int count = 0;
        for(int i = 0; i < lineArr.length; i++){
            if(lineArr[i] == key.charAt(0) || key.toUpperCase().charAt(0) == String.valueOf(lineArr[i]).toUpperCase().charAt(0))
                count++;
        }
        System.out.println(count);
    }
}
