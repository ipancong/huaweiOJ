package com.pancong.train;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/31.
 */
public class ASCIISort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            char[] arr =  line.toCharArray();
            Arrays.sort(arr);
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < arr.length; i++)
                sb.append(arr[i]);
            System.out.println(sb);
        }

    }
}
