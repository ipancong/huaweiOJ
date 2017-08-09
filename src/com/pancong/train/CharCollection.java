package com.pancong.train;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/23.
 *
 输入描述:
 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。


 输出描述:
 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。

 输入例子1:
 abcqweracb

 输出例子1:
 abcqwer
 */
public class CharCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            char[] ori = line.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < ori.length; i++){
                String tmp = String.valueOf(ori[i]);
                if(sb.toString().indexOf(tmp) == -1)
                    sb.append(tmp);
            }
            System.out.println(sb.toString());
        }

    }
}
