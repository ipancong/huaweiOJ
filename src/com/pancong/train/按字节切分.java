package com.pancong.train;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Pan on 2017/8/2.
 */
public class 按字节切分 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.next();
            int len = scanner.nextInt();
            char[] arr = line.toCharArray();
            String chinese = "[\u4e00-\u9fa5]";
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < arr.length; i++){
                int tmp = 1;
                if(Character.toString(arr[i]).matches(chinese))
                    tmp = 2;
                if( tmp <= len){
                    sb.append(arr[i]);
                    len -= tmp;
                }
            }
            System.out.println(sb);
        }

    }
}
