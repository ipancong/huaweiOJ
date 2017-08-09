package com.pancong.train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.
 */
public class StringCombine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line1 = scanner.next();
            String line2 = scanner.next();
            String key = line1.trim() + line2.trim();
            int n = key.length();
            try{
                char[] arr1 = null;
                char[] arr2 = null;
                char[] arr = new char[key.length()];
                if(n%2==0){
                    arr1 = new char[n/2];
                    arr2 = new char[n/2];
                }else{
                    arr1 = new char[n/2];
                    arr2 = new char[n/2+1];
                }


                for(int i=0; i < key.length();i++){
                    if(i%2==0){
                        arr2[i/2] = key.charAt(i);
                    }
                    else
                        arr1[(i-1)/2] = key.charAt(i);
                }

                Arrays.sort(arr1);
                Arrays.sort(arr2);
                for(int i=0; i< n; i++){
                    if(i%2==0)
                        arr[i] = arr2[i/2];
                    else
                        arr[i] = arr1[(i-1)/2];

                }


                System.out.println(convert(arr));
            }catch (Exception e){
                return;
            }

        }


    }

    static String convert(char[] arr){
        StringBuffer res = new StringBuffer();
        int i = 0;
        for(i=0; i<arr.length; i++){
            char tmp = String.valueOf(arr[i]).toLowerCase().charAt(0);
            int m = 0;
            if(tmp >= 'a' && tmp <= 'f')
                m = tmp - 'a' + 10;
            else if(tmp >= '0' && tmp<='9'){
                m = Integer.parseInt(String.valueOf(tmp));
                String str = Integer.toBinaryString(m);
                str = ("0000"+str).substring(str.length(),str.length()+4);
                StringBuffer sb = new StringBuffer(str);
                String valueBin = sb.reverse().toString();

                int value = Integer.valueOf(valueBin,2);

                String valueHex = Integer.toHexString(value).toUpperCase();
                res.append(valueHex);
            }else
                res.append(arr[i]);

        }
        return res.toString();
    }


}


