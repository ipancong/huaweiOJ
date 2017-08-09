package com.pancong.train;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

/**
 * Created by Pan on 2017/7/23.

 //纯粹的考代码实现能力
 //记录个数，故使用Map，不需要排序故使用HashMap，根据题意是要循环输出，而且提交一次会有测试用例提示，需要按照输入顺序输出，故使用LinkedHashMap
 //在输出的时候，题目的意思是循环八个，但问题是必须记录全部错误个数，否则刚记录完后弹出了，错误数就对不上了，跟操作系统里的缺页有那么点相似。
 */
public class RecordMistakes {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()) {
            String str = sc.next();
            int linenum = sc.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if (s.length() > 16)
                s = s.substring(s.length() - 16);
            String key = s + " " + linenum;
            int value = 1;
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else {
                map.put(key, value);
            }
        }
        int count = 0;
        for (String string : map.keySet()) {
            count++;
            if (count > (map.keySet().size() - 8)) //输出最后八个记录
                System.out.println(string + " " + map.get(string));
        }

    }
}

