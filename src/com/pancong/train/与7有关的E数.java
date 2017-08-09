package com.pancong.train;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Pan on 2017/8/6.
 */
public class 与7有关的E数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            Set<Integer> set = new HashSet<>();

            for(i = 1 ; i <= x ; i++){
                if(String.valueOf(i).indexOf("7") >= 0){
                    set.add(i);
                }
                if(i%7==0)
                    set.add(i);
            }

            System.out.println(set.size());

        }
    }
}
