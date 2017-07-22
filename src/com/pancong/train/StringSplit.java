package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class StringSplit {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        convert(str1);
        convert(str2);

    }

    public static void convert(String str){

        if(str.length() > 8){
            while(true){
                System.out.println(str.substring(0,8));
                str = str.substring(8,str.length());
                if(str.length()<=8)
                    break;
            }
        }
        if(str.length() == 0)
            return;
        if(str.length() == 8)
            System.out.println(str);
        if(str.length() < 8){
            char[] strArr = str.toCharArray();
            char[] resArr = new char[8];
            for(int i=0; i< 8; i++){
                if(i < strArr.length)
                    resArr[i] = strArr[i];
                else
                    resArr[i] = '0';
            }
            System.out.println(new String(resArr));
        }


    }
}
