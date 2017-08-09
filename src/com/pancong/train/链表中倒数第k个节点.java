package com.pancong.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pan on 2017/8/5.
 */
public class 链表中倒数第k个节点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            List<Integer> list = new ArrayList<>();
            int x = scanner.nextInt();
            int i = 0,j=0;
            for(i = 0 ; i < x; i++){
                list.add(scanner.nextInt());
            }
            int k = scanner.nextInt();
            if(k<1){
                System.out.println(0);
                return;
            }
            int res = 0;
            for(i=0,j=k-1;j<x; i++,j++){
                res = list.get(i);
            }
            System.out.println(res);
        }
    }
}
