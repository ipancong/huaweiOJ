package com.pancong.train;

import java.util.*;

/**
 * Created by Pan on 2017/7/21.
 * 题目描述

 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），
 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 Input Param
 n               输入随机数的个数
 inputArray      n个随机整数组成的数组

 Return Value
 OutputArray    输出处理后的随机整数

 注：测试用例保证输入参数的正确性，答题者无需验证。
 输入描述

 输入多行，先输入随机整数的个数，在输入相应个数的整数
 输出描述

 返回多行，处理后的结果
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);


        while(scanner.hasNext()){
            n = scanner.nextInt();
            Set<Integer> result = new TreeSet<Integer>(); //Set可以去重 TreeSet从小到大排列
//        Set<Integer> result2 = new TreeSet<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2){
//
//                return Integer.parseInt(String.valueOf(o2)) - Integer.parseInt(String.valueOf(o1));
//            }
//        }); //Set可以去重 TreeSet从小到大排列
            for(int i=0; i< n; i++){
                int val = scanner.nextInt();
                result.add(val);
//            result2.add(val);

            }
            //        System.out.println("==");
            //从小到大排序
            for (Integer i : result) {
                System.out.println(i);
            }
            //从大到小排序
//        System.out.println("==");
//        for (Integer i : result2) {
//            System.out.println(i);
//        }

        }





    }


}
