package com.pancong.train;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class RevorseLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        reverse(line);
    }
    public static void reverse(String sentence){
        String[] arr = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        Collections.reverse(Arrays.asList(arr));
        for (String s : arr) {
           sb.append(s+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
