package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class FloatUpOrDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float val = scanner.nextFloat();
        String str = String.valueOf(val);
        String lastValue = str.substring(str.indexOf(".")+1,str.length());
        String frontValue = str.substring(0,str.indexOf("."));
        int result = 0;
        if(Integer.parseInt(lastValue) >= 5){
            result = Integer.parseInt(frontValue)+1;
        }else
            result = Integer.parseInt(frontValue);
        System.out.print(result);


    }
}
