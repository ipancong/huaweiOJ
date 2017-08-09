package com.pancong.train;

import java.util.*;

/**
 * Created by Pan on 2017/8/2.
 */
public class 信号测量 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = scanner.nextInt();
        int i = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(i = 0; i < n; i++){
            int no = scanner.nextInt();
            int value = scanner.nextInt();
            if(!map.containsKey(no))
                map.put(no,value);
        }
        Object[] arr = map.keySet().toArray();
        for(i = 0; i < arr.length-1; i++){
            Integer a = (Integer) arr[i];
            Integer b = (Integer) arr[i+1];
            if(b-a > 1 && map.size() < max){
                map.put(a+1,getValue(map,map.get(a),map.get(b),a,b,a+1));
                arr = map.keySet().toArray();
            }
        }
        for(Integer x : map.keySet())
            System.out.println(x+" "+map.get(x));
    }

    public static int getValue(TreeMap<Integer,Integer> map,int val1,int val2,int no1,int no2,int no){
        return map.get(no1)+((map.get(no2)-map.get(no1))/(no2-no1))*(no-no1);
    }

}
