package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 * 题目描述

 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 输入描述

 输入一个十六进制的数值字符串。
 输出描述

 输出该数值的十进制字符串
 输入例子

 0xA
 输出例子

 10
 */
public class HexToNum {
    public static void main(String[] args) {
        String hex = "";
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            hex = scanner.nextLine();
            hexToNum(hex);
        }

    }

    public static void hexToNum(String hex){
        //7E
        long value = 0;
        char[] hexArr = hex.toCharArray();
        for(int i=hexArr.length-1; i>=0; i--){
            if(hexArr[i] >=  'a' && hexArr[i] <= 'f' ){
                value += (hexArr[i]-'a'+10) * Math.pow(16,hexArr.length-1-i);
            }else if(hexArr[i] >=  'A' && hexArr[i] <= 'F' ){
                value += (hexArr[i]-'A'+10) * Math.pow(16,hexArr.length-1-i);
            }
            else if(hexArr[i] >=  '0' && hexArr[i] <= '9' ) {
                value += (hexArr[i]-'0') * Math.pow(16,hexArr.length-1-i);
            }
        }
        System.out.println(value);
    }
}
