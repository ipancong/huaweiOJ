package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/8/6.
 */
public class 高精度加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(add(line1,line2));

    }
    public static String add(String line1,String line2){
        StringBuffer res = new StringBuffer();
        StringBuffer line1Sb = new StringBuffer(line1).reverse();
        StringBuffer line2Sb = new StringBuffer(line2).reverse();
        char[] arr1 = line1Sb.toString().toCharArray();
        char[] arr2 = line2Sb.toString().toCharArray();
        int i = 0, j = 0;
        int flag = 0;
        while(i < arr1.length && j < arr2.length){
            int a = Integer.valueOf(String.valueOf(arr1[i]));
            int b = Integer.valueOf(String.valueOf(arr2[j]));
            int temp = a+b;
            int val = temp%10 + flag;
            flag = temp/10;
            res.append(String.valueOf(val));
            i++;
            j++;
        }
        if(flag == 1){
            if(arr2.length == arr1.length){
                res.append(flag);
            }else{

            }

        }else{
            if(arr1.length > arr2.length){
                while (i < arr1.length){
                    res.append(arr1[i]);
                    i++;
                }
            }else{
                while (i < arr2.length){
                    res.append(arr2[i]);
                    i++;
                }
            }
        }
        return res.reverse().toString();
    }
}
