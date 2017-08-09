package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/23.
 */
public class EmptyBottles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int count = 0;
            int empties = scanner.nextInt();
            if(empties == 0)
                break;
            else{
                if(empties < 3)
                    count = 0;
                if(empties >=3){
                    while(empties>=3){
                        count++;
                        empties -= 3;
                        empties ++;
                    }
                    if(empties == 2)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
