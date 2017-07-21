package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/21.
 *
 * 输入描述

 一行字符串
 输出描述

 整数N，最后一个单词的长度。
 输入例子

 hello world
 输出例子

 5
 */
public class LastWordLength {
    public static void main(String args[]){
        String line = "";
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(words[words.length-1].length());
    }

}
