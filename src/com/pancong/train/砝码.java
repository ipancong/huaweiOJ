package com.pancong.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/8/1.
 */
public class 砝码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] weights = new int[n];
            int[] counts = new int[n];
            int i=0,j=0;
            for(i=0; i<n; i++){
                weights[i] = scanner.nextInt();
            }
            for(i=0; i<n; i++){
                counts[i] = scanner.nextInt();
            }
            System.out.println(getKinds(  n,   weights,   counts));
        }


    }

    public static int getKinds(int n, int[] weights, int[] counts){

        HashSet<Integer> set = new HashSet<>();
        int i=0,j=0,k=0;
        //第一个砝码
        for(i=0; i<=counts[0]; i++){
            set.add(weights[0]*i);
        }
        //从第二个砝码开始
        for(i=1; i<n; i++){
            List<Integer> list = new ArrayList<>(set);
            for(k=1; k<=counts[i]; k++){
                for(j=0; j<list.size(); j++){
                    set.add(weights[i]*k+list.get(j));
                }
            }
        }
        return set.size();
    }
}
