package com.pancong.train;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Pan on 2017/7/22.
 */
public class IndexValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Map<Integer,Integer> map = new TreeMap<>();
        n = scanner.nextInt();
        for(int i = 0; i < n ; i++){
            int key = scanner.nextInt();
            int val = scanner.nextInt();
            if(map.containsKey(key)){
                map.put(key,map.get(key)+val);
            }else
                map.put(key,val);
        }
        for(Integer key : map.keySet()){
            System.out.println(key +" "+ map.get(key));
        }
    }
}
