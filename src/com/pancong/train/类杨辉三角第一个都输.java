package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/8/6.
 */
public class 类杨辉三角第一个都输 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int line = scanner.nextInt();
            if (line <= 2) {
                System.out.println(-1);
                return;
            }
            if (line % 2 == 1)
                System.out.println(2);
            else {
                if ((line / 2) % 2 == 1)
                    System.out.println(4);
                else
                    System.out.println(3);
            }
        }
    }
}
