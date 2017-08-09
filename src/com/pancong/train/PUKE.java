package com.pancong.train;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/23.
 */
public class PUKE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] pais = line.split("-");
            if(pais[0].length() == 0 || pais[1].length() == 0)
                return;

            //判断是否王炸或炸弹
            //如果有王炸就是王炸最大
            if(isWangzha(pais[0])||isWangzha(pais[1])){
                if(isWangzha(pais[0]))
                    System.out.println(pais[0]);
                else
                    System.out.println(pais[1]);
            }
            //如果没有王炸 就是炸弹最大
            else if(isZhadan(pais[0])||isZhadan(pais[1])){
                if(isZhadan(pais[0]))
                    System.out.println(pais[0]);
                else
                    System.out.println(pais[1]);
            }else{ //没有王炸也也没有炸弹
                if(pais[0].length()!= pais[1].length()){
                    if((isDanpai(pais[0])&&isDanpai(pais[1])||(isDanpai(pais[0])&&isDanpai(pais[1])))){
                        if(duizi(pais[0],pais[1])){
                            System.out.println(pais[0]);
                        }else
                            System.out.println(pais[1]);
                    }else
                        System.out.println("ERROR");
                }

                if(duizi(pais[0],pais[1])){
                    System.out.println(pais[0]);
                }else
                    System.out.println(pais[1]);
            }
        }


    }

    public static boolean isDanpai(String pai){
        String[] arr = {"A","2","3","4","5","6","7","8","9","10","J","Q","K","joker","JOKER"};
        if(Arrays.asList(arr).contains(pai))
            return true;
        else
            return false;
    }

    public static int convert(String pai){
        int value = 0;
        if(pai.equals("J"))
            value = 11;
        else if(pai.equals("Q"))
            value = 12;
        else if(pai.equals("K"))
            value = 13;
        else if(pai.equals("A"))
            value = 14;
        else if(pai.equals("2"))
            value = 15;
        else if(pai.equals("joker"))
            value = 16;
        else if(pai.equals("JOKER"))
            value = 17;
        else
            value = Integer.parseInt(pai);

        return value;
    }
    public static boolean compareDanpai(String a, String b){
        return convert(a) > convert(b);
    }
    //对子、顺子、三个、个子
    public static boolean duizi(String a, String b){
        return compareDanpai(a.substring(0,1),b.substring(0,1));
    }

    //判断是否炸
    public static boolean isZhadan(String a){
        if(a.length() == 7)
            return true;
        else
            return false;
    }

    //判断是否王炸
    public static boolean isWangzha(String a){
        if(a.length() == 11)
            return true;
        else
            return false;
    }



}
