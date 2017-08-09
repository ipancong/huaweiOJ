package com.pancong.train;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.

 牛顿迭代法。设f(x)=x3-y, 求f(x)=0时的解x，即为y的立方根。

 根据牛顿迭代思想，xn+1=xn-f(xn)/f'(xn)即x=x-(x3-y)/(3*x2)=(2*x+y/x/x)/3;
 */
public class LiFanggen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double i = 1;
        for(i = 1.0; Math.abs(Math.pow(i,3) - x) >= 1.0E-4; i=(2*i+x/(i*i))/3);
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(df.format(i));

    }
}
