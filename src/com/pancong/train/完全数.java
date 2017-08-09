package com.pancong.train;

import java.util.*;

/**
 * Created by Pan on 2017/8/6.
 */
public class 完全数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int count = 0;
            for(int i = 1 ; i <= x ; i++){
                if(ischeck(i))
                    count ++;
            }
            System.out.println(count);
        }



    }
    public static boolean ischeck(int x){
        int i = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(i < x){
            if(x%i == 0){
                list.add(i);
            }
            i++;
        }
        int sum = 0;
        //System.out.println(Arrays.toString(list.toArray()));
        for(i=0; i<list.size(); i++){
            sum += list.get(i);
        }

         return sum == x ;

    }
}
