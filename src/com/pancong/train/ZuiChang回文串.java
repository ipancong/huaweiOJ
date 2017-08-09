package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/31.
 */
public class ZuiChang回文串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
//            System.out.println(find(line).length());

        }

    }

    //动态规划法
    public static String findDp(String str){
        String res = "";

        return res;
    }

//暴力破解法
//    public static String find(String str){
//        String res = "";
//        int length = str.length();
//        int i,j=0;
//        int maxLength = 0;
//        for(i = 0; i < length; i++){
//            for(j = i; j < length; j++){
//                int tmp1,tmp2 = 0;
//                for(tmp1 = i, tmp2 = j; tmp1 < tmp2; tmp1++,tmp2--){
//                    if(str.charAt(tmp1) != str.charAt(tmp2))
//                        break;
//                }
//                if(tmp1 >= tmp2 && j - i + 1 > maxLength){
//                    res = str.substring(i,j+1);
//                    maxLength = j - i + 1;
//                    //System.out.println(maxLength+"-->"+i+","+j);
//                }
//
//
//
//            }
//        }
//
//        return res;
//
//    }
}
