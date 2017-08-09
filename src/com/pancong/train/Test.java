package com.pancong.train;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.
 */
public class Test {
    public static void main(String[] args) {
        int[] num=new int[]{1,2,3,4,5};
        String str="";
        //求3个数的组合个数
        count(0,str,num,2);
//        求1-n个数的组合个数
     //   count1(0,str,num);
    }

    private static void count1(int i, String str, int[] num) {
        if(i==num.length){
            System.out.println(str);
            return;
        }
        count1(i+1,str,num);
        count1(i+1,str+num[i]+",",num);
    }

    private static void count(int i, String str, int[] num,int n) {
        if(n==0){
            System.out.println(str);
            return;
        }
        if(i==num.length){
            return;
        }
        count(i+1,str+num[i]+",",num,n-1);
        count(i+1,str,num,n);
    }
}
