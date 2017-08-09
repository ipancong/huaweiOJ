package com.pancong.train;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.
 */
public class NiXuShu {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        StringBuffer sb = new StringBuffer(line);
//        System.out.println(sb.reverse());
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        double count2 = 0;
        double sum = 0;
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            if (x < 0)
                count1++;
            else {
                count2++;
                sum += x;
            }
            DecimalFormat df = new DecimalFormat("#.0");
            System.out.println(count1);
            System.out.println(df.format(sum/count2));
        }
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(count1);
        System.out.println(df.format(sum/count2));
    }
}
