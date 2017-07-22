package com.pancong.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class StringSort {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0 ; i< n; i++){
            list.add(scanner.next());
        }
        Collections.sort(list);
        for(String val : list){
            System.out.println(val);
        }
    }
}
