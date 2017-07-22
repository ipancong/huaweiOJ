package com.pancong.train;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Pan on 2017/7/22.
 * 题目描述
 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 输入描述:
 输入N个字符，字符在ACSII码范围内。
 输出描述:
 输出范围在(0~127)字符的个数。
 示例1
 输入

 abc
 输出

 3
 */
public class ACSIICharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set set = new HashSet();
        for(int i = 0; i < line.length(); i++){
            char s = line.charAt(i);
            if(s >= 0 && s <= 127)
                set.add(s);
        }
        System.out.println(set.size());
    }
}
